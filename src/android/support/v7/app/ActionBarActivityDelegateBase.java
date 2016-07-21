package android.support.v7.app;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.color;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.layout;
import android.support.v7.appcompat.R.style;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.internal.app.ToolbarActionBar;
import android.support.v7.internal.app.WindowCallback;
import android.support.v7.internal.app.WindowDecorActionBar;
import android.support.v7.internal.view.StandaloneActionMode;
import android.support.v7.internal.view.menu.ListMenuPresenter;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuBuilder.Callback;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.DecorContentParent;
import android.support.v7.internal.widget.FitWindowsViewGroup;
import android.support.v7.internal.widget.TintCheckBox;
import android.support.v7.internal.widget.TintCheckedTextView;
import android.support.v7.internal.widget.TintEditText;
import android.support.v7.internal.widget.TintRadioButton;
import android.support.v7.internal.widget.TintSpinner;
import android.support.v7.internal.widget.ViewStubCompat;
import android.support.v7.internal.widget.ViewUtils;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.support.v7.widget.Toolbar;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

class ActionBarActivityDelegateBase
  extends ActionBarActivityDelegate
  implements MenuBuilder.Callback
{
  private static final String TAG = "ActionBarActivityDelegateBase";
  private ActionBarActivityDelegateBase.ActionMenuPresenterCallback mActionMenuPresenterCallback;
  ActionMode mActionMode;
  PopupWindow mActionModePopup;
  ActionBarContextView mActionModeView;
  private boolean mClosingActionMenu;
  private DecorContentParent mDecorContentParent;
  private boolean mEnableDefaultActionBarUp;
  private boolean mFeatureIndeterminateProgress;
  private boolean mFeatureProgress;
  private int mInvalidatePanelMenuFeatures;
  private boolean mInvalidatePanelMenuPosted;
  private final Runnable mInvalidatePanelMenuRunnable = new ActionBarActivityDelegateBase.1(this);
  private ActionBarActivityDelegateBase.PanelMenuPresenterCallback mPanelMenuPresenterCallback;
  private ActionBarActivityDelegateBase.PanelFeatureState[] mPanels;
  private ActionBarActivityDelegateBase.PanelFeatureState mPreparedPanel;
  Runnable mShowActionModePopup;
  private View mStatusGuard;
  private ViewGroup mSubDecor;
  private boolean mSubDecorInstalled;
  private Rect mTempRect1;
  private Rect mTempRect2;
  private CharSequence mTitleToSet;
  private ListMenuPresenter mToolbarListMenuPresenter;
  private ViewGroup mWindowDecor;
  
  ActionBarActivityDelegateBase(ActionBarActivity paramActionBarActivity)
  {
    super(paramActionBarActivity);
  }
  
  private void applyFixedSizeWindow()
  {
    TypedValue localTypedValue4 = null;
    TypedArray localTypedArray = mActivity.obtainStyledAttributes(R.styleable.Theme);
    TypedValue localTypedValue1;
    if (localTypedArray.hasValue(R.styleable.Theme_windowFixedWidthMajor))
    {
      localTypedValue1 = new TypedValue();
      localTypedArray.getValue(R.styleable.Theme_windowFixedWidthMajor, localTypedValue1);
    }
    for (;;)
    {
      TypedValue localTypedValue2;
      if (localTypedArray.hasValue(R.styleable.Theme_windowFixedWidthMinor))
      {
        localTypedValue2 = new TypedValue();
        localTypedArray.getValue(R.styleable.Theme_windowFixedWidthMinor, localTypedValue2);
      }
      for (;;)
      {
        TypedValue localTypedValue3;
        if (localTypedArray.hasValue(R.styleable.Theme_windowFixedHeightMajor))
        {
          localTypedValue3 = new TypedValue();
          localTypedArray.getValue(R.styleable.Theme_windowFixedHeightMajor, localTypedValue3);
        }
        for (;;)
        {
          if (localTypedArray.hasValue(R.styleable.Theme_windowFixedHeightMinor))
          {
            localTypedValue4 = new TypedValue();
            localTypedArray.getValue(R.styleable.Theme_windowFixedHeightMinor, localTypedValue4);
          }
          DisplayMetrics localDisplayMetrics = mActivity.getResources().getDisplayMetrics();
          int j;
          label168:
          int i;
          if (widthPixels < heightPixels)
          {
            j = 1;
            if (j == 0) {
              break label267;
            }
            if ((localTypedValue2 == null) || (type == 0)) {
              break label349;
            }
            if (type != 5) {
              break label273;
            }
            i = (int)localTypedValue2.getDimension(localDisplayMetrics);
          }
          for (;;)
          {
            label199:
            if (j != 0)
            {
              label203:
              if ((localTypedValue3 == null) || (type == 0)) {
                break label344;
              }
              if (type != 5) {
                break label312;
              }
              j = (int)localTypedValue3.getDimension(localDisplayMetrics);
            }
            for (;;)
            {
              if ((i != -1) || (j != -1)) {
                mActivity.getWindow().setLayout(i, j);
              }
              localTypedArray.recycle();
              return;
              j = 0;
              break;
              label267:
              localTypedValue2 = localTypedValue1;
              break label168;
              label273:
              if (type != 6) {
                break label349;
              }
              i = (int)localTypedValue2.getFraction(widthPixels, widthPixels);
              break label199;
              localTypedValue3 = localTypedValue4;
              break label203;
              label312:
              if (type == 6) {
                j = (int)localTypedValue3.getFraction(heightPixels, heightPixels);
              } else {
                label344:
                j = -1;
              }
            }
            label349:
            i = -1;
          }
          localTypedValue3 = null;
        }
        localTypedValue2 = null;
      }
      localTypedValue1 = null;
    }
  }
  
  private void callOnPanelClosed(int paramInt, ActionBarActivityDelegateBase.PanelFeatureState paramPanelFeatureState, Menu paramMenu)
  {
    Object localObject1 = paramPanelFeatureState;
    Object localObject2 = paramMenu;
    if (paramMenu == null)
    {
      ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState = paramPanelFeatureState;
      if (paramPanelFeatureState == null)
      {
        localPanelFeatureState = paramPanelFeatureState;
        if (paramInt >= 0)
        {
          localPanelFeatureState = paramPanelFeatureState;
          if (paramInt < mPanels.length) {
            localPanelFeatureState = mPanels[paramInt];
          }
        }
      }
      localObject1 = localPanelFeatureState;
      localObject2 = paramMenu;
      if (localPanelFeatureState != null)
      {
        localObject2 = menu;
        localObject1 = localPanelFeatureState;
      }
    }
    if ((localObject1 != null) && (!isOpen)) {
      return;
    }
    getWindowCallback().onPanelClosed(paramInt, (Menu)localObject2);
  }
  
  private void checkCloseActionMenu(MenuBuilder paramMenuBuilder)
  {
    if (mClosingActionMenu) {
      return;
    }
    mClosingActionMenu = true;
    mDecorContentParent.dismissPopups();
    WindowCallback localWindowCallback = getWindowCallback();
    if ((localWindowCallback != null) && (!isDestroyed())) {
      localWindowCallback.onPanelClosed(8, paramMenuBuilder);
    }
    mClosingActionMenu = false;
  }
  
  private void closePanel(ActionBarActivityDelegateBase.PanelFeatureState paramPanelFeatureState, boolean paramBoolean)
  {
    if ((paramBoolean) && (featureId == 0) && (mDecorContentParent != null) && (mDecorContentParent.isOverflowMenuShowing())) {
      checkCloseActionMenu(menu);
    }
    do
    {
      return;
      if ((isOpen) && (paramBoolean)) {
        callOnPanelClosed(featureId, paramPanelFeatureState, null);
      }
      isPrepared = false;
      isHandled = false;
      isOpen = false;
      shownPanelView = null;
      refreshDecorView = true;
    } while (mPreparedPanel != paramPanelFeatureState);
    mPreparedPanel = null;
  }
  
  private void doInvalidatePanelMenu(int paramInt)
  {
    ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState = getPanelState(paramInt, true);
    if (menu != null)
    {
      Bundle localBundle = new Bundle();
      menu.saveActionViewStates(localBundle);
      if (localBundle.size() > 0) {
        frozenActionViewState = localBundle;
      }
      menu.stopDispatchingItemsChanged();
      menu.clear();
    }
    refreshMenuContent = true;
    refreshDecorView = true;
    if (((paramInt == 8) || (paramInt == 0)) && (mDecorContentParent != null))
    {
      localPanelFeatureState = getPanelState(0, false);
      if (localPanelFeatureState != null)
      {
        isPrepared = false;
        preparePanel(localPanelFeatureState, null);
      }
    }
  }
  
  private void ensureToolbarListMenuPresenter()
  {
    TypedValue localTypedValue;
    ActionBarActivity localActionBarActivity;
    if (mToolbarListMenuPresenter == null)
    {
      localTypedValue = new TypedValue();
      mActivity.getTheme().resolveAttribute(R.attr.panelMenuListTheme, localTypedValue, true);
      localActionBarActivity = mActivity;
      if (resourceId == 0) {
        break label72;
      }
    }
    label72:
    for (int i = resourceId;; i = R.style.Theme_AppCompat_CompactMenu)
    {
      mToolbarListMenuPresenter = new ListMenuPresenter(new ContextThemeWrapper(localActionBarActivity, i), R.layout.abc_list_menu_item_layout);
      return;
    }
  }
  
  private ActionBarActivityDelegateBase.PanelFeatureState findMenuPanel(Menu paramMenu)
  {
    ActionBarActivityDelegateBase.PanelFeatureState[] arrayOfPanelFeatureState = mPanels;
    int i;
    int j;
    if (arrayOfPanelFeatureState != null)
    {
      i = arrayOfPanelFeatureState.length;
      j = 0;
    }
    for (;;)
    {
      if (j >= i) {
        break label57;
      }
      ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState = arrayOfPanelFeatureState[j];
      if ((localPanelFeatureState != null) && (menu == paramMenu))
      {
        return localPanelFeatureState;
        i = 0;
        break;
      }
      j += 1;
    }
    label57:
    return null;
  }
  
  private ActionBarActivityDelegateBase.PanelFeatureState getPanelState(int paramInt, boolean paramBoolean)
  {
    Object localObject2 = mPanels;
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2.length > paramInt) {}
    }
    else
    {
      localObject1 = new ActionBarActivityDelegateBase.PanelFeatureState[paramInt + 1];
      if (localObject2 != null) {
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
      }
      mPanels = ((ActionBarActivityDelegateBase.PanelFeatureState[])localObject1);
    }
    localObject2 = localObject1[paramInt];
    if (localObject2 == null)
    {
      localObject2 = new ActionBarActivityDelegateBase.PanelFeatureState(paramInt);
      localObject1[paramInt] = localObject2;
      return (ActionBarActivityDelegateBase.PanelFeatureState)localObject2;
    }
    return (ActionBarActivityDelegateBase.PanelFeatureState)localObject2;
  }
  
  private boolean initializePanelContent(ActionBarActivityDelegateBase.PanelFeatureState paramPanelFeatureState)
  {
    if (menu == null) {
      return false;
    }
    if (mPanelMenuPresenterCallback == null) {
      mPanelMenuPresenterCallback = new ActionBarActivityDelegateBase.PanelMenuPresenterCallback(this, null);
    }
    shownPanelView = ((View)paramPanelFeatureState.getListMenuView(mPanelMenuPresenterCallback));
    return shownPanelView != null;
  }
  
  private void initializePanelDecor(ActionBarActivityDelegateBase.PanelFeatureState paramPanelFeatureState)
  {
    decorView = mWindowDecor;
    paramPanelFeatureState.setStyle(getActionBarThemedContext());
  }
  
  private boolean initializePanelMenu(ActionBarActivityDelegateBase.PanelFeatureState paramPanelFeatureState)
  {
    ActionBarActivity localActionBarActivity = mActivity;
    TypedValue localTypedValue;
    Resources.Theme localTheme;
    Object localObject1;
    if (((featureId == 0) || (featureId == 8)) && (mDecorContentParent != null))
    {
      localTypedValue = new TypedValue();
      localTheme = localActionBarActivity.getTheme();
      localTheme.resolveAttribute(R.attr.actionBarTheme, localTypedValue, true);
      localObject1 = null;
      if (resourceId != 0)
      {
        localObject1 = localActionBarActivity.getResources().newTheme();
        ((Resources.Theme)localObject1).setTo(localTheme);
        ((Resources.Theme)localObject1).applyStyle(resourceId, true);
        ((Resources.Theme)localObject1).resolveAttribute(R.attr.actionBarWidgetTheme, localTypedValue, true);
        Object localObject2 = localObject1;
        if (resourceId != 0)
        {
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = localActionBarActivity.getResources().newTheme();
            ((Resources.Theme)localObject2).setTo(localTheme);
          }
          ((Resources.Theme)localObject2).applyStyle(resourceId, true);
        }
        if (localObject2 == null) {
          break label203;
        }
        localObject1 = new ContextThemeWrapper(localActionBarActivity, 0);
        ((Context)localObject1).getTheme().setTo((Resources.Theme)localObject2);
      }
    }
    for (;;)
    {
      localObject1 = new MenuBuilder((Context)localObject1);
      ((MenuBuilder)localObject1).setCallback(this);
      paramPanelFeatureState.setMenu((MenuBuilder)localObject1);
      return true;
      localTheme.resolveAttribute(R.attr.actionBarWidgetTheme, localTypedValue, true);
      break;
      label203:
      localObject1 = localActionBarActivity;
    }
  }
  
  private void invalidatePanelMenu(int paramInt)
  {
    mInvalidatePanelMenuFeatures |= 1 << paramInt;
    if ((!mInvalidatePanelMenuPosted) && (mWindowDecor != null))
    {
      ViewCompat.postOnAnimation(mWindowDecor, mInvalidatePanelMenuRunnable);
      mInvalidatePanelMenuPosted = true;
    }
  }
  
  private void openPanel(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 0) && (mDecorContentParent != null) && (mDecorContentParent.canShowOverflowMenu()) && (!ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(mActivity))))
    {
      mDecorContentParent.showOverflowMenu();
      return;
    }
    openPanel(getPanelState(paramInt, true), paramKeyEvent);
  }
  
  private void openPanel(ActionBarActivityDelegateBase.PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    if ((isOpen) || (isDestroyed())) {}
    label109:
    label114:
    label118:
    label120:
    do
    {
      do
      {
        for (;;)
        {
          return;
          Object localObject;
          int i;
          if (featureId == 0)
          {
            localObject = mActivity;
            if ((getResourcesgetConfigurationscreenLayout & 0xF) != 4) {
              break label109;
            }
            i = 1;
            if (getApplicationInfotargetSdkVersion < 11) {
              break label114;
            }
          }
          for (int j = 1;; j = 0)
          {
            if ((i != 0) && (j != 0)) {
              break label118;
            }
            localObject = getWindowCallback();
            if ((localObject == null) || (((WindowCallback)localObject).onMenuOpened(featureId, menu))) {
              break label120;
            }
            closePanel(paramPanelFeatureState, true);
            return;
            i = 0;
            break;
          }
        }
      } while (!preparePanel(paramPanelFeatureState, paramKeyEvent));
      if ((decorView == null) || (refreshDecorView)) {
        initializePanelDecor(paramPanelFeatureState);
      }
    } while ((!initializePanelContent(paramPanelFeatureState)) || (!paramPanelFeatureState.hasPanelItems()));
    isHandled = false;
    isOpen = true;
  }
  
  private boolean preparePanel(ActionBarActivityDelegateBase.PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    if (isDestroyed()) {
      return false;
    }
    if (isPrepared) {
      return true;
    }
    if ((mPreparedPanel != null) && (mPreparedPanel != paramPanelFeatureState)) {
      closePanel(mPreparedPanel, false);
    }
    if ((featureId == 0) || (featureId == 8)) {}
    for (int i = 1;; i = 0)
    {
      if ((i != 0) && (mDecorContentParent != null)) {
        mDecorContentParent.setMenuPrepared();
      }
      if ((menu != null) && (!refreshMenuContent)) {
        break label233;
      }
      if ((menu == null) && ((!initializePanelMenu(paramPanelFeatureState)) || (menu == null))) {
        break;
      }
      if ((i != 0) && (mDecorContentParent != null))
      {
        if (mActionMenuPresenterCallback == null) {
          mActionMenuPresenterCallback = new ActionBarActivityDelegateBase.ActionMenuPresenterCallback(this, null);
        }
        mDecorContentParent.setMenu(menu, mActionMenuPresenterCallback);
      }
      menu.stopDispatchingItemsChanged();
      if (getWindowCallback().onCreatePanelMenu(featureId, menu)) {
        break label228;
      }
      paramPanelFeatureState.setMenu(null);
      if ((i == 0) || (mDecorContentParent == null)) {
        break;
      }
      mDecorContentParent.setMenu(null, mActionMenuPresenterCallback);
      return false;
    }
    label228:
    refreshMenuContent = false;
    label233:
    menu.stopDispatchingItemsChanged();
    if (frozenActionViewState != null)
    {
      menu.restoreActionViewStates(frozenActionViewState);
      frozenActionViewState = null;
    }
    if (!getWindowCallback().onPreparePanel(0, null, menu))
    {
      if ((i != 0) && (mDecorContentParent != null)) {
        mDecorContentParent.setMenu(null, mActionMenuPresenterCallback);
      }
      menu.startDispatchingItemsChanged();
      return false;
    }
    if (paramKeyEvent != null)
    {
      i = paramKeyEvent.getDeviceId();
      if (KeyCharacterMap.load(i).getKeyboardType() == 1) {
        break label384;
      }
    }
    label384:
    for (boolean bool = true;; bool = false)
    {
      qwertyMode = bool;
      menu.setQwertyMode(qwertyMode);
      menu.startDispatchingItemsChanged();
      isPrepared = true;
      isHandled = false;
      mPreparedPanel = paramPanelFeatureState;
      return true;
      i = -1;
      break;
    }
  }
  
  private void reopenMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    if ((mDecorContentParent != null) && (mDecorContentParent.canShowOverflowMenu()) && ((!ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(mActivity))) || (mDecorContentParent.isOverflowMenuShowPending())))
    {
      paramMenuBuilder = getWindowCallback();
      if ((!mDecorContentParent.isOverflowMenuShowing()) || (!paramBoolean)) {
        if ((paramMenuBuilder != null) && (!isDestroyed()))
        {
          if ((mInvalidatePanelMenuPosted) && ((mInvalidatePanelMenuFeatures & 0x1) != 0))
          {
            mWindowDecor.removeCallbacks(mInvalidatePanelMenuRunnable);
            mInvalidatePanelMenuRunnable.run();
          }
          ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState = getPanelState(0, true);
          if ((menu != null) && (!refreshMenuContent) && (paramMenuBuilder.onPreparePanel(0, null, menu)))
          {
            paramMenuBuilder.onMenuOpened(8, menu);
            mDecorContentParent.showOverflowMenu();
          }
        }
      }
      do
      {
        return;
        mDecorContentParent.hideOverflowMenu();
      } while (isDestroyed());
      paramMenuBuilder = getPanelState(0, true);
      mActivity.onPanelClosed(8, menu);
      return;
    }
    paramMenuBuilder = getPanelState(0, true);
    refreshDecorView = true;
    closePanel(paramMenuBuilder, false);
    openPanel(paramMenuBuilder, null);
  }
  
  private void throwFeatureRequestIfSubDecorInstalled()
  {
    if (mSubDecorInstalled) {
      throw new AndroidRuntimeException("supportRequestWindowFeature() must be called before adding content");
    }
  }
  
  private int updateStatusGuard(int paramInt)
  {
    int j = 1;
    int k = 1;
    int m = 0;
    Object localObject1;
    Object localObject2;
    int i;
    if ((mActionModeView != null) && ((mActionModeView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      localObject1 = (ViewGroup.MarginLayoutParams)mActionModeView.getLayoutParams();
      if (mActionModeView.isShown())
      {
        if (mTempRect1 == null)
        {
          mTempRect1 = new Rect();
          mTempRect2 = new Rect();
        }
        localObject2 = mTempRect1;
        Rect localRect = mTempRect2;
        ((Rect)localObject2).set(0, paramInt, 0, 0);
        ViewUtils.computeFitSystemWindows(mSubDecor, (Rect)localObject2, localRect);
        if (top == 0)
        {
          i = paramInt;
          if (topMargin == i) {
            break label355;
          }
          topMargin = paramInt;
          if (mStatusGuard != null) {
            break label279;
          }
          mStatusGuard = new View(mActivity);
          mStatusGuard.setBackgroundColor(mActivity.getResources().getColor(R.color.abc_input_method_navigation_guard));
          mSubDecor.addView(mStatusGuard, -1, new ViewGroup.LayoutParams(-1, paramInt));
          i = 1;
          label201:
          if (mStatusGuard == null) {
            break label317;
          }
          label208:
          j = paramInt;
          if (!mOverlayActionMode)
          {
            j = paramInt;
            if (k != 0) {
              j = 0;
            }
          }
          paramInt = j;
          j = i;
          i = k;
          label233:
          if (j != 0) {
            mActionModeView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          }
        }
      }
    }
    for (;;)
    {
      if (mStatusGuard != null)
      {
        localObject1 = mStatusGuard;
        if (i == 0) {
          break label342;
        }
      }
      label279:
      label317:
      label342:
      for (i = m;; i = 8)
      {
        ((View)localObject1).setVisibility(i);
        return paramInt;
        i = 0;
        break;
        localObject2 = mStatusGuard.getLayoutParams();
        if (height != paramInt)
        {
          height = paramInt;
          mStatusGuard.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        i = 1;
        break label201;
        k = 0;
        break label208;
        if (topMargin == 0) {
          break label348;
        }
        topMargin = 0;
        i = 0;
        break label233;
      }
      label348:
      j = 0;
      i = 0;
      break label233;
      label355:
      i = 0;
      break label201;
      i = 0;
    }
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    ensureSubDecor();
    ((ViewGroup)mActivity.findViewById(16908290)).addView(paramView, paramLayoutParams);
    mActivity.onSupportContentChanged();
  }
  
  public ActionBar createSupportActionBar()
  {
    ensureSubDecor();
    WindowDecorActionBar localWindowDecorActionBar = new WindowDecorActionBar(mActivity, mOverlayActionBar);
    localWindowDecorActionBar.setDefaultDisplayHomeAsUpEnabled(mEnableDefaultActionBarUp);
    return localWindowDecorActionBar;
  }
  
  View createView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    int i;
    if (Build.VERSION.SDK_INT < 21)
    {
      i = -1;
      switch (paramString.hashCode())
      {
      }
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        return null;
        if (paramString.equals("EditText"))
        {
          i = 0;
          continue;
          if (paramString.equals("Spinner"))
          {
            i = 1;
            continue;
            if (paramString.equals("CheckBox"))
            {
              i = 2;
              continue;
              if (paramString.equals("RadioButton"))
              {
                i = 3;
                continue;
                if (paramString.equals("CheckedTextView")) {
                  i = 4;
                }
              }
            }
          }
        }
        break;
      }
    }
    return new TintEditText(paramContext, paramAttributeSet);
    return new TintSpinner(paramContext, paramAttributeSet);
    return new TintCheckBox(paramContext, paramAttributeSet);
    return new TintRadioButton(paramContext, paramAttributeSet);
    return new TintCheckedTextView(paramContext, paramAttributeSet);
  }
  
  final void ensureSubDecor()
  {
    Object localObject;
    if (!mSubDecorInstalled)
    {
      if (!mHasActionBar) {
        break label311;
      }
      localObject = new TypedValue();
      mActivity.getTheme().resolveAttribute(R.attr.actionBarTheme, (TypedValue)localObject, true);
      if (resourceId == 0) {
        break label303;
      }
      localObject = new ContextThemeWrapper(mActivity, resourceId);
      mSubDecor = ((ViewGroup)LayoutInflater.from((Context)localObject).inflate(R.layout.abc_screen_toolbar, null));
      mDecorContentParent = ((DecorContentParent)mSubDecor.findViewById(R.id.decor_content_parent));
      mDecorContentParent.setWindowCallback(getWindowCallback());
      if (mOverlayActionBar) {
        mDecorContentParent.initFeature(9);
      }
      if (mFeatureProgress) {
        mDecorContentParent.initFeature(2);
      }
      if (mFeatureIndeterminateProgress) {
        mDecorContentParent.initFeature(5);
      }
    }
    for (;;)
    {
      ViewUtils.makeOptionalFitsSystemWindows(mSubDecor);
      mActivity.superSetContentView(mSubDecor);
      localObject = mActivity.findViewById(16908290);
      ((View)localObject).setId(-1);
      mActivity.findViewById(R.id.action_bar_activity_content).setId(16908290);
      if ((localObject instanceof FrameLayout)) {
        ((FrameLayout)localObject).setForeground(null);
      }
      if ((mTitleToSet != null) && (mDecorContentParent != null))
      {
        mDecorContentParent.setWindowTitle(mTitleToSet);
        mTitleToSet = null;
      }
      applyFixedSizeWindow();
      onSubDecorInstalled();
      mSubDecorInstalled = true;
      localObject = getPanelState(0, false);
      if ((!isDestroyed()) && ((localObject == null) || (menu == null))) {
        invalidatePanelMenu(8);
      }
      return;
      label303:
      localObject = mActivity;
      break;
      label311:
      if (mOverlayActionMode) {}
      for (mSubDecor = ((ViewGroup)LayoutInflater.from(mActivity).inflate(R.layout.abc_screen_simple_overlay_action_mode, null));; mSubDecor = ((ViewGroup)LayoutInflater.from(mActivity).inflate(R.layout.abc_screen_simple, null)))
      {
        if (Build.VERSION.SDK_INT < 21) {
          break label389;
        }
        ViewCompat.setOnApplyWindowInsetsListener(mSubDecor, new ActionBarActivityDelegateBase.2(this));
        break;
      }
      label389:
      ((FitWindowsViewGroup)mSubDecor).setOnFitSystemWindowsListener(new ActionBarActivityDelegateBase.3(this));
    }
  }
  
  int getHomeAsUpIndicatorAttrId()
  {
    return R.attr.homeAsUpIndicator;
  }
  
  public boolean onBackPressed()
  {
    if (mActionMode != null) {
      mActionMode.finish();
    }
    ActionBar localActionBar;
    do
    {
      return true;
      localActionBar = getSupportActionBar();
    } while ((localActionBar != null) && (localActionBar.collapseActionView()));
    return false;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if ((mHasActionBar) && (mSubDecorInstalled))
    {
      ActionBar localActionBar = getSupportActionBar();
      if (localActionBar != null) {
        localActionBar.onConfigurationChanged(paramConfiguration);
      }
    }
  }
  
  public void onContentChanged() {}
  
  void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    mWindowDecor = ((ViewGroup)mActivity.getWindow().getDecorView());
    if (NavUtils.getParentActivityName(mActivity) != null)
    {
      paramBundle = peekSupportActionBar();
      if (paramBundle == null) {
        mEnableDefaultActionBarUp = true;
      }
    }
    else
    {
      return;
    }
    paramBundle.setDefaultDisplayHomeAsUpEnabled(true);
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt != 0) {
      return getWindowCallback().onCreatePanelMenu(paramInt, paramMenu);
    }
    return false;
  }
  
  public View onCreatePanelView(int paramInt)
  {
    if (mActionMode == null)
    {
      Object localObject1 = getWindowCallback();
      if (localObject1 != null) {}
      for (localObject1 = ((WindowCallback)localObject1).onCreatePanelView(paramInt);; localObject1 = null)
      {
        Object localObject2 = localObject1;
        if (localObject1 == null)
        {
          localObject2 = localObject1;
          if (mToolbarListMenuPresenter == null)
          {
            ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState = getPanelState(paramInt, true);
            openPanel(localPanelFeatureState, null);
            localObject2 = localObject1;
            if (isOpen) {
              localObject2 = shownPanelView;
            }
          }
        }
        return (View)localObject2;
      }
    }
    return null;
  }
  
  boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return onKeyShortcut(paramInt, paramKeyEvent);
  }
  
  boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((mPreparedPanel != null) && (performPanelShortcut(mPreparedPanel, paramKeyEvent.getKeyCode(), paramKeyEvent, 1))) {
      if (mPreparedPanel != null) {
        mPreparedPanel.isHandled = true;
      }
    }
    boolean bool;
    do
    {
      return true;
      if (mPreparedPanel != null) {
        break;
      }
      ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState = getPanelState(0, true);
      preparePanel(localPanelFeatureState, paramKeyEvent);
      bool = performPanelShortcut(localPanelFeatureState, paramKeyEvent.getKeyCode(), paramKeyEvent, 1);
      isPrepared = false;
    } while (bool);
    return false;
  }
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    WindowCallback localWindowCallback = getWindowCallback();
    if ((localWindowCallback != null) && (!isDestroyed()))
    {
      paramMenuBuilder = findMenuPanel(paramMenuBuilder.getRootMenu());
      if (paramMenuBuilder != null) {
        return localWindowCallback.onMenuItemSelected(featureId, paramMenuItem);
      }
    }
    return false;
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder)
  {
    reopenMenu(paramMenuBuilder, true);
  }
  
  boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    if (paramInt == 8)
    {
      paramMenu = getSupportActionBar();
      if (paramMenu != null) {
        paramMenu.dispatchMenuVisibilityChanged(true);
      }
      return true;
    }
    return mActivity.superOnMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState = getPanelState(paramInt, false);
    if (localPanelFeatureState != null) {
      closePanel(localPanelFeatureState, false);
    }
    if (paramInt == 8)
    {
      paramMenu = getSupportActionBar();
      if (paramMenu != null) {
        paramMenu.dispatchMenuVisibilityChanged(false);
      }
    }
    while (isDestroyed()) {
      return;
    }
    mActivity.superOnPanelClosed(paramInt, paramMenu);
  }
  
  public void onPostResume()
  {
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null) {
      localActionBar.setShowHideAnimationEnabled(true);
    }
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if (paramInt != 0) {
      return getWindowCallback().onPreparePanel(paramInt, paramView, paramMenu);
    }
    return false;
  }
  
  public void onStop()
  {
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null) {
      localActionBar.setShowHideAnimationEnabled(false);
    }
  }
  
  void onSubDecorInstalled() {}
  
  public void onTitleChanged(CharSequence paramCharSequence)
  {
    if (mDecorContentParent != null)
    {
      mDecorContentParent.setWindowTitle(paramCharSequence);
      return;
    }
    if (getSupportActionBar() != null)
    {
      getSupportActionBar().setWindowTitle(paramCharSequence);
      return;
    }
    mTitleToSet = paramCharSequence;
  }
  
  final boolean performPanelShortcut(ActionBarActivityDelegateBase.PanelFeatureState paramPanelFeatureState, int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    if (paramKeyEvent.isSystem()) {
      bool2 = bool1;
    }
    do
    {
      do
      {
        do
        {
          return bool2;
          if (!isPrepared)
          {
            bool1 = bool2;
            if (!preparePanel(paramPanelFeatureState, paramKeyEvent)) {}
          }
          else
          {
            bool1 = bool2;
            if (menu != null) {
              bool1 = menu.performShortcut(paramInt1, paramKeyEvent, paramInt2);
            }
          }
          bool2 = bool1;
        } while (!bool1);
        bool2 = bool1;
      } while ((paramInt2 & 0x1) != 0);
      bool2 = bool1;
    } while (mDecorContentParent != null);
    closePanel(paramPanelFeatureState, true);
    return bool1;
  }
  
  public void setContentView(int paramInt)
  {
    ensureSubDecor();
    ViewGroup localViewGroup = (ViewGroup)mActivity.findViewById(16908290);
    localViewGroup.removeAllViews();
    mActivity.getLayoutInflater().inflate(paramInt, localViewGroup);
    mActivity.onSupportContentChanged();
  }
  
  public void setContentView(View paramView)
  {
    ensureSubDecor();
    ViewGroup localViewGroup = (ViewGroup)mActivity.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    mActivity.onSupportContentChanged();
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    ensureSubDecor();
    ViewGroup localViewGroup = (ViewGroup)mActivity.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    mActivity.onSupportContentChanged();
  }
  
  void setSupportActionBar(Toolbar paramToolbar)
  {
    ActionBar localActionBar = getSupportActionBar();
    if ((localActionBar instanceof WindowDecorActionBar)) {
      throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }
    if ((localActionBar instanceof ToolbarActionBar)) {
      ((ToolbarActionBar)localActionBar).setListMenuPresenter(null);
    }
    paramToolbar = new ToolbarActionBar(paramToolbar, mActivity.getTitle(), mActivity.getWindow(), mDefaultWindowCallback);
    ensureToolbarListMenuPresenter();
    paramToolbar.setListMenuPresenter(mToolbarListMenuPresenter);
    setSupportActionBar(paramToolbar);
    setWindowCallback(paramToolbar.getWrappedWindowCallback());
    paramToolbar.invalidateOptionsMenu();
  }
  
  void setSupportProgress(int paramInt) {}
  
  void setSupportProgressBarIndeterminate(boolean paramBoolean) {}
  
  void setSupportProgressBarIndeterminateVisibility(boolean paramBoolean) {}
  
  void setSupportProgressBarVisibility(boolean paramBoolean) {}
  
  public ActionMode startSupportActionMode(ActionMode.Callback paramCallback)
  {
    if (paramCallback == null) {
      throw new IllegalArgumentException("ActionMode callback can not be null.");
    }
    if (mActionMode != null) {
      mActionMode.finish();
    }
    paramCallback = new ActionBarActivityDelegateBase.ActionModeCallbackWrapper(this, paramCallback);
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null)
    {
      mActionMode = localActionBar.startActionMode(paramCallback);
      if (mActionMode != null) {
        mActivity.onSupportActionModeStarted(mActionMode);
      }
    }
    if (mActionMode == null) {
      mActionMode = startSupportActionModeFromWindow(paramCallback);
    }
    return mActionMode;
  }
  
  ActionMode startSupportActionModeFromWindow(ActionMode.Callback paramCallback)
  {
    if (mActionMode != null) {
      mActionMode.finish();
    }
    Object localObject1 = new ActionBarActivityDelegateBase.ActionModeCallbackWrapper(this, paramCallback);
    Context localContext = getActionBarThemedContext();
    Object localObject2;
    boolean bool;
    if (mActionModeView == null)
    {
      if (mIsFloating)
      {
        mActionModeView = new ActionBarContextView(localContext);
        mActionModePopup = new PopupWindow(localContext, null, R.attr.actionModePopupWindowStyle);
        mActionModePopup.setContentView(mActionModeView);
        mActionModePopup.setWidth(-1);
        localObject2 = new TypedValue();
        mActivity.getTheme().resolveAttribute(R.attr.actionBarSize, (TypedValue)localObject2, true);
        int i = TypedValue.complexToDimensionPixelSize(data, mActivity.getResources().getDisplayMetrics());
        mActionModeView.setContentHeight(i);
        mActionModePopup.setHeight(-2);
        mShowActionModePopup = new ActionBarActivityDelegateBase.4(this);
      }
    }
    else if (mActionModeView != null)
    {
      mActionModeView.killMode();
      localObject2 = mActionModeView;
      if (mActionModePopup != null) {
        break label389;
      }
      bool = true;
      label197:
      localObject1 = new StandaloneActionMode(localContext, (ActionBarContextView)localObject2, (ActionMode.Callback)localObject1, bool);
      if (!paramCallback.onCreateActionMode((ActionMode)localObject1, ((ActionMode)localObject1).getMenu())) {
        break label394;
      }
      ((ActionMode)localObject1).invalidate();
      mActionModeView.initForMode((ActionMode)localObject1);
      mActionModeView.setVisibility(0);
      mActionMode = ((ActionMode)localObject1);
      if (mActionModePopup != null) {
        mActivity.getWindow().getDecorView().post(mShowActionModePopup);
      }
      mActionModeView.sendAccessibilityEvent(32);
      if (mActionModeView.getParent() != null) {
        ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
      }
    }
    for (;;)
    {
      if ((mActionMode != null) && (mActivity != null)) {
        mActivity.onSupportActionModeStarted(mActionMode);
      }
      return mActionMode;
      localObject2 = (ViewStubCompat)mActivity.findViewById(R.id.action_mode_bar_stub);
      if (localObject2 == null) {
        break;
      }
      ((ViewStubCompat)localObject2).setLayoutInflater(LayoutInflater.from(localContext));
      mActionModeView = ((ActionBarContextView)((ViewStubCompat)localObject2).inflate());
      break;
      label389:
      bool = false;
      break label197;
      label394:
      mActionMode = null;
    }
  }
  
  public void supportInvalidateOptionsMenu()
  {
    ActionBar localActionBar = getSupportActionBar();
    if ((localActionBar != null) && (localActionBar.invalidateOptionsMenu())) {
      return;
    }
    invalidatePanelMenu(0);
  }
  
  public boolean supportRequestWindowFeature(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    case 4: 
    case 6: 
    case 7: 
    default: 
      return mActivity.requestWindowFeature(paramInt);
    case 8: 
      throwFeatureRequestIfSubDecorInstalled();
      mHasActionBar = true;
      return true;
    case 9: 
      throwFeatureRequestIfSubDecorInstalled();
      mOverlayActionBar = true;
      return true;
    case 10: 
      throwFeatureRequestIfSubDecorInstalled();
      mOverlayActionMode = true;
      return true;
    case 2: 
      throwFeatureRequestIfSubDecorInstalled();
      mFeatureProgress = true;
      return true;
    }
    throwFeatureRequestIfSubDecorInstalled();
    mFeatureIndeterminateProgress = true;
    return true;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarActivityDelegateBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */