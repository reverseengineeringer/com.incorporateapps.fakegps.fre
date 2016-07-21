package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(AppContentReceivedResult paramAppContentReceivedResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramAppContentReceivedResult.getVersionCode());
    zzb.zza(paramParcel, 2, paramAppContentReceivedResult.zzEJ(), paramInt, false);
    zzb.zzc(paramParcel, 3, paramAppContentReceivedResult.getStatusCode());
    zzb.zzI(paramParcel, i);
  }
  
  public AppContentReceivedResult zzgq(Parcel paramParcel)
  {
    int k = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    Uri localUri = null;
    int i = 0;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.zza.zzca(m))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m);
        break;
      case 1: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        localUri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, m, Uri.CREATOR);
        break;
      case 3: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new AppContentReceivedResult(i, localUri, j);
  }
  
  public AppContentReceivedResult[] zzjw(int paramInt)
  {
    return new AppContentReceivedResult[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.sharing.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */