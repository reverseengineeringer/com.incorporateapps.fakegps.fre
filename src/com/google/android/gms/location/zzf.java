package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzf
  implements Parcelable.Creator
{
  static void zza(LocationSettingsRequest paramLocationSettingsRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramLocationSettingsRequest.zzuZ(), false);
    zzb.zzc(paramParcel, 1000, paramLocationSettingsRequest.getVersionCode());
    zzb.zza(paramParcel, 2, paramLocationSettingsRequest.zzyK());
    zzb.zza(paramParcel, 3, paramLocationSettingsRequest.zzyL());
    zzb.zzI(paramParcel, paramInt);
  }
  
  public LocationSettingsRequest zzeS(Parcel paramParcel)
  {
    boolean bool2 = false;
    int j = zza.zzau(paramParcel);
    ArrayList localArrayList = null;
    int i = 0;
    boolean bool1 = false;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localArrayList = zza.zzc(paramParcel, k, LocationRequest.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 3: 
        bool2 = zza.zzc(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new LocationSettingsRequest(i, localArrayList, bool1, bool2);
  }
  
  public LocationSettingsRequest[] zzhv(int paramInt)
  {
    return new LocationSettingsRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */