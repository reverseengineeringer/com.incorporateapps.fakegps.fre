package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(PlaceAliasResult paramPlaceAliasResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramPlaceAliasResult.getStatus(), paramInt, false);
    zzb.zzc(paramParcel, 1000, mVersionCode);
    zzb.zza(paramParcel, 2, paramPlaceAliasResult.zzzC(), paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PlaceAliasResult zzfr(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    Status localStatus = null;
    int i = 0;
    PlaceUserData localPlaceUserData = null;
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
        localPlaceUserData = (PlaceUserData)zza.zza(paramParcel, k, PlaceUserData.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new PlaceAliasResult(i, localStatus, localPlaceUserData);
  }
  
  public PlaceAliasResult[] zzie(int paramInt)
  {
    return new PlaceAliasResult[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.personalized.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */