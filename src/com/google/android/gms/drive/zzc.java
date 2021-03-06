package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(DriveFileRange paramDriveFileRange, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzaoJ);
    zzb.zza(paramParcel, 3, zzaoK);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public DriveFileRange zzaJ(Parcel paramParcel)
  {
    long l1 = 0L;
    int j = zza.zzau(paramParcel);
    int i = 0;
    long l2 = 0L;
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
        l2 = zza.zzi(paramParcel, k);
        break;
      case 3: 
        l1 = zza.zzi(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new DriveFileRange(i, l2, l1);
  }
  
  public DriveFileRange[] zzcs(int paramInt)
  {
    return new DriveFileRange[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */