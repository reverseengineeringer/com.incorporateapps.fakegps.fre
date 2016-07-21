package com.google.android.gms.location.places;

import com.google.android.gms.location.places.internal.zzh.zza;

public class zzf
  extends zzh.zza
{
  private final zzf.zzb zzaPw;
  private final zzf.zza zzaPx;
  
  public zzf(zzf.zza paramzza)
  {
    zzaPw = null;
    zzaPx = paramzza;
  }
  
  public zzf(zzf.zzb paramzzb)
  {
    zzaPw = paramzzb;
    zzaPx = null;
  }
  
  public void zza(PlacePhotoMetadataResult paramPlacePhotoMetadataResult)
  {
    zzaPw.zza(paramPlacePhotoMetadataResult);
  }
  
  public void zza(PlacePhotoResult paramPlacePhotoResult)
  {
    zzaPx.zza(paramPlacePhotoResult);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */