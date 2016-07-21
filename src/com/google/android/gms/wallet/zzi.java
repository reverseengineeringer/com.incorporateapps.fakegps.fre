package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator
{
  static void zza(IsReadyToPayRequest paramIsReadyToPayRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramIsReadyToPayRequest.getVersionCode());
    zzb.zzI(paramParcel, paramInt);
  }
  
  public IsReadyToPayRequest zzhw(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
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
        i = zza.zzg(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new IsReadyToPayRequest(i);
  }
  
  public IsReadyToPayRequest[] zzkU(int paramInt)
  {
    return new IsReadyToPayRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */