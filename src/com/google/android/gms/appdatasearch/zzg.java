package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzg
  implements Parcelable.Creator
{
  static void zza(GetRecentContextCall.Response paramResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1000, mVersionCode);
    zzb.zza(paramParcel, 1, zzTY, paramInt, false);
    zzb.zzc(paramParcel, 2, zzTZ, false);
    zzb.zza(paramParcel, 3, zzUa, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GetRecentContextCall.Response[] zzan(int paramInt)
  {
    return new GetRecentContextCall.Response[paramInt];
  }
  
  public GetRecentContextCall.Response zzw(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    ArrayList localArrayList = null;
    Status localStatus = null;
    int i = 0;
    String[] arrayOfString = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 1: 
        localStatus = (Status)zza.zza(paramParcel, k, Status.CREATOR);
        break;
      case 2: 
        localArrayList = zza.zzc(paramParcel, k, UsageInfo.CREATOR);
        break;
      case 3: 
        arrayOfString = zza.zzB(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new GetRecentContextCall.Response(i, localStatus, localArrayList, arrayOfString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.appdatasearch.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */