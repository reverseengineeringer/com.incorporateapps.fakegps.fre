package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzf
  implements Parcelable.Creator
{
  static void zza(DataStatsResult paramDataStatsResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramDataStatsResult.getStatus(), paramInt, false);
    zzb.zzc(paramParcel, 1000, paramDataStatsResult.getVersionCode());
    zzb.zzc(paramParcel, 2, paramDataStatsResult.zzvn(), false);
    zzb.zzI(paramParcel, i);
  }
  
  public DataStatsResult zzdS(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    Status localStatus = null;
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
        localStatus = (Status)zza.zza(paramParcel, k, Status.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localArrayList = zza.zzc(paramParcel, k, DataSourceStatsResult.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new DataStatsResult(i, localStatus, localArrayList);
  }
  
  public DataStatsResult[] zzfT(int paramInt)
  {
    return new DataStatsResult[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */