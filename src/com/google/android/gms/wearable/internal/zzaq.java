package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzaq
  implements Parcelable.Creator
{
  static void zza(GetConnectedNodesResponse paramGetConnectedNodesResponse, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zzc(paramParcel, 2, statusCode);
    zzb.zzc(paramParcel, 3, zzbsI, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public GetConnectedNodesResponse zziw(Parcel paramParcel)
  {
    int j = 0;
    int k = zza.zzau(paramParcel);
    ArrayList localArrayList = null;
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
        localArrayList = zza.zzc(paramParcel, m, NodeParcelable.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new GetConnectedNodesResponse(i, j, localArrayList);
  }
  
  public GetConnectedNodesResponse[] zzma(int paramInt)
  {
    return new GetConnectedNodesResponse[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzaq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */