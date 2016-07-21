package com.google.android.gms.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class zziw$zzb
  extends zzk
{
  private final zziw.zza zzMD;
  private final zzm.zzb zzaG;
  
  public zziw$zzb(String paramString, zziw.zza paramzza, zzm.zzb paramzzb)
  {
    super(0, paramString, new zziw.zzb.1(paramzzb, paramzza));
    zzMD = paramzza;
    zzaG = paramzzb;
  }
  
  protected zzm zza(zzi paramzzi)
  {
    return zzm.zza(new ByteArrayInputStream(data), zzx.zzb(paramzzi));
  }
  
  protected void zzj(InputStream paramInputStream)
  {
    zzaG.zzb(zzMD.zzh(paramInputStream));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zziw.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */