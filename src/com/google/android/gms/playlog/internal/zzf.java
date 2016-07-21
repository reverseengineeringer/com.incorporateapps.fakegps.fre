package com.google.android.gms.playlog.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzsu;
import java.util.ArrayList;
import java.util.Iterator;

public class zzf
  extends zzj
{
  private final String zzTJ;
  private final zzd zzbdT;
  private final zzb zzbdU;
  private boolean zzbdV;
  private final Object zzpV;
  
  public zzf(Context paramContext, Looper paramLooper, zzd paramzzd, com.google.android.gms.common.internal.zzf paramzzf)
  {
    super(paramContext, paramLooper, 24, paramzzf, paramzzd, paramzzd);
    zzTJ = paramContext.getPackageName();
    zzbdT = ((zzd)zzx.zzz(paramzzd));
    zzbdT.zza(this);
    zzbdU = new zzb();
    zzpV = new Object();
    zzbdV = true;
  }
  
  private void zzEW()
  {
    boolean bool;
    if (!zzbdV)
    {
      bool = true;
      com.google.android.gms.common.internal.zzb.zzab(bool);
      if (zzbdU.isEmpty()) {}
    }
    ArrayList localArrayList;
    label122:
    PlayLoggerContext localPlayLoggerContext;
    for (;;)
    {
      zzb.zza localzza;
      try
      {
        localArrayList = new ArrayList();
        Iterator localIterator = zzbdU.zzEU().iterator();
        Object localObject = null;
        if (!localIterator.hasNext()) {
          break label195;
        }
        localzza = (zzb.zza)localIterator.next();
        if (zzbdI == null) {
          break label122;
        }
        ((zza)zzqJ()).zza(zzTJ, zzbdG, zzsu.toByteArray(zzbdI));
        continue;
        return;
      }
      catch (RemoteException localRemoteException)
      {
        Log.e("PlayLoggerImpl", "Couldn't send cached log events to AndroidLog service.  Retaining in memory cache.");
      }
      bool = false;
      break;
      if (zzbdG.equals(localRemoteException))
      {
        localArrayList.add(zzbdH);
      }
      else
      {
        if (!localArrayList.isEmpty())
        {
          ((zza)zzqJ()).zza(zzTJ, localRemoteException, localArrayList);
          localArrayList.clear();
        }
        localPlayLoggerContext = zzbdG;
        localArrayList.add(zzbdH);
      }
    }
    label195:
    if (!localArrayList.isEmpty()) {
      ((zza)zzqJ()).zza(zzTJ, localPlayLoggerContext, localArrayList);
    }
    zzbdU.clear();
  }
  
  private void zzc(PlayLoggerContext paramPlayLoggerContext, LogEvent paramLogEvent)
  {
    zzbdU.zza(paramPlayLoggerContext, paramLogEvent);
  }
  
  private void zzd(PlayLoggerContext paramPlayLoggerContext, LogEvent paramLogEvent)
  {
    try
    {
      zzEW();
      ((zza)zzqJ()).zza(zzTJ, paramPlayLoggerContext, paramLogEvent);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("PlayLoggerImpl", "Couldn't send log event.  Will try caching.");
      zzc(paramPlayLoggerContext, paramLogEvent);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      Log.e("PlayLoggerImpl", "Service was disconnected.  Will try caching.");
      zzc(paramPlayLoggerContext, paramLogEvent);
    }
  }
  
  public void start()
  {
    synchronized (zzpV)
    {
      if ((isConnecting()) || (isConnected())) {
        return;
      }
      zzbdT.zzat(true);
      zzqG();
      return;
    }
  }
  
  public void stop()
  {
    synchronized (zzpV)
    {
      zzbdT.zzat(false);
      disconnect();
      return;
    }
  }
  
  void zzau(boolean paramBoolean)
  {
    synchronized (zzpV)
    {
      boolean bool = zzbdV;
      zzbdV = paramBoolean;
      if ((bool) && (!zzbdV)) {
        zzEW();
      }
      return;
    }
  }
  
  public void zzb(PlayLoggerContext paramPlayLoggerContext, LogEvent paramLogEvent)
  {
    synchronized (zzpV)
    {
      if (zzbdV)
      {
        zzc(paramPlayLoggerContext, paramLogEvent);
        return;
      }
      zzd(paramPlayLoggerContext, paramLogEvent);
    }
  }
  
  protected zza zzdO(IBinder paramIBinder)
  {
    return zza.zza.zzdN(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.playlog.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.playlog.internal.IPlayLogService";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.playlog.internal.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */