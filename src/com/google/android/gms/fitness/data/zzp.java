package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzp
  implements Parcelable.Creator
{
  static void zza(RawDataSet paramRawDataSet, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, zzaxg);
    zzb.zzc(paramParcel, 1000, mVersionCode);
    zzb.zzc(paramParcel, 2, zzaxi);
    zzb.zzc(paramParcel, 3, zzaxj, false);
    zzb.zza(paramParcel, 4, zzawi);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public RawDataSet zzda(Parcel paramParcel)
  {
    boolean bool = false;
    int m = zza.zzau(paramParcel);
    ArrayList localArrayList = null;
    int i = 0;
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
        j = zza.zzg(paramParcel, n);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, n);
        break;
      case 2: 
        i = zza.zzg(paramParcel, n);
        break;
      case 3: 
        localArrayList = zza.zzc(paramParcel, n, RawDataPoint.CREATOR);
        break;
      case 4: 
        bool = zza.zzc(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new zza.zza("Overread allowed size end=" + m, paramParcel);
    }
    return new RawDataSet(k, j, i, localArrayList, bool);
  }
  
  public RawDataSet[] zzeZ(int paramInt)
  {
    return new RawDataSet[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */