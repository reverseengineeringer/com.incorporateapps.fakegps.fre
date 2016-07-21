package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.common.stats.zzb;
import com.google.android.gms.common.zzc;
import com.google.android.gms.measurement.AppMeasurementService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzac
  extends zzz
{
  private final zzac.zza zzaYN;
  private zzm zzaYO;
  private Boolean zzaYP;
  private final zzf zzaYQ;
  private final zzaf zzaYR;
  private final List zzaYS = new ArrayList();
  private final zzf zzaYT;
  
  protected zzac(zzw paramzzw)
  {
    super(paramzzw);
    zzaYR = new zzaf(paramzzw.zzjl());
    zzaYN = new zzac.zza(this);
    zzaYQ = new zzac.1(this, paramzzw);
    zzaYT = new zzac.2(this, paramzzw);
  }
  
  private void onServiceDisconnected(ComponentName paramComponentName)
  {
    zzjk();
    if (zzaYO != null)
    {
      zzaYO = null;
      zzAo().zzCK().zzj("Disconnected from device MeasurementService", paramComponentName);
      zzDr();
    }
  }
  
  private boolean zzDp()
  {
    List localList = getContext().getPackageManager().queryIntentServices(new Intent(getContext(), AppMeasurementService.class), 65536);
    return (localList != null) && (localList.size() > 0);
  }
  
  private boolean zzDq()
  {
    zzjk();
    zzjv();
    if (zzCp().zzkr()) {
      return true;
    }
    zzAo().zzCK().zzfg("Checking service availability");
    switch (zzc.zzoK().isGooglePlayServicesAvailable(getContext()))
    {
    default: 
      return false;
    case 0: 
      zzAo().zzCK().zzfg("Service available");
      return true;
    case 1: 
      zzAo().zzCK().zzfg("Service missing");
      return false;
    case 18: 
      zzAo().zzCK().zzfg("Service updating");
      return true;
    case 2: 
      zzAo().zzCK().zzfg("Service version update required");
      return false;
    case 3: 
      zzAo().zzCK().zzfg("Service disabled");
      return false;
    }
    zzAo().zzCK().zzfg("Service invalid");
    return false;
  }
  
  private void zzDr()
  {
    zzjk();
    zzjX();
  }
  
  private void zzDs()
  {
    zzjk();
    zzAo().zzCK().zzj("Processing queued up service tasks", Integer.valueOf(zzaYS.size()));
    Iterator localIterator = zzaYS.iterator();
    while (localIterator.hasNext())
    {
      Runnable localRunnable = (Runnable)localIterator.next();
      zzCn().zzg(localRunnable);
    }
    zzaYS.clear();
    zzaYT.cancel();
  }
  
  private void zza(zzm paramzzm)
  {
    zzjk();
    com.google.android.gms.common.internal.zzx.zzz(paramzzm);
    zzaYO = paramzzm;
    zzjI();
    zzDs();
  }
  
  private void zzi(Runnable paramRunnable)
  {
    zzjk();
    if (isConnected())
    {
      paramRunnable.run();
      return;
    }
    if (zzaYS.size() >= zzCp().zzBS())
    {
      zzAo().zzCE().zzfg("Discarding data. Max runnable queue size reached");
      return;
    }
    zzaYS.add(paramRunnable);
    if (!zzaTV.zzCZ()) {
      zzaYT.zzt(60000L);
    }
    zzjX();
  }
  
  private void zzjI()
  {
    zzjk();
    zzaYR.start();
    if (!zzaTV.zzCZ()) {
      zzaYQ.zzt(zzCp().zzkM());
    }
  }
  
  private void zzjJ()
  {
    zzjk();
    if (!isConnected()) {
      return;
    }
    zzAo().zzCK().zzfg("Inactivity, disconnecting from AppMeasurementService");
    disconnect();
  }
  
  private void zzjX()
  {
    zzjk();
    zzjv();
    if (isConnected()) {
      return;
    }
    if (zzaYP == null)
    {
      zzaYP = zzCo().zzCP();
      if (zzaYP == null)
      {
        zzAo().zzCK().zzfg("State of service unknown");
        zzaYP = Boolean.valueOf(zzDq());
        zzCo().zzar(zzaYP.booleanValue());
      }
    }
    if (zzaYP.booleanValue())
    {
      zzAo().zzCK().zzfg("Using measurement service");
      zzaYN.zzDt();
      return;
    }
    if ((zzDp()) && (!zzaTV.zzCZ()))
    {
      zzAo().zzCK().zzfg("Using local app measurement service");
      Intent localIntent = new Intent("com.google.android.gms.measurement.START");
      localIntent.setComponent(new ComponentName(getContext(), AppMeasurementService.class));
      zzaYN.zzz(localIntent);
      return;
    }
    if (zzCp().zzks())
    {
      zzAo().zzCK().zzfg("Using direct local measurement implementation");
      zza(new zzx(zzaTV, true));
      return;
    }
    zzAo().zzCE().zzfg("Not in main process. Unable to use local measurement implementation. Please register the AppMeasurementService service in the app manifest");
  }
  
  public void disconnect()
  {
    zzjk();
    zzjv();
    try
    {
      zzb.zzrP().zza(getContext(), zzaYN);
      zzaYO = null;
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  public boolean isConnected()
  {
    zzjk();
    zzjv();
    return zzaYO != null;
  }
  
  protected void zzDl()
  {
    zzjk();
    zzjv();
    zzi(new zzac.6(this));
  }
  
  protected void zzDo()
  {
    zzjk();
    zzjv();
    zzi(new zzac.3(this));
  }
  
  protected void zza(UserAttributeParcel paramUserAttributeParcel)
  {
    zzjk();
    zzjv();
    zzi(new zzac.5(this, paramUserAttributeParcel));
  }
  
  protected void zzb(EventParcel paramEventParcel, String paramString)
  {
    com.google.android.gms.common.internal.zzx.zzz(paramEventParcel);
    zzjk();
    zzjv();
    zzi(new zzac.4(this, paramString, paramEventParcel));
  }
  
  protected void zziJ() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */