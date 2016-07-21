package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzo
  implements Parcelable.Creator
{
  static void zza(RawDataPoint paramRawDataPoint, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, zzawj);
    zzb.zzc(paramParcel, 1000, mVersionCode);
    zzb.zza(paramParcel, 2, zzawk);
    zzb.zza(paramParcel, 3, zzawl, paramInt, false);
    zzb.zzc(paramParcel, 4, zzaxg);
    zzb.zzc(paramParcel, 5, zzaxh);
    zzb.zza(paramParcel, 6, zzawn);
    zzb.zza(paramParcel, 7, zzawo);
    zzb.zzI(paramParcel, i);
  }
  
  public RawDataPoint zzcZ(Parcel paramParcel)
  {
    int m = zza.zzau(paramParcel);
    int k = 0;
    long l4 = 0L;
    long l3 = 0L;
    Value[] arrayOfValue = null;
    int j = 0;
    int i = 0;
    long l2 = 0L;
    long l1 = 0L;
    while (paramParcel.dataPosition() < m)
    {
      int n = zza.zzat(paramParcel);
      switch (zza.zzca(n))
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        l4 = zza.zzi(paramParcel, n);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, n);
        break;
      case 2: 
        l3 = zza.zzi(paramParcel, n);
        break;
      case 3: 
        arrayOfValue = (Value[])zza.zzb(paramParcel, n, Value.CREATOR);
        break;
      case 4: 
        j = zza.zzg(paramParcel, n);
        break;
      case 5: 
        i = zza.zzg(paramParcel, n);
        break;
      case 6: 
        l2 = zza.zzi(paramParcel, n);
        break;
      case 7: 
        l1 = zza.zzi(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new zza.zza("Overread allowed size end=" + m, paramParcel);
    }
    return new RawDataPoint(k, l4, l3, arrayOfValue, j, i, l2, l1);
  }
  
  public RawDataPoint[] zzeY(int paramInt)
  {
    return new RawDataPoint[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.zzo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */