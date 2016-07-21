package android.support.v7.internal.app;

import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuBuilder.Callback;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

final class ToolbarActionBar$MenuBuilderCallback
  implements MenuBuilder.Callback
{
  private ToolbarActionBar$MenuBuilderCallback(ToolbarActionBar paramToolbarActionBar) {}
  
  public final boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void onMenuModeChange(MenuBuilder paramMenuBuilder)
  {
    if (ToolbarActionBar.access$000(this$0) != null)
    {
      if (!ToolbarActionBar.access$400(this$0).isOverflowMenuShowing()) {
        break label39;
      }
      ToolbarActionBar.access$000(this$0).onPanelClosed(8, paramMenuBuilder);
    }
    label39:
    while (!ToolbarActionBar.access$000(this$0).onPreparePanel(0, null, paramMenuBuilder)) {
      return;
    }
    ToolbarActionBar.access$000(this$0).onMenuOpened(8, paramMenuBuilder);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.app.ToolbarActionBar.MenuBuilderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */