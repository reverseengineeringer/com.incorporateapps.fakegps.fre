package com.google.android.gms.measurement;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzc
{
  private final zzf zzaUi;
  private boolean zzaUj;
  private long zzaUk;
  private long zzaUl;
  private long zzaUm;
  private long zzaUn;
  private long zzaUo;
  private boolean zzaUp;
  private final Map zzaUq;
  private final List zzaUr;
  private final zzmq zzqW;
  
  zzc(zzc paramzzc)
  {
    zzaUi = zzaUi;
    zzqW = zzqW;
    zzaUk = zzaUk;
    zzaUl = zzaUl;
    zzaUm = zzaUm;
    zzaUn = zzaUn;
    zzaUo = zzaUo;
    zzaUr = new ArrayList(zzaUr);
    zzaUq = new HashMap(zzaUq.size());
    paramzzc = zzaUq.entrySet().iterator();
    while (paramzzc.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramzzc.next();
      zze localzze = zzg((Class)localEntry.getKey());
      ((zze)localEntry.getValue()).zza(localzze);
      zzaUq.put(localEntry.getKey(), localzze);
    }
  }
  
  zzc(zzf paramzzf, zzmq paramzzmq)
  {
    zzx.zzz(paramzzf);
    zzx.zzz(paramzzmq);
    zzaUi = paramzzf;
    zzqW = paramzzmq;
    zzaUn = 1800000L;
    zzaUo = 3024000000L;
    zzaUq = new HashMap();
    zzaUr = new ArrayList();
  }
  
  private static zze zzg(Class paramClass)
  {
    try
    {
      paramClass = (zze)paramClass.newInstance();
      return paramClass;
    }
    catch (InstantiationException paramClass)
    {
      throw new IllegalArgumentException("dataType doesn't have default constructor", paramClass);
    }
    catch (IllegalAccessException paramClass)
    {
      throw new IllegalArgumentException("dataType default constructor is not accessible", paramClass);
    }
  }
  
  final void zzAA()
  {
    zzaUm = zzqW.elapsedRealtime();
    if (zzaUl != 0L) {}
    for (zzaUk = zzaUl;; zzaUk = zzqW.currentTimeMillis())
    {
      zzaUj = true;
      return;
    }
  }
  
  final zzf zzAB()
  {
    return zzaUi;
  }
  
  final zzg zzAC()
  {
    return zzaUi.zzAC();
  }
  
  final boolean zzAD()
  {
    return zzaUp;
  }
  
  final void zzAE()
  {
    zzaUp = true;
  }
  
  public final zzc zzAu()
  {
    return new zzc(this);
  }
  
  public final Collection zzAv()
  {
    return zzaUq.values();
  }
  
  public final List zzAw()
  {
    return zzaUr;
  }
  
  public final long zzAx()
  {
    return zzaUk;
  }
  
  public final void zzAy()
  {
    zzAC().zze(this);
  }
  
  public final boolean zzAz()
  {
    return zzaUj;
  }
  
  public final void zzM(long paramLong)
  {
    zzaUl = paramLong;
  }
  
  public final void zzb(zze paramzze)
  {
    zzx.zzz(paramzze);
    Class localClass = paramzze.getClass();
    if (localClass.getSuperclass() != zze.class) {
      throw new IllegalArgumentException();
    }
    paramzze.zza(zzf(localClass));
  }
  
  public final zze zze(Class paramClass)
  {
    return (zze)zzaUq.get(paramClass);
  }
  
  public final zze zzf(Class paramClass)
  {
    zze localzze2 = (zze)zzaUq.get(paramClass);
    zze localzze1 = localzze2;
    if (localzze2 == null)
    {
      localzze1 = zzg(paramClass);
      zzaUq.put(paramClass, localzze1);
    }
    return localzze1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */