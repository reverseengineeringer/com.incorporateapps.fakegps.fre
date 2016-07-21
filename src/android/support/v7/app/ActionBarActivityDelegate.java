package android.support.v7.app;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.internal.app.WindowCallback;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

abstract class ActionBarActivityDelegate
{
  static final String METADATA_UI_OPTIONS = "android.support.UI_OPTIONS";
  private static final String TAG = "ActionBarActivityDelegate";
  private ActionBar mActionBar;
  final ActionBarActivity mActivity;
  final WindowCallback mDefaultWindowCallback = new ActionBarActivityDelegate.1(this);
  boolean mHasActionBar;
  private boolean mIsDestroyed;
  boolean mIsFloating;
  private MenuInflater mMenuInflater;
  boolean mOverlayActionBar;
  boolean mOverlayActionMode;
  private WindowCallback mWindowCallback;
  
  ActionBarActivityDelegate(ActionBarActivity paramActionBarActivity)
  {
    mActivity = paramActionBarActivity;
    mWindowCallback = mDefaultWindowCallback;
  }
  
  static ActionBarActivityDelegate createDelegate(ActionBarActivity paramActionBarActivity)
  {
    if (Build.VERSION.SDK_INT >= 11) {
      return new ActionBarActivityDelegateHC(paramActionBarActivity);
    }
    return new ActionBarActivityDelegateBase(paramActionBarActivity);
  }
  
  abstract void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  abstract ActionBar createSupportActionBar();
  
  abstract View createView(String paramString, Context paramContext, AttributeSet paramAttributeSet);
  
  final void destroy()
  {
    mIsDestroyed = true;
  }
  
  protected final Context getActionBarThemedContext()
  {
    Context localContext = null;
    Object localObject = getSupportActionBar();
    if (localObject != null) {
      localContext = ((ActionBar)localObject).getThemedContext();
    }
    localObject = localContext;
    if (localContext == null) {
      localObject = mActivity;
    }
    return (Context)localObject;
  }
  
  final android.support.v4.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
  {
    return new ActionBarActivityDelegate.ActionBarDrawableToggleImpl(this, null);
  }
  
  abstract int getHomeAsUpIndicatorAttrId();
  
  MenuInflater getMenuInflater()
  {
    if (mMenuInflater == null) {
      mMenuInflater = new SupportMenuInflater(getActionBarThemedContext());
    }
    return mMenuInflater;
  }
  
  final ActionBar getSupportActionBar()
  {
    if ((mHasActionBar) && (mActionBar == null)) {
      mActionBar = createSupportActionBar();
    }
    return mActionBar;
  }
  
  final String getUiOptionsFromMetadata()
  {
    String str = null;
    try
    {
      ActivityInfo localActivityInfo = mActivity.getPackageManager().getActivityInfo(mActivity.getComponentName(), 128);
      if (metaData != null) {
        str = metaData.getString("android.support.UI_OPTIONS");
      }
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.e("ActionBarActivityDelegate", "getUiOptionsFromMetadata: Activity '" + mActivity.getClass().getSimpleName() + "' not in manifest");
    }
    return null;
  }
  
  final ActionBarDrawerToggle.Delegate getV7DrawerToggleDelegate()
  {
    return new ActionBarActivityDelegate.ActionBarDrawableToggleImpl(this, null);
  }
  
  final WindowCallback getWindowCallback()
  {
    return mWindowCallback;
  }
  
  final boolean isDestroyed()
  {
    return mIsDestroyed;
  }
  
  abstract boolean onBackPressed();
  
  abstract void onConfigurationChanged(Configuration paramConfiguration);
  
  abstract void onContentChanged();
  
  void onCreate(Bundle paramBundle)
  {
    paramBundle = mActivity.obtainStyledAttributes(R.styleable.Theme);
    if (!paramBundle.hasValue(R.styleable.Theme_windowActionBar))
    {
      paramBundle.recycle();
      throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }
    if (paramBundle.getBoolean(R.styleable.Theme_windowActionBar, false)) {
      mHasActionBar = true;
    }
    if (paramBundle.getBoolean(R.styleable.Theme_windowActionBarOverlay, false)) {
      mOverlayActionBar = true;
    }
    if (paramBundle.getBoolean(R.styleable.Theme_windowActionModeOverlay, false)) {
      mOverlayActionMode = true;
    }
    mIsFloating = paramBundle.getBoolean(R.styleable.Theme_android_windowIsFloating, false);
    paramBundle.recycle();
  }
  
  abstract boolean onCreatePanelMenu(int paramInt, Menu paramMenu);
  
  abstract View onCreatePanelView(int paramInt);
  
  boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }
  
  abstract boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent);
  
  abstract boolean onMenuOpened(int paramInt, Menu paramMenu);
  
  abstract void onPanelClosed(int paramInt, Menu paramMenu);
  
  abstract void onPostResume();
  
  boolean onPrepareOptionsPanel(View paramView, Menu paramMenu)
  {
    if (Build.VERSION.SDK_INT < 16) {
      return mActivity.onPrepareOptionsMenu(paramMenu);
    }
    return mActivity.superOnPrepareOptionsPanel(paramView, paramMenu);
  }
  
  abstract boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu);
  
  abstract void onStop();
  
  abstract void onTitleChanged(CharSequence paramCharSequence);
  
  final ActionBar peekSupportActionBar()
  {
    return mActionBar;
  }
  
  abstract void setContentView(int paramInt);
  
  abstract void setContentView(View paramView);
  
  abstract void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  protected final void setSupportActionBar(ActionBar paramActionBar)
  {
    mActionBar = paramActionBar;
  }
  
  abstract void setSupportActionBar(Toolbar paramToolbar);
  
  abstract void setSupportProgress(int paramInt);
  
  abstract void setSupportProgressBarIndeterminate(boolean paramBoolean);
  
  abstract void setSupportProgressBarIndeterminateVisibility(boolean paramBoolean);
  
  abstract void setSupportProgressBarVisibility(boolean paramBoolean);
  
  final void setWindowCallback(WindowCallback paramWindowCallback)
  {
    if (paramWindowCallback == null) {
      throw new IllegalArgumentException("callback can not be null");
    }
    mWindowCallback = paramWindowCallback;
  }
  
  abstract ActionMode startSupportActionMode(ActionMode.Callback paramCallback);
  
  abstract ActionMode startSupportActionModeFromWindow(ActionMode.Callback paramCallback);
  
  abstract void supportInvalidateOptionsMenu();
  
  abstract boolean supportRequestWindowFeature(int paramInt);
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarActivityDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */