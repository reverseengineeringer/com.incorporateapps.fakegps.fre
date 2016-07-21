package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator
{
  static void zza(ValuesAddedDetails paramValuesAddedDetails, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zzc(paramParcel, 2, mIndex);
    zzb.zzc(paramParcel, 3, zzauP);
    zzb.zzc(paramParcel, 4, zzauQ);
    zzb.zza(paramParcel, 5, zzavo, false);
    zzb.zzc(paramParcel, 6, zzavp);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public ValuesAddedDetails zzcK(Parcel paramParcel)
  {
    int i = 0;
    int i1 = zza.zzau(paramParcel);
    String str = null;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    while (paramParcel.dataPosition() < i1)
    {
      int i2 = zza.zzat(paramParcel);
      switch (zza.zzca(i2))
      {
      default: 
        zza.zzb(paramParcel, i2);
        break;
      case 1: 
        n = zza.zzg(paramParcel, i2);
        break;
      case 2: 
        m = zza.zzg(paramParcel, i2);
        break;
      case 3: 
        k = zza.zzg(paramParcel, i2);
        break;
      case 4: 
        j = zza.zzg(paramParcel, i2);
        break;
      case 5: 
        str = zza.zzp(paramParcel, i2);
        break;
      case 6: 
        i = zza.zzg(paramParcel, i2);
      }
    }
    if (paramParcel.dataPosition() != i1) {
      throw new zza.zza("Overread allowed size end=" + i1, paramParcel);
    }
    return new ValuesAddedDetails(n, m, k, j, str, i);
  }
  
  public ValuesAddedDetails[] zzeG(int paramInt)
  {
    return new ValuesAddedDetails[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.event.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */