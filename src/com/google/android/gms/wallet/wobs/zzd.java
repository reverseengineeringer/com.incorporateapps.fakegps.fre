package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(LoyaltyPointsBalance paramLoyaltyPointsBalance, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramLoyaltyPointsBalance.getVersionCode());
    zzb.zzc(paramParcel, 2, zzbqJ);
    zzb.zza(paramParcel, 3, zzbqK, false);
    zzb.zza(paramParcel, 4, zzbqL);
    zzb.zza(paramParcel, 5, zzboF, false);
    zzb.zza(paramParcel, 6, zzbqM);
    zzb.zzc(paramParcel, 7, zzbqN);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public LoyaltyPointsBalance zzhR(Parcel paramParcel)
  {
    String str1 = null;
    int j = 0;
    int m = zza.zzau(paramParcel);
    double d = 0.0D;
    long l = 0L;
    int i = -1;
    String str2 = null;
    int k = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = zza.zzat(paramParcel);
      switch (zza.zzca(n))
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        k = zza.zzg(paramParcel, n);
        break;
      case 2: 
        j = zza.zzg(paramParcel, n);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 4: 
        d = zza.zzn(paramParcel, n);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, n);
        break;
      case 6: 
        l = zza.zzi(paramParcel, n);
        break;
      case 7: 
        i = zza.zzg(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new zza.zza("Overread allowed size end=" + m, paramParcel);
    }
    return new LoyaltyPointsBalance(k, j, str2, d, str1, l, i);
  }
  
  public LoyaltyPointsBalance[] zzls(int paramInt)
  {
    return new LoyaltyPointsBalance[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.wobs.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */