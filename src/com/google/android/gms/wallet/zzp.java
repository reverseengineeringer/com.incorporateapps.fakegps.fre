package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzp
  implements Parcelable.Creator
{
  static void zza(PaymentMethodToken paramPaymentMethodToken, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramPaymentMethodToken.getVersionCode());
    zzb.zzc(paramParcel, 2, zzbpC);
    zzb.zza(paramParcel, 3, zzbaW, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public PaymentMethodToken zzhD(Parcel paramParcel)
  {
    int j = 0;
    int k = zza.zzau(paramParcel);
    String str = null;
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
        str = zza.zzp(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new PaymentMethodToken(i, j, str);
  }
  
  public PaymentMethodToken[] zzlb(int paramInt)
  {
    return new PaymentMethodToken[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */