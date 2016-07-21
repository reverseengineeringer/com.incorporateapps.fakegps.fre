package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh
  implements Parcelable.Creator
{
  static void zza(PlacePhotoMetadataResult paramPlacePhotoMetadataResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramPlacePhotoMetadataResult.getStatus(), paramInt, false);
    zzb.zzc(paramParcel, 1000, mVersionCode);
    zzb.zza(paramParcel, 2, zzaPE, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PlacePhotoMetadataResult zzff(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    Status localStatus = null;
    int i = 0;
    DataHolder localDataHolder = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localStatus = (Status)zza.zza(paramParcel, k, Status.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localDataHolder = (DataHolder)zza.zza(paramParcel, k, DataHolder.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new PlacePhotoMetadataResult(i, localStatus, localDataHolder);
  }
  
  public PlacePhotoMetadataResult[] zzhQ(int paramInt)
  {
    return new PlacePhotoMetadataResult[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */