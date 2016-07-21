package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzr
  implements Parcelable.Creator
{
  static void zza(SessionDataSet paramSessionDataSet, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramSessionDataSet.getSession(), paramInt, false);
    zzb.zzc(paramParcel, 1000, mVersionCode);
    zzb.zza(paramParcel, 2, paramSessionDataSet.getDataSet(), paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SessionDataSet zzdc(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    Session localSession = null;
    int i = 0;
    DataSet localDataSet = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localSession = (Session)zza.zza(paramParcel, k, Session.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localDataSet = (DataSet)zza.zza(paramParcel, k, DataSet.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new SessionDataSet(i, localSession, localDataSet);
  }
  
  public SessionDataSet[] zzfc(int paramInt)
  {
    return new SessionDataSet[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.zzr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */