package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;

public abstract interface zzf
  extends IInterface
{
  public abstract void zza(NearbyAlertRequest paramNearbyAlertRequest, PlacesParams paramPlacesParams, PendingIntent paramPendingIntent, zzi paramzzi);
  
  public abstract void zza(PlaceFilter paramPlaceFilter, PlacesParams paramPlacesParams, zzi paramzzi);
  
  public abstract void zza(PlaceReport paramPlaceReport, PlacesParams paramPlacesParams, zzi paramzzi);
  
  public abstract void zza(PlaceRequest paramPlaceRequest, PlacesParams paramPlacesParams, PendingIntent paramPendingIntent, zzi paramzzi);
  
  public abstract void zza(PlacesParams paramPlacesParams, PendingIntent paramPendingIntent, zzi paramzzi);
  
  public abstract void zzb(PlacesParams paramPlacesParams, PendingIntent paramPendingIntent, zzi paramzzi);
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */