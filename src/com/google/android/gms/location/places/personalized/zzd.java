package com.google.android.gms.location.places.personalized;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.PlacesStatusCodes;

public final class zzd
  extends com.google.android.gms.common.data.zzd
  implements Result
{
  private final Status zzUX;
  
  public zzd(DataHolder paramDataHolder)
  {
    this(paramDataHolder, PlacesStatusCodes.zzhU(paramDataHolder.getStatusCode()));
  }
  
  private zzd(DataHolder paramDataHolder, Status paramStatus)
  {
    super(paramDataHolder, PlaceUserData.CREATOR);
    if ((paramDataHolder == null) || (paramDataHolder.getStatusCode() == paramStatus.getStatusCode())) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzac(bool);
      zzUX = paramStatus;
      return;
    }
  }
  
  public static zzd zzaZ(Status paramStatus)
  {
    return new zzd(null, paramStatus);
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.personalized.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */