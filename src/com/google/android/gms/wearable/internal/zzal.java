package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzal
  implements Parcelable.Creator
{
  static void zza(GetCloudSyncOptInOutDoneResponse paramGetCloudSyncOptInOutDoneResponse, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zzc(paramParcel, 2, statusCode);
    zzb.zza(paramParcel, 3, zzbsD);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public GetCloudSyncOptInOutDoneResponse zzir(Parcel paramParcel)
  {
    boolean bool = false;
    int k = zza.zzau(paramParcel);
    int j = 0;
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
        bool = zza.zzc(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new GetCloudSyncOptInOutDoneResponse(i, j, bool);
  }
  
  public GetCloudSyncOptInOutDoneResponse[] zzlV(int paramInt)
  {
    return new GetCloudSyncOptInOutDoneResponse[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */