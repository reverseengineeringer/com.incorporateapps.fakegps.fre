package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlz;

public final class zzy$zza
{
  private final Object zzSA;
  private final zzlz zzSB;
  private Object zzSC;
  
  private zzy$zza(zzlz paramzzlz, Object paramObject)
  {
    zzx.zzz(paramzzlz);
    zzSB = paramzzlz;
    zzSA = paramObject;
  }
  
  static zza zza(String paramString, float paramFloat)
  {
    return zza(paramString, paramFloat, paramFloat);
  }
  
  static zza zza(String paramString, float paramFloat1, float paramFloat2)
  {
    return new zza(zzlz.zza(paramString, Float.valueOf(paramFloat2)), Float.valueOf(paramFloat1));
  }
  
  static zza zza(String paramString, int paramInt1, int paramInt2)
  {
    return new zza(zzlz.zza(paramString, Integer.valueOf(paramInt2)), Integer.valueOf(paramInt1));
  }
  
  static zza zza(String paramString, long paramLong1, long paramLong2)
  {
    return new zza(zzlz.zza(paramString, Long.valueOf(paramLong2)), Long.valueOf(paramLong1));
  }
  
  static zza zza(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new zza(zzlz.zzk(paramString, paramBoolean2), Boolean.valueOf(paramBoolean1));
  }
  
  static zza zzb(String paramString, long paramLong)
  {
    return zza(paramString, paramLong, paramLong);
  }
  
  static zza zzd(String paramString, int paramInt)
  {
    return zza(paramString, paramInt, paramInt);
  }
  
  static zza zze(String paramString1, String paramString2, String paramString3)
  {
    return new zza(zzlz.zzv(paramString1, paramString3), paramString2);
  }
  
  static zza zzg(String paramString, boolean paramBoolean)
  {
    return zza(paramString, paramBoolean, paramBoolean);
  }
  
  static zza zzl(String paramString1, String paramString2)
  {
    return zze(paramString1, paramString2, paramString2);
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
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzy.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */