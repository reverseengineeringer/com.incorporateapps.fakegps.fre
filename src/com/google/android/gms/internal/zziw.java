package com.google.android.gms.internal;

import android.content.Context;
import java.util.Map;

public class zziw
{
  private static zzl zzMy;
  public static final zziw.zza zzMz = new zziw.1();
  private static final Object zzqy = new Object();
  
  public zziw(Context paramContext)
  {
    zzMy = zzS(paramContext);
  }
  
  private static zzl zzS(Context paramContext)
  {
    synchronized (zzqy)
    {
      if (zzMy == null) {
        zzMy = zzac.zza(paramContext.getApplicationContext());
      }
      paramContext = zzMy;
      return paramContext;
    }
  }
  
  public zzjg zza(String paramString, zziw.zza paramzza)
  {
    zziw.zzc localzzc = new zziw.zzc(this, null);
    zzMy.zze(new zziw.zzb(paramString, paramzza, localzzc));
    return localzzc;
  }
  
  public zzjg zzb(String paramString, Map paramMap)
  {
    zziw.zzc localzzc = new zziw.zzc(this, null);
    paramString = new zziw.3(this, paramString, localzzc, new zziw.2(this, paramString, localzzc), paramMap);
    zzMy.zze(paramString);
    return localzzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zziw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */