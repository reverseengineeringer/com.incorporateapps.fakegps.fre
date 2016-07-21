package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzn
  implements Parcelable.Creator
{
  static void zza(PartialDriveId paramPartialDriveId, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzaoL, false);
    zzb.zza(paramParcel, 3, zzaoM);
    zzb.zzc(paramParcel, 4, zzaoN);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public PartialDriveId zzci(Parcel paramParcel)
  {
    int k = zza.zzau(paramParcel);
    int j = 0;
    String str = null;
    long l = 0L;
    int i = -1;
    while (paramParcel.dataPosition() < k)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzca(m))
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        j = zza.zzg(paramParcel, m);
        break;
      case 2: 
        str = zza.zzp(paramParcel, m);
        break;
      case 3: 
        l = zza.zzi(paramParcel, m);
        break;
      case 4: 
        i = zza.zzg(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new PartialDriveId(j, str, l, i);
  }
  
  public PartialDriveId[] zzed(int paramInt)
  {
    return new PartialDriveId[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.zzn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */