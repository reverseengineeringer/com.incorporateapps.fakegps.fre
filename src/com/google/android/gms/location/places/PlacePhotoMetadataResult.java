package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class PlacePhotoMetadataResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzh();
  final int mVersionCode;
  private final Status zzUX;
  final DataHolder zzaPE;
  private final PlacePhotoMetadataBuffer zzaPF;
  
  PlacePhotoMetadataResult(int paramInt, Status paramStatus, DataHolder paramDataHolder)
  {
    mVersionCode = paramInt;
    zzUX = paramStatus;
    zzaPE = paramDataHolder;
    if (paramDataHolder == null)
    {
      zzaPF = null;
      return;
    }
    zzaPF = new PlacePhotoMetadataBuffer(zzaPE);
  }
  
  public PlacePhotoMetadataResult(Status paramStatus, DataHolder paramDataHolder)
  {
    this(0, paramStatus, paramDataHolder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public PlacePhotoMetadataBuffer getPhotoMetadata()
  {
    return zzaPF;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.PlacePhotoMetadataResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */