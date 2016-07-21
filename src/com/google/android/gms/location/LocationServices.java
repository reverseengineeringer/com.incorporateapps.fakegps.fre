package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.internal.zzd;
import com.google.android.gms.location.internal.zzf;
import com.google.android.gms.location.internal.zzl;
import com.google.android.gms.location.internal.zzq;

public class LocationServices
{
  public static final Api API = new Api("LocationServices.API", zzUJ, zzUI);
  public static final FusedLocationProviderApi FusedLocationApi = new zzd();
  public static final GeofencingApi GeofencingApi = new zzf();
  public static final SettingsApi SettingsApi = new zzq();
  private static final Api.zzc zzUI = new Api.zzc();
  private static final Api.zza zzUJ = new LocationServices.1();
  
  public static zzl zzi(GoogleApiClient paramGoogleApiClient)
  {
    boolean bool2 = true;
    if (paramGoogleApiClient != null)
    {
      bool1 = true;
      zzx.zzb(bool1, "GoogleApiClient parameter is required.");
      paramGoogleApiClient = (zzl)paramGoogleApiClient.zza(zzUI);
      if (paramGoogleApiClient == null) {
        break label44;
      }
    }
    label44:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zza(bool1, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
      return paramGoogleApiClient;
      bool1 = false;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.LocationServices
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */