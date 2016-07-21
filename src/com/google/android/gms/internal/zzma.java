package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;

public final class zzma
  extends Drawable
  implements Drawable.Callback
{
  private int mFrom;
  private long zzRD;
  private boolean zzajT = true;
  private int zzaka = 0;
  private int zzakb;
  private int zzakc = 255;
  private int zzakd;
  private int zzake = 0;
  private boolean zzakf;
  private zzma.zzb zzakg;
  private Drawable zzakh;
  private Drawable zzaki;
  private boolean zzakj;
  private boolean zzakk;
  private boolean zzakl;
  private int zzakm;
  
  public zzma(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    this(null);
    Object localObject = paramDrawable1;
    if (paramDrawable1 == null) {
      localObject = zzma.zza.zzqo();
    }
    zzakh = ((Drawable)localObject);
    ((Drawable)localObject).setCallback(this);
    paramDrawable1 = zzakg;
    zzakq |= ((Drawable)localObject).getChangingConfigurations();
    paramDrawable1 = paramDrawable2;
    if (paramDrawable2 == null) {
      paramDrawable1 = zzma.zza.zzqo();
    }
    zzaki = paramDrawable1;
    paramDrawable1.setCallback(this);
    paramDrawable2 = zzakg;
    zzakq |= paramDrawable1.getChangingConfigurations();
  }
  
  zzma(zzma.zzb paramzzb)
  {
    zzakg = new zzma.zzb(paramzzb);
  }
  
  public final boolean canConstantState()
  {
    if (!zzakj) {
      if ((zzakh.getConstantState() == null) || (zzaki.getConstantState() == null)) {
        break label44;
      }
    }
    label44:
    for (boolean bool = true;; bool = false)
    {
      zzakk = bool;
      zzakj = true;
      return zzakk;
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    int j = 1;
    int i = 1;
    int k = 0;
    switch (zzaka)
    {
    }
    boolean bool;
    Drawable localDrawable1;
    Drawable localDrawable2;
    do
    {
      for (;;)
      {
        j = zzake;
        bool = zzajT;
        localDrawable1 = zzakh;
        localDrawable2 = zzaki;
        if (i == 0) {
          break;
        }
        if ((!bool) || (j == 0)) {
          localDrawable1.draw(paramCanvas);
        }
        if (j == zzakc)
        {
          localDrawable2.setAlpha(zzakc);
          localDrawable2.draw(paramCanvas);
        }
        return;
        zzRD = SystemClock.uptimeMillis();
        zzaka = 2;
        i = k;
      }
    } while (zzRD < 0L);
    float f1 = (float)(SystemClock.uptimeMillis() - zzRD) / zzakd;
    if (f1 >= 1.0F) {}
    for (i = j;; i = 0)
    {
      if (i != 0) {
        zzaka = 0;
      }
      f1 = Math.min(f1, 1.0F);
      float f2 = mFrom;
      zzake = ((int)(f1 * (zzakb - mFrom) + f2));
      break;
    }
    if (bool) {
      localDrawable1.setAlpha(zzakc - j);
    }
    localDrawable1.draw(paramCanvas);
    if (bool) {
      localDrawable1.setAlpha(zzakc);
    }
    if (j > 0)
    {
      localDrawable2.setAlpha(j);
      localDrawable2.draw(paramCanvas);
      localDrawable2.setAlpha(zzakc);
    }
    invalidateSelf();
  }
  
  public final int getChangingConfigurations()
  {
    return super.getChangingConfigurations() | zzakg.zzakp | zzakg.zzakq;
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    if (canConstantState())
    {
      zzakg.zzakp = getChangingConfigurations();
      return zzakg;
    }
    return null;
  }
  
  public final int getIntrinsicHeight()
  {
    return Math.max(zzakh.getIntrinsicHeight(), zzaki.getIntrinsicHeight());
  }
  
  public final int getIntrinsicWidth()
  {
    return Math.max(zzakh.getIntrinsicWidth(), zzaki.getIntrinsicWidth());
  }
  
  public final int getOpacity()
  {
    if (!zzakl)
    {
      zzakm = Drawable.resolveOpacity(zzakh.getOpacity(), zzaki.getOpacity());
      zzakl = true;
    }
    return zzakm;
  }
  
  public final void invalidateDrawable(Drawable paramDrawable)
  {
    if (zzne.zzsd())
    {
      paramDrawable = getCallback();
      if (paramDrawable != null) {
        paramDrawable.invalidateDrawable(this);
      }
    }
  }
  
  public final Drawable mutate()
  {
    if ((!zzakf) && (super.mutate() == this))
    {
      if (!canConstantState()) {
        throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
      }
      zzakh.mutate();
      zzaki.mutate();
      zzakf = true;
    }
    return this;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    zzakh.setBounds(paramRect);
    zzaki.setBounds(paramRect);
  }
  
  public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    if (zzne.zzsd())
    {
      paramDrawable = getCallback();
      if (paramDrawable != null) {
        paramDrawable.scheduleDrawable(this, paramRunnable, paramLong);
      }
    }
  }
  
  public final void setAlpha(int paramInt)
  {
    if (zzake == zzakc) {
      zzake = paramInt;
    }
    zzakc = paramInt;
    invalidateSelf();
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    zzakh.setColorFilter(paramColorFilter);
    zzaki.setColorFilter(paramColorFilter);
  }
  
  public final void startTransition(int paramInt)
  {
    mFrom = 0;
    zzakb = zzakc;
    zzake = 0;
    zzakd = paramInt;
    zzaka = 1;
    invalidateSelf();
  }
  
  public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    if (zzne.zzsd())
    {
      paramDrawable = getCallback();
      if (paramDrawable != null) {
        paramDrawable.unscheduleDrawable(this, paramRunnable);
      }
    }
  }
  
  public final Drawable zzqn()
  {
    return zzaki;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzma
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */