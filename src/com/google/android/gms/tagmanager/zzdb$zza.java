package com.google.android.gms.tagmanager;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class zzdb$zza
  implements Runnable
{
  private final long zzCv;
  private final long zzaNY;
  private final String zzblw;
  private final String zzblx;
  private final long zzbly;
  private long zzblz;
  
  zzdb$zza(zzdb paramzzdb, String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    zzblw = paramString1;
    zzblx = paramString2;
    zzaNY = paramLong1;
    zzbly = paramLong2;
    zzCv = System.currentTimeMillis();
  }
  
  public final void run()
  {
    if ((zzbly > 0L) && (zzblz >= zzbly))
    {
      if (!"0".equals(zzblx)) {
        zzdb.zza(zzblA).remove(zzblx);
      }
      return;
    }
    zzblz += 1L;
    if (zzcH())
    {
      long l = System.currentTimeMillis();
      zzdb.zzb(zzblA).push(DataLayer.mapOf(new Object[] { "event", zzblw, "gtm.timerInterval", String.valueOf(zzaNY), "gtm.timerLimit", String.valueOf(zzbly), "gtm.timerStartTime", String.valueOf(zzCv), "gtm.timerCurrentTime", String.valueOf(l), "gtm.timerElapsedTime", String.valueOf(l - zzCv), "gtm.timerEventNumber", String.valueOf(zzblz), "gtm.triggers", zzblx }));
    }
    zzdb.zzc(zzblA).postDelayed(this, zzaNY);
  }
  
  protected final boolean zzcH()
  {
    if (zzdb.zzd(zzblA)) {
      return zzdb.zze(zzblA);
    }
    Object localObject = (ActivityManager)zzdb.zzf(zzblA).getSystemService("activity");
    KeyguardManager localKeyguardManager = (KeyguardManager)zzdb.zzf(zzblA).getSystemService("keyguard");
    PowerManager localPowerManager = (PowerManager)zzdb.zzf(zzblA).getSystemService("power");
    localObject = ((ActivityManager)localObject).getRunningAppProcesses().iterator();
    while (((Iterator)localObject).hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      if ((Process.myPid() == pid) && (importance == 100) && (!localKeyguardManager.inKeyguardRestrictedInputMode()) && (localPowerManager.isScreenOn())) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzdb.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */