package com.google.android.gms.location;

import java.util.ArrayList;
import java.util.Collection;

public final class LocationSettingsRequest$Builder
{
  private boolean zzaOf = false;
  private boolean zzaOg = false;
  private final ArrayList zzaOh = new ArrayList();
  
  public final Builder addAllLocationRequests(Collection paramCollection)
  {
    zzaOh.addAll(paramCollection);
    return this;
  }
  
  public final Builder addLocationRequest(LocationRequest paramLocationRequest)
  {
    zzaOh.add(paramLocationRequest);
    return this;
  }
  
  public final LocationSettingsRequest build()
  {
    return new LocationSettingsRequest(zzaOh, zzaOf, zzaOg, null);
  }
  
  public final Builder setAlwaysShow(boolean paramBoolean)
  {
    zzaOf = paramBoolean;
    return this;
  }
  
  public final Builder setNeedBle(boolean paramBoolean)
  {
    zzaOg = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.LocationSettingsRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */