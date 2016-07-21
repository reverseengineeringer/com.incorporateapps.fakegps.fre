package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;

public class zzbt
  implements Parcelable.Creator
{
  static void zza(SetResourceParentsRequest paramSetResourceParentsRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzaqf, paramInt, false);
    zzb.zzc(paramParcel, 3, zzasC, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SetResourceParentsRequest zzbV(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    DriveId localDriveId = null;
    int i = 0;
    ArrayList localArrayList = null;
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
        localArrayList = zza.zzc(paramParcel, k, DriveId.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new SetResourceParentsRequest(i, localDriveId, localArrayList);
  }
  
  public SetResourceParentsRequest[] zzdQ(int paramInt)
  {
    return new SetResourceParentsRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzbt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */