package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg
  implements Parcelable.Creator
{
  static void zza(LocationSettingsResult paramLocationSettingsResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramLocationSettingsResult.getStatus(), paramInt, false);
    zzb.zzc(paramParcel, 1000, paramLocationSettingsResult.getVersionCode());
    zzb.zza(paramParcel, 2, paramLocationSettingsResult.getLocationSettingsStates(), paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public LocationSettingsResult zzeT(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    Status localStatus = null;
    int i = 0;
    LocationSettingsStates localLocationSettingsStates = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localStatus = (Status)zza.zza(paramParcel, k, Status.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localLocationSettingsStates = (LocationSettingsStates)zza.zza(paramParcel, k, LocationSettingsStates.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new LocationSettingsResult(i, localStatus, localLocationSettingsStates);
  }
  
  public LocationSettingsResult[] zzhw(int paramInt)
  {
    return new LocationSettingsResult[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */