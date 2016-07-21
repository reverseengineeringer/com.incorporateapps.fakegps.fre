package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl
  implements Parcelable.Creator
{
  static void zza(SyncInfoResult paramSyncInfoResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramSyncInfoResult.getStatus(), paramInt, false);
    zzb.zzc(paramParcel, 1000, paramSyncInfoResult.getVersionCode());
    zzb.zza(paramParcel, 2, paramSyncInfoResult.zzvq());
    zzb.zzI(paramParcel, i);
  }
  
  public SyncInfoResult zzdY(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    Status localStatus = null;
    int i = 0;
    long l = 0L;
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
        l = zza.zzi(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new SyncInfoResult(i, localStatus, l);
  }
  
  public SyncInfoResult[] zzfZ(int paramInt)
  {
    return new SyncInfoResult[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */