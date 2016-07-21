package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface ActivityRecognitionApi
{
  public abstract PendingResult removeActivityUpdates(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent);
  
  public abstract PendingResult requestActivityUpdates(GoogleApiClient paramGoogleApiClient, long paramLong, PendingIntent paramPendingIntent);
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.ActivityRecognitionApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */