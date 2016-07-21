package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.support.v7.internal.widget.ActivityChooserModel;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

class ShareActionProvider$ShareMenuItemOnMenuItemClickListener
  implements MenuItem.OnMenuItemClickListener
{
  private ShareActionProvider$ShareMenuItemOnMenuItemClickListener(ShareActionProvider paramShareActionProvider) {}
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    paramMenuItem = ActivityChooserModel.get(ShareActionProvider.access$100(this$0), ShareActionProvider.access$200(this$0)).chooseActivity(paramMenuItem.getItemId());
    if (paramMenuItem != null)
    {
      paramMenuItem.addFlags(524288);
      ShareActionProvider.access$100(this$0).startActivity(paramMenuItem);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.widget.ShareActionProvider.ShareMenuItemOnMenuItemClickListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */