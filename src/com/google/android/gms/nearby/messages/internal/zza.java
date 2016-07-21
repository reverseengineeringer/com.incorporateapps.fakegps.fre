package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(ClientAppContext paramClientAppContext, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zza(paramParcel, 2, zzbco, false);
    zzb.zza(paramParcel, 3, zzbcp, false);
    zzb.zza(paramParcel, 4, zzbbH);
    zzb.zzc(paramParcel, 5, zzbcq);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public ClientAppContext zzgg(Parcel paramParcel)
  {
    String str1 = null;
    int i = 0;
    int k = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    boolean bool = false;
    String str2 = null;
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
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        str2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 3: 
        str1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 4: 
        bool = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, m);
        break;
      case 5: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new ClientAppContext(j, str2, str1, bool, i);
  }
  
  public ClientAppContext[] zzjl(int paramInt)
  {
    return new ClientAppContext[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */