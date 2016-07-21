package com.google.android.gms.measurement;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzp.zza;
import com.google.android.gms.measurement.internal.zzv;
import com.google.android.gms.measurement.internal.zzw;

public final class AppMeasurementService
  extends Service
{
  private static Boolean zzOO;
  private final Handler mHandler = new Handler();
  
  private zzp zzAo()
  {
    return zzw.zzaT(this).zzAo();
  }
  
  public static boolean zzZ(Context paramContext)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramContext);
    if (zzOO != null) {
      return zzOO.booleanValue();
    }
    boolean bool = zzaj.zza(paramContext, AppMeasurementService.class);
    zzOO = Boolean.valueOf(bool);
    return bool;
  }
  
  private void zziz()
  {
    try
    {
      synchronized (AppMeasurementReceiver.zzqy)
      {
        zzrp localzzrp = AppMeasurementReceiver.zzOM;
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
    if (paramIntent == null)
    {
      zzAo().zzCE().zzfg("onBind called with null intent");
      return null;
    }
    paramIntent = paramIntent.getAction();
    if ("com.google.android.gms.measurement.START".equals(paramIntent)) {
      return new com.google.android.gms.measurement.internal.zzx(zzw.zzaT(this));
    }
    zzAo().zzCF().zzj("onBind received unknown action", paramIntent);
    return null;
  }
  
  public final void onCreate()
  {
    super.onCreate();
    zzw localzzw = zzw.zzaT(this);
    zzp localzzp = localzzw.zzAo();
    if (localzzw.zzCp().zzkr())
    {
      localzzp.zzCK().zzfg("Device AppMeasurementService is starting up");
      return;
    }
    localzzp.zzCK().zzfg("Local AppMeasurementService is starting up");
  }
  
  public final void onDestroy()
  {
    zzw localzzw = zzw.zzaT(this);
    zzp localzzp = localzzw.zzAo();
    if (localzzw.zzCp().zzkr()) {
      localzzp.zzCK().zzfg("Device AppMeasurementService is shutting down");
    }
    for (;;)
    {
      super.onDestroy();
      return;
      localzzp.zzCK().zzfg("Local AppMeasurementService is shutting down");
    }
  }
  
  public final void onRebind(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      zzAo().zzCE().zzfg("onRebind called with null intent");
      return;
    }
    paramIntent = paramIntent.getAction();
    zzAo().zzCK().zzj("onRebind called. action", paramIntent);
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    zziz();
    zzw localzzw = zzw.zzaT(this);
    zzp localzzp = localzzw.zzAo();
    paramIntent = paramIntent.getAction();
    if (localzzw.zzCp().zzkr()) {
      localzzp.zzCK().zze("Device AppMeasurementService called. startId, action", Integer.valueOf(paramInt2), paramIntent);
    }
    for (;;)
    {
      if ("com.google.android.gms.measurement.UPLOAD".equals(paramIntent)) {
        localzzw.zzCn().zzg(new AppMeasurementService.1(this, localzzw, paramInt2, localzzp));
      }
      return 2;
      localzzp.zzCK().zze("Local AppMeasurementService called. startId, action", Integer.valueOf(paramInt2), paramIntent);
    }
  }
  
  public final boolean onUnbind(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      zzAo().zzCE().zzfg("onUnbind called with null intent");
      return true;
    }
    paramIntent = paramIntent.getAction();
    zzAo().zzCK().zzj("onUnbind called for intent. action", paramIntent);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.AppMeasurementService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */