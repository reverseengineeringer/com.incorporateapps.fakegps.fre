package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator
{
  static void zza(PlacePhotoResult paramPlacePhotoResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramPlacePhotoResult.getStatus(), paramInt, false);
    zzb.zzc(paramParcel, 1000, mVersionCode);
    zzb.zza(paramParcel, 2, zzaPG, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PlacePhotoResult zzfg(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    Status localStatus = null;
    int i = 0;
    BitmapTeleporter localBitmapTeleporter = null;
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
        localBitmapTeleporter = (BitmapTeleporter)zza.zza(paramParcel, k, BitmapTeleporter.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new PlacePhotoResult(i, localStatus, localBitmapTeleporter);
  }
  
  public PlacePhotoResult[] zzhR(int paramInt)
  {
    return new PlacePhotoResult[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */