package android.support.v7.app;

import android.support.v7.internal.app.WindowCallback;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuPresenter.Callback;

final class ActionBarActivityDelegateBase$PanelMenuPresenterCallback
  implements MenuPresenter.Callback
{
  private ActionBarActivityDelegateBase$PanelMenuPresenterCallback(ActionBarActivityDelegateBase paramActionBarActivityDelegateBase) {}
  
  public final void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    MenuBuilder localMenuBuilder = paramMenuBuilder.getRootMenu();
    if (localMenuBuilder != paramMenuBuilder) {}
    for (int i = 1;; i = 0)
    {
      ActionBarActivityDelegateBase localActionBarActivityDelegateBase = this$0;
      if (i != 0) {
        paramMenuBuilder = localMenuBuilder;
      }
      paramMenuBuilder = ActionBarActivityDelegateBase.access$600(localActionBarActivityDelegateBase, paramMenuBuilder);
      if (paramMenuBuilder != null)
      {
        if (i == 0) {
          break;
        }
        ActionBarActivityDelegateBase.access$700(this$0, featureId, paramMenuBuilder, localMenuBuilder);
        ActionBarActivityDelegateBase.access$800(this$0, paramMenuBuilder, true);
      }
      return;
    }
    this$0.mActivity.closeOptionsMenu();
    ActionBarActivityDelegateBase.access$800(this$0, paramMenuBuilder, paramBoolean);
  }
  
  public final boolean onOpenSubMenu(MenuBuilder paramMenuBuilder)
  {
    if ((paramMenuBuilder == null) && (this$0.mHasActionBar))
    {
      WindowCallback localWindowCallback = this$0.getWindowCallback();
      if ((localWindowCallback != null) && (!this$0.isDestroyed())) {
        localWindowCallback.onMenuOpened(8, paramMenuBuilder);
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarActivityDelegateBase.PanelMenuPresenterCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */