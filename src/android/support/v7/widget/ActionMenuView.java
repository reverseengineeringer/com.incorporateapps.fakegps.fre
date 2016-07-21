package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuBuilder.Callback;
import android.support.v7.internal.view.menu.MenuBuilder.ItemInvoker;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.support.v7.internal.view.menu.MenuPresenter.Callback;
import android.support.v7.internal.view.menu.MenuView;
import android.support.v7.internal.widget.ViewUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView
  extends LinearLayoutCompat
  implements MenuBuilder.ItemInvoker, MenuView
{
  static final int GENERATED_ITEM_PADDING = 4;
  static final int MIN_CELL_SIZE = 56;
  private static final String TAG = "ActionMenuView";
  private MenuPresenter.Callback mActionMenuPresenterCallback;
  private Context mContext;
  private boolean mFormatItems;
  private int mFormatItemsWidth;
  private int mGeneratedItemPadding;
  private MenuBuilder mMenu;
  private MenuBuilder.Callback mMenuBuilderCallback;
  private int mMinCellSize;
  private ActionMenuView.OnMenuItemClickListener mOnMenuItemClickListener;
  private Context mPopupContext;
  private int mPopupTheme;
  private ActionMenuPresenter mPresenter;
  private boolean mReserveOverflow;
  
  public ActionMenuView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    mContext = paramContext;
    setBaselineAligned(false);
    float f = getResourcesgetDisplayMetricsdensity;
    mMinCellSize = ((int)(56.0F * f));
    mGeneratedItemPadding = ((int)(f * 4.0F));
    mPopupContext = paramContext;
    mPopupTheme = 0;
  }
  
  static int measureChildForCells(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool2 = false;
    ActionMenuView.LayoutParams localLayoutParams = (ActionMenuView.LayoutParams)paramView.getLayoutParams();
    int i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt3) - paramInt4, View.MeasureSpec.getMode(paramInt3));
    ActionMenuItemView localActionMenuItemView;
    if ((paramView instanceof ActionMenuItemView))
    {
      localActionMenuItemView = (ActionMenuItemView)paramView;
      if ((localActionMenuItemView == null) || (!localActionMenuItemView.hasText())) {
        break label184;
      }
      paramInt4 = 1;
      label57:
      if ((paramInt2 <= 0) || ((paramInt4 != 0) && (paramInt2 < 2))) {
        break label190;
      }
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, Integer.MIN_VALUE), i);
      int j = paramView.getMeasuredWidth();
      paramInt3 = j / paramInt1;
      paramInt2 = paramInt3;
      if (j % paramInt1 != 0) {
        paramInt2 = paramInt3 + 1;
      }
      paramInt3 = paramInt2;
      if (paramInt4 != 0)
      {
        paramInt3 = paramInt2;
        if (paramInt2 >= 2) {}
      }
    }
    label184:
    label190:
    for (paramInt3 = 2;; paramInt3 = 0)
    {
      boolean bool1 = bool2;
      if (!isOverflowButton)
      {
        bool1 = bool2;
        if (paramInt4 != 0) {
          bool1 = true;
        }
      }
      expandable = bool1;
      cellsUsed = paramInt3;
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt3 * paramInt1, 1073741824), i);
      return paramInt3;
      localActionMenuItemView = null;
      break;
      paramInt4 = 0;
      break label57;
    }
  }
  
  private void onMeasureExactFormat(int paramInt1, int paramInt2)
  {
    int i7 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int i6 = View.MeasureSpec.getSize(paramInt2);
    int i = getPaddingLeft();
    int j = getPaddingRight();
    int i4 = getPaddingTop() + getPaddingBottom();
    int i8 = getChildMeasureSpec(paramInt2, i4, -2);
    int i9 = paramInt1 - (i + j);
    paramInt1 = i9 / mMinCellSize;
    paramInt2 = mMinCellSize;
    if (paramInt1 == 0)
    {
      setMeasuredDimension(i9, 0);
      return;
    }
    int i10 = mMinCellSize + i9 % paramInt2 / paramInt1;
    paramInt2 = 0;
    int n = 0;
    int m = 0;
    int i1 = 0;
    int k = 0;
    long l1 = 0L;
    int i11 = getChildCount();
    int i2 = 0;
    Object localObject;
    boolean bool;
    ActionMenuView.LayoutParams localLayoutParams;
    label246:
    label264:
    int i3;
    label302:
    label313:
    long l2;
    if (i2 < i11)
    {
      localObject = getChildAt(i2);
      if (((View)localObject).getVisibility() == 8) {
        break label1278;
      }
      bool = localObject instanceof ActionMenuItemView;
      i1 += 1;
      if (bool) {
        ((View)localObject).setPadding(mGeneratedItemPadding, 0, mGeneratedItemPadding, 0);
      }
      localLayoutParams = (ActionMenuView.LayoutParams)((View)localObject).getLayoutParams();
      expanded = false;
      extraPixels = 0;
      cellsUsed = 0;
      expandable = false;
      leftMargin = 0;
      rightMargin = 0;
      if ((bool) && (((ActionMenuItemView)localObject).hasText()))
      {
        bool = true;
        preventEdgeOffset = bool;
        if (!isOverflowButton) {
          break label407;
        }
        i = 1;
        i3 = measureChildForCells((View)localObject, i10, i, i8, i4);
        n = Math.max(n, i3);
        if (!expandable) {
          break label1271;
        }
        i = m + 1;
        if (!isOverflowButton) {
          break label1264;
        }
        j = 1;
        paramInt1 -= i3;
        m = Math.max(paramInt2, ((View)localObject).getMeasuredHeight());
        if (i3 != 1) {
          break label1226;
        }
        l2 = 1 << i2;
        paramInt2 = m;
        k = paramInt1;
        m = i;
        i3 = j;
        l1 = l2 | l1;
        paramInt1 = i1;
        j = k;
        i = paramInt2;
        k = i3;
        paramInt2 = n;
      }
    }
    for (;;)
    {
      i2 += 1;
      i1 = paramInt1;
      paramInt1 = j;
      n = paramInt2;
      paramInt2 = i;
      break;
      bool = false;
      break label246;
      label407:
      i = paramInt1;
      break label264;
      long l3;
      if ((k != 0) && (i1 == 2))
      {
        i3 = 1;
        i = 0;
        i2 = paramInt1;
        paramInt1 = i;
        l3 = l1;
        if (m <= 0) {
          break label757;
        }
        l3 = l1;
        if (i2 <= 0) {
          break label757;
        }
        i = Integer.MAX_VALUE;
        l2 = 0L;
        j = 0;
        i4 = 0;
        label467:
        if (i4 >= i11) {
          break label591;
        }
        localObject = (ActionMenuView.LayoutParams)getChildAt(i4).getLayoutParams();
        if (!expandable) {
          break label1211;
        }
        if (cellsUsed >= i) {
          break label554;
        }
        j = cellsUsed;
        l2 = 1 << i4;
        i = 1;
      }
      for (;;)
      {
        int i5 = i4 + 1;
        i4 = j;
        j = i;
        i = i4;
        i4 = i5;
        break label467;
        i3 = 0;
        break;
        label554:
        if (cellsUsed == i)
        {
          l2 |= 1 << i4;
          i5 = j + 1;
          j = i;
          i = i5;
          continue;
          label591:
          l1 |= l2;
          l3 = l1;
          if (j <= i2)
          {
            j = 0;
            paramInt1 = i2;
            label615:
            if (j < i11)
            {
              localObject = getChildAt(j);
              localLayoutParams = (ActionMenuView.LayoutParams)((View)localObject).getLayoutParams();
              if ((1 << j & l2) == 0L)
              {
                if (cellsUsed != i + 1) {
                  break label1208;
                }
                l1 |= 1 << j;
              }
            }
          }
          label757:
          label921:
          label924:
          label1032:
          label1100:
          label1103:
          label1106:
          label1202:
          label1208:
          for (;;)
          {
            j += 1;
            break label615;
            if ((i3 != 0) && (preventEdgeOffset) && (paramInt1 == 1)) {
              ((View)localObject).setPadding(mGeneratedItemPadding + i10, 0, mGeneratedItemPadding, 0);
            }
            cellsUsed += 1;
            expanded = true;
            paramInt1 -= 1;
            continue;
            i = 1;
            i2 = paramInt1;
            paramInt1 = i;
            break;
            float f2;
            float f1;
            if ((k == 0) && (i1 == 1))
            {
              i = 1;
              if ((i2 <= 0) || (l3 == 0L) || ((i2 >= i1 - 1) && (i == 0) && (n <= 1))) {
                break label1103;
              }
              float f3 = Long.bitCount(l3);
              f2 = f3;
              if (i != 0) {
                break label1202;
              }
              f1 = f3;
              if ((1L & l3) != 0L)
              {
                f1 = f3;
                if (!getChildAt0getLayoutParamspreventEdgeOffset) {
                  f1 = f3 - 0.5F;
                }
              }
              f2 = f1;
              if ((1 << i11 - 1 & l3) == 0L) {
                break label1202;
              }
              f2 = f1;
              if (getChildAt1getLayoutParamspreventEdgeOffset) {
                break label1202;
              }
            }
            for (f1 -= 0.5F;; f1 = f2)
            {
              if (f1 > 0.0F)
              {
                i = (int)(i2 * i10 / f1);
                j = 0;
                k = paramInt1;
                if (j >= i11) {
                  break label1106;
                }
                if ((1 << j & l3) == 0L) {
                  break label1100;
                }
                localObject = getChildAt(j);
                localLayoutParams = (ActionMenuView.LayoutParams)((View)localObject).getLayoutParams();
                if (!(localObject instanceof ActionMenuItemView)) {
                  break label1032;
                }
                extraPixels = i;
                expanded = true;
                if ((j == 0) && (!preventEdgeOffset)) {
                  leftMargin = (-i / 2);
                }
                paramInt1 = 1;
              }
              for (;;)
              {
                j += 1;
                break label924;
                i = 0;
                break;
                i = 0;
                break label921;
                if (isOverflowButton)
                {
                  extraPixels = i;
                  expanded = true;
                  rightMargin = (-i / 2);
                  paramInt1 = 1;
                }
                else
                {
                  if (j != 0) {
                    leftMargin = (i / 2);
                  }
                  if (j != i11 - 1) {
                    rightMargin = (i / 2);
                  }
                }
              }
              k = paramInt1;
              if (k != 0)
              {
                paramInt1 = 0;
                while (paramInt1 < i11)
                {
                  localObject = getChildAt(paramInt1);
                  localLayoutParams = (ActionMenuView.LayoutParams)((View)localObject).getLayoutParams();
                  if (expanded)
                  {
                    i = cellsUsed;
                    ((View)localObject).measure(View.MeasureSpec.makeMeasureSpec(extraPixels + i * i10, 1073741824), i8);
                  }
                  paramInt1 += 1;
                }
              }
              if (i7 != 1073741824) {}
              for (;;)
              {
                setMeasuredDimension(i9, paramInt2);
                return;
                paramInt2 = i6;
              }
            }
          }
        }
        else
        {
          label1211:
          i5 = i;
          i = j;
          j = i5;
        }
      }
      label1226:
      paramInt2 = i1;
      k = n;
      n = m;
      i1 = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = k;
      m = i;
      k = j;
      i = n;
      j = i1;
      continue;
      label1264:
      j = k;
      break label313;
      label1271:
      i = m;
      break label302;
      label1278:
      i = paramInt2;
      j = paramInt1;
      paramInt2 = n;
      paramInt1 = i1;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return (paramLayoutParams != null) && ((paramLayoutParams instanceof ActionMenuView.LayoutParams));
  }
  
  public void dismissPopupMenus()
  {
    if (mPresenter != null) {
      mPresenter.dismissPopupMenus();
    }
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }
  
  protected ActionMenuView.LayoutParams generateDefaultLayoutParams()
  {
    ActionMenuView.LayoutParams localLayoutParams = new ActionMenuView.LayoutParams(-2, -2);
    gravity = 16;
    return localLayoutParams;
  }
  
  public ActionMenuView.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ActionMenuView.LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ActionMenuView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null)
    {
      if ((paramLayoutParams instanceof ActionMenuView.LayoutParams)) {}
      for (paramLayoutParams = new ActionMenuView.LayoutParams((ActionMenuView.LayoutParams)paramLayoutParams);; paramLayoutParams = new ActionMenuView.LayoutParams(paramLayoutParams))
      {
        if (gravity <= 0) {
          gravity = 16;
        }
        return paramLayoutParams;
      }
    }
    return generateDefaultLayoutParams();
  }
  
  public ActionMenuView.LayoutParams generateOverflowButtonLayoutParams()
  {
    ActionMenuView.LayoutParams localLayoutParams = generateDefaultLayoutParams();
    isOverflowButton = true;
    return localLayoutParams;
  }
  
  public Menu getMenu()
  {
    ActionMenuPresenter localActionMenuPresenter;
    if (mMenu == null)
    {
      localObject = getContext();
      mMenu = new MenuBuilder((Context)localObject);
      mMenu.setCallback(new ActionMenuView.MenuBuilderCallback(this, null));
      mPresenter = new ActionMenuPresenter((Context)localObject);
      mPresenter.setReserveOverflow(true);
      localActionMenuPresenter = mPresenter;
      if (mActionMenuPresenterCallback == null) {
        break label110;
      }
    }
    label110:
    for (Object localObject = mActionMenuPresenterCallback;; localObject = new ActionMenuView.ActionMenuPresenterCallback(this, null))
    {
      localActionMenuPresenter.setCallback((MenuPresenter.Callback)localObject);
      mMenu.addMenuPresenter(mPresenter, mPopupContext);
      mPresenter.setMenuView(this);
      return mMenu;
    }
  }
  
  public int getPopupTheme()
  {
    return mPopupTheme;
  }
  
  public int getWindowAnimations()
  {
    return 0;
  }
  
  protected boolean hasSupportDividerBeforeChildAt(int paramInt)
  {
    boolean bool2 = false;
    if (paramInt == 0) {
      return false;
    }
    View localView1 = getChildAt(paramInt - 1);
    View localView2 = getChildAt(paramInt);
    boolean bool1 = bool2;
    if (paramInt < getChildCount())
    {
      bool1 = bool2;
      if ((localView1 instanceof ActionMenuView.ActionMenuChildView)) {
        bool1 = ((ActionMenuView.ActionMenuChildView)localView1).needsDividerAfter() | false;
      }
    }
    if ((paramInt > 0) && ((localView2 instanceof ActionMenuView.ActionMenuChildView))) {
      return ((ActionMenuView.ActionMenuChildView)localView2).needsDividerBefore() | bool1;
    }
    return bool1;
  }
  
  public boolean hideOverflowMenu()
  {
    return (mPresenter != null) && (mPresenter.hideOverflowMenu());
  }
  
  public void initialize(MenuBuilder paramMenuBuilder)
  {
    mMenu = paramMenuBuilder;
  }
  
  public boolean invokeItem(MenuItemImpl paramMenuItemImpl)
  {
    return mMenu.performItemAction(paramMenuItemImpl, 0);
  }
  
  public boolean isOverflowMenuShowPending()
  {
    return (mPresenter != null) && (mPresenter.isOverflowMenuShowPending());
  }
  
  public boolean isOverflowMenuShowing()
  {
    return (mPresenter != null) && (mPresenter.isOverflowMenuShowing());
  }
  
  public boolean isOverflowReserved()
  {
    return mReserveOverflow;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    mPresenter.updateMenuView(false);
    if ((mPresenter != null) && (mPresenter.isOverflowMenuShowing()))
    {
      mPresenter.hideOverflowMenu();
      mPresenter.showOverflowMenu();
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    dismissPopupMenus();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!mFormatItems)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    int i1 = getChildCount();
    int n = (paramInt4 - paramInt2) / 2;
    int i2 = getDividerWidth();
    paramInt2 = 0;
    paramInt4 = paramInt3 - paramInt1 - getPaddingRight() - getPaddingLeft();
    int j = 0;
    paramBoolean = ViewUtils.isLayoutRtl(this);
    int i = 0;
    label68:
    View localView;
    ActionMenuView.LayoutParams localLayoutParams;
    int k;
    int m;
    if (i < i1)
    {
      localView = getChildAt(i);
      if (localView.getVisibility() == 8) {
        break label669;
      }
      localLayoutParams = (ActionMenuView.LayoutParams)localView.getLayoutParams();
      if (isOverflowButton)
      {
        k = localView.getMeasuredWidth();
        j = k;
        if (hasSupportDividerBeforeChildAt(i)) {
          j = k + i2;
        }
        int i3 = localView.getMeasuredHeight();
        if (paramBoolean)
        {
          k = getPaddingLeft();
          k = leftMargin + k;
          m = k + j;
          label172:
          int i4 = n - i3 / 2;
          localView.layout(k, i4, m, i3 + i4);
          k = paramInt4 - j;
          j = 1;
          paramInt4 = paramInt2;
          paramInt2 = k;
        }
      }
    }
    for (;;)
    {
      k = i + 1;
      i = paramInt4;
      paramInt4 = paramInt2;
      paramInt2 = i;
      i = k;
      break label68;
      m = getWidth() - getPaddingRight() - rightMargin;
      k = m - j;
      break label172;
      k = localView.getMeasuredWidth();
      m = leftMargin;
      paramInt4 -= rightMargin + (k + m);
      hasSupportDividerBeforeChildAt(i);
      k = paramInt2 + 1;
      paramInt2 = paramInt4;
      paramInt4 = k;
      continue;
      if ((i1 == 1) && (j == 0))
      {
        localView = getChildAt(0);
        paramInt2 = localView.getMeasuredWidth();
        paramInt4 = localView.getMeasuredHeight();
        paramInt1 = (paramInt3 - paramInt1) / 2 - paramInt2 / 2;
        paramInt3 = n - paramInt4 / 2;
        localView.layout(paramInt1, paramInt3, paramInt2 + paramInt1, paramInt4 + paramInt3);
        return;
      }
      if (j != 0)
      {
        paramInt1 = 0;
        label390:
        paramInt1 = paramInt2 - paramInt1;
        if (paramInt1 <= 0) {
          break label541;
        }
        paramInt1 = paramInt4 / paramInt1;
        label403:
        paramInt3 = Math.max(0, paramInt1);
        if (!paramBoolean) {
          break label546;
        }
        paramInt1 = getWidth() - getPaddingRight();
        paramInt2 = 0;
        label426:
        if (paramInt2 < i1)
        {
          localView = getChildAt(paramInt2);
          localLayoutParams = (ActionMenuView.LayoutParams)localView.getLayoutParams();
          if ((localView.getVisibility() == 8) || (isOverflowButton)) {
            break label666;
          }
          paramInt1 -= rightMargin;
          paramInt4 = localView.getMeasuredWidth();
          i = localView.getMeasuredHeight();
          j = n - i / 2;
          localView.layout(paramInt1 - paramInt4, j, paramInt1, i + j);
          paramInt1 -= leftMargin + paramInt4 + paramInt3;
        }
      }
      label541:
      label546:
      label553:
      label663:
      label666:
      for (;;)
      {
        paramInt2 += 1;
        break label426;
        break;
        paramInt1 = 1;
        break label390;
        paramInt1 = 0;
        break label403;
        paramInt1 = getPaddingLeft();
        paramInt2 = 0;
        if (paramInt2 < i1)
        {
          localView = getChildAt(paramInt2);
          localLayoutParams = (ActionMenuView.LayoutParams)localView.getLayoutParams();
          if ((localView.getVisibility() == 8) || (isOverflowButton)) {
            break label663;
          }
          paramInt1 += leftMargin;
          paramInt4 = localView.getMeasuredWidth();
          i = localView.getMeasuredHeight();
          j = n - i / 2;
          localView.layout(paramInt1, j, paramInt1 + paramInt4, i + j);
          paramInt1 = rightMargin + paramInt4 + paramInt3 + paramInt1;
        }
        for (;;)
        {
          paramInt2 += 1;
          break label553;
          break;
        }
      }
      label669:
      k = paramInt2;
      paramInt2 = paramInt4;
      paramInt4 = k;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool2 = mFormatItems;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {}
    int j;
    for (boolean bool1 = true;; bool1 = false)
    {
      mFormatItems = bool1;
      if (bool2 != mFormatItems) {
        mFormatItemsWidth = 0;
      }
      i = View.MeasureSpec.getSize(paramInt1);
      if ((mFormatItems) && (mMenu != null) && (i != mFormatItemsWidth))
      {
        mFormatItemsWidth = i;
        mMenu.onItemsChanged(true);
      }
      j = getChildCount();
      if ((!mFormatItems) || (j <= 0)) {
        break;
      }
      onMeasureExactFormat(paramInt1, paramInt2);
      return;
    }
    int i = 0;
    while (i < j)
    {
      ActionMenuView.LayoutParams localLayoutParams = (ActionMenuView.LayoutParams)getChildAt(i).getLayoutParams();
      rightMargin = 0;
      leftMargin = 0;
      i += 1;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public MenuBuilder peekMenu()
  {
    return mMenu;
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean)
  {
    mPresenter.setExpandedActionViewsExclusive(paramBoolean);
  }
  
  public void setMenuCallbacks(MenuPresenter.Callback paramCallback, MenuBuilder.Callback paramCallback1)
  {
    mActionMenuPresenterCallback = paramCallback;
    mMenuBuilderCallback = paramCallback1;
  }
  
  public void setOnMenuItemClickListener(ActionMenuView.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    mOnMenuItemClickListener = paramOnMenuItemClickListener;
  }
  
  public void setOverflowReserved(boolean paramBoolean)
  {
    mReserveOverflow = paramBoolean;
  }
  
  public void setPopupTheme(int paramInt)
  {
    if (mPopupTheme != paramInt)
    {
      mPopupTheme = paramInt;
      if (paramInt == 0) {
        mPopupContext = mContext;
      }
    }
    else
    {
      return;
    }
    mPopupContext = new ContextThemeWrapper(mContext, paramInt);
  }
  
  public void setPresenter(ActionMenuPresenter paramActionMenuPresenter)
  {
    mPresenter = paramActionMenuPresenter;
    mPresenter.setMenuView(this);
  }
  
  public boolean showOverflowMenu()
  {
    return (mPresenter != null) && (mPresenter.showOverflowMenu());
  }
}

/* Location:
 * Qualified Name:     android.support.v7.widget.ActionMenuView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */