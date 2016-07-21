package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator
{
  static void zza(CapabilityParcel paramCapabilityParcel, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zza(paramParcel, 2, zzIn);
    zzb.zza(paramParcel, 3, zzIo);
    zzb.zza(paramParcel, 4, zzIp);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public CapabilityParcel[] zzI(int paramInt)
  {
    return new CapabilityParcel[paramInt];
  }
  
  public CapabilityParcel zzk(Parcel paramParcel)
  {
    boolean bool3 = false;
    int j = zza.zzau(paramParcel);
    boolean bool2 = false;
    boolean bool1 = false;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 3: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 4: 
        bool3 = zza.zzc(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new CapabilityParcel(i, bool1, bool2, bool3);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */