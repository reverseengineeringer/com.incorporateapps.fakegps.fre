package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzd
  implements Parcelable.Creator
{
  static void zza(NearbyAlertFilter paramNearbyAlertFilter, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzb(paramParcel, 1, zzaPj, false);
    zzb.zzc(paramParcel, 1000, mVersionCode);
    zzb.zza(paramParcel, 2, zzaPk, false);
    zzb.zzc(paramParcel, 3, zzaPl, false);
    zzb.zza(paramParcel, 4, zzaPm, false);
    zzb.zza(paramParcel, 5, zzaPn);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public NearbyAlertFilter zzfc(Parcel paramParcel)
  {
    boolean bool = false;
    String str = null;
    int j = zza.zzau(paramParcel);
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = null;
    ArrayList localArrayList3 = null;
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
        localArrayList3 = zza.zzD(paramParcel, k);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localArrayList2 = zza.zzC(paramParcel, k);
        break;
      case 3: 
        localArrayList1 = zza.zzc(paramParcel, k, UserDataType.CREATOR);
        break;
      case 4: 
        str = zza.zzp(paramParcel, k);
        break;
      case 5: 
        bool = zza.zzc(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new NearbyAlertFilter(i, localArrayList3, localArrayList2, localArrayList1, str, bool);
  }
  
  public NearbyAlertFilter[] zzhM(int paramInt)
  {
    return new NearbyAlertFilter[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */