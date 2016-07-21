package com.google.android.gms.location.places;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.maps.model.LatLngBounds;

public abstract interface GeoDataApi
{
  public abstract PendingResult addPlace(GoogleApiClient paramGoogleApiClient, AddPlaceRequest paramAddPlaceRequest);
  
  public abstract PendingResult getAutocompletePredictions(GoogleApiClient paramGoogleApiClient, String paramString, LatLngBounds paramLatLngBounds, AutocompleteFilter paramAutocompleteFilter);
  
  public abstract PendingResult getPlaceById(GoogleApiClient paramGoogleApiClient, String... paramVarArgs);
  
  public abstract PendingResult getPlacePhotos(GoogleApiClient paramGoogleApiClient, String paramString);
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.GeoDataApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */