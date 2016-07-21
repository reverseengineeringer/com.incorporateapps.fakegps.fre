package android.support.v7.app;

import android.support.v7.internal.app.WindowCallback;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuPresenter.Callback;

final class ActionBarActivityDelegateBase$ActionMenuPresenterCallback
  implements MenuPresenter.Callback
{
  private ActionBarActivityDelegateBase$ActionMenuPresenterCallback(ActionBarActivityDelegateBase paramActionBarActivityDelegateBase) {}
  
  public final void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    ActionBarActivityDelegateBase.access$900(this$0, paramMenuBuilder);
  }
  
  public final boolean onOpenSubMenu(MenuBuilder paramMenuBuilder)
  {
    WindowCallback localWindowCallback = this$0.getWindowCallback();
    if (localWindowCallback != null) {
      localWindowCallback.onMenuOpened(8, paramMenuBuilder);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarActivityDelegateBase.ActionMenuPresenterCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */