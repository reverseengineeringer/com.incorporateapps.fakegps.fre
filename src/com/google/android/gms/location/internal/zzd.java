package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

public class zzd
  implements FusedLocationProviderApi
{
  public PendingResult flushLocations(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zzb(new zzd.5(this, paramGoogleApiClient));
  }
  
  public Location getLastLocation(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = LocationServices.zzi(paramGoogleApiClient);
    try
    {
      paramGoogleApiClient = paramGoogleApiClient.getLastLocation();
      return paramGoogleApiClient;
    }
    catch (Exception paramGoogleApiClient) {}
    return null;
  }
  
  public LocationAvailability getLocationAvailability(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = LocationServices.zzi(paramGoogleApiClient);
    try
    {
      paramGoogleApiClient = paramGoogleApiClient.zzyO();
      return paramGoogleApiClient;
    }
    catch (Exception paramGoogleApiClient) {}
    return null;
  }
  
  public PendingResult removeLocationUpdates(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.zzb(new zzd.10(this, paramGoogleApiClient, paramPendingIntent));
  }
  
  public PendingResult removeLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationCallback paramLocationCallback)
  {
    return paramGoogleApiClient.zzb(new zzd.2(this, paramGoogleApiClient, paramLocationCallback));
  }
  
  public PendingResult removeLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationListener paramLocationListener)
  {
    return paramGoogleApiClient.zzb(new zzd.9(this, paramGoogleApiClient, paramLocationListener));
  }
  
  public PendingResult requestLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.zzb(new zzd.8(this, paramGoogleApiClient, paramLocationRequest, paramPendingIntent));
  }
  
  public PendingResult requestLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, LocationCallback paramLocationCallback, Looper paramLooper)
  {
    return paramGoogleApiClient.zzb(new zzd.7(this, paramGoogleApiClient, paramLocationRequest, paramLocationCallback, paramLooper));
  }
  
  public PendingResult requestLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, LocationListener paramLocationListener)
  {
    return paramGoogleApiClient.zzb(new zzd.1(this, paramGoogleApiClient, paramLocationRequest, paramLocationListener));
  }
  
  public PendingResult requestLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper)
  {
    return paramGoogleApiClient.zzb(new zzd.6(this, paramGoogleApiClient, paramLocationRequest, paramLocationListener, paramLooper));
  }
  
  public PendingResult setMockLocation(GoogleApiClient paramGoogleApiClient, Location paramLocation)
  {
    return paramGoogleApiClient.zzb(new zzd.4(this, paramGoogleApiClient, paramLocation));
  }
  
  public PendingResult setMockMode(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return paramGoogleApiClient.zzb(new zzd.3(this, paramGoogleApiClient, paramBoolean));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */