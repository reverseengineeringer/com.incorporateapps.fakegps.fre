package com.google.android.gms.internal;

import java.util.Map;

class zzhf$2
  implements zzdf
{
  zzhf$2(zzhf paramzzhf) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    zzhi localzzhi;
    synchronized (zzhf.zza(zzJm))
    {
      if (zzhf.zzb(zzJm).isDone()) {
        return;
      }
      localzzhi = new zzhi(-2, paramMap);
      if (!zzhf.zzc(zzJm).equals(localzzhi.getRequestId()))
      {
        zzin.zzaK(localzzhi.getRequestId() + " ==== " + zzhf.zzc(zzJm));
        return;
      }
    }
    String str = localzzhi.getUrl();
    if (str == null)
    {
      zzin.zzaK("URL missing in loadAdUrl GMSG.");
      return;
    }
    if (str.contains("%40mediation_adapters%40"))
    {
      paramzzjp = str.replaceAll("%40mediation_adapters%40", zzil.zza(paramzzjp.getContext(), (String)paramMap.get("check_adapters"), zzhf.zzd(zzJm)));
      localzzhi.setUrl(paramzzjp);
      zzin.v("Ad request URL modified to " + paramzzjp);
    }
    zzhf.zzb(zzJm).zzg(localzzhi);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhf.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */