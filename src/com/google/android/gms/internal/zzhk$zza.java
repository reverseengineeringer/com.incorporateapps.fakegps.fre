package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzr;

class zzhk$zza
{
  public final long zzKn = zzr.zzbG().currentTimeMillis();
  public final zzhj zzKo;
  
  public zzhk$zza(zzhk paramzzhk, zzhj paramzzhj)
  {
    zzKo = paramzzhj;
  }
  
  public boolean hasExpired()
  {
    long l = zzKn;
    return ((Long)zzbt.zzwM.get()).longValue() + l < zzr.zzbG().currentTimeMillis();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhk.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */