package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.List;

public abstract interface GeofencingApi
{
  public abstract PendingResult addGeofences(GoogleApiClient paramGoogleApiClient, GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent);
  
  public abstract PendingResult addGeofences(GoogleApiClient paramGoogleApiClient, List paramList, PendingIntent paramPendingIntent);
  
  public abstract PendingResult removeGeofences(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent);
  
  public abstract PendingResult removeGeofences(GoogleApiClient paramGoogleApiClient, List paramList);
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.GeofencingApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */