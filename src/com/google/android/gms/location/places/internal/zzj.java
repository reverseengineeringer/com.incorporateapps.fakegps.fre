package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.places.PlaceDetectionApi;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.Places;

public class zzj
  implements PlaceDetectionApi
{
  public PendingResult getCurrentPlace(GoogleApiClient paramGoogleApiClient, PlaceFilter paramPlaceFilter)
  {
    return paramGoogleApiClient.zza(new zzj.1(this, Places.zzaPO, paramGoogleApiClient, paramPlaceFilter));
  }
  
  public PendingResult reportDeviceAtPlace(GoogleApiClient paramGoogleApiClient, PlaceReport paramPlaceReport)
  {
    return paramGoogleApiClient.zzb(new zzj.2(this, Places.zzaPO, paramGoogleApiClient, paramPlaceReport));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */