package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.zzx;

public final class zzt$zzb
{
  private long zzaDV;
  private final long zzaXB;
  private boolean zzaXz;
  private final String zzvs;
  
  public zzt$zzb(zzt paramzzt, String paramString, long paramLong)
  {
    zzx.zzcM(paramString);
    zzvs = paramString;
    zzaXB = paramLong;
  }
  
  private void zzCR()
  {
    if (zzaXz) {
      return;
    }
    zzaXz = true;
    zzaDV = zzt.zza(zzaXA).getLong(zzvs, zzaXB);
  }
  
  public final long get()
  {
    zzCR();
    return zzaDV;
  }
  
  public final void set(long paramLong)
  {
    SharedPreferences.Editor localEditor = zzt.zza(zzaXA).edit();
    localEditor.putLong(zzvs, paramLong);
    localEditor.apply();
    zzaDV = paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzt.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */