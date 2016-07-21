package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class zznx
{
  private static final double zzazE = 1000.0D / TimeUnit.SECONDS.toNanos(1L);
  private static final double zzazF = 1000.0D / TimeUnit.SECONDS.toNanos(1L);
  private static final zznx zzazI = new zznx();
  private final Map zzazG;
  private final Map zzazH;
  
  private zznx()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(zzaxFname, new zznx.zza(-90.0D, 90.0D, null));
    localHashMap.put(zzaxGname, new zznx.zza(-180.0D, 180.0D, null));
    localHashMap.put(zzaxHname, new zznx.zza(0.0D, 10000.0D, null));
    localHashMap.put(zzaxEname, new zznx.zza(0.0D, 1000.0D, null));
    localHashMap.put(zzaxIname, new zznx.zza(-100000.0D, 100000.0D, null));
    localHashMap.put(zzaxPname, new zznx.zza(0.0D, 100.0D, null));
    localHashMap.put(zzaxxname, new zznx.zza(0.0D, 100.0D, null));
    localHashMap.put(zzaxAname, new zznx.zza(0.0D, 9.223372036854776E18D, null));
    localHashMap.put(zzaxMname, new zznx.zza(0.0D, 10.0D, null));
    localHashMap.put(zzaxNname, new zznx.zza(0.0D, 1000.0D, null));
    localHashMap.put(zzaxQname, new zznx.zza(0.0D, 200000.0D, null));
    zzazH = Collections.unmodifiableMap(localHashMap);
    localHashMap = new HashMap();
    localHashMap.put("com.google.step_count.delta", zzf(zzaxzname, new zznx.zza(0.0D, zzazE, null)));
    localHashMap.put("com.google.calories.consumed", zzf(zzaxTname, new zznx.zza(0.0D, zzazF, null)));
    localHashMap.put("com.google.calories.expended", zzf(zzaxTname, new zznx.zza(0.0D, zzazF, null)));
    zzazG = Collections.unmodifiableMap(localHashMap);
  }
  
  private static Map zzf(Object paramObject1, Object paramObject2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(paramObject1, paramObject2);
    return localHashMap;
  }
  
  public static zznx zzuG()
  {
    return zzazI;
  }
  
  public zznx.zza zzC(String paramString1, String paramString2)
  {
    paramString1 = (Map)zzazG.get(paramString1);
    if (paramString1 != null) {
      return (zznx.zza)paramString1.get(paramString2);
    }
    return null;
  }
  
  public zznx.zza zzdE(String paramString)
  {
    return (zznx.zza)zzazH.get(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zznx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */