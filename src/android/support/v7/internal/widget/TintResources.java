package android.support.v7.internal.widget;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class TintResources
  extends Resources
{
  private final TintManager mTintManager;
  
  public TintResources(Resources paramResources, TintManager paramTintManager)
  {
    super(paramResources.getAssets(), paramResources.getDisplayMetrics(), paramResources.getConfiguration());
    mTintManager = paramTintManager;
  }
  
  public Drawable getDrawable(int paramInt)
  {
    Drawable localDrawable = super.getDrawable(paramInt);
    if (localDrawable != null) {
      mTintManager.tintDrawable(paramInt, localDrawable);
    }
    return localDrawable;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.TintResources
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */