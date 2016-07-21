package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(ChangesAvailableEvent paramChangesAvailableEvent, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, mVersionCode);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, zzVa, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, zzapy, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public ChangesAvailableEvent zzaQ(Parcel paramParcel)
  {
    ChangesAvailableOptions localChangesAvailableOptions = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    String str = null;
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
        str = zza.zzp(paramParcel, k);
        break;
      case 3: 
        localChangesAvailableOptions = (ChangesAvailableOptions)zza.zza(paramParcel, k, ChangesAvailableOptions.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new ChangesAvailableEvent(i, str, localChangesAvailableOptions);
  }
  
  public ChangesAvailableEvent[] zzcF(int paramInt)
  {
    return new ChangesAvailableEvent[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */