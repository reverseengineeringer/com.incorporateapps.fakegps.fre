package android.support.v7.app;

import android.support.v7.internal.view.SupportActionModeWrapper;
import android.support.v7.internal.view.SupportActionModeWrapper.CallbackWrapper;
import android.support.v7.internal.widget.NativeActionModeAwareLayout;
import android.support.v7.internal.widget.NativeActionModeAwareLayout.OnActionModeForChildListener;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.View;

class ActionBarActivityDelegateHC
  extends ActionBarActivityDelegateBase
  implements NativeActionModeAwareLayout.OnActionModeForChildListener
{
  private NativeActionModeAwareLayout mNativeActionModeAwareLayout;
  
  ActionBarActivityDelegateHC(ActionBarActivity paramActionBarActivity)
  {
    super(paramActionBarActivity);
  }
  
  boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }
  
  void onSubDecorInstalled()
  {
    mNativeActionModeAwareLayout = ((NativeActionModeAwareLayout)mActivity.findViewById(16908290));
    if (mNativeActionModeAwareLayout != null) {
      mNativeActionModeAwareLayout.setActionModeForChildListener(this);
    }
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    paramView = startSupportActionMode(new SupportActionModeWrapper.CallbackWrapper(paramView.getContext(), paramCallback));
    if (paramView != null) {
      return new SupportActionModeWrapper(mActivity, paramView);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarActivityDelegateHC
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */