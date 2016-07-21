package android.support.v7.widget;

import android.support.v7.internal.app.WindowCallback;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class WindowCallbackWrapper
  implements WindowCallback
{
  private WindowCallback mWrapped;
  
  public WindowCallbackWrapper(WindowCallback paramWindowCallback)
  {
    if (paramWindowCallback == null) {
      throw new IllegalArgumentException("Window callback may not be null");
    }
    mWrapped = paramWindowCallback;
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    return mWrapped.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public View onCreatePanelView(int paramInt)
  {
    return mWrapped.onCreatePanelView(paramInt);
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    return mWrapped.onMenuItemSelected(paramInt, paramMenuItem);
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return mWrapped.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    mWrapped.onPanelClosed(paramInt, paramMenu);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    return mWrapped.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public ActionMode startActionMode(ActionMode.Callback paramCallback)
  {
    return mWrapped.startActionMode(paramCallback);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.widget.WindowCallbackWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */