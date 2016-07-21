package com.google.android.gms.fitness.request;

import java.util.HashMap;
import java.util.Map;

public class zza$zza
{
  private static final zza zzaAz = new zza();
  private final Map zzaAA = new HashMap();
  
  public static zza zzuJ()
  {
    return zzaAz;
  }
  
  public zza zza(BleScanCallback paramBleScanCallback)
  {
    synchronized (zzaAA)
    {
      zza localzza2 = (zza)zzaAA.get(paramBleScanCallback);
      zza localzza1 = localzza2;
      if (localzza2 == null)
      {
        localzza1 = new zza(paramBleScanCallback, null);
        zzaAA.put(paramBleScanCallback, localzza1);
      }
      return localzza1;
    }
  }
  
  public zza zzb(BleScanCallback paramBleScanCallback)
  {
    synchronized (zzaAA)
    {
      zza localzza = (zza)zzaAA.get(paramBleScanCallback);
      if (localzza != null) {
        return localzza;
      }
      paramBleScanCallback = new zza(paramBleScanCallback, null);
      return paramBleScanCallback;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */