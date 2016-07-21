package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl
  implements Parcelable.Creator
{
  static void zza(QueryResultEventParcelable paramQueryResultEventParcelable, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzahi, paramInt, false);
    zzb.zza(paramParcel, 3, zzapQ);
    zzb.zzc(paramParcel, 4, zzapR);
    zzb.zzI(paramParcel, i);
  }
  
  public QueryResultEventParcelable zzaT(Parcel paramParcel)
  {
    int k = zza.zzau(paramParcel);
    boolean bool = false;
    DataHolder localDataHolder = null;
    int i = 0;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzca(m))
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        i = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localDataHolder = (DataHolder)zza.zza(paramParcel, m, DataHolder.CREATOR);
        break;
      case 3: 
        bool = zza.zzc(paramParcel, m);
        break;
      case 4: 
        j = zza.zzg(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new QueryResultEventParcelable(i, localDataHolder, bool, j);
  }
  
  public QueryResultEventParcelable[] zzcI(int paramInt)
  {
    return new QueryResultEventParcelable[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */