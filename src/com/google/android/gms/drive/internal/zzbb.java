package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbb
  implements Parcelable.Creator
{
  static void zza(OnFetchThumbnailResponse paramOnFetchThumbnailResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzasr, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public OnFetchThumbnailResponse zzbE(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    int i = 0;
    ParcelFileDescriptor localParcelFileDescriptor = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localParcelFileDescriptor = (ParcelFileDescriptor)zza.zza(paramParcel, k, ParcelFileDescriptor.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new OnFetchThumbnailResponse(i, localParcelFileDescriptor);
  }
  
  public OnFetchThumbnailResponse[] zzdz(int paramInt)
  {
    return new OnFetchThumbnailResponse[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzbb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */