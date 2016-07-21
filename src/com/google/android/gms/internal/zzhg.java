package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.zzr;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzhg
{
  private int mOrientation = -1;
  private final AdRequestInfoParcel zzCu;
  private List zzGK;
  private boolean zzJA = true;
  private int zzJB = 0;
  private String zzJC = "";
  private boolean zzJD = false;
  private RewardItemParcel zzJE;
  private List zzJF;
  private List zzJG;
  private boolean zzJH = false;
  private String zzJn;
  private String zzJo;
  private List zzJp;
  private String zzJq;
  private String zzJr;
  private List zzJs;
  private long zzJt = -1L;
  private boolean zzJu = false;
  private final long zzJv = -1L;
  private long zzJw = -1L;
  private boolean zzJx = false;
  private boolean zzJy = false;
  private boolean zzJz = false;
  private boolean zzuS = false;
  private String zzxY;
  
  public zzhg(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    zzCu = paramAdRequestInfoParcel;
  }
  
  private void zzA(Map paramMap)
  {
    paramMap = zzd(paramMap, "X-Afma-Fluid");
    if ((paramMap != null) && (paramMap.equals("height"))) {
      zzJD = true;
    }
  }
  
  private void zzB(Map paramMap)
  {
    zzuS = "native_express".equals(zzd(paramMap, "X-Afma-Ad-Format"));
  }
  
  private void zzC(Map paramMap)
  {
    zzJE = RewardItemParcel.zzay(zzd(paramMap, "X-Afma-Rewards"));
  }
  
  private void zzD(Map paramMap)
  {
    if (zzJF != null) {
      return;
    }
    zzJF = zzf(paramMap, "X-Afma-Reward-Video-Start-Urls");
  }
  
  private void zzE(Map paramMap)
  {
    if (zzJG != null) {
      return;
    }
    zzJG = zzf(paramMap, "X-Afma-Reward-Video-Complete-Urls");
  }
  
  private void zzF(Map paramMap)
  {
    zzJH |= zzg(paramMap, "X-Afma-Use-Displayed-Impression");
  }
  
  static String zzd(Map paramMap, String paramString)
  {
    paramMap = (List)paramMap.get(paramString);
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      return (String)paramMap.get(0);
    }
    return null;
  }
  
  static long zze(Map paramMap, String paramString)
  {
    paramMap = (List)paramMap.get(paramString);
    if ((paramMap != null) && (!paramMap.isEmpty()))
    {
      paramMap = (String)paramMap.get(0);
      try
      {
        float f = Float.parseFloat(paramMap);
        return (f * 1000.0F);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        zzin.zzaK("Could not parse float from " + paramString + " header: " + paramMap);
      }
    }
    return -1L;
  }
  
  static List zzf(Map paramMap, String paramString)
  {
    paramMap = (List)paramMap.get(paramString);
    if ((paramMap != null) && (!paramMap.isEmpty()))
    {
      paramMap = (String)paramMap.get(0);
      if (paramMap != null) {
        return Arrays.asList(paramMap.trim().split("\\s+"));
      }
    }
    return null;
  }
  
  private boolean zzg(Map paramMap, String paramString)
  {
    paramMap = (List)paramMap.get(paramString);
    return (paramMap != null) && (!paramMap.isEmpty()) && (Boolean.valueOf((String)paramMap.get(0)).booleanValue());
  }
  
  private void zzk(Map paramMap)
  {
    zzJn = zzd(paramMap, "X-Afma-Ad-Size");
  }
  
  private void zzl(Map paramMap)
  {
    paramMap = zzf(paramMap, "X-Afma-Click-Tracking-Urls");
    if (paramMap != null) {
      zzJp = paramMap;
    }
  }
  
  private void zzm(Map paramMap)
  {
    paramMap = (List)paramMap.get("X-Afma-Debug-Dialog");
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      zzJq = ((String)paramMap.get(0));
    }
  }
  
  private void zzn(Map paramMap)
  {
    paramMap = zzf(paramMap, "X-Afma-Tracking-Urls");
    if (paramMap != null) {
      zzJs = paramMap;
    }
  }
  
  private void zzo(Map paramMap)
  {
    long l = zze(paramMap, "X-Afma-Interstitial-Timeout");
    if (l != -1L) {
      zzJt = l;
    }
  }
  
  private void zzp(Map paramMap)
  {
    zzJr = zzd(paramMap, "X-Afma-ActiveView");
  }
  
  private void zzq(Map paramMap)
  {
    zzJy = "native".equals(zzd(paramMap, "X-Afma-Ad-Format"));
  }
  
  private void zzr(Map paramMap)
  {
    zzJx |= zzg(paramMap, "X-Afma-Custom-Rendering-Allowed");
  }
  
  private void zzs(Map paramMap)
  {
    zzJu |= zzg(paramMap, "X-Afma-Mediation");
  }
  
  private void zzt(Map paramMap)
  {
    paramMap = zzf(paramMap, "X-Afma-Manual-Tracking-Urls");
    if (paramMap != null) {
      zzGK = paramMap;
    }
  }
  
  private void zzu(Map paramMap)
  {
    long l = zze(paramMap, "X-Afma-Refresh-Rate");
    if (l != -1L) {
      zzJw = l;
    }
  }
  
  private void zzv(Map paramMap)
  {
    paramMap = (List)paramMap.get("X-Afma-Orientation");
    if ((paramMap != null) && (!paramMap.isEmpty()))
    {
      paramMap = (String)paramMap.get(0);
      if (!"portrait".equalsIgnoreCase(paramMap)) {
        break label56;
      }
      mOrientation = zzr.zzbE().zzhw();
    }
    label56:
    while (!"landscape".equalsIgnoreCase(paramMap)) {
      return;
    }
    mOrientation = zzr.zzbE().zzhv();
  }
  
  private void zzw(Map paramMap)
  {
    paramMap = (List)paramMap.get("X-Afma-Use-HTTPS");
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      zzJz = Boolean.valueOf((String)paramMap.get(0)).booleanValue();
    }
  }
  
  private void zzx(Map paramMap)
  {
    paramMap = (List)paramMap.get("X-Afma-Content-Url-Opted-Out");
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      zzJA = Boolean.valueOf((String)paramMap.get(0)).booleanValue();
    }
  }
  
  private void zzy(Map paramMap)
  {
    paramMap = zzf(paramMap, "X-Afma-OAuth-Token-Status");
    zzJB = 0;
    if (paramMap == null) {}
    String str;
    do
    {
      return;
      while (!paramMap.hasNext()) {
        paramMap = paramMap.iterator();
      }
      str = (String)paramMap.next();
      if ("Clear".equalsIgnoreCase(str))
      {
        zzJB = 1;
        return;
      }
    } while (!"No-Op".equalsIgnoreCase(str));
    zzJB = 0;
  }
  
  private void zzz(Map paramMap)
  {
    paramMap = (List)paramMap.get("X-Afma-Gws-Query-Id");
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      zzJC = ((String)paramMap.get(0));
    }
  }
  
  public final void zzb(String paramString1, Map paramMap, String paramString2)
  {
    zzJo = paramString1;
    zzxY = paramString2;
    zzj(paramMap);
  }
  
  public final AdResponseParcel zzj(long paramLong)
  {
    return new AdResponseParcel(zzCu, zzJo, zzxY, zzJp, zzJs, zzJt, zzJu, -1L, zzGK, zzJw, mOrientation, zzJn, paramLong, zzJq, zzJr, zzJx, zzJy, zzJz, zzJA, false, zzJB, zzJC, zzJD, zzuS, zzJE, zzJF, zzJG, zzJH);
  }
  
  public final void zzj(Map paramMap)
  {
    zzk(paramMap);
    zzl(paramMap);
    zzm(paramMap);
    zzn(paramMap);
    zzo(paramMap);
    zzs(paramMap);
    zzt(paramMap);
    zzu(paramMap);
    zzv(paramMap);
    zzp(paramMap);
    zzw(paramMap);
    zzr(paramMap);
    zzq(paramMap);
    zzx(paramMap);
    zzy(paramMap);
    zzz(paramMap);
    zzA(paramMap);
    zzB(paramMap);
    zzC(paramMap);
    zzD(paramMap);
    zzE(paramMap);
    zzF(paramMap);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */