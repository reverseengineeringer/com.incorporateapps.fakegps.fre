package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.internal.TransferProgressData;

public class zzn
  implements Parcelable.Creator
{
  static void zza(TransferProgressEvent paramTransferProgressEvent, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzapS, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public TransferProgressEvent zzaU(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    int i = 0;
    TransferProgressData localTransferProgressData = null;
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
        localTransferProgressData = (TransferProgressData)zza.zza(paramParcel, k, TransferProgressData.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new TransferProgressEvent(i, localTransferProgressData);
  }
  
  public TransferProgressEvent[] zzcK(int paramInt)
  {
    return new TransferProgressEvent[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.zzn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */