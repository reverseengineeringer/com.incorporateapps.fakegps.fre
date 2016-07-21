package com.google.android.gms.fitness.data;

import com.google.android.gms.fitness.request.OnDataPointListener;
import java.util.HashMap;
import java.util.Map;

public class zzl$zza
{
  private static final zza zzaxc = new zza();
  private final Map zzaxd = new HashMap();
  
  public static zza zzuu()
  {
    return zzaxc;
  }
  
  public zzl zza(OnDataPointListener paramOnDataPointListener)
  {
    synchronized (zzaxd)
    {
      zzl localzzl2 = (zzl)zzaxd.get(paramOnDataPointListener);
      zzl localzzl1 = localzzl2;
      if (localzzl2 == null)
      {
        localzzl1 = new zzl(paramOnDataPointListener, null);
        zzaxd.put(paramOnDataPointListener, localzzl1);
      }
      return localzzl1;
    }
  }
  
  public zzl zzb(OnDataPointListener paramOnDataPointListener)
  {
    synchronized (zzaxd)
    {
      paramOnDataPointListener = (zzl)zzaxd.get(paramOnDataPointListener);
      return paramOnDataPointListener;
    }
  }
  
  public zzl zzc(OnDataPointListener paramOnDataPointListener)
  {
    synchronized (zzaxd)
    {
      zzl localzzl = (zzl)zzaxd.remove(paramOnDataPointListener);
      if (localzzl != null) {
        return localzzl;
      }
      paramOnDataPointListener = new zzl(paramOnDataPointListener, null);
      return paramOnDataPointListener;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.zzl.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */