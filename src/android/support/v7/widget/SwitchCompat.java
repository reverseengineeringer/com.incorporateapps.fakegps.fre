package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.internal.text.AllCapsTransformationMethod;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.support.v7.internal.widget.ViewUtils;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.widget.CompoundButton;
import java.util.List;

public class SwitchCompat
  extends CompoundButton
{
  private static final int[] CHECKED_STATE_SET = { 16842912 };
  private static final int MONOSPACE = 3;
  private static final int SANS = 1;
  private static final int SERIF = 2;
  private static final int[] TEXT_APPEARANCE_ATTRS = { 16842904, 16842901, R.attr.textAllCaps };
  private static final int THUMB_ANIMATION_DURATION = 250;
  private static final int TOUCH_MODE_DOWN = 1;
  private static final int TOUCH_MODE_DRAGGING = 2;
  private static final int TOUCH_MODE_IDLE = 0;
  private int mMinFlingVelocity;
  private Layout mOffLayout;
  private Layout mOnLayout;
  private Animation mPositionAnimator;
  private boolean mShowText;
  private boolean mSplitTrack;
  private int mSwitchBottom;
  private int mSwitchHeight;
  private int mSwitchLeft;
  private int mSwitchMinWidth;
  private int mSwitchPadding;
  private int mSwitchRight;
  private int mSwitchTop;
  private TransformationMethod mSwitchTransformationMethod;
  private int mSwitchWidth;
  private final Rect mTempRect = new Rect();
  private ColorStateList mTextColors;
  private CharSequence mTextOff;
  private CharSequence mTextOn;
  private TextPaint mTextPaint = new TextPaint(1);
  private Drawable mThumbDrawable;
  private float mThumbPosition;
  private int mThumbTextPadding;
  private int mThumbWidth;
  private final TintManager mTintManager;
  private int mTouchMode;
  private int mTouchSlop;
  private float mTouchX;
  private float mTouchY;
  private Drawable mTrackDrawable;
  private VelocityTracker mVelocityTracker = VelocityTracker.obtain();
  
  public SwitchCompat(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.switchStyle);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = getResources();
    mTextPaint.density = getDisplayMetricsdensity;
    paramAttributeSet = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, R.styleable.SwitchCompat, paramInt, 0);
    mThumbDrawable = paramAttributeSet.getDrawable(R.styleable.SwitchCompat_android_thumb);
    mTrackDrawable = paramAttributeSet.getDrawable(R.styleable.SwitchCompat_track);
    mTextOn = paramAttributeSet.getText(R.styleable.SwitchCompat_android_textOn);
    mTextOff = paramAttributeSet.getText(R.styleable.SwitchCompat_android_textOff);
    mShowText = paramAttributeSet.getBoolean(R.styleable.SwitchCompat_showText, true);
    mThumbTextPadding = paramAttributeSet.getDimensionPixelSize(R.styleable.SwitchCompat_thumbTextPadding, 0);
    mSwitchMinWidth = paramAttributeSet.getDimensionPixelSize(R.styleable.SwitchCompat_switchMinWidth, 0);
    mSwitchPadding = paramAttributeSet.getDimensionPixelSize(R.styleable.SwitchCompat_switchPadding, 0);
    mSplitTrack = paramAttributeSet.getBoolean(R.styleable.SwitchCompat_splitTrack, false);
    paramInt = paramAttributeSet.getResourceId(R.styleable.SwitchCompat_switchTextAppearance, 0);
    if (paramInt != 0) {
      setSwitchTextAppearance(paramContext, paramInt);
    }
    mTintManager = paramAttributeSet.getTintManager();
    paramAttributeSet.recycle();
    paramContext = ViewConfiguration.get(paramContext);
    mTouchSlop = paramContext.getScaledTouchSlop();
    mMinFlingVelocity = paramContext.getScaledMinimumFlingVelocity();
    refreshDrawableState();
    setChecked(isChecked());
  }
  
  private void animateThumbToCheckedState(boolean paramBoolean)
  {
    float f2 = mThumbPosition;
    if (paramBoolean) {}
    for (float f1 = 1.0F;; f1 = 0.0F)
    {
      mPositionAnimator = new SwitchCompat.1(this, f2, f1 - f2);
      mPositionAnimator.setDuration(250L);
      startAnimation(mPositionAnimator);
      return;
    }
  }
  
  private void cancelPositionAnimator()
  {
    if (mPositionAnimator != null)
    {
      clearAnimation();
      mPositionAnimator = null;
    }
  }
  
  private void cancelSuperTouch(MotionEvent paramMotionEvent)
  {
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.setAction(3);
    super.onTouchEvent(paramMotionEvent);
    paramMotionEvent.recycle();
  }
  
  private static float constrain(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 < paramFloat2) {
      return paramFloat2;
    }
    if (paramFloat1 > paramFloat3) {
      return paramFloat3;
    }
    return paramFloat1;
  }
  
  private boolean getTargetCheckedState()
  {
    return mThumbPosition > 0.5F;
  }
  
  private int getThumbOffset()
  {
    if (ViewUtils.isLayoutRtl(this)) {}
    for (float f = 1.0F - mThumbPosition;; f = mThumbPosition) {
      return (int)(f * getThumbScrollRange() + 0.5F);
    }
  }
  
  private int getThumbScrollRange()
  {
    if (mTrackDrawable != null)
    {
      Rect localRect = mTempRect;
      mTrackDrawable.getPadding(localRect);
      return mSwitchWidth - mThumbWidth - left - right;
    }
    return 0;
  }
  
  private boolean hitThumb(float paramFloat1, float paramFloat2)
  {
    int k = getThumbOffset();
    mThumbDrawable.getPadding(mTempRect);
    int i = mSwitchTop;
    int j = mTouchSlop;
    k = k + mSwitchLeft - mTouchSlop;
    int m = mThumbWidth;
    int n = mTempRect.left;
    int i1 = mTempRect.right;
    int i2 = mTouchSlop;
    int i3 = mSwitchBottom;
    int i4 = mTouchSlop;
    return (paramFloat1 > k) && (paramFloat1 < m + k + n + i1 + i2) && (paramFloat2 > i - j) && (paramFloat2 < i3 + i4);
  }
  
  private Layout makeLayout(CharSequence paramCharSequence)
  {
    if (mSwitchTransformationMethod != null) {
      paramCharSequence = mSwitchTransformationMethod.getTransformation(paramCharSequence, this);
    }
    for (;;)
    {
      return new StaticLayout(paramCharSequence, mTextPaint, (int)Math.ceil(Layout.getDesiredWidth(paramCharSequence, mTextPaint)), Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
    }
  }
  
  private void setThumbPosition(float paramFloat)
  {
    mThumbPosition = paramFloat;
    invalidate();
  }
  
  private void stopDrag(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    mTouchMode = 0;
    int i;
    float f;
    if ((paramMotionEvent.getAction() == 1) && (isEnabled()))
    {
      i = 1;
      if (i == 0) {
        break label117;
      }
      mVelocityTracker.computeCurrentVelocity(1000);
      f = mVelocityTracker.getXVelocity();
      if (Math.abs(f) <= mMinFlingVelocity) {
        break label108;
      }
      if (!ViewUtils.isLayoutRtl(this)) {
        break label96;
      }
      if (f >= 0.0F) {
        break label90;
      }
    }
    for (;;)
    {
      setChecked(bool);
      cancelSuperTouch(paramMotionEvent);
      return;
      i = 0;
      break;
      label90:
      bool = false;
      continue;
      label96:
      if (f <= 0.0F)
      {
        bool = false;
        continue;
        label108:
        bool = getTargetCheckedState();
        continue;
        label117:
        bool = isChecked();
      }
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    Object localObject = mTempRect;
    int n = mSwitchLeft;
    int k = mSwitchTop;
    int i1 = mSwitchRight;
    int m = mSwitchBottom;
    int j = getThumbOffset() + n;
    int i = j;
    if (mTrackDrawable != null)
    {
      mTrackDrawable.getPadding((Rect)localObject);
      i = j + left;
      mTrackDrawable.setBounds(n, k, i1, m);
    }
    if (mThumbDrawable != null)
    {
      mThumbDrawable.getPadding((Rect)localObject);
      j = i - left;
      i = i + mThumbWidth + right;
      mThumbDrawable.setBounds(j, k, i, m);
      localObject = getBackground();
      if (localObject != null) {
        DrawableCompat.setHotspotBounds((Drawable)localObject, j, k, i, m);
      }
    }
    super.draw(paramCanvas);
  }
  
  public void drawableHotspotChanged(float paramFloat1, float paramFloat2)
  {
    super.drawableHotspotChanged(paramFloat1, paramFloat2);
    if (mThumbDrawable != null) {
      DrawableCompat.setHotspot(mThumbDrawable, paramFloat1, paramFloat2);
    }
    if (mTrackDrawable != null) {
      DrawableCompat.setHotspot(mTrackDrawable, paramFloat1, paramFloat2);
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    if (mThumbDrawable != null) {
      mThumbDrawable.setState(arrayOfInt);
    }
    if (mTrackDrawable != null) {
      mTrackDrawable.setState(arrayOfInt);
    }
    invalidate();
  }
  
  public int getCompoundPaddingLeft()
  {
    int i;
    if (!ViewUtils.isLayoutRtl(this)) {
      i = super.getCompoundPaddingLeft();
    }
    int j;
    do
    {
      return i;
      j = super.getCompoundPaddingLeft() + mSwitchWidth;
      i = j;
    } while (TextUtils.isEmpty(getText()));
    return j + mSwitchPadding;
  }
  
  public int getCompoundPaddingRight()
  {
    int i;
    if (ViewUtils.isLayoutRtl(this)) {
      i = super.getCompoundPaddingRight();
    }
    int j;
    do
    {
      return i;
      j = super.getCompoundPaddingRight() + mSwitchWidth;
      i = j;
    } while (TextUtils.isEmpty(getText()));
    return j + mSwitchPadding;
  }
  
  public boolean getShowText()
  {
    return mShowText;
  }
  
  public boolean getSplitTrack()
  {
    return mSplitTrack;
  }
  
  public int getSwitchMinWidth()
  {
    return mSwitchMinWidth;
  }
  
  public int getSwitchPadding()
  {
    return mSwitchPadding;
  }
  
  public CharSequence getTextOff()
  {
    return mTextOff;
  }
  
  public CharSequence getTextOn()
  {
    return mTextOn;
  }
  
  public Drawable getThumbDrawable()
  {
    return mThumbDrawable;
  }
  
  public int getThumbTextPadding()
  {
    return mThumbTextPadding;
  }
  
  public Drawable getTrackDrawable()
  {
    return mTrackDrawable;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      super.jumpDrawablesToCurrentState();
      if (mThumbDrawable != null) {
        mThumbDrawable.jumpToCurrentState();
      }
      if (mTrackDrawable != null) {
        mTrackDrawable.jumpToCurrentState();
      }
      if ((mPositionAnimator != null) && (mPositionAnimator.hasStarted()) && (!mPositionAnimator.hasEnded()))
      {
        clearAnimation();
        mPositionAnimator = null;
      }
    }
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked()) {
      mergeDrawableStates(arrayOfInt, CHECKED_STATE_SET);
    }
    return arrayOfInt;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Object localObject2 = mTempRect;
    Object localObject1 = mTrackDrawable;
    int k;
    int m;
    int n;
    int i1;
    int j;
    if (localObject1 != null)
    {
      ((Drawable)localObject1).getPadding((Rect)localObject2);
      k = mSwitchTop;
      m = mSwitchBottom;
      n = top;
      i1 = bottom;
      localObject2 = mThumbDrawable;
      if (localObject1 != null) {
        ((Drawable)localObject1).draw(paramCanvas);
      }
      j = paramCanvas.save();
      if (localObject2 != null) {
        ((Drawable)localObject2).draw(paramCanvas);
      }
      if (!getTargetCheckedState()) {
        break label244;
      }
      localObject1 = mOnLayout;
      label102:
      if (localObject1 != null)
      {
        int[] arrayOfInt = getDrawableState();
        if (mTextColors != null) {
          mTextPaint.setColor(mTextColors.getColorForState(arrayOfInt, 0));
        }
        mTextPaint.drawableState = arrayOfInt;
        if (localObject2 == null) {
          break label253;
        }
        localObject2 = ((Drawable)localObject2).getBounds();
        i = left;
      }
    }
    label244:
    label253:
    for (int i = right + i;; i = getWidth())
    {
      i /= 2;
      int i2 = ((Layout)localObject1).getWidth() / 2;
      k = (k + n + (m - i1)) / 2;
      m = ((Layout)localObject1).getHeight() / 2;
      paramCanvas.translate(i - i2, k - m);
      ((Layout)localObject1).draw(paramCanvas);
      paramCanvas.restoreToCount(j);
      return;
      ((Rect)localObject2).setEmpty();
      break;
      localObject1 = mOffLayout;
      break label102;
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(SwitchCompat.class.getName());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(SwitchCompat.class.getName());
      if (!isChecked()) {
        break label59;
      }
    }
    CharSequence localCharSequence2;
    label59:
    for (CharSequence localCharSequence1 = mTextOn;; localCharSequence1 = mTextOff)
    {
      if (!TextUtils.isEmpty(localCharSequence1))
      {
        localCharSequence2 = paramAccessibilityNodeInfo.getText();
        if (!TextUtils.isEmpty(localCharSequence2)) {
          break;
        }
        paramAccessibilityNodeInfo.setText(localCharSequence1);
      }
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localCharSequence2).append(' ').append(localCharSequence1);
    paramAccessibilityNodeInfo.setText(localStringBuilder);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Rect localRect;
    if (mThumbDrawable != null)
    {
      localRect = mTempRect;
      if (mTrackDrawable != null) {
        mTrackDrawable.getPadding(localRect);
      }
    }
    else
    {
      if (!ViewUtils.isLayoutRtl(this)) {
        break label147;
      }
      paramInt3 = getPaddingLeft() + 0;
      paramInt4 = mSwitchWidth + paramInt3 + 0 + 0;
      label69:
      switch (getGravity() & 0x70)
      {
      default: 
        paramInt2 = getPaddingTop();
        paramInt1 = mSwitchHeight + paramInt2;
      }
    }
    for (;;)
    {
      mSwitchLeft = paramInt3;
      mSwitchTop = paramInt2;
      mSwitchBottom = paramInt1;
      mSwitchRight = paramInt4;
      return;
      localRect.setEmpty();
      break;
      label147:
      paramInt4 = getWidth() - getPaddingRight() + 0;
      paramInt3 = paramInt4 - mSwitchWidth + 0 + 0;
      break label69;
      paramInt2 = (getPaddingTop() + getHeight() - getPaddingBottom()) / 2 - mSwitchHeight / 2;
      paramInt1 = mSwitchHeight + paramInt2;
      continue;
      paramInt1 = getHeight() - getPaddingBottom();
      paramInt2 = paramInt1 - mSwitchHeight;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int m = 0;
    if (mShowText)
    {
      if (mOnLayout == null) {
        mOnLayout = makeLayout(mTextOn);
      }
      if (mOffLayout == null) {
        mOffLayout = makeLayout(mTextOff);
      }
    }
    Rect localRect = mTempRect;
    int i;
    int k;
    if (mThumbDrawable != null)
    {
      mThumbDrawable.getPadding(localRect);
      j = mThumbDrawable.getIntrinsicWidth() - left - right;
      i = mThumbDrawable.getIntrinsicHeight();
      if (!mShowText) {
        break label255;
      }
      k = Math.max(mOnLayout.getWidth(), mOffLayout.getWidth()) + mThumbTextPadding * 2;
      label133:
      mThumbWidth = Math.max(k, j);
      if (mTrackDrawable == null) {
        break label261;
      }
      mTrackDrawable.getPadding(localRect);
    }
    for (int j = mTrackDrawable.getIntrinsicHeight();; j = m)
    {
      k = left;
      m = right;
      k = Math.max(mSwitchMinWidth, k + mThumbWidth * 2 + m);
      i = Math.max(j, i);
      mSwitchWidth = k;
      mSwitchHeight = i;
      super.onMeasure(paramInt1, paramInt2);
      if (getMeasuredHeight() < i) {
        setMeasuredDimension(ViewCompat.getMeasuredWidthAndState(this), i);
      }
      return;
      i = 0;
      j = 0;
      break;
      label255:
      k = 0;
      break label133;
      label261:
      localRect.setEmpty();
    }
  }
  
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    if (isChecked()) {}
    for (CharSequence localCharSequence = mTextOn;; localCharSequence = mTextOff)
    {
      if (localCharSequence != null) {
        paramAccessibilityEvent.getText().add(localCharSequence);
      }
      return;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    mVelocityTracker.addMovement(paramMotionEvent);
    switch (MotionEventCompat.getActionMasked(paramMotionEvent))
    {
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      if ((isEnabled()) && (hitThumb(f1, f2)))
      {
        mTouchMode = 1;
        mTouchX = f1;
        mTouchY = f2;
        continue;
        switch (mTouchMode)
        {
        case 0: 
        default: 
          break;
        case 1: 
          f1 = paramMotionEvent.getX();
          f2 = paramMotionEvent.getY();
          if ((Math.abs(f1 - mTouchX) > mTouchSlop) || (Math.abs(f2 - mTouchY) > mTouchSlop))
          {
            mTouchMode = 2;
            getParent().requestDisallowInterceptTouchEvent(true);
            mTouchX = f1;
            mTouchY = f2;
            return true;
          }
          break;
        case 2: 
          float f3 = paramMotionEvent.getX();
          int i = getThumbScrollRange();
          f1 = f3 - mTouchX;
          if (i != 0) {
            f1 /= i;
          }
          for (;;)
          {
            f2 = f1;
            if (ViewUtils.isLayoutRtl(this)) {
              f2 = -f1;
            }
            f1 = constrain(f2 + mThumbPosition, 0.0F, 1.0F);
            if (f1 != mThumbPosition)
            {
              mTouchX = f3;
              setThumbPosition(f1);
            }
            return true;
            if (f1 > 0.0F) {
              f1 = 1.0F;
            } else {
              f1 = -1.0F;
            }
          }
          if (mTouchMode == 2)
          {
            stopDrag(paramMotionEvent);
            super.onTouchEvent(paramMotionEvent);
            return true;
          }
          mTouchMode = 0;
          mVelocityTracker.clear();
        }
      }
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    super.setChecked(paramBoolean);
    paramBoolean = isChecked();
    if (getWindowToken() != null)
    {
      animateThumbToCheckedState(paramBoolean);
      return;
    }
    cancelPositionAnimator();
    if (paramBoolean) {}
    for (float f = 1.0F;; f = 0.0F)
    {
      setThumbPosition(f);
      return;
    }
  }
  
  public void setShowText(boolean paramBoolean)
  {
    if (mShowText != paramBoolean)
    {
      mShowText = paramBoolean;
      requestLayout();
    }
  }
  
  public void setSplitTrack(boolean paramBoolean)
  {
    mSplitTrack = paramBoolean;
    invalidate();
  }
  
  public void setSwitchMinWidth(int paramInt)
  {
    mSwitchMinWidth = paramInt;
    requestLayout();
  }
  
  public void setSwitchPadding(int paramInt)
  {
    mSwitchPadding = paramInt;
    requestLayout();
  }
  
  public void setSwitchTextAppearance(Context paramContext, int paramInt)
  {
    paramContext = paramContext.obtainStyledAttributes(paramInt, TEXT_APPEARANCE_ATTRS);
    ColorStateList localColorStateList = paramContext.getColorStateList(0);
    if (localColorStateList != null)
    {
      mTextColors = localColorStateList;
      paramInt = paramContext.getDimensionPixelSize(1, 0);
      if ((paramInt != 0) && (paramInt != mTextPaint.getTextSize()))
      {
        mTextPaint.setTextSize(paramInt);
        requestLayout();
      }
      if (!paramContext.getBoolean(2, false)) {
        break label101;
      }
    }
    label101:
    for (mSwitchTransformationMethod = new AllCapsTransformationMethod(getContext());; mSwitchTransformationMethod = null)
    {
      paramContext.recycle();
      return;
      mTextColors = getTextColors();
      break;
    }
  }
  
  public void setSwitchTypeface(Typeface paramTypeface)
  {
    if (mTextPaint.getTypeface() != paramTypeface)
    {
      mTextPaint.setTypeface(paramTypeface);
      requestLayout();
      invalidate();
    }
  }
  
  public void setSwitchTypeface(Typeface paramTypeface, int paramInt)
  {
    boolean bool = false;
    if (paramInt > 0)
    {
      int i;
      if (paramTypeface == null)
      {
        paramTypeface = Typeface.defaultFromStyle(paramInt);
        setSwitchTypeface(paramTypeface);
        if (paramTypeface == null) {
          break label88;
        }
        i = paramTypeface.getStyle();
        label31:
        paramInt = (i ^ 0xFFFFFFFF) & paramInt;
        paramTypeface = mTextPaint;
        if ((paramInt & 0x1) != 0) {
          bool = true;
        }
        paramTypeface.setFakeBoldText(bool);
        paramTypeface = mTextPaint;
        if ((paramInt & 0x2) == 0) {
          break label94;
        }
      }
      label88:
      label94:
      for (float f = -0.25F;; f = 0.0F)
      {
        paramTypeface.setTextSkewX(f);
        return;
        paramTypeface = Typeface.create(paramTypeface, paramInt);
        break;
        i = 0;
        break label31;
      }
    }
    mTextPaint.setFakeBoldText(false);
    mTextPaint.setTextSkewX(0.0F);
    setSwitchTypeface(paramTypeface);
  }
  
  public void setTextOff(CharSequence paramCharSequence)
  {
    mTextOff = paramCharSequence;
    requestLayout();
  }
  
  public void setTextOn(CharSequence paramCharSequence)
  {
    mTextOn = paramCharSequence;
    requestLayout();
  }
  
  public void setThumbDrawable(Drawable paramDrawable)
  {
    mThumbDrawable = paramDrawable;
    requestLayout();
  }
  
  public void setThumbResource(int paramInt)
  {
    setThumbDrawable(mTintManager.getDrawable(paramInt));
  }
  
  public void setThumbTextPadding(int paramInt)
  {
    mThumbTextPadding = paramInt;
    requestLayout();
  }
  
  public void setTrackDrawable(Drawable paramDrawable)
  {
    mTrackDrawable = paramDrawable;
    requestLayout();
  }
  
  public void setTrackResource(int paramInt)
  {
    setTrackDrawable(mTintManager.getDrawable(paramInt));
  }
  
  public void toggle()
  {
    if (!isChecked()) {}
    for (boolean bool = true;; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == mThumbDrawable) || (paramDrawable == mTrackDrawable);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.widget.SwitchCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */