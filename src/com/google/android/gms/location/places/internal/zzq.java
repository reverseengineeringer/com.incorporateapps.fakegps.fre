package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.PlacePhotoMetadata;

public class zzq
  extends zzt
  implements PlacePhotoMetadata
{
  private final String zzaQR = getString("photo_fife_url");
  
  public zzq(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public CharSequence getAttributions()
  {
    return zzG("photo_attributions", null);
  }
  
  public int getMaxHeight()
  {
    return zzz("photo_max_height", 0);
  }
  
  public int getMaxWidth()
  {
    return zzz("photo_max_width", 0);
  }
  
  public PendingResult getPhoto(GoogleApiClient paramGoogleApiClient)
  {
    return getScaledPhoto(paramGoogleApiClient, getMaxWidth(), getMaxHeight());
  }
  
  public PendingResult getScaledPhoto(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2)
  {
    return zzzz().getScaledPhoto(paramGoogleApiClient, paramInt1, paramInt2);
  }
  
  public PlacePhotoMetadata zzzz()
  {
    return new zzp(zzaQR, getMaxWidth(), getMaxHeight(), getAttributions(), zzaje);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.zzq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */