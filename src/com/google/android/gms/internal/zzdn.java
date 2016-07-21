package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.Map;

public class zzdn
  implements zzdf
{
  private final zzdn.zza zzzH;
  
  public zzdn(zzdn.zza paramzza)
  {
    zzzH = paramzza;
  }
  
  public static void zza(zzjp paramzzjp, zzdn.zza paramzza)
  {
    paramzzjp.zzhU().zza("/reward", new zzdn(paramzza));
  }
  
  private void zze(Map paramMap)
  {
    try
    {
      int i = Integer.parseInt((String)paramMap.get("amount"));
      paramMap = (String)paramMap.get("type");
      if (!TextUtils.isEmpty(paramMap))
      {
        paramMap = new RewardItemParcel(paramMap, i);
        zzzH.zzb(paramMap);
        return;
      }
    }
    catch (NumberFormatException paramMap)
    {
      for (;;)
      {
        zzin.zzd("Unable to parse reward amount.", paramMap);
        paramMap = null;
      }
    }
  }
  
  private void zzf(Map paramMap)
  {
    zzzH.zzbq();
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    paramzzjp = (String)paramMap.get("action");
    if ("grant".equals(paramzzjp)) {
      zze(paramMap);
    }
    while (!"video_start".equals(paramzzjp)) {
      return;
    }
    zzf(paramMap);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */