package com.google.android.gms.location.places.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzl;
import java.util.Locale;

public class zzk
  extends zzj
{
  private final PlacesParams zzaQq;
  private final Locale zzaQr = Locale.getDefault();
  
  public zzk(Context paramContext, Looper paramLooper, com.google.android.gms.common.internal.zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString, PlacesOptions paramPlacesOptions)
  {
    super(paramContext, paramLooper, 67, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    paramContext = null;
    if (paramzzf.getAccount() != null) {
      paramContext = getAccountname;
    }
    zzaQq = new PlacesParams(paramString, zzaQr, paramContext, zzaPU, zzaPV);
  }
  
  public void zza(zzl paramzzl, PlaceFilter paramPlaceFilter)
  {
    PlaceFilter localPlaceFilter = paramPlaceFilter;
    if (paramPlaceFilter == null) {
      localPlaceFilter = PlaceFilter.zzzd();
    }
    ((zzf)zzqJ()).zza(localPlaceFilter, zzaQq, paramzzl);
  }
  
  public void zza(zzl paramzzl, PlaceReport paramPlaceReport)
  {
    zzx.zzz(paramPlaceReport);
    ((zzf)zzqJ()).zza(paramPlaceReport, zzaQq, paramzzl);
  }
  
  protected zzf zzcq(IBinder paramIBinder)
  {
    return zzf.zza.zzcm(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.location.places.PlaceDetectionApi";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */