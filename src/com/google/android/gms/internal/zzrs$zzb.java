package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public class zzrs$zzb
{
  private zzag.zza zzbkI;
  private final Map zzbmi = new HashMap();
  
  public zzrs.zza zzHJ()
  {
    return new zzrs.zza(zzbmi, zzbkI, null);
  }
  
  public zzb zzb(String paramString, zzag.zza paramzza)
  {
    zzbmi.put(paramString, paramzza);
    return this;
  }
  
  public zzb zzq(zzag.zza paramzza)
  {
    zzbkI = paramzza;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrs.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */