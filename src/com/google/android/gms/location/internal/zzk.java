package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzc;
import com.google.android.gms.location.zzd;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class zzk
{
  private final Context mContext;
  private ContentProviderClient zzaOG = null;
  private boolean zzaOH = false;
  private Map zzaOI = new HashMap();
  private final zzp zzaOt;
  private Map zzaxd = new HashMap();
  
  public zzk(Context paramContext, zzp paramzzp)
  {
    mContext = paramContext;
    zzaOt = paramzzp;
  }
  
  private zzk.zza zza(LocationCallback paramLocationCallback, Looper paramLooper)
  {
    synchronized (zzaOI)
    {
      zzk.zza localzza2 = (zzk.zza)zzaOI.get(paramLocationCallback);
      zzk.zza localzza1 = localzza2;
      if (localzza2 == null) {
        localzza1 = new zzk.zza(paramLocationCallback, paramLooper);
      }
      zzaOI.put(paramLocationCallback, localzza1);
      return localzza1;
    }
  }
  
  private zzk.zzc zza(LocationListener paramLocationListener, Looper paramLooper)
  {
    synchronized (zzaxd)
    {
      zzk.zzc localzzc2 = (zzk.zzc)zzaxd.get(paramLocationListener);
      zzk.zzc localzzc1 = localzzc2;
      if (localzzc2 == null) {
        localzzc1 = new zzk.zzc(paramLocationListener, paramLooper);
      }
      zzaxd.put(paramLocationListener, localzzc1);
      return localzzc1;
    }
  }
  
  public Location getLastLocation()
  {
    zzaOt.zzqI();
    try
    {
      Location localLocation = ((zzi)zzaOt.zzqJ()).zzei(mContext.getPackageName());
      return localLocation;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  public void removeAllListeners()
  {
    Object localObject3;
    try
    {
      synchronized (zzaxd)
      {
        Iterator localIterator1 = zzaxd.values().iterator();
        while (localIterator1.hasNext())
        {
          localObject3 = (zzk.zzc)localIterator1.next();
          if (localObject3 != null) {
            ((zzi)zzaOt.zzqJ()).zza(LocationRequestUpdateData.zza((zzd)localObject3, null));
          }
        }
      }
      zzaxd.clear();
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
    synchronized (zzaOI)
    {
      Iterator localIterator2 = zzaOI.values().iterator();
      while (localIterator2.hasNext())
      {
        localObject3 = (zzk.zza)localIterator2.next();
        if (localObject3 != null) {
          ((zzi)zzaOt.zzqJ()).zza(LocationRequestUpdateData.zza((zzc)localObject3, null));
        }
      }
    }
    zzaOI.clear();
  }
  
  public void zza(PendingIntent paramPendingIntent, zzg paramzzg)
  {
    zzaOt.zzqI();
    ((zzi)zzaOt.zzqJ()).zza(LocationRequestUpdateData.zzb(paramPendingIntent, paramzzg));
  }
  
  public void zza(LocationCallback paramLocationCallback, zzg paramzzg)
  {
    zzaOt.zzqI();
    zzx.zzb(paramLocationCallback, "Invalid null callback");
    synchronized (zzaOI)
    {
      paramLocationCallback = (zzk.zza)zzaOI.remove(paramLocationCallback);
      if (paramLocationCallback != null)
      {
        paramLocationCallback.release();
        ((zzi)zzaOt.zzqJ()).zza(LocationRequestUpdateData.zza(paramLocationCallback, paramzzg));
      }
      return;
    }
  }
  
  public void zza(LocationListener paramLocationListener, zzg paramzzg)
  {
    zzaOt.zzqI();
    zzx.zzb(paramLocationListener, "Invalid null listener");
    synchronized (zzaxd)
    {
      paramLocationListener = (zzk.zzc)zzaxd.remove(paramLocationListener);
      if ((zzaOG != null) && (zzaxd.isEmpty()))
      {
        zzaOG.release();
        zzaOG = null;
      }
      if (paramLocationListener != null)
      {
        paramLocationListener.release();
        ((zzi)zzaOt.zzqJ()).zza(LocationRequestUpdateData.zza(paramLocationListener, paramzzg));
      }
      return;
    }
  }
  
  public void zza(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent, zzg paramzzg)
  {
    zzaOt.zzqI();
    ((zzi)zzaOt.zzqJ()).zza(LocationRequestUpdateData.zza(LocationRequestInternal.zzb(paramLocationRequest), paramPendingIntent, paramzzg));
  }
  
  public void zza(LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper, zzg paramzzg)
  {
    zzaOt.zzqI();
    paramLocationListener = zza(paramLocationListener, paramLooper);
    ((zzi)zzaOt.zzqJ()).zza(LocationRequestUpdateData.zza(LocationRequestInternal.zzb(paramLocationRequest), paramLocationListener, paramzzg));
  }
  
  public void zza(LocationRequestInternal paramLocationRequestInternal, LocationCallback paramLocationCallback, Looper paramLooper, zzg paramzzg)
  {
    zzaOt.zzqI();
    paramLocationCallback = zza(paramLocationCallback, paramLooper);
    ((zzi)zzaOt.zzqJ()).zza(LocationRequestUpdateData.zza(paramLocationRequestInternal, paramLocationCallback, paramzzg));
  }
  
  public void zza(zzg paramzzg)
  {
    zzaOt.zzqI();
    ((zzi)zzaOt.zzqJ()).zza(paramzzg);
  }
  
  public void zzam(boolean paramBoolean)
  {
    zzaOt.zzqI();
    ((zzi)zzaOt.zzqJ()).zzam(paramBoolean);
    zzaOH = paramBoolean;
  }
  
  public void zzc(Location paramLocation)
  {
    zzaOt.zzqI();
    ((zzi)zzaOt.zzqJ()).zzc(paramLocation);
  }
  
  public LocationAvailability zzyO()
  {
    zzaOt.zzqI();
    try
    {
      LocationAvailability localLocationAvailability = ((zzi)zzaOt.zzqJ()).zzej(mContext.getPackageName());
      return localLocationAvailability;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  public void zzyP()
  {
    if (zzaOH) {}
    try
    {
      zzam(false);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */