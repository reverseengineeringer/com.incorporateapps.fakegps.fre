package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzae
  implements Parcelable.Creator
{
  static void zza(DataItemParcelable paramDataItemParcelable, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, paramDataItemParcelable.getUri(), paramInt, false);
    zzb.zza(paramParcel, 4, paramDataItemParcelable.zzIv(), false);
    zzb.zza(paramParcel, 5, paramDataItemParcelable.getData(), false);
    zzb.zzI(paramParcel, i);
  }
  
  public DataItemParcelable zzil(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    Bundle localBundle = null;
    Uri localUri = null;
    int i = 0;
    byte[] arrayOfByte = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      case 3: 
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localUri = (Uri)zza.zza(paramParcel, k, Uri.CREATOR);
        break;
      case 4: 
        localBundle = zza.zzr(paramParcel, k);
        break;
      case 5: 
        arrayOfByte = zza.zzs(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new DataItemParcelable(i, localUri, localBundle, arrayOfByte);
  }
  
  public DataItemParcelable[] zzlP(int paramInt)
  {
    return new DataItemParcelable[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */