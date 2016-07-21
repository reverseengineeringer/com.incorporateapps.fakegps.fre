package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.Map;
import org.json.JSONObject;

final class zzde$8
  implements zzdf
{
  private void zzc(zzjp paramzzjp)
  {
    zzin.zzaJ("Received support message, responding.");
    boolean bool2 = false;
    Object localObject = paramzzjp.zzhR();
    boolean bool1 = bool2;
    if (localObject != null)
    {
      localObject = zzpy;
      bool1 = bool2;
      if (localObject != null) {
        bool1 = ((zzm)localObject).zzfM();
      }
    }
    localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).put("event", "checkSupport");
      ((JSONObject)localObject).put("supports", bool1);
      paramzzjp.zzb("appStreaming", (JSONObject)localObject);
      return;
    }
    catch (Throwable paramzzjp) {}
  }
  
  public final void zza(zzjp paramzzjp, Map paramMap)
  {
    if ("checkSupport".equals(paramMap.get("action"))) {
      zzc(paramzzjp);
    }
    com.google.android.gms.ads.internal.overlay.zzd localzzd;
    do
    {
      return;
      localzzd = paramzzjp.zzhS();
    } while (localzzd == null);
    localzzd.zzg(paramzzjp, paramMap);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzde.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */