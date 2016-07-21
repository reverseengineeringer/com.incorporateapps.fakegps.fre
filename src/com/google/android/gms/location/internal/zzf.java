package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GeofencingRequest.Builder;
import java.util.List;

public class zzf
  implements GeofencingApi
{
  public PendingResult addGeofences(GoogleApiClient paramGoogleApiClient, GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.zzb(new zzf.1(this, paramGoogleApiClient, paramGeofencingRequest, paramPendingIntent));
  }
  
  public PendingResult addGeofences(GoogleApiClient paramGoogleApiClient, List paramList, PendingIntent paramPendingIntent)
  {
    GeofencingRequest.Builder localBuilder = new GeofencingRequest.Builder();
    localBuilder.addGeofences(paramList);
    localBuilder.setInitialTrigger(5);
    return addGeofences(paramGoogleApiClient, localBuilder.build(), paramPendingIntent);
  }
  
  public PendingResult removeGeofences(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.zzb(new zzf.2(this, paramGoogleApiClient, paramPendingIntent));
  }
  
  public PendingResult removeGeofences(GoogleApiClient paramGoogleApiClient, List paramList)
  {
    return paramGoogleApiClient.zzb(new zzf.3(this, paramGoogleApiClient, paramList));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */