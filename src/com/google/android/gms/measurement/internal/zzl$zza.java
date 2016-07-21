package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlz;

public final class zzl$zza
{
  private final Object zzSA;
  private final zzlz zzSB;
  private Object zzSC;
  private final String zzvs;
  
  private zzl$zza(String paramString, zzlz paramzzlz, Object paramObject)
  {
    zzx.zzz(paramzzlz);
    zzSB = paramzzlz;
    zzSA = paramObject;
    zzvs = paramString;
  }
  
  static zza zzD(String paramString, int paramInt)
  {
    return zzo(paramString, paramInt, paramInt);
  }
  
  static zza zzN(String paramString1, String paramString2)
  {
    return zzl(paramString1, paramString2, paramString2);
  }
  
  static zza zzb(String paramString, long paramLong1, long paramLong2)
  {
    return new zza(paramString, zzlz.zza(paramString, Long.valueOf(paramLong2)), Long.valueOf(paramLong1));
  }
  
  static zza zzb(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new zza(paramString, zzlz.zzk(paramString, paramBoolean2), Boolean.valueOf(paramBoolean1));
  }
  
  static zza zze(String paramString, long paramLong)
  {
    return zzb(paramString, paramLong, paramLong);
  }
  
  static zza zzl(String paramString1, String paramString2, String paramString3)
  {
    return new zza(paramString1, zzlz.zzv(paramString1, paramString3), paramString2);
  }
  
  static zza zzm(String paramString, boolean paramBoolean)
  {
    return zzb(paramString, paramBoolean, paramBoolean);
  }
  
  static zza zzo(String paramString, int paramInt1, int paramInt2)
  {
    return new zza(paramString, zzlz.zza(paramString, Integer.valueOf(paramInt2)), Integer.valueOf(paramInt1));
  }
  
  public final Object get()
  {
    if (zzSC != null) {
      return zzSC;
    }
    if ((zzd.zzakE) && (zzlz.isInitialized())) {
      return zzSB.zzpX();
    }
    return zzSA;
  }
  
  public final Object get(Object paramObject)
  {
    Object localObject;
    if (zzSC != null) {
      localObject = zzSC;
    }
    do
    {
      return localObject;
      localObject = paramObject;
    } while (paramObject != null);
    if ((zzd.zzakE) && (zzlz.isInitialized())) {
      return zzSB.zzpX();
    }
    return zzSA;
  }
  
  public final String getKey()
  {
    return zzvs;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzl.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */