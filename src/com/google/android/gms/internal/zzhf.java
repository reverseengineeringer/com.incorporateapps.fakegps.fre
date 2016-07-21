package com.google.android.gms.internal;

import java.util.concurrent.Future;

public final class zzhf
{
  private String zzEY;
  private String zzJh;
  private zzjd zzJi = new zzjd();
  zzeg.zzd zzJj;
  public final zzdf zzJk = new zzhf.1(this);
  public final zzdf zzJl = new zzhf.2(this);
  zzjp zzpD;
  private final Object zzpV = new Object();
  
  public zzhf(String paramString1, String paramString2)
  {
    zzJh = paramString2;
    zzEY = paramString1;
  }
  
  public final void zzb(zzeg.zzd paramzzd)
  {
    zzJj = paramzzd;
  }
  
  public final zzeg.zzd zzgB()
  {
    return zzJj;
  }
  
  public final Future zzgC()
  {
    return zzJi;
  }
  
  public final void zzgD()
  {
    if (zzpD != null)
    {
      zzpD.destroy();
      zzpD = null;
    }
  }
  
  public final void zzh(zzjp paramzzjp)
  {
    zzpD = paramzzjp;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */