package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SettingsApi;

public class zzq
  implements SettingsApi
{
  public PendingResult checkLocationSettings(GoogleApiClient paramGoogleApiClient, LocationSettingsRequest paramLocationSettingsRequest)
  {
    return zza(paramGoogleApiClient, paramLocationSettingsRequest, null);
  }
  
  public PendingResult zza(GoogleApiClient paramGoogleApiClient, LocationSettingsRequest paramLocationSettingsRequest, String paramString)
  {
    return paramGoogleApiClient.zza(new zzq.1(this, paramGoogleApiClient, paramLocationSettingsRequest, paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.zzq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */