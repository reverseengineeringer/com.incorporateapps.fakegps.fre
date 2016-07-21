package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.TransferProgressOptions;

public class zzbp
  implements Parcelable.Creator
{
  static void zza(RemoveEventListenerRequest paramRemoveEventListenerRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzaoz, paramInt, false);
    zzb.zzc(paramParcel, 3, zzanf);
    zzb.zza(paramParcel, 4, zzapZ, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public RemoveEventListenerRequest zzbR(Parcel paramParcel)
  {
    int k = zza.zzau(paramParcel);
    int j = 0;
    DriveId localDriveId = null;
    int i = 0;
    TransferProgressOptions localTransferProgressOptions = null;
    while (paramParcel.dataPosition() < k)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzca(m))
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        i = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localDriveId = (DriveId)zza.zza(paramParcel, m, DriveId.CREATOR);
        break;
      case 3: 
        j = zza.zzg(paramParcel, m);
        break;
      case 4: 
        localTransferProgressOptions = (TransferProgressOptions)zza.zza(paramParcel, m, TransferProgressOptions.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new RemoveEventListenerRequest(i, localDriveId, j, localTransferProgressOptions);
  }
  
  public RemoveEventListenerRequest[] zzdM(int paramInt)
  {
    return new RemoveEventListenerRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzbp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */