package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api.ApiOptions.Optional;

public final class PlacesOptions
  implements Api.ApiOptions.Optional
{
  public final String zzaPU;
  public final int zzaPV;
  
  private PlacesOptions(PlacesOptions.Builder paramBuilder)
  {
    zzaPU = PlacesOptions.Builder.zza(paramBuilder);
    zzaPV = PlacesOptions.Builder.zzb(paramBuilder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.PlacesOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */