package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzrp;

public final class AnalyticsService
  extends Service
{
  private static Boolean zzOO;
  private final Handler mHandler = new Handler();
  
  public static boolean zzZ(Context paramContext)
  {
    zzx.zzz(paramContext);
    if (zzOO != null) {
      return zzOO.booleanValue();
    }
    boolean bool = zzam.zza(paramContext, AnalyticsService.class);
    zzOO = Boolean.valueOf(bool);
    return bool;
  }
  
  private void zziz()
  {
    try
    {
      synchronized (AnalyticsReceiver.zzqy)
      {
        zzrp localzzrp = AnalyticsReceiver.zzOM;
        if ((localzzrp != null) && (localzzrp.isHeld())) {
          localzzrp.release();
        }
        return;
      }
      return;
    }
    catch (SecurityException localSecurityException) {}
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public final void onCreate()
  {
    super.onCreate();
    zzf localzzf = zzf.zzaa(this);
    zzaf localzzaf = localzzf.zzjm();
    if (localzzf.zzjn().zzkr())
    {
      localzzaf.zzbd("Device AnalyticsService is starting up");
      return;
    }
    localzzaf.zzbd("Local AnalyticsService is starting up");
  }
  
  public final void onDestroy()
  {
    zzf localzzf = zzf.zzaa(this);
    zzaf localzzaf = localzzf.zzjm();
    if (localzzf.zzjn().zzkr()) {
      localzzaf.zzbd("Device AnalyticsService is shutting down");
    }
    for (;;)
    {
      super.onDestroy();
      return;
      localzzaf.zzbd("Local AnalyticsService is shutting down");
    }
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    zziz();
    zzf localzzf = zzf.zzaa(this);
    zzaf localzzaf = localzzf.zzjm();
    paramIntent = paramIntent.getAction();
    if (localzzf.zzjn().zzkr()) {
      localzzaf.zza("Device AnalyticsService called. startId, action", Integer.valueOf(paramInt2), paramIntent);
    }
    for (;;)
    {
      if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(paramIntent)) {
        localzzf.zziH().zza(new AnalyticsService.1(this, paramInt2, localzzf, localzzaf));
      }
      return 2;
      localzzaf.zza("Local AnalyticsService called. startId, action", Integer.valueOf(paramInt2), paramIntent);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.AnalyticsService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */