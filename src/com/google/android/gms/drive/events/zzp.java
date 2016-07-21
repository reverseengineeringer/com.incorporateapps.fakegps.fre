package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.ArrayList;

public class zzp
  implements Parcelable.Creator
{
  static void zza(TransferStateEvent paramTransferStateEvent, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzVa, false);
    zzb.zzc(paramParcel, 3, zzapU, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public TransferStateEvent zzaW(Parcel paramParcel)
  {
    ArrayList localArrayList = null;
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
        localArrayList = zza.zzc(paramParcel, k, TransferProgressData.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new TransferStateEvent(i, str, localArrayList);
  }
  
  public TransferStateEvent[] zzcM(int paramInt)
  {
    return new TransferStateEvent[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */