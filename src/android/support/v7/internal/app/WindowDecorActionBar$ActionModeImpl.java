package android.support.v7.internal.app;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuBuilder.Callback;
import android.support.v7.internal.view.menu.MenuPopupHelper;
import android.support.v7.internal.view.menu.SubMenuBuilder;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.DecorToolbar;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class WindowDecorActionBar$ActionModeImpl
  extends ActionMode
  implements MenuBuilder.Callback
{
  private ActionMode.Callback mCallback;
  private WeakReference mCustomView;
  private MenuBuilder mMenu;
  
  public WindowDecorActionBar$ActionModeImpl(WindowDecorActionBar paramWindowDecorActionBar, ActionMode.Callback paramCallback)
  {
    mCallback = paramCallback;
    mMenu = new MenuBuilder(paramWindowDecorActionBar.getThemedContext()).setDefaultShowAsAction(1);
    mMenu.setCallback(this);
  }
  
  public boolean dispatchOnCreate()
  {
    mMenu.stopDispatchingItemsChanged();
    try
    {
      boolean bool = mCallback.onCreateActionMode(this, mMenu);
      return bool;
    }
    finally
    {
      mMenu.startDispatchingItemsChanged();
    }
  }
  
  public void finish()
  {
    if (this$0.mActionMode != this) {
      return;
    }
    if (!WindowDecorActionBar.access$900(WindowDecorActionBar.access$700(this$0), WindowDecorActionBar.access$800(this$0), false))
    {
      this$0.mDeferredDestroyActionMode = this;
      this$0.mDeferredModeDestroyCallback = mCallback;
    }
    for (;;)
    {
      mCallback = null;
      this$0.animateToMode(false);
      WindowDecorActionBar.access$1000(this$0).closeMode();
      WindowDecorActionBar.access$1100(this$0).getViewGroup().sendAccessibilityEvent(32);
      WindowDecorActionBar.access$600(this$0).setHideOnContentScrollEnabled(this$0.mHideOnContentScroll);
      this$0.mActionMode = null;
      return;
      mCallback.onDestroyActionMode(this);
    }
  }
  
  public View getCustomView()
  {
    if (mCustomView != null) {
      return (View)mCustomView.get();
    }
    return null;
  }
  
  public Menu getMenu()
  {
    return mMenu;
  }
  
  public MenuInflater getMenuInflater()
  {
    return new SupportMenuInflater(this$0.getThemedContext());
  }
  
  public CharSequence getSubtitle()
  {
    return WindowDecorActionBar.access$1000(this$0).getSubtitle();
  }
  
  public CharSequence getTitle()
  {
    return WindowDecorActionBar.access$1000(this$0).getTitle();
  }
  
  public void invalidate()
  {
    mMenu.stopDispatchingItemsChanged();
    try
    {
      mCallback.onPrepareActionMode(this, mMenu);
      return;
    }
    finally
    {
      mMenu.startDispatchingItemsChanged();
    }
  }
  
  public boolean isTitleOptional()
  {
    return WindowDecorActionBar.access$1000(this$0).isTitleOptional();
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean) {}
  
  public void onCloseSubMenu(SubMenuBuilder paramSubMenuBuilder) {}
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    if (mCallback != null) {
      return mCallback.onActionItemClicked(this, paramMenuItem);
    }
    return false;
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder)
  {
    if (mCallback == null) {
      return;
    }
    invalidate();
    WindowDecorActionBar.access$1000(this$0).showOverflowMenu();
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    boolean bool = true;
    if (mCallback == null) {
      bool = false;
    }
    while (!paramSubMenuBuilder.hasVisibleItems()) {
      return bool;
    }
    new MenuPopupHelper(this$0.getThemedContext(), paramSubMenuBuilder).show();
    return true;
  }
  
  public void setCustomView(View paramView)
  {
    WindowDecorActionBar.access$1000(this$0).setCustomView(paramView);
    mCustomView = new WeakReference(paramView);
  }
  
  public void setSubtitle(int paramInt)
  {
    setSubtitle(WindowDecorActionBar.access$1200(this$0).getResources().getString(paramInt));
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    WindowDecorActionBar.access$1000(this$0).setSubtitle(paramCharSequence);
  }
  
  public void setTitle(int paramInt)
  {
    setTitle(WindowDecorActionBar.access$1200(this$0).getResources().getString(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    WindowDecorActionBar.access$1000(this$0).setTitle(paramCharSequence);
  }
  
  public void setTitleOptionalHint(boolean paramBoolean)
  {
    super.setTitleOptionalHint(paramBoolean);
    WindowDecorActionBar.access$1000(this$0).setTitleOptional(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.app.WindowDecorActionBar.ActionModeImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */