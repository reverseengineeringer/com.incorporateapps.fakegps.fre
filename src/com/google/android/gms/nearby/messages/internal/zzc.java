package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(HandleClientLifecycleEventRequest paramHandleClientLifecycleEventRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, versionCode);
    zzb.zza(paramParcel, 2, zzbcs, paramInt, false);
    zzb.zzc(paramParcel, 3, zzbct);
    zzb.zzI(paramParcel, i);
  }
  
  public HandleClientLifecycleEventRequest zzgi(Parcel paramParcel)
  {
    int k = zza.zzau(paramParcel);
    ClientAppContext localClientAppContext = null;
    int i = 0;
    int j = 0;
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
        localClientAppContext = (ClientAppContext)zza.zza(paramParcel, m, ClientAppContext.CREATOR);
        break;
      case 3: 
        j = zza.zzg(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new HandleClientLifecycleEventRequest(i, localClientAppContext, j);
  }
  
  public HandleClientLifecycleEventRequest[] zzjn(int paramInt)
  {
    return new HandleClientLifecycleEventRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */