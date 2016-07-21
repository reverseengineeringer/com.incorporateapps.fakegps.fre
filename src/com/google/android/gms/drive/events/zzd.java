package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveSpace;
import java.util.ArrayList;

public class zzd
  implements Parcelable.Creator
{
  static void zza(ChangesAvailableOptions paramChangesAvailableOptions, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zzc(paramParcel, 2, zzapz);
    zzb.zza(paramParcel, 3, zzapA);
    zzb.zzc(paramParcel, 4, zzapB, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public ChangesAvailableOptions zzaR(Parcel paramParcel)
  {
    boolean bool = false;
    int k = zza.zzau(paramParcel);
    ArrayList localArrayList = null;
    int j = 0;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzca(m))
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        i = zza.zzg(paramParcel, m);
        break;
      case 2: 
        j = zza.zzg(paramParcel, m);
        break;
      case 3: 
        bool = zza.zzc(paramParcel, m);
        break;
      case 4: 
        localArrayList = zza.zzc(paramParcel, m, DriveSpace.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new ChangesAvailableOptions(i, j, bool, localArrayList);
  }
  
  public ChangesAvailableOptions[] zzcG(int paramInt)
  {
    return new ChangesAvailableOptions[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */