package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

public class zzrs$zza
{
  private final zzag.zza zzbkI;
  private final Map zzbmi;
  
  private zzrs$zza(Map paramMap, zzag.zza paramzza)
  {
    zzbmi = paramMap;
    zzbkI = paramzza;
  }
  
  public static zzrs.zzb zzHH()
  {
    return new zzrs.zzb(null);
  }
  
  public String toString()
  {
    return "Properties: " + zzHI() + " pushAfterEvaluate: " + zzbkI;
  }
  
  public Map zzHI()
  {
    return Collections.unmodifiableMap(zzbmi);
  }
  
  public zzag.zza zzHh()
  {
    return zzbkI;
  }
  
  public void zza(String paramString, zzag.zza paramzza)
  {
    zzbmi.put(paramString, paramzza);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrs.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */