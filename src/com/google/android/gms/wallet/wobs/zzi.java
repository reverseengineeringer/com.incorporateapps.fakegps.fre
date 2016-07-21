package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator
{
  static void zza(WalletObjectMessage paramWalletObjectMessage, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramWalletObjectMessage.getVersionCode());
    zzb.zza(paramParcel, 2, zzbqO, false);
    zzb.zza(paramParcel, 3, body, false);
    zzb.zza(paramParcel, 4, zzbqR, paramInt, false);
    zzb.zza(paramParcel, 5, zzbqS, paramInt, false);
    zzb.zza(paramParcel, 6, zzbqT, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public WalletObjectMessage zzhW(Parcel paramParcel)
  {
    UriData localUriData1 = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    UriData localUriData2 = null;
    TimeInterval localTimeInterval = null;
    String str1 = null;
    String str2 = null;
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
        str2 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localTimeInterval = (TimeInterval)zza.zza(paramParcel, k, TimeInterval.CREATOR);
        break;
      case 5: 
        localUriData2 = (UriData)zza.zza(paramParcel, k, UriData.CREATOR);
        break;
      case 6: 
        localUriData1 = (UriData)zza.zza(paramParcel, k, UriData.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new WalletObjectMessage(i, str2, str1, localTimeInterval, localUriData2, localUriData1);
  }
  
  public WalletObjectMessage[] zzlx(int paramInt)
  {
    return new WalletObjectMessage[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.wobs.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */