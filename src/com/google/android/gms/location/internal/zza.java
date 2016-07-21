package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.ActivityRecognitionApi;

public class zza
  implements ActivityRecognitionApi
{
  public PendingResult removeActivityUpdates(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.zzb(new zza.2(this, paramGoogleApiClient, paramPendingIntent));
  }
  
  public PendingResult requestActivityUpdates(GoogleApiClient paramGoogleApiClient, long paramLong, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.zzb(new zza.1(this, paramGoogleApiClient, paramLong, paramPendingIntent));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */