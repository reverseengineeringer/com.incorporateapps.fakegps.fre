package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;

public class zzd
  implements Parcelable.Creator
{
  static void zza(DataSourceStatsResult paramDataSourceStatsResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, zzavU, paramInt, false);
    zzb.zzc(paramParcel, 1000, mVersionCode);
    zzb.zza(paramParcel, 2, zzUZ);
    zzb.zza(paramParcel, 3, zzaBI);
    zzb.zza(paramParcel, 4, zzaBJ);
    zzb.zza(paramParcel, 5, zzaBK);
    zzb.zzI(paramParcel, i);
  }
  
  public DataSourceStatsResult zzdQ(Parcel paramParcel)
  {
    boolean bool = false;
    long l1 = 0L;
    int j = zza.zzau(paramParcel);
    DataSource localDataSource = null;
    long l2 = 0L;
    long l3 = 0L;
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
        localDataSource = (DataSource)zza.zza(paramParcel, k, DataSource.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        l3 = zza.zzi(paramParcel, k);
        break;
      case 3: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 4: 
        l2 = zza.zzi(paramParcel, k);
        break;
      case 5: 
        l1 = zza.zzi(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new DataSourceStatsResult(i, localDataSource, l3, bool, l2, l1);
  }
  
  public DataSourceStatsResult[] zzfR(int paramInt)
  {
    return new DataSourceStatsResult[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */