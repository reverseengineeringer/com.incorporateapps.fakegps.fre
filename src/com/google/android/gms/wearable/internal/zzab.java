package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzab
  implements Parcelable.Creator
{
  static void zza(DataItemAssetParcelable paramDataItemAssetParcelable, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, paramDataItemAssetParcelable.getId(), false);
    zzb.zza(paramParcel, 3, paramDataItemAssetParcelable.getDataItemKey(), false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public DataItemAssetParcelable zzik(Parcel paramParcel)
  {
    String str2 = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    String str1 = null;
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
        str1 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new DataItemAssetParcelable(i, str1, str2);
  }
  
  public DataItemAssetParcelable[] zzlO(int paramInt)
  {
    return new DataItemAssetParcelable[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */