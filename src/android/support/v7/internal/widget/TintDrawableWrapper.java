package android.support.v7.internal.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;

class TintDrawableWrapper
  extends DrawableWrapper
{
  private int mCurrentColor;
  private final PorterDuff.Mode mTintMode;
  private final ColorStateList mTintStateList;
  
  public TintDrawableWrapper(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    this(paramDrawable, paramColorStateList, TintManager.DEFAULT_MODE);
  }
  
  public TintDrawableWrapper(Drawable paramDrawable, ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    super(paramDrawable);
    mTintStateList = paramColorStateList;
    mTintMode = paramMode;
  }
  
  private boolean updateTint(int[] paramArrayOfInt)
  {
    if (mTintStateList != null)
    {
      int i = mTintStateList.getColorForState(paramArrayOfInt, mCurrentColor);
      if (i != mCurrentColor)
      {
        if (i != 0) {
          setColorFilter(i, mTintMode);
        }
        for (;;)
        {
          mCurrentColor = i;
          return true;
          clearColorFilter();
        }
      }
    }
    return false;
  }
  
  public boolean isStateful()
  {
    return ((mTintStateList != null) && (mTintStateList.isStateful())) || (super.isStateful());
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    boolean bool = super.setState(paramArrayOfInt);
    return (updateTint(paramArrayOfInt)) || (bool);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.TintDrawableWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */