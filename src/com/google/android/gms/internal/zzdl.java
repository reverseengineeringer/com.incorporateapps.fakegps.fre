package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zze;
import java.util.Map;

public class zzdl
  implements zzdf
{
  static final Map zzzC = zzmr.zza("resize", Integer.valueOf(1), "playVideo", Integer.valueOf(2), "storePicture", Integer.valueOf(3), "createCalendarEvent", Integer.valueOf(4), "setOrientationProperties", Integer.valueOf(5), "closeResizedAd", Integer.valueOf(6));
  private final zze zzzA;
  private final zzfn zzzB;
  
  public zzdl(zze paramzze, zzfn paramzzfn)
  {
    zzzA = paramzze;
    zzzB = paramzzfn;
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    String str = (String)paramMap.get("a");
    int i = ((Integer)zzzC.get(str)).intValue();
    if ((i != 5) && (zzzA != null) && (!zzzA.zzbh()))
    {
      zzzA.zzq(null);
      return;
    }
    switch (i)
    {
    case 2: 
    default: 
      zzin.zzaJ("Unknown MRAID command called.");
      return;
    case 1: 
      zzzB.zzi(paramMap);
      return;
    case 4: 
      new zzfm(paramzzjp, paramMap).execute();
      return;
    case 3: 
      new zzfp(paramzzjp, paramMap).execute();
      return;
    case 5: 
      new zzfo(paramzzjp, paramMap).execute();
      return;
    }
    zzzB.zzp(true);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */