package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.zzb;
import java.util.Map;

public class zzds
  implements zzdf
{
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    zzdq localzzdq = zzr.zzbR();
    if (paramMap.containsKey("abort"))
    {
      if (!localzzdq.zzd(paramzzjp)) {
        zzin.zzaK("Precache abort but no preload task running.");
      }
      return;
    }
    String str = (String)paramMap.get("src");
    if (str == null)
    {
      zzin.zzaK("Precache video action is missing the src parameter.");
      return;
    }
    try
    {
      i = Integer.parseInt((String)paramMap.get("player"));
      if (paramMap.containsKey("mimetype"))
      {
        paramMap = (String)paramMap.get("mimetype");
        if (!localzzdq.zze(paramzzjp)) {
          break label121;
        }
        zzin.zzaK("Precache task already running.");
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      int i;
      for (;;)
      {
        i = 0;
        continue;
        paramMap = "";
      }
      label121:
      zzb.zzv(paramzzjp.zzhR());
      new zzdp(paramzzjp, zzhRzzpw.zza(paramzzjp, i, paramMap), str).zzhn();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzds
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */