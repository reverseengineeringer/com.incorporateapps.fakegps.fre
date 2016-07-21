package android.support.v7.internal.app;

import android.support.v7.internal.widget.DecorToolbar;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.WindowCallbackWrapper;
import android.view.Menu;
import android.view.View;

class ToolbarActionBar$ToolbarCallbackWrapper
  extends WindowCallbackWrapper
{
  public ToolbarActionBar$ToolbarCallbackWrapper(ToolbarActionBar paramToolbarActionBar, WindowCallback paramWindowCallback)
  {
    super(paramWindowCallback);
  }
  
  public View onCreatePanelView(int paramInt)
  {
    switch (paramInt)
    {
    }
    Menu localMenu;
    do
    {
      do
      {
        return super.onCreatePanelView(paramInt);
        if (!ToolbarActionBar.access$100(this$0))
        {
          this$0.populateOptionsMenu();
          ToolbarActionBar.access$400(this$0).removeCallbacks(ToolbarActionBar.access$300(this$0));
        }
      } while ((!ToolbarActionBar.access$100(this$0)) || (ToolbarActionBar.access$000(this$0) == null));
      localMenu = ToolbarActionBar.access$500(this$0);
    } while ((!ToolbarActionBar.access$000(this$0).onPreparePanel(paramInt, null, localMenu)) || (!ToolbarActionBar.access$000(this$0).onMenuOpened(paramInt, localMenu)));
    return ToolbarActionBar.access$600(this$0, localMenu);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    boolean bool = super.onPreparePanel(paramInt, paramView, paramMenu);
    if ((bool) && (!ToolbarActionBar.access$100(this$0)))
    {
      ToolbarActionBar.access$200(this$0).setMenuPrepared();
      ToolbarActionBar.access$102(this$0, true);
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.app.ToolbarActionBar.ToolbarCallbackWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */