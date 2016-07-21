package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;

public class SlidingPaneLayout
  extends ViewGroup
{
  private static final int DEFAULT_FADE_COLOR = -858993460;
  private static final int DEFAULT_OVERHANG_SIZE = 32;
  static final SlidingPaneLayout.SlidingPanelLayoutImpl IMPL = new SlidingPaneLayout.SlidingPanelLayoutImplBase();
  private static final int MIN_FLING_VELOCITY = 400;
  private static final String TAG = "SlidingPaneLayout";
  private boolean mCanSlide;
  private int mCoveredFadeColor;
  private final ViewDragHelper mDragHelper;
  private boolean mFirstLayout = true;
  private float mInitialMotionX;
  private float mInitialMotionY;
  private boolean mIsUnableToDrag;
  private final int mOverhangSize;
  private SlidingPaneLayout.PanelSlideListener mPanelSlideListener;
  private int mParallaxBy;
  private float mParallaxOffset;
  private final ArrayList mPostedRunnables = new ArrayList();
  private boolean mPreservedOpenState;
  private Drawable mShadowDrawable;
  private float mSlideOffset;
  private int mSlideRange;
  private View mSlideableView;
  private int mSliderFadeColor = -858993460;
  private final Rect mTmpRect = new Rect();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 17)
    {
      IMPL = new SlidingPaneLayout.SlidingPanelLayoutImplJBMR1();
      return;
    }
    if (i >= 16)
    {
      IMPL = new SlidingPaneLayout.SlidingPanelLayoutImplJB();
      return;
    }
  }
  
  public SlidingPaneLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    float f = getResourcesgetDisplayMetricsdensity;
    mOverhangSize = ((int)(32.0F * f + 0.5F));
    ViewConfiguration.get(paramContext);
    setWillNotDraw(false);
    ViewCompat.setAccessibilityDelegate(this, new SlidingPaneLayout.AccessibilityDelegate(this));
    ViewCompat.setImportantForAccessibility(this, 1);
    mDragHelper = ViewDragHelper.create(this, 0.5F, new SlidingPaneLayout.DragHelperCallback(this, null));
    mDragHelper.setEdgeTrackingEnabled(1);
    mDragHelper.setMinVelocity(f * 400.0F);
  }
  
  private boolean closePane(View paramView, int paramInt)
  {
    boolean bool = false;
    if ((mFirstLayout) || (smoothSlideTo(0.0F, paramInt)))
    {
      mPreservedOpenState = false;
      bool = true;
    }
    return bool;
  }
  
  private void dimChildView(View paramView, float paramFloat, int paramInt)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    if ((paramFloat > 0.0F) && (paramInt != 0))
    {
      i = (int)(((0xFF000000 & paramInt) >>> 24) * paramFloat);
      if (dimPaint == null) {
        dimPaint = new Paint();
      }
      dimPaint.setColorFilter(new PorterDuffColorFilter(i << 24 | 0xFFFFFF & paramInt, PorterDuff.Mode.SRC_OVER));
      if (ViewCompat.getLayerType(paramView) != 2) {
        ViewCompat.setLayerType(paramView, 2, dimPaint);
      }
      invalidateChildRegion(paramView);
    }
    while (ViewCompat.getLayerType(paramView) == 0)
    {
      int i;
      return;
    }
    if (dimPaint != null) {
      dimPaint.setColorFilter(null);
    }
    paramView = new SlidingPaneLayout.DisableLayerRunnable(this, paramView);
    mPostedRunnables.add(paramView);
    ViewCompat.postOnAnimation(this, paramView);
  }
  
  private void invalidateChildRegion(View paramView)
  {
    IMPL.invalidateChildRegion(this, paramView);
  }
  
  private void onPanelDragged(int paramInt)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)mSlideableView.getLayoutParams();
    mSlideOffset = ((paramInt - (getPaddingLeft() + leftMargin)) / mSlideRange);
    if (mParallaxBy != 0) {
      parallaxOtherViews(mSlideOffset);
    }
    if (dimWhenOffset) {
      dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
    }
    dispatchOnPanelSlide(mSlideableView);
  }
  
  private boolean openPane(View paramView, int paramInt)
  {
    if ((mFirstLayout) || (smoothSlideTo(1.0F, paramInt)))
    {
      mPreservedOpenState = true;
      return true;
    }
    return false;
  }
  
  private void parallaxOtherViews(float paramFloat)
  {
    int j = 0;
    Object localObject = (SlidingPaneLayout.LayoutParams)mSlideableView.getLayoutParams();
    if ((dimWhenOffset) && (leftMargin <= 0)) {}
    for (int i = 1;; i = 0)
    {
      int k = getChildCount();
      while (j < k)
      {
        localObject = getChildAt(j);
        if (localObject != mSlideableView)
        {
          int m = (int)((1.0F - mParallaxOffset) * mParallaxBy);
          mParallaxOffset = paramFloat;
          ((View)localObject).offsetLeftAndRight(m - (int)((1.0F - paramFloat) * mParallaxBy));
          if (i != 0) {
            dimChildView((View)localObject, 1.0F - mParallaxOffset, mCoveredFadeColor);
          }
        }
        j += 1;
      }
    }
  }
  
  private static boolean viewIsOpaque(View paramView)
  {
    if (ViewCompat.isOpaque(paramView)) {}
    do
    {
      return true;
      if (Build.VERSION.SDK_INT >= 18) {
        return false;
      }
      paramView = paramView.getBackground();
      if (paramView == null) {
        break;
      }
    } while (paramView.getOpacity() == -1);
    return false;
    return false;
  }
  
  protected boolean canScroll(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int j = paramView.getScrollX();
      int k = paramView.getScrollY();
      i = localViewGroup.getChildCount() - 1;
      if (i >= 0)
      {
        localView = localViewGroup.getChildAt(i);
        if ((paramInt2 + j < localView.getLeft()) || (paramInt2 + j >= localView.getRight()) || (paramInt3 + k < localView.getTop()) || (paramInt3 + k >= localView.getBottom()) || (!canScroll(localView, true, paramInt1, paramInt2 + j - localView.getLeft(), paramInt3 + k - localView.getTop()))) {}
      }
    }
    while ((paramBoolean) && (ViewCompat.canScrollHorizontally(paramView, -paramInt1)))
    {
      View localView;
      return true;
      i -= 1;
      break;
    }
    return false;
  }
  
  public boolean canSlide()
  {
    return mCanSlide;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof SlidingPaneLayout.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public boolean closePane()
  {
    return closePane(mSlideableView, 0);
  }
  
  public void computeScroll()
  {
    if (mDragHelper.continueSettling(true))
    {
      if (!mCanSlide) {
        mDragHelper.abort();
      }
    }
    else {
      return;
    }
    ViewCompat.postInvalidateOnAnimation(this);
  }
  
  void dispatchOnPanelClosed(View paramView)
  {
    if (mPanelSlideListener != null) {
      mPanelSlideListener.onPanelClosed(paramView);
    }
    sendAccessibilityEvent(32);
  }
  
  void dispatchOnPanelOpened(View paramView)
  {
    if (mPanelSlideListener != null) {
      mPanelSlideListener.onPanelOpened(paramView);
    }
    sendAccessibilityEvent(32);
  }
  
  void dispatchOnPanelSlide(View paramView)
  {
    if (mPanelSlideListener != null) {
      mPanelSlideListener.onPanelSlide(paramView, mSlideOffset);
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (getChildCount() > 1) {}
    for (View localView = getChildAt(1); (localView == null) || (mShadowDrawable == null); localView = null) {
      return;
    }
    int i = mShadowDrawable.getIntrinsicWidth();
    int j = localView.getLeft();
    int k = localView.getTop();
    int m = localView.getBottom();
    mShadowDrawable.setBounds(j - i, k, j, m);
    mShadowDrawable.draw(paramCanvas);
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    int i = paramCanvas.save(2);
    if ((mCanSlide) && (!slideable) && (mSlideableView != null))
    {
      paramCanvas.getClipBounds(mTmpRect);
      mTmpRect.right = Math.min(mTmpRect.right, mSlideableView.getLeft());
      paramCanvas.clipRect(mTmpRect);
    }
    boolean bool;
    if (Build.VERSION.SDK_INT < 11)
    {
      if ((!dimWhenOffset) || (mSlideOffset <= 0.0F)) {
        break label202;
      }
      if (!paramView.isDrawingCacheEnabled()) {
        paramView.setDrawingCacheEnabled(true);
      }
      Bitmap localBitmap = paramView.getDrawingCache();
      if (localBitmap != null)
      {
        paramCanvas.drawBitmap(localBitmap, paramView.getLeft(), paramView.getTop(), dimPaint);
        bool = false;
        paramCanvas.restoreToCount(i);
        return bool;
      }
      Log.e("SlidingPaneLayout", "drawChild: child view " + paramView + " returned null drawing cache");
    }
    for (;;)
    {
      bool = super.drawChild(paramCanvas, paramView, paramLong);
      break;
      label202:
      if (paramView.isDrawingCacheEnabled()) {
        paramView.setDrawingCacheEnabled(false);
      }
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new SlidingPaneLayout.LayoutParams();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new SlidingPaneLayout.LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new SlidingPaneLayout.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new SlidingPaneLayout.LayoutParams(paramLayoutParams);
  }
  
  public int getCoveredFadeColor()
  {
    return mCoveredFadeColor;
  }
  
  public int getParallaxDistance()
  {
    return mParallaxBy;
  }
  
  public int getSliderFadeColor()
  {
    return mSliderFadeColor;
  }
  
  boolean isDimmed(View paramView)
  {
    if (paramView == null) {
      return false;
    }
    paramView = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    return (mCanSlide) && (dimWhenOffset) && (mSlideOffset > 0.0F);
  }
  
  public boolean isOpen()
  {
    return (!mCanSlide) || (mSlideOffset == 1.0F);
  }
  
  public boolean isSlideable()
  {
    return mCanSlide;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    mFirstLayout = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    mFirstLayout = true;
    int j = mPostedRunnables.size();
    int i = 0;
    while (i < j)
    {
      ((SlidingPaneLayout.DisableLayerRunnable)mPostedRunnables.get(i)).run();
      i += 1;
    }
    mPostedRunnables.clear();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    int i = MotionEventCompat.getActionMasked(paramMotionEvent);
    if ((!mCanSlide) && (i == 0) && (getChildCount() > 1))
    {
      View localView = getChildAt(1);
      if (localView != null) {
        if (mDragHelper.isViewUnder(localView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
          break label108;
        }
      }
    }
    label108:
    for (boolean bool1 = true;; bool1 = false)
    {
      mPreservedOpenState = bool1;
      if ((mCanSlide) && ((!mIsUnableToDrag) || (i == 0))) {
        break;
      }
      mDragHelper.cancel();
      bool1 = super.onInterceptTouchEvent(paramMotionEvent);
      return bool1;
    }
    if ((i == 3) || (i == 1))
    {
      mDragHelper.cancel();
      return false;
    }
    switch (i)
    {
    }
    label164:
    float f1;
    float f2;
    do
    {
      for (i = 0;; i = 1)
      {
        if (!mDragHelper.shouldInterceptTouchEvent(paramMotionEvent))
        {
          bool1 = bool2;
          if (i == 0) {
            break;
          }
        }
        return true;
        mIsUnableToDrag = false;
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        mInitialMotionX = f1;
        mInitialMotionY = f2;
        if ((!mDragHelper.isViewUnder(mSlideableView, (int)f1, (int)f2)) || (!isDimmed(mSlideableView))) {
          break label164;
        }
      }
      f2 = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      f2 = Math.abs(f2 - mInitialMotionX);
      f1 = Math.abs(f1 - mInitialMotionY);
    } while ((f2 <= mDragHelper.getTouchSlop()) || (f1 <= f2));
    mDragHelper.cancel();
    mIsUnableToDrag = true;
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = paramInt3 - paramInt1;
    paramInt2 = getPaddingLeft();
    int k = getPaddingRight();
    int m = getPaddingTop();
    int i = getChildCount();
    float f;
    if (mFirstLayout)
    {
      if ((mCanSlide) && (mPreservedOpenState))
      {
        f = 1.0F;
        mSlideOffset = f;
      }
    }
    else
    {
      paramInt3 = 0;
      paramInt1 = paramInt2;
      label64:
      if (paramInt3 >= i) {
        break label306;
      }
      View localView = getChildAt(paramInt3);
      if (localView.getVisibility() == 8) {
        break label415;
      }
      SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)localView.getLayoutParams();
      int n = localView.getMeasuredWidth();
      paramInt4 = 0;
      if (!slideable) {
        break label270;
      }
      int i1 = leftMargin;
      int i2 = rightMargin;
      i1 = Math.min(paramInt1, j - k - mOverhangSize) - paramInt2 - (i1 + i2);
      mSlideRange = i1;
      if (leftMargin + paramInt2 + i1 + n / 2 <= j - k) {
        break label265;
      }
      paramBoolean = true;
      label186:
      dimWhenOffset = paramBoolean;
      i1 = (int)(i1 * mSlideOffset);
      paramInt2 = leftMargin + i1 + paramInt2;
      paramInt4 = paramInt2 - paramInt4;
      localView.layout(paramInt4, m, paramInt4 + n, localView.getMeasuredHeight() + m);
      paramInt1 += localView.getWidth();
    }
    label265:
    label270:
    label306:
    label381:
    label415:
    for (;;)
    {
      paramInt3 += 1;
      break label64;
      f = 0.0F;
      break;
      paramBoolean = false;
      break label186;
      if ((mCanSlide) && (mParallaxBy != 0)) {}
      for (paramInt2 = (int)((1.0F - mSlideOffset) * mParallaxBy);; paramInt2 = 0)
      {
        paramInt4 = paramInt2;
        paramInt2 = paramInt1;
        break;
        if (mFirstLayout)
        {
          if (!mCanSlide) {
            break label381;
          }
          if (mParallaxBy != 0) {
            parallaxOtherViews(mSlideOffset);
          }
          if (mSlideableView.getLayoutParams()).dimWhenOffset) {
            dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
          }
        }
        for (;;)
        {
          updateObscuredViewsVisibility(mSlideableView);
          mFirstLayout = false;
          return;
          paramInt1 = 0;
          while (paramInt1 < i)
          {
            dimChildView(getChildAt(paramInt1), 0.0F, mSliderFadeColor);
            paramInt1 += 1;
          }
        }
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int k = View.MeasureSpec.getMode(paramInt1);
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt2);
    if (k != 1073741824) {
      if (isInEditMode())
      {
        if ((k == Integer.MIN_VALUE) || (k != 0)) {
          break label1070;
        }
        i = j;
        j = 300;
      }
    }
    for (;;)
    {
      label93:
      boolean bool1;
      int i2;
      int i1;
      float f1;
      label140:
      View localView;
      SlidingPaneLayout.LayoutParams localLayoutParams;
      int m;
      switch (i)
      {
      default: 
        paramInt1 = 0;
        k = -1;
        bool1 = false;
        paramInt2 = j - getPaddingLeft() - getPaddingRight();
        i2 = getChildCount();
        if (i2 > 2) {
          Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        mSlideableView = null;
        i1 = 0;
        f1 = 0.0F;
        if (i1 < i2)
        {
          localView = getChildAt(i1);
          localLayoutParams = (SlidingPaneLayout.LayoutParams)localView.getLayoutParams();
          if (localView.getVisibility() == 8)
          {
            dimWhenOffset = false;
            m = paramInt2;
            paramInt2 = paramInt1;
            paramInt1 = m;
          }
        }
        break;
      }
      for (;;)
      {
        i1 += 1;
        m = paramInt2;
        paramInt2 = paramInt1;
        paramInt1 = m;
        break label140;
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        if (j != 0) {
          break label1070;
        }
        if (isInEditMode())
        {
          if (j != 0) {
            break label1070;
          }
          paramInt2 = Integer.MIN_VALUE;
          j = i;
          paramInt1 = 300;
          i = paramInt2;
          break;
        }
        throw new IllegalStateException("Height must not be UNSPECIFIED");
        paramInt1 = paramInt1 - getPaddingTop() - getPaddingBottom();
        k = paramInt1;
        break label93;
        k = getPaddingTop();
        m = getPaddingBottom();
        paramInt2 = 0;
        k = paramInt1 - k - m;
        paramInt1 = paramInt2;
        break label93;
        float f2 = f1;
        if (weight > 0.0F)
        {
          f2 = f1 + weight;
          if (width == 0) {}
        }
        else
        {
          m = leftMargin + rightMargin;
          label375:
          int n;
          label395:
          int i3;
          if (width == -2)
          {
            m = View.MeasureSpec.makeMeasureSpec(j - m, Integer.MIN_VALUE);
            if (height != -2) {
              break label537;
            }
            n = View.MeasureSpec.makeMeasureSpec(k, Integer.MIN_VALUE);
            localView.measure(m, n);
            n = localView.getMeasuredWidth();
            i3 = localView.getMeasuredHeight();
            m = paramInt1;
            if (i == Integer.MIN_VALUE)
            {
              m = paramInt1;
              if (i3 > paramInt1) {
                m = Math.min(i3, k);
              }
            }
            paramInt1 = paramInt2 - n;
            if (paramInt1 >= 0) {
              break label575;
            }
          }
          label537:
          label575:
          for (boolean bool2 = true;; bool2 = false)
          {
            slideable = bool2;
            if (slideable) {
              mSlideableView = localView;
            }
            f1 = f2;
            bool1 = bool2 | bool1;
            paramInt2 = m;
            break;
            if (width == -1)
            {
              m = View.MeasureSpec.makeMeasureSpec(j - m, 1073741824);
              break label375;
            }
            m = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
            break label375;
            if (height == -1)
            {
              n = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
              break label395;
            }
            n = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
            break label395;
          }
          if ((bool1) || (f1 > 0.0F))
          {
            i1 = j - mOverhangSize;
            m = 0;
            if (m < i2)
            {
              localView = getChildAt(m);
              if (localView.getVisibility() != 8)
              {
                localLayoutParams = (SlidingPaneLayout.LayoutParams)localView.getLayoutParams();
                if (localView.getVisibility() != 8)
                {
                  if ((width != 0) || (weight <= 0.0F)) {
                    break label766;
                  }
                  i = 1;
                  label670:
                  if (i == 0) {
                    break label772;
                  }
                  n = 0;
                  label678:
                  if ((!bool1) || (localView == mSlideableView)) {
                    break label836;
                  }
                  if ((width < 0) && ((n > i1) || (weight > 0.0F)))
                  {
                    if (i == 0) {
                      break label820;
                    }
                    if (height != -2) {
                      break label782;
                    }
                    i = View.MeasureSpec.makeMeasureSpec(k, Integer.MIN_VALUE);
                    label742:
                    localView.measure(View.MeasureSpec.makeMeasureSpec(i1, 1073741824), i);
                  }
                }
              }
              for (;;)
              {
                m += 1;
                break;
                label766:
                i = 0;
                break label670;
                label772:
                n = localView.getMeasuredWidth();
                break label678;
                label782:
                if (height == -1)
                {
                  i = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
                  break label742;
                }
                i = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
                break label742;
                label820:
                i = View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824);
                break label742;
                label836:
                if (weight > 0.0F)
                {
                  if (width == 0) {
                    if (height == -2) {
                      i = View.MeasureSpec.makeMeasureSpec(k, Integer.MIN_VALUE);
                    }
                  }
                  for (;;)
                  {
                    if (!bool1) {
                      break label982;
                    }
                    i3 = leftMargin;
                    i3 = j - (rightMargin + i3);
                    int i4 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    if (n == i3) {
                      break;
                    }
                    localView.measure(i4, i);
                    break;
                    if (height == -1)
                    {
                      i = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
                    }
                    else
                    {
                      i = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
                      continue;
                      i = View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824);
                    }
                  }
                  label982:
                  i3 = Math.max(0, paramInt2);
                  localView.measure(View.MeasureSpec.makeMeasureSpec((int)(weight * i3 / f1) + n, 1073741824), i);
                }
              }
            }
          }
          setMeasuredDimension(j, paramInt1);
          mCanSlide = bool1;
          if ((mDragHelper.getViewDragState() != 0) && (!bool1)) {
            mDragHelper.abort();
          }
          return;
        }
        m = paramInt1;
        f1 = f2;
        paramInt1 = paramInt2;
        paramInt2 = m;
      }
      label1070:
      paramInt2 = j;
      j = i;
      i = paramInt2;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (SlidingPaneLayout.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    if (isOpen) {
      openPane();
    }
    for (;;)
    {
      mPreservedOpenState = isOpen;
      return;
      closePane();
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SlidingPaneLayout.SavedState localSavedState = new SlidingPaneLayout.SavedState(super.onSaveInstanceState());
    if (isSlideable()) {}
    for (boolean bool = isOpen();; bool = mPreservedOpenState)
    {
      isOpen = bool;
      return localSavedState;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      mFirstLayout = true;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!mCanSlide) {
      return super.onTouchEvent(paramMotionEvent);
    }
    mDragHelper.processTouchEvent(paramMotionEvent);
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    for (;;)
    {
      return true;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      mInitialMotionX = f1;
      mInitialMotionY = f2;
      continue;
      if (isDimmed(mSlideableView))
      {
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        float f3 = f1 - mInitialMotionX;
        float f4 = f2 - mInitialMotionY;
        int i = mDragHelper.getTouchSlop();
        if ((f3 * f3 + f4 * f4 < i * i) && (mDragHelper.isViewUnder(mSlideableView, (int)f1, (int)f2))) {
          closePane(mSlideableView, 0);
        }
      }
    }
  }
  
  public boolean openPane()
  {
    return openPane(mSlideableView, 0);
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    super.requestChildFocus(paramView1, paramView2);
    if ((!isInTouchMode()) && (!mCanSlide)) {
      if (paramView1 != mSlideableView) {
        break label36;
      }
    }
    label36:
    for (boolean bool = true;; bool = false)
    {
      mPreservedOpenState = bool;
      return;
    }
  }
  
  void setAllChildrenVisible()
  {
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 4) {
        localView.setVisibility(0);
      }
      i += 1;
    }
  }
  
  public void setCoveredFadeColor(int paramInt)
  {
    mCoveredFadeColor = paramInt;
  }
  
  public void setPanelSlideListener(SlidingPaneLayout.PanelSlideListener paramPanelSlideListener)
  {
    mPanelSlideListener = paramPanelSlideListener;
  }
  
  public void setParallaxDistance(int paramInt)
  {
    mParallaxBy = paramInt;
    requestLayout();
  }
  
  public void setShadowDrawable(Drawable paramDrawable)
  {
    mShadowDrawable = paramDrawable;
  }
  
  public void setShadowResource(int paramInt)
  {
    setShadowDrawable(getResources().getDrawable(paramInt));
  }
  
  public void setSliderFadeColor(int paramInt)
  {
    mSliderFadeColor = paramInt;
  }
  
  public void smoothSlideClosed()
  {
    closePane();
  }
  
  public void smoothSlideOpen()
  {
    openPane();
  }
  
  boolean smoothSlideTo(float paramFloat, int paramInt)
  {
    if (!mCanSlide) {
      return false;
    }
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)mSlideableView.getLayoutParams();
    paramInt = getPaddingLeft();
    paramInt = (int)(leftMargin + paramInt + mSlideRange * paramFloat);
    if (mDragHelper.smoothSlideViewTo(mSlideableView, paramInt, mSlideableView.getTop()))
    {
      setAllChildrenVisible();
      ViewCompat.postInvalidateOnAnimation(this);
      return true;
    }
    return false;
  }
  
  void updateObscuredViewsVisibility(View paramView)
  {
    int i2 = getPaddingLeft();
    int i3 = getWidth();
    int i4 = getPaddingRight();
    int i5 = getPaddingTop();
    int i6 = getHeight();
    int i7 = getPaddingBottom();
    int m;
    int k;
    int j;
    int i;
    int n;
    label78:
    View localView;
    if ((paramView != null) && (viewIsOpaque(paramView)))
    {
      m = paramView.getLeft();
      k = paramView.getRight();
      j = paramView.getTop();
      i = paramView.getBottom();
      int i8 = getChildCount();
      n = 0;
      if (n >= i8) {
        return;
      }
      localView = getChildAt(n);
      if (localView == paramView) {
        return;
      }
      i1 = Math.max(i2, localView.getLeft());
      int i9 = Math.max(i5, localView.getTop());
      int i10 = Math.min(i3 - i4, localView.getRight());
      int i11 = Math.min(i6 - i7, localView.getBottom());
      if ((i1 < m) || (i9 < j) || (i10 > k) || (i11 > i)) {
        break label211;
      }
    }
    label211:
    for (int i1 = 4;; i1 = 0)
    {
      localView.setVisibility(i1);
      n += 1;
      break label78;
      i = 0;
      j = 0;
      k = 0;
      m = 0;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.SlidingPaneLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */