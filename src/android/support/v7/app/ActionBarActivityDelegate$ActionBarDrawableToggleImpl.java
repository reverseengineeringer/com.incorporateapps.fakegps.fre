package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

class ActionBarActivityDelegate$ActionBarDrawableToggleImpl
  implements android.support.v4.app.ActionBarDrawerToggle.Delegate, ActionBarDrawerToggle.Delegate
{
  private ActionBarActivityDelegate$ActionBarDrawableToggleImpl(ActionBarActivityDelegate paramActionBarActivityDelegate) {}
  
  public Context getActionBarThemedContext()
  {
    return this$0.getActionBarThemedContext();
  }
  
  public Drawable getThemeUpIndicator()
  {
    TypedArray localTypedArray = this$0.getActionBarThemedContext().obtainStyledAttributes(new int[] { this$0.getHomeAsUpIndicatorAttrId() });
    Drawable localDrawable = localTypedArray.getDrawable(0);
    localTypedArray.recycle();
    return localDrawable;
  }
  
  public void setActionBarDescription(int paramInt)
  {
    ActionBar localActionBar = this$0.getSupportActionBar();
    if (localActionBar != null) {
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }
  
  public void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
  {
    ActionBar localActionBar = this$0.getSupportActionBar();
    if (localActionBar != null)
    {
      localActionBar.setHomeAsUpIndicator(paramDrawable);
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.ActionBarActivityDelegate.ActionBarDrawableToggleImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */