package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk
  implements Parcelable.Creator
{
  static void zza(ValuesSetDetails paramValuesSetDetails, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zzc(paramParcel, 2, mIndex);
    zzb.zzc(paramParcel, 3, zzauP);
    zzb.zzc(paramParcel, 4, zzauQ);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public ValuesSetDetails zzcM(Parcel paramParcel)
  {
    int m = 0;
    int n = zza.zzau(paramParcel);
    int k = 0;
    int j = 0;
    int i = 0;
    while (paramParcel.dataPosition() < n)
    {
      int i1 = zza.zzat(paramParcel);
      switch (zza.zzca(i1))
      {
      default: 
        zza.zzb(paramParcel, i1);
        break;
      case 1: 
        i = zza.zzg(paramParcel, i1);
        break;
      case 2: 
        j = zza.zzg(paramParcel, i1);
        break;
      case 3: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 4: 
        m = zza.zzg(paramParcel, i1);
      }
    }
    if (paramParcel.dataPosition() != n) {
      throw new zza.zza("Overread allowed size end=" + n, paramParcel);
    }
    return new ValuesSetDetails(i, j, k, m);
  }
  
  public ValuesSetDetails[] zzeI(int paramInt)
  {
    return new ValuesSetDetails[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.event.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */