package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import java.util.Collections;
import java.util.List;

public class zzi
  extends zzd
{
  private final zzi.zza zzQH;
  private zzac zzQI;
  private final zzt zzQJ;
  private zzaj zzQK;
  
  protected zzi(zzf paramzzf)
  {
    super(paramzzf);
    zzQK = new zzaj(paramzzf.zzjl());
    zzQH = new zzi.zza(this);
    zzQJ = new zzi.1(this, paramzzf);
  }
  
  private void onDisconnect()
  {
    zziH().zzjf();
  }
  
  private void onServiceDisconnected(ComponentName paramComponentName)
  {
    zzjk();
    if (zzQI != null)
    {
      zzQI = null;
      zza("Disconnected from device AnalyticsService", paramComponentName);
      zziH().zzjf();
    }
  }
  
  private void zza(zzac paramzzac)
  {
    zzjk();
    zzQI = paramzzac;
    zzjI();
    zziH().onServiceConnected();
  }
  
  private void zzjI()
  {
    zzQK.start();
    zzQJ.zzt(zzjn().zzkM());
  }
  
  private void zzjJ()
  {
    zzjk();
    if (!isConnected()) {
      return;
    }
    zzbd("Inactivity, disconnecting from device AnalyticsService");
    disconnect();
  }
  
  public boolean connect()
  {
    zzjk();
    zzjv();
    if (zzQI != null) {
      return true;
    }
    zzac localzzac = zzQH.zzjK();
    if (localzzac != null)
    {
      zzQI = localzzac;
      zzjI();
      return true;
    }
    return false;
  }
  
  public void disconnect()
  {
    zzjk();
    zzjv();
    try
    {
      com.google.android.gms.common.stats.zzb.zzrP().zza(getContext(), zzQH);
      if (zzQI != null)
      {
        zzQI = null;
        zziH().zzjf();
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
  }
  
  public boolean isConnected()
  {
    zzjk();
    zzjv();
    return zzQI != null;
  }
  
  public boolean zzb(zzab paramzzab)
  {
    zzx.zzz(paramzzab);
    zzjk();
    zzjv();
    zzac localzzac = zzQI;
    if (localzzac == null) {
      return false;
    }
    if (paramzzab.zzlt()) {}
    for (String str = zzjn().zzkF();; str = zzjn().zzkG())
    {
      List localList = Collections.emptyList();
      try
      {
        localzzac.zza(paramzzab.zzn(), paramzzab.zzlr(), str, localList);
        zzjI();
        return true;
      }
      catch (RemoteException paramzzab)
      {
        zzbd("Failed to send hits to AnalyticsService");
      }
    }
    return false;
  }
  
  protected void zziJ() {}
  
  public boolean zzjH()
  {
    zzjk();
    zzjv();
    zzac localzzac = zzQI;
    if (localzzac == null) {
      return false;
    }
    try
    {
      localzzac.zzjc();
      zzjI();
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      zzbd("Failed to clear hits from AnalyticsService");
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */