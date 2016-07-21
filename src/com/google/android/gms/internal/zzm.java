package com.google.android.gms.internal;

public class zzm
{
  public final Object result;
  public final zzb.zza zzag;
  public final zzr zzah;
  public boolean zzai = false;
  
  private zzm(zzr paramzzr)
  {
    result = null;
    zzag = null;
    zzah = paramzzr;
  }
  
  private zzm(Object paramObject, zzb.zza paramzza)
  {
    result = paramObject;
    zzag = paramzza;
    zzah = null;
  }
  
  public static zzm zza(Object paramObject, zzb.zza paramzza)
  {
    return new zzm(paramObject, paramzza);
  }
  
  public static zzm zzd(zzr paramzzr)
  {
    return new zzm(paramzzr);
  }
  
  public boolean isSuccess()
  {
    return zzah == null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */