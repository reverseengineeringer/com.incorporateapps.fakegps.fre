package com.google.android.gms.drive.events.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzc
  implements Parcelable.Creator
{
  static void zza(TransferProgressData paramTransferProgressData, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zzc(paramParcel, 2, zzapT);
    zzb.zza(paramParcel, 3, zzaoz, paramInt, false);
    zzb.zzc(paramParcel, 4, zzBc);
    zzb.zza(paramParcel, 5, zzapW);
    zzb.zza(paramParcel, 6, zzapX);
    zzb.zzI(paramParcel, i);
  }
  
  public TransferProgressData zzaY(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = 0;
    int m = zza.zzau(paramParcel);
    DriveId localDriveId = null;
    long l2 = 0L;
    int j = 0;
    int k = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = zza.zzat(paramParcel);
      switch (zza.zzca(n))
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        k = zza.zzg(paramParcel, n);
        break;
      case 2: 
        j = zza.zzg(paramParcel, n);
        break;
      case 3: 
        localDriveId = (DriveId)zza.zza(paramParcel, n, DriveId.CREATOR);
        break;
      case 4: 
        i = zza.zzg(paramParcel, n);
        break;
      case 5: 
        l2 = zza.zzi(paramParcel, n);
        break;
      case 6: 
        l1 = zza.zzi(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new zza.zza("Overread allowed size end=" + m, paramParcel);
    }
    return new TransferProgressData(k, j, localDriveId, i, l2, l1);
  }
  
  public TransferProgressData[] zzcO(int paramInt)
  {
    return new TransferProgressData[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.internal.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */