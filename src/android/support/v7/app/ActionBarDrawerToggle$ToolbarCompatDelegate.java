package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;

class ActionBarDrawerToggle$ToolbarCompatDelegate
  implements ActionBarDrawerToggle.Delegate
{
  final Toolbar mToolbar;
  
  ActionBarDrawerToggle$ToolbarCompatDelegate(Toolbar paramToolbar)
  {
    mToolbar = paramToolbar;
  }
  
  public Context getActionBarThemedContext()
  {
    return mToolbar.getContext();
  }
  
  public Drawable getThemeUpIndicator()
  {
    TypedArray localTypedArray = mToolbar.getContext().obtainStyledAttributes(new int[] { 16908332 });
    Drawable localDrawable = localTypedArray.getDrawable(0);
    localTypedArray.recycle();
    return localDrawable;
  }
  
  public void setActionBarDescription(int paramInt)
  {
    mToolbar.setNavigationContentDescription(paramInt);
  }
  
  public void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
  {
    mToolbar.setNavigationIcon(paramDrawable);
    mToolbar.setNavigationContentDescription(paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarDrawerToggle.ToolbarCompatDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */