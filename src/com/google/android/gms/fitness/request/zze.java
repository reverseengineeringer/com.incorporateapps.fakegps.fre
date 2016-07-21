package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSet;

public class zze
  implements Parcelable.Creator
{
  static void zza(DataInsertRequest paramDataInsertRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramDataInsertRequest.getDataSet(), paramInt, false);
    zzb.zzc(paramParcel, 1000, paramDataInsertRequest.getVersionCode());
    zzb.zza(paramParcel, 2, paramDataInsertRequest.getCallbackBinder(), false);
    zzb.zza(paramParcel, 4, paramDataInsertRequest.zzuO());
    zzb.zzI(paramParcel, i);
  }
  
  public DataInsertRequest zzdk(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    IBinder localIBinder = null;
    DataSet localDataSet = null;
    int i = 0;
    boolean bool = false;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localDataSet = (DataSet)zza.zza(paramParcel, k, DataSet.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localIBinder = zza.zzq(paramParcel, k);
        break;
      case 4: 
        bool = zza.zzc(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new DataInsertRequest(i, localDataSet, localIBinder, bool);
  }
  
  public DataInsertRequest[] zzfk(int paramInt)
  {
    return new DataInsertRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */