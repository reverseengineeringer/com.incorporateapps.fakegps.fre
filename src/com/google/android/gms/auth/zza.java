package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(AccountChangeEvent paramAccountChangeEvent, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersion);
    zzb.zza(paramParcel, 2, zzUZ);
    zzb.zza(paramParcel, 3, zzVa, false);
    zzb.zzc(paramParcel, 4, zzVb);
    zzb.zzc(paramParcel, 5, zzVc);
    zzb.zza(paramParcel, 6, zzVd, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public AccountChangeEvent[] zzau(int paramInt)
  {
    return new AccountChangeEvent[paramInt];
  }
  
  public AccountChangeEvent zzz(Parcel paramParcel)
  {
    String str1 = null;
    int i = 0;
    int m = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    long l = 0L;
    int j = 0;
    String str2 = null;
    int k = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.zza.zzca(n))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, n);
        break;
      case 1: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, n);
        break;
      case 2: 
        l = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, n);
        break;
      case 3: 
        str2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, n);
        break;
      case 4: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, n);
        break;
      case 5: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, n);
        break;
      case 6: 
        str1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new zza.zza("Overread allowed size end=" + m, paramParcel);
    }
    return new AccountChangeEvent(k, l, str2, j, i, str1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */