package android.support.v4.app;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

class ActionBarDrawerToggle$SlideDrawable
  extends Drawable
  implements Drawable.Callback
{
  private float mOffset;
  private float mOffsetBy;
  private final Rect mTmpRect = new Rect();
  private Drawable mWrapped;
  
  public ActionBarDrawerToggle$SlideDrawable(Drawable paramDrawable)
  {
    mWrapped = paramDrawable;
  }
  
  public void clearColorFilter()
  {
    mWrapped.clearColorFilter();
  }
  
  public void draw(Canvas paramCanvas)
  {
    mWrapped.copyBounds(mTmpRect);
    paramCanvas.save();
    paramCanvas.translate(mOffsetBy * mTmpRect.width() * -mOffset, 0.0F);
    mWrapped.draw(paramCanvas);
    paramCanvas.restore();
  }
  
  public int getChangingConfigurations()
  {
    return mWrapped.getChangingConfigurations();
  }
  
  public Drawable.ConstantState getConstantState()
  {
    return super.getConstantState();
  }
  
  public Drawable getCurrent()
  {
    return mWrapped.getCurrent();
  }
  
  public int getIntrinsicHeight()
  {
    return mWrapped.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    return mWrapped.getIntrinsicWidth();
  }
  
  public int getMinimumHeight()
  {
    return mWrapped.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    return mWrapped.getMinimumWidth();
  }
  
  public float getOffset()
  {
    return mOffset;
  }
  
  public int getOpacity()
  {
    return mWrapped.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    return mWrapped.getPadding(paramRect);
  }
  
  public int[] getState()
  {
    return mWrapped.getState();
  }
  
  public Region getTransparentRegion()
  {
    return mWrapped.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == mWrapped) {
      invalidateSelf();
    }
  }
  
  public boolean isStateful()
  {
    return mWrapped.isStateful();
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    mWrapped.setBounds(paramRect);
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    mWrapped.setState(paramArrayOfInt);
    return super.onStateChange(paramArrayOfInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    if (paramDrawable == mWrapped) {
      scheduleSelf(paramRunnable, paramLong);
    }
  }
  
  public void setAlpha(int paramInt)
  {
    mWrapped.setAlpha(paramInt);
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    mWrapped.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(int paramInt, PorterDuff.Mode paramMode)
  {
    mWrapped.setColorFilter(paramInt, paramMode);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    mWrapped.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean)
  {
    mWrapped.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    mWrapped.setFilterBitmap(paramBoolean);
  }
  
  public void setOffset(float paramFloat)
  {
    mOffset = paramFloat;
    invalidateSelf();
  }
  
  public void setOffsetBy(float paramFloat)
  {
    mOffsetBy = paramFloat;
    invalidateSelf();
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    return mWrapped.setState(paramArrayOfInt);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    if (paramDrawable == mWrapped) {
      unscheduleSelf(paramRunnable);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.ActionBarDrawerToggle.SlideDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */