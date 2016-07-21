package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzr;

public abstract class zzbp
{
  private final int zzvr;
  private final String zzvs;
  private final Object zzvt;
  
  private zzbp(int paramInt, String paramString, Object paramObject)
  {
    zzvr = paramInt;
    zzvs = paramString;
    zzvt = paramObject;
    zzr.zzbK().zza(this);
  }
  
  public static zzbp zza(int paramInt, String paramString)
  {
    paramString = zza(paramInt, paramString, null);
    zzr.zzbK().zzb(paramString);
    return paramString;
  }
  
  public static zzbp zza(int paramInt1, String paramString, int paramInt2)
  {
    return new zzbp.2(paramInt1, paramString, Integer.valueOf(paramInt2));
  }
  
  public static zzbp zza(int paramInt, String paramString, long paramLong)
  {
    return new zzbp.3(paramInt, paramString, Long.valueOf(paramLong));
  }
  
  public static zzbp zza(int paramInt, String paramString, Boolean paramBoolean)
  {
    return new zzbp.1(paramInt, paramString, paramBoolean);
  }
  
  public static zzbp zza(int paramInt, String paramString1, String paramString2)
  {
    return new zzbp.4(paramInt, paramString1, paramString2);
  }
  
  public static zzbp zzb(int paramInt, String paramString)
  {
    paramString = zza(paramInt, paramString, null);
    zzr.zzbK().zzc(paramString);
    return paramString;
  }
  
  public Object get()
  {
    return zzr.zzbL().zzd(this);
  }
  
  public String getKey()
  {
    return zzvs;
  }
  
  protected abstract Object zza(SharedPreferences paramSharedPreferences);
  
  public Object zzdq()
  {
    return zzvt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */