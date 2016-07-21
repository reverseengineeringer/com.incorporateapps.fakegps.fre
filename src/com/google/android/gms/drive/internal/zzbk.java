package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzbk
  implements Parcelable.Creator
{
  static void zza(OpenContentsRequest paramOpenContentsRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzaqj, paramInt, false);
    zzb.zzc(paramParcel, 3, zzaoy);
    zzb.zzc(paramParcel, 4, zzasx);
    zzb.zzI(paramParcel, i);
  }
  
  public OpenContentsRequest zzbN(Parcel paramParcel)
  {
    int m = zza.zzau(paramParcel);
    int j = 0;
    DriveId localDriveId = null;
    int i = 0;
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
        i = zza.zzg(paramParcel, n);
        break;
      case 2: 
        localDriveId = (DriveId)zza.zza(paramParcel, n, DriveId.CREATOR);
        break;
      case 3: 
        j = zza.zzg(paramParcel, n);
        break;
      case 4: 
        k = zza.zzg(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new zza.zza("Overread allowed size end=" + m, paramParcel);
    }
    return new OpenContentsRequest(i, localDriveId, j, k);
  }
  
  public OpenContentsRequest[] zzdI(int paramInt)
  {
    return new OpenContentsRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzbk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */