package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.List;

public class zzl
  extends zzb
{
  private final zzk zzaOM = new zzk(paramContext, zzaOt);
  
  public zzl(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString)
  {
    this(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramString, zzf.zzat(paramContext));
  }
  
  public zzl(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString, zzf paramzzf)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramString, paramzzf);
  }
  
  public void disconnect()
  {
    synchronized (zzaOM)
    {
      boolean bool = isConnected();
      if (bool) {}
      try
      {
        zzaOM.removeAllListeners();
        zzaOM.zzyP();
        super.disconnect();
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", localException);
        }
      }
    }
  }
  
  public Location getLastLocation()
  {
    return zzaOM.getLastLocation();
  }
  
  public void zza(long paramLong, PendingIntent paramPendingIntent)
  {
    zzqI();
    zzx.zzz(paramPendingIntent);
    if (paramLong >= 0L) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "detectionIntervalMillis must be >= 0");
      ((zzi)zzqJ()).zza(paramLong, true, paramPendingIntent);
      return;
    }
  }
  
  public void zza(PendingIntent paramPendingIntent)
  {
    zzqI();
    zzx.zzz(paramPendingIntent);
    ((zzi)zzqJ()).zza(paramPendingIntent);
  }
  
  public void zza(PendingIntent paramPendingIntent, zza.zzb paramzzb)
  {
    zzqI();
    zzx.zzb(paramPendingIntent, "PendingIntent must be specified.");
    zzx.zzb(paramzzb, "ResultHolder not provided.");
    paramzzb = new zzl.zzb(paramzzb);
    ((zzi)zzqJ()).zza(paramPendingIntent, paramzzb, getContext().getPackageName());
  }
  
  public void zza(PendingIntent paramPendingIntent, zzg paramzzg)
  {
    zzaOM.zza(paramPendingIntent, paramzzg);
  }
  
  public void zza(GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent, zza.zzb paramzzb)
  {
    zzqI();
    zzx.zzb(paramGeofencingRequest, "geofencingRequest can't be null.");
    zzx.zzb(paramPendingIntent, "PendingIntent must be specified.");
    zzx.zzb(paramzzb, "ResultHolder not provided.");
    paramzzb = new zzl.zza(paramzzb);
    ((zzi)zzqJ()).zza(paramGeofencingRequest, paramPendingIntent, paramzzb);
  }
  
  public void zza(LocationCallback paramLocationCallback, zzg paramzzg)
  {
    zzaOM.zza(paramLocationCallback, paramzzg);
  }
  
  public void zza(LocationListener paramLocationListener, zzg paramzzg)
  {
    zzaOM.zza(paramLocationListener, paramzzg);
  }
  
  public void zza(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent, zzg paramzzg)
  {
    zzaOM.zza(paramLocationRequest, paramPendingIntent, paramzzg);
  }
  
  public void zza(LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper, zzg paramzzg)
  {
    synchronized (zzaOM)
    {
      zzaOM.zza(paramLocationRequest, paramLocationListener, paramLooper, paramzzg);
      return;
    }
  }
  
  public void zza(LocationSettingsRequest paramLocationSettingsRequest, zza.zzb paramzzb, String paramString)
  {
    boolean bool2 = true;
    zzqI();
    if (paramLocationSettingsRequest != null)
    {
      bool1 = true;
      zzx.zzb(bool1, "locationSettingsRequest can't be null nor empty.");
      if (paramzzb == null) {
        break label67;
      }
    }
    label67:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zzb(bool1, "listener can't be null.");
      paramzzb = new zzl.zzc(paramzzb);
      ((zzi)zzqJ()).zza(paramLocationSettingsRequest, paramzzb, paramString);
      return;
      bool1 = false;
      break;
    }
  }
  
  public void zza(LocationRequestInternal paramLocationRequestInternal, LocationCallback paramLocationCallback, Looper paramLooper, zzg paramzzg)
  {
    synchronized (zzaOM)
    {
      zzaOM.zza(paramLocationRequestInternal, paramLocationCallback, paramLooper, paramzzg);
      return;
    }
  }
  
  public void zza(zzg paramzzg)
  {
    zzaOM.zza(paramzzg);
  }
  
  public void zza(List paramList, zza.zzb paramzzb)
  {
    zzqI();
    if ((paramList != null) && (paramList.size() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "geofenceRequestIds can't be null nor empty.");
      zzx.zzb(paramzzb, "ResultHolder not provided.");
      paramList = (String[])paramList.toArray(new String[0]);
      paramzzb = new zzl.zzb(paramzzb);
      ((zzi)zzqJ()).zza(paramList, paramzzb, getContext().getPackageName());
      return;
    }
  }
  
  public void zzam(boolean paramBoolean)
  {
    zzaOM.zzam(paramBoolean);
  }
  
  public void zzc(Location paramLocation)
  {
    zzaOM.zzc(paramLocation);
  }
  
  public LocationAvailability zzyO()
  {
    return zzaOM.zzyO();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */