package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzi
  implements Parcelable.Creator
{
  static void zza(ReadRawResult paramReadRawResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramReadRawResult.zzsX(), paramInt, false);
    zzb.zzc(paramParcel, 1000, paramReadRawResult.getVersionCode());
    zzb.zzc(paramParcel, 2, paramReadRawResult.zzvo(), false);
    zzb.zzI(paramParcel, i);
  }
  
  public ReadRawResult zzdV(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    DataHolder localDataHolder = null;
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
        localDataHolder = (DataHolder)zza.zza(paramParcel, k, DataHolder.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localArrayList = zza.zzc(paramParcel, k, DataHolder.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new ReadRawResult(i, localDataHolder, localArrayList);
  }
  
  public ReadRawResult[] zzfW(int paramInt)
  {
    return new ReadRawResult[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */