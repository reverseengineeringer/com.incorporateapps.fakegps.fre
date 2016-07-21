package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class zzma$zzb
  extends Drawable.ConstantState
{
  int zzakp;
  int zzakq;
  
  zzma$zzb(zzb paramzzb)
  {
    if (paramzzb != null)
    {
      zzakp = zzakp;
      zzakq = zzakq;
    }
  }
  
  public final int getChangingConfigurations()
  {
    return zzakp;
  }
  
  public final Drawable newDrawable()
  {
    return new zzma(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzma.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */