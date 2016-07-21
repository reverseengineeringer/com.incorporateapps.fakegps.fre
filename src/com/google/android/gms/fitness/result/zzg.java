package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataType;

public class zzg
  implements Parcelable.Creator
{
  static void zza(DataTypeResult paramDataTypeResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramDataTypeResult.getStatus(), paramInt, false);
    zzb.zzc(paramParcel, 1000, paramDataTypeResult.getVersionCode());
    zzb.zza(paramParcel, 3, paramDataTypeResult.getDataType(), paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public DataTypeResult zzdT(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    Status localStatus = null;
    int i = 0;
    DataType localDataType = null;
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
      case 3: 
        localDataType = (DataType)zza.zza(paramParcel, k, DataType.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new DataTypeResult(i, localStatus, localDataType);
  }
  
  public DataTypeResult[] zzfU(int paramInt)
  {
    return new DataTypeResult[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */