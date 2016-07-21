package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

public class zzah
  implements Parcelable.Creator
{
  static void zza(UnsubscribeRequest paramUnsubscribeRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramUnsubscribeRequest.getDataType(), paramInt, false);
    zzb.zzc(paramParcel, 1000, paramUnsubscribeRequest.getVersionCode());
    zzb.zza(paramParcel, 2, paramUnsubscribeRequest.getDataSource(), paramInt, false);
    zzb.zza(paramParcel, 3, paramUnsubscribeRequest.getCallbackBinder(), false);
    zzb.zzI(paramParcel, i);
  }
  
  public UnsubscribeRequest zzdM(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    DataSource localDataSource = null;
    DataType localDataType = null;
    int i = 0;
    IBinder localIBinder = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localDataType = (DataType)zza.zza(paramParcel, k, DataType.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localDataSource = (DataSource)zza.zza(paramParcel, k, DataSource.CREATOR);
        break;
      case 3: 
        localIBinder = zza.zzq(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new UnsubscribeRequest(i, localDataType, localDataSource, localIBinder);
  }
  
  public UnsubscribeRequest[] zzfN(int paramInt)
  {
    return new UnsubscribeRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.zzah
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */