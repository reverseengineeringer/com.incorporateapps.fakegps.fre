package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl
  implements Parcelable.Creator
{
  static void zza(DataUpdateListenerUnregistrationRequest paramDataUpdateListenerUnregistrationRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramDataUpdateListenerUnregistrationRequest.getIntent(), paramInt, false);
    zzb.zzc(paramParcel, 1000, paramDataUpdateListenerUnregistrationRequest.getVersionCode());
    zzb.zza(paramParcel, 2, paramDataUpdateListenerUnregistrationRequest.getCallbackBinder(), false);
    zzb.zzI(paramParcel, i);
  }
  
  public DataUpdateListenerUnregistrationRequest zzdr(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    PendingIntent localPendingIntent = null;
    int i = 0;
    IBinder localIBinder = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localPendingIntent = (PendingIntent)zza.zza(paramParcel, k, PendingIntent.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localIBinder = zza.zzq(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new DataUpdateListenerUnregistrationRequest(i, localPendingIntent, localIBinder);
  }
  
  public DataUpdateListenerUnregistrationRequest[] zzfr(int paramInt)
  {
    return new DataUpdateListenerUnregistrationRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */