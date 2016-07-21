package com.google.android.gms.internal;

class zzhd$2$1
  implements zzji.zzc
{
  zzhd$2$1(zzhd.2 param2, zzbz paramzzbz) {}
  
  public void zzd(zzeh paramzzeh)
  {
    zzJc.zzpt.zza(zzJb, new String[] { "jsf" });
    zzJc.zzpt.zzdC();
    paramzzeh.zza("/invalidRequest", zzJc.zzIY.zzJk);
    paramzzeh.zza("/loadAdURL", zzJc.zzIY.zzJl);
    try
    {
      paramzzeh.zze("AFMA_buildAdURL", zzJc.zzJa);
      return;
    }
    catch (Exception paramzzeh)
    {
      zzin.zzb("Error requesting an ad url", paramzzeh);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhd.2.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */