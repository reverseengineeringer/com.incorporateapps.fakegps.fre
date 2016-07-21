package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.GeoDataApi;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.model.LatLngBounds;

public class zzd
  implements GeoDataApi
{
  public PendingResult addPlace(GoogleApiClient paramGoogleApiClient, AddPlaceRequest paramAddPlaceRequest)
  {
    return paramGoogleApiClient.zzb(new zzd.1(this, Places.zzaPN, paramGoogleApiClient, paramAddPlaceRequest));
  }
  
  public PendingResult getAutocompletePredictions(GoogleApiClient paramGoogleApiClient, String paramString, LatLngBounds paramLatLngBounds, AutocompleteFilter paramAutocompleteFilter)
  {
    return paramGoogleApiClient.zza(new zzd.3(this, Places.zzaPN, paramGoogleApiClient, paramString, paramLatLngBounds, paramAutocompleteFilter));
  }
  
  public PendingResult getPlaceById(GoogleApiClient paramGoogleApiClient, String... paramVarArgs)
  {
    if ((paramVarArgs != null) && (paramVarArgs.length > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzac(bool);
      return paramGoogleApiClient.zza(new zzd.2(this, Places.zzaPN, paramGoogleApiClient, paramVarArgs));
    }
  }
  
  public PendingResult getPlacePhotos(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zza(new zzd.4(this, Places.zzaPN, paramGoogleApiClient, paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */