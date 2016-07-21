package android.support.v7.app;

import android.support.v4.view.ViewCompat;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;

class ActionBarActivityDelegateBase$ActionModeCallbackWrapper
  implements ActionMode.Callback
{
  private ActionMode.Callback mWrapped;
  
  public ActionBarActivityDelegateBase$ActionModeCallbackWrapper(ActionBarActivityDelegateBase paramActionBarActivityDelegateBase, ActionMode.Callback paramCallback)
  {
    mWrapped = paramCallback;
  }
  
  public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return mWrapped.onActionItemClicked(paramActionMode, paramMenuItem);
  }
  
  public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return mWrapped.onCreateActionMode(paramActionMode, paramMenu);
  }
  
  public void onDestroyActionMode(ActionMode paramActionMode)
  {
    mWrapped.onDestroyActionMode(paramActionMode);
    if (this$0.mActionModePopup != null)
    {
      this$0.mActivity.getWindow().getDecorView().removeCallbacks(this$0.mShowActionModePopup);
      this$0.mActionModePopup.dismiss();
    }
    for (;;)
    {
      if (this$0.mActionModeView != null) {
        this$0.mActionModeView.removeAllViews();
      }
      if (this$0.mActivity != null) {}
      try
      {
        this$0.mActivity.onSupportActionModeFinished(this$0.mActionMode);
        this$0.mActionMode = null;
        return;
        if (this$0.mActionModeView == null) {
          continue;
        }
        this$0.mActionModeView.setVisibility(8);
        if (this$0.mActionModeView.getParent() == null) {
          continue;
        }
        ViewCompat.requestApplyInsets((View)this$0.mActionModeView.getParent());
      }
      catch (AbstractMethodError paramActionMode)
      {
        for (;;) {}
      }
    }
  }
  
  public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return mWrapped.onPrepareActionMode(paramActionMode, paramMenu);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarActivityDelegateBase.ActionModeCallbackWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */