package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wearable.ConnectionConfiguration;

public class zzap
  implements Parcelable.Creator
{
  static void zza(GetConfigsResponse paramGetConfigsResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zzc(paramParcel, 2, statusCode);
    zzb.zza(paramParcel, 3, zzbsH, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GetConfigsResponse zziv(Parcel paramParcel)
  {
    int j = 0;
    int k = zza.zzau(paramParcel);
    ConnectionConfiguration[] arrayOfConnectionConfiguration = null;
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
        arrayOfConnectionConfiguration = (ConnectionConfiguration[])zza.zzb(paramParcel, m, ConnectionConfiguration.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new GetConfigsResponse(i, j, arrayOfConnectionConfiguration);
  }
  
  public GetConfigsResponse[] zzlZ(int paramInt)
  {
    return new GetConfigsResponse[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */