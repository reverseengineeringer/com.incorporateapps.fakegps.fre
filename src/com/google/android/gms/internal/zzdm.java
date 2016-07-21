package com.google.android.gms.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public final class zzdm
  implements zzdf
{
  private final zze zzzA;
  private final zzfn zzzB;
  private final zzdh zzzD;
  
  public zzdm(zzdh paramzzdh, zze paramzze, zzfn paramzzfn)
  {
    zzzD = paramzzdh;
    zzzA = paramzze;
    zzzB = paramzzfn;
  }
  
  private static boolean zzc(Map paramMap)
  {
    return "1".equals(paramMap.get("custom_close"));
  }
  
  private static int zzd(Map paramMap)
  {
    paramMap = (String)paramMap.get("o");
    if (paramMap != null)
    {
      if ("p".equalsIgnoreCase(paramMap)) {
        return zzr.zzbE().zzhw();
      }
      if ("l".equalsIgnoreCase(paramMap)) {
        return zzr.zzbE().zzhv();
      }
      if ("c".equalsIgnoreCase(paramMap)) {
        return zzr.zzbE().zzhx();
      }
    }
    return -1;
  }
  
  private static void zze(zzjp paramzzjp, Map paramMap)
  {
    paramMap = (String)paramMap.get("u");
    if (TextUtils.isEmpty(paramMap))
    {
      zzin.zzaK("Destination url cannot be empty.");
      return;
    }
    new zzdm.zza(paramzzjp, paramMap).zzhn();
  }
  
  private static void zzf(zzjp paramzzjp, Map paramMap)
  {
    Context localContext = paramzzjp.getContext();
    if (TextUtils.isEmpty((String)paramMap.get("u")))
    {
      zzin.zzaK("Destination url cannot be empty.");
      return;
    }
    zzjq localzzjq = paramzzjp.zzhU();
    paramzzjp = new zzdm.zzb(paramzzjp).zza(localContext, paramMap);
    try
    {
      localzzjq.zza(new AdLauncherIntentInfoParcel(paramzzjp));
      return;
    }
    catch (ActivityNotFoundException paramzzjp)
    {
      zzin.zzaK(paramzzjp.getMessage());
    }
  }
  
  private void zzo(boolean paramBoolean)
  {
    if (zzzB != null) {
      zzzB.zzp(paramBoolean);
    }
  }
  
  public final void zza(zzjp paramzzjp, Map paramMap)
  {
    String str = (String)paramMap.get("a");
    if (str == null) {
      zzin.zzaK("Action missing from an open GMSG.");
    }
    zzjq localzzjq;
    do
    {
      return;
      if ((zzzA != null) && (!zzzA.zzbh()))
      {
        zzzA.zzq((String)paramMap.get("u"));
        return;
      }
      localzzjq = paramzzjp.zzhU();
      if ("expand".equalsIgnoreCase(str))
      {
        if (paramzzjp.zzhY())
        {
          zzin.zzaK("Cannot expand WebView that is already expanded.");
          return;
        }
        zzo(false);
        localzzjq.zza(zzc(paramMap), zzd(paramMap));
        return;
      }
      if ("webapp".equalsIgnoreCase(str))
      {
        paramzzjp = (String)paramMap.get("u");
        zzo(false);
        if (paramzzjp != null)
        {
          localzzjq.zza(zzc(paramMap), zzd(paramMap), paramzzjp);
          return;
        }
        localzzjq.zza(zzc(paramMap), zzd(paramMap), (String)paramMap.get("html"), (String)paramMap.get("baseurl"));
        return;
      }
      if (!"in_app_purchase".equalsIgnoreCase(str)) {
        break;
      }
      paramzzjp = (String)paramMap.get("product_id");
      paramMap = (String)paramMap.get("report_urls");
    } while (zzzD == null);
    if ((paramMap != null) && (!paramMap.isEmpty()))
    {
      paramMap = paramMap.split(" ");
      zzzD.zza(paramzzjp, new ArrayList(Arrays.asList(paramMap)));
      return;
    }
    zzzD.zza(paramzzjp, new ArrayList());
    return;
    if (("app".equalsIgnoreCase(str)) && ("true".equalsIgnoreCase((String)paramMap.get("play_store"))))
    {
      zze(paramzzjp, paramMap);
      return;
    }
    if (("app".equalsIgnoreCase(str)) && ("true".equalsIgnoreCase((String)paramMap.get("system_browser"))))
    {
      zzo(true);
      zzf(paramzzjp, paramMap);
      return;
    }
    zzo(true);
    str = (String)paramMap.get("u");
    if (!TextUtils.isEmpty(str)) {}
    for (paramzzjp = zzr.zzbC().zza(paramzzjp, str);; paramzzjp = str)
    {
      localzzjq.zza(new AdLauncherIntentInfoParcel((String)paramMap.get("i"), paramzzjp, (String)paramMap.get("m"), (String)paramMap.get("p"), (String)paramMap.get("c"), (String)paramMap.get("f"), (String)paramMap.get("e")));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */