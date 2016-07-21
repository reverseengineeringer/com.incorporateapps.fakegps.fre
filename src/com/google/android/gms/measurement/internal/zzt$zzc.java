package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import java.security.SecureRandom;

public final class zzt$zzc
{
  private final long zzTl;
  final String zzaXC;
  private final String zzaXD;
  private final String zzaXE;
  
  private zzt$zzc(zzt paramzzt, String paramString, long paramLong)
  {
    zzx.zzcM(paramString);
    if (paramLong > 0L) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzac(bool);
      zzaXC = (paramString + ":start");
      zzaXD = (paramString + ":count");
      zzaXE = (paramString + ":value");
      zzTl = paramLong;
      return;
    }
  }
  
  private void zzlL()
  {
    zzaXA.zzjk();
    long l = zzaXA.zzjl().currentTimeMillis();
    SharedPreferences.Editor localEditor = zzt.zza(zzaXA).edit();
    localEditor.remove(zzaXD);
    localEditor.remove(zzaXE);
    localEditor.putLong(zzaXC, l);
    localEditor.apply();
  }
  
  private long zzlM()
  {
    zzaXA.zzjk();
    long l = zzlO();
    if (l == 0L)
    {
      zzlL();
      return 0L;
    }
    return Math.abs(l - zzaXA.zzjl().currentTimeMillis());
  }
  
  private long zzlO()
  {
    return zzt.zzc(zzaXA).getLong(zzaXC, 0L);
  }
  
  public final void zzbq(String paramString)
  {
    zzf(paramString, 1L);
  }
  
  public final void zzf(String paramString, long paramLong)
  {
    zzaXA.zzjk();
    if (zzlO() == 0L) {
      zzlL();
    }
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    long l = zzt.zza(zzaXA).getLong(zzaXD, 0L);
    if (l <= 0L)
    {
      paramString = zzt.zza(zzaXA).edit();
      paramString.putString(zzaXE, str);
      paramString.putLong(zzaXD, paramLong);
      paramString.apply();
      return;
    }
    if ((zzt.zzb(zzaXA).nextLong() & 0x7FFFFFFFFFFFFFFF) < Long.MAX_VALUE / (l + paramLong) * paramLong) {}
    for (int i = 1;; i = 0)
    {
      paramString = zzt.zza(zzaXA).edit();
      if (i != 0) {
        paramString.putString(zzaXE, str);
      }
      paramString.putLong(zzaXD, l + paramLong);
      paramString.apply();
      return;
    }
  }
  
  public final Pair zzlN()
  {
    zzaXA.zzjk();
    long l = zzlM();
    if (l < zzTl) {
      return null;
    }
    if (l > zzTl * 2L)
    {
      zzlL();
      return null;
    }
    String str = zzt.zzc(zzaXA).getString(zzaXE, null);
    l = zzt.zzc(zzaXA).getLong(zzaXD, 0L);
    zzlL();
    if ((str == null) || (l <= 0L)) {
      return zzt.zzaXh;
    }
    return new Pair(str, Long.valueOf(l));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzt.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */