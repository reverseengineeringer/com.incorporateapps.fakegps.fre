package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

public class zzm
  implements Parcelable.Creator
{
  static void zza(LocationRequestInternal paramLocationRequestInternal, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, zzaBp, paramInt, false);
    zzb.zzc(paramParcel, 1000, paramLocationRequestInternal.getVersionCode());
    zzb.zza(paramParcel, 2, zzaOP);
    zzb.zza(paramParcel, 3, zzaOQ);
    zzb.zza(paramParcel, 4, zzaOR);
    zzb.zzc(paramParcel, 5, zzaOS, false);
    zzb.zza(paramParcel, 6, mTag, false);
    zzb.zza(paramParcel, 7, zzaOT);
    zzb.zzI(paramParcel, i);
  }
  
  public LocationRequestInternal zzeX(Parcel paramParcel)
  {
    String str = null;
    boolean bool2 = true;
    boolean bool1 = false;
    int j = zza.zzau(paramParcel);
    Object localObject = LocationRequestInternal.zzaOO;
    boolean bool3 = true;
    boolean bool4 = false;
    LocationRequest localLocationRequest = null;
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
        localLocationRequest = (LocationRequest)zza.zza(paramParcel, k, LocationRequest.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool4 = zza.zzc(paramParcel, k);
        break;
      case 3: 
        bool3 = zza.zzc(paramParcel, k);
        break;
      case 4: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 5: 
        localObject = zza.zzc(paramParcel, k, ClientIdentity.CREATOR);
        break;
      case 6: 
        str = zza.zzp(paramParcel, k);
        break;
      case 7: 
        bool1 = zza.zzc(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new LocationRequestInternal(i, localLocationRequest, bool4, bool3, bool2, (List)localObject, str, bool1);
  }
  
  public LocationRequestInternal[] zzhD(int paramInt)
  {
    return new LocationRequestInternal[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.zzm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */