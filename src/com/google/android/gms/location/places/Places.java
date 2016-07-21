package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.location.places.internal.zzd;
import com.google.android.gms.location.places.internal.zze.zza;
import com.google.android.gms.location.places.internal.zzj;
import com.google.android.gms.location.places.internal.zzk.zza;

public class Places
{
  public static final Api GEO_DATA_API;
  public static final GeoDataApi GeoDataApi = new zzd();
  public static final Api PLACE_DETECTION_API;
  public static final PlaceDetectionApi PlaceDetectionApi = new zzj();
  public static final Api.zzc zzaPN = new Api.zzc();
  public static final Api.zzc zzaPO = new Api.zzc();
  
  static
  {
    GEO_DATA_API = new Api("Places.GEO_DATA_API", new zze.zza(null), zzaPN);
    PLACE_DETECTION_API = new Api("Places.PLACE_DETECTION_API", new zzk.zza(null), zzaPO);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.Places
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */