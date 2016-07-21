package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzby
  implements Parcelable.Creator
{
  static void zza(UnsubscribeResourceRequest paramUnsubscribeResourceRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzaqj, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public UnsubscribeResourceRequest zzbZ(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    int i = 0;
    DriveId localDriveId = null;
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
        localDriveId = (DriveId)zza.zza(paramParcel, k, DriveId.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new UnsubscribeResourceRequest(i, localDriveId);
  }
  
  public UnsubscribeResourceRequest[] zzdU(int paramInt)
  {
    return new UnsubscribeResourceRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzby
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */