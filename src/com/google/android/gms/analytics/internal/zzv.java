package com.google.android.gms.analytics.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;

public class zzv
  extends zzd
{
  private boolean zzRG;
  private boolean zzRH;
  private AlarmManager zzRI = (AlarmManager)getContext().getSystemService("alarm");
  
  protected zzv(zzf paramzzf)
  {
    super(paramzzf);
  }
  
  private PendingIntent zzld()
  {
    Intent localIntent = new Intent(getContext(), AnalyticsReceiver.class);
    localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
    return PendingIntent.getBroadcast(getContext(), 0, localIntent, 0);
  }
  
  public void cancel()
  {
    zzjv();
    zzRH = false;
    zzRI.cancel(zzld());
  }
  
  public boolean zzbw()
  {
    return zzRH;
  }
  
  protected void zziJ()
  {
    try
    {
      zzRI.cancel(zzld());
      if (zzjn().zzkA() > 0L)
      {
        ActivityInfo localActivityInfo = getContext().getPackageManager().getReceiverInfo(new ComponentName(getContext(), AnalyticsReceiver.class), 2);
        if ((localActivityInfo != null) && (enabled))
        {
          zzbd("Receiver registered. Using alarm for local dispatch.");
          zzRG = true;
        }
      }
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
  }
  
  public boolean zzlb()
  {
    return zzRG;
  }
  
  public void zzlc()
  {
    zzjv();
    zzx.zza(zzlb(), "Receiver not registered");
    long l1 = zzjn().zzkA();
    if (l1 > 0L)
    {
      cancel();
      long l2 = zzjl().elapsedRealtime();
      zzRH = true;
      zzRI.setInexactRepeating(2, l2 + l1, 0L, zzld());
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */