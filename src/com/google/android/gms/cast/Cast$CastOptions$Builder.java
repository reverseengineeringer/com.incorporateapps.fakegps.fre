package com.google.android.gms.cast;

import com.google.android.gms.common.internal.zzx;

public final class Cast$CastOptions$Builder
{
  CastDevice zzZO;
  Cast.Listener zzZP;
  private int zzZQ;
  
  public Cast$CastOptions$Builder(CastDevice paramCastDevice, Cast.Listener paramListener)
  {
    zzx.zzb(paramCastDevice, "CastDevice parameter cannot be null");
    zzx.zzb(paramListener, "CastListener parameter cannot be null");
    zzZO = paramCastDevice;
    zzZP = paramListener;
    zzZQ = 0;
  }
  
  public final Cast.CastOptions build()
  {
    return new Cast.CastOptions(this, null);
  }
  
  public final Builder setVerboseLoggingEnabled(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      zzZQ |= 0x1;
      return this;
    }
    zzZQ &= 0xFFFFFFFE;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.Cast.CastOptions.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */