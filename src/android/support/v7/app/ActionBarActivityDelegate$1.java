package android.support.v7.app;

import android.support.v7.internal.app.WindowCallback;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

class ActionBarActivityDelegate$1
  implements WindowCallback
{
  ActionBarActivityDelegate$1(ActionBarActivityDelegate paramActionBarActivityDelegate) {}
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    return this$0.mActivity.superOnCreatePanelMenu(paramInt, paramMenu);
  }
  
  public View onCreatePanelView(int paramInt)
  {
    return null;
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    return this$0.mActivity.onMenuItemSelected(paramInt, paramMenuItem);
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return this$0.mActivity.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    this$0.mActivity.onPanelClosed(paramInt, paramMenu);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    return this$0.mActivity.superOnPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public ActionMode startActionMode(ActionMode.Callback paramCallback)
  {
    return this$0.startSupportActionModeFromWindow(paramCallback);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarActivityDelegate.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */