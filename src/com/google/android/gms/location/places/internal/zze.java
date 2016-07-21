package com.google.android.gms.location.places.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzl;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Locale;

public class zze
  extends zzj
{
  private final PlacesParams zzaQq;
  private final Locale zzaQr = Locale.getDefault();
  
  public zze(Context paramContext, Looper paramLooper, com.google.android.gms.common.internal.zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString, PlacesOptions paramPlacesOptions)
  {
    super(paramContext, paramLooper, 65, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    paramContext = null;
    if (paramzzf.getAccount() != null) {
      paramContext = getAccountname;
    }
    zzaQq = new PlacesParams(paramString, zzaQr, paramContext, zzaPU, zzaPV);
  }
  
  public void zza(com.google.android.gms.location.places.zzf paramzzf, String paramString)
  {
    zzx.zzb(paramString, "placeId cannot be null");
    ((zzg)zzqJ()).zza(paramString, zzaQq, paramzzf);
  }
  
  public void zza(com.google.android.gms.location.places.zzf paramzzf, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool2 = true;
    zzx.zzb(paramString, "fifeUrl cannot be null");
    if (paramInt1 > 0)
    {
      bool1 = true;
      zzx.zzb(bool1, "width should be > 0");
      if (paramInt1 <= 0) {
        break label69;
      }
    }
    label69:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zzb(bool1, "height should be > 0");
      ((zzg)zzqJ()).zza(paramString, paramInt1, paramInt2, paramInt3, zzaQq, paramzzf);
      return;
      bool1 = false;
      break;
    }
  }
  
  public void zza(zzl paramzzl, AddPlaceRequest paramAddPlaceRequest)
  {
    zzx.zzb(paramAddPlaceRequest, "userAddedPlace == null");
    ((zzg)zzqJ()).zza(paramAddPlaceRequest, zzaQq, paramzzl);
  }
  
  public void zza(zzl paramzzl, String paramString, LatLngBounds paramLatLngBounds, AutocompleteFilter paramAutocompleteFilter)
  {
    zzx.zzb(paramzzl, "callback == null");
    if (paramString == null) {
      paramString = "";
    }
    for (;;)
    {
      if (paramAutocompleteFilter == null) {
        paramAutocompleteFilter = AutocompleteFilter.create(null);
      }
      for (;;)
      {
        ((zzg)zzqJ()).zza(paramString, paramLatLngBounds, paramAutocompleteFilter, zzaQq, paramzzl);
        return;
      }
    }
  }
  
  public void zza(zzl paramzzl, List paramList)
  {
    ((zzg)zzqJ()).zzb(paramList, zzaQq, paramzzl);
  }
  
  protected zzg zzcl(IBinder paramIBinder)
  {
    return zzg.zza.zzcn(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.location.places.GeoDataApi";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.location.places.internal.IGooglePlacesService";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */