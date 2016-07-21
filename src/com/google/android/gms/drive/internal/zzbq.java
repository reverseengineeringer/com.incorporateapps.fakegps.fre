package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzbq
  implements Parcelable.Creator
{
  static void zza(RemovePermissionRequest paramRemovePermissionRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzaoz, paramInt, false);
    zzb.zza(paramParcel, 3, zzapk, false);
    zzb.zza(paramParcel, 4, zzaqd);
    zzb.zza(paramParcel, 5, zzaoV, false);
    zzb.zzI(paramParcel, i);
  }
  
  public RemovePermissionRequest zzbS(Parcel paramParcel)
  {
    boolean bool = false;
    String str1 = null;
    int j = zza.zzau(paramParcel);
    String str2 = null;
    DriveId localDriveId = null;
    int i = 0;
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
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new RemovePermissionRequest(i, localDriveId, str2, bool, str1);
  }
  
  public RemovePermissionRequest[] zzdN(int paramInt)
  {
    return new RemovePermissionRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzbq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */