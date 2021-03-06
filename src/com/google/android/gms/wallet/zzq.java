package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzq
  implements Parcelable.Creator
{
  static void zza(PaymentMethodTokenizationParameters paramPaymentMethodTokenizationParameters, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramPaymentMethodTokenizationParameters.getVersionCode());
    zzb.zzc(paramParcel, 2, zzbpC);
    zzb.zza(paramParcel, 3, zzbpD, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public PaymentMethodTokenizationParameters zzhE(Parcel paramParcel)
  {
    int j = 0;
    int k = zza.zzau(paramParcel);
    Bundle localBundle = null;
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
        localBundle = zza.zzr(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new PaymentMethodTokenizationParameters(i, j, localBundle);
  }
  
  public PaymentMethodTokenizationParameters[] zzlc(int paramInt)
  {
    return new PaymentMethodTokenizationParameters[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.zzq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */