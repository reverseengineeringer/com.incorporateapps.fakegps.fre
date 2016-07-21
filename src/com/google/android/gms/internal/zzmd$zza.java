package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzw;

public final class zzmd$zza
{
  public final int zzakx;
  public final int zzaky;
  
  public zzmd$zza(int paramInt1, int paramInt2)
  {
    zzakx = paramInt1;
    zzaky = paramInt2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zza)) {}
    do
    {
      return false;
      if (this == paramObject) {
        return true;
      }
      paramObject = (zza)paramObject;
    } while ((zzakx != zzakx) || (zzaky != zzaky));
    return true;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(zzakx), Integer.valueOf(zzaky) });
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzmd.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */