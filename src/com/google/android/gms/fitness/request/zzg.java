package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;

public class zzg
  implements Parcelable.Creator
{
  static void zza(DataSourceQueryParams paramDataSourceQueryParams, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, zzavU, paramInt, false);
    zzb.zzc(paramParcel, 1000, mVersionCode);
    zzb.zza(paramParcel, 2, zzUZ);
    zzb.zza(paramParcel, 3, zzawk);
    zzb.zza(paramParcel, 4, zzaAT);
    zzb.zzc(paramParcel, 5, zzaAO);
    zzb.zzc(paramParcel, 6, zzaAU);
    zzb.zzI(paramParcel, i);
  }
  
  public DataSourceQueryParams zzdm(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = 0;
    int m = zza.zzau(paramParcel);
    DataSource localDataSource = null;
    int j = 0;
    long l2 = 0L;
    long l3 = 0L;
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
        localDataSource = (DataSource)zza.zza(paramParcel, n, DataSource.CREATOR);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, n);
        break;
      case 2: 
        l3 = zza.zzi(paramParcel, n);
        break;
      case 3: 
        l2 = zza.zzi(paramParcel, n);
        break;
      case 4: 
        l1 = zza.zzi(paramParcel, n);
        break;
      case 5: 
        j = zza.zzg(paramParcel, n);
        break;
      case 6: 
        i = zza.zzg(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new zza.zza("Overread allowed size end=" + m, paramParcel);
    }
    return new DataSourceQueryParams(k, localDataSource, l3, l2, l1, j, i);
  }
  
  public DataSourceQueryParams[] zzfm(int paramInt)
  {
    return new DataSourceQueryParams[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */