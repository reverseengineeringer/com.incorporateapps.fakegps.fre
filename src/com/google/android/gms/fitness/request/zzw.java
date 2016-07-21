package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzw
  implements Parcelable.Creator
{
  static void zza(SensorUnregistrationRequest paramSensorUnregistrationRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramSensorUnregistrationRequest.zzvb(), false);
    zzb.zzc(paramParcel, 1000, paramSensorUnregistrationRequest.getVersionCode());
    zzb.zza(paramParcel, 2, paramSensorUnregistrationRequest.getIntent(), paramInt, false);
    zzb.zza(paramParcel, 3, paramSensorUnregistrationRequest.getCallbackBinder(), false);
    zzb.zzI(paramParcel, i);
  }
  
  public SensorUnregistrationRequest zzdB(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    PendingIntent localPendingIntent = null;
    IBinder localIBinder1 = null;
    int i = 0;
    IBinder localIBinder2 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localIBinder1 = zza.zzq(paramParcel, k);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localPendingIntent = (PendingIntent)zza.zza(paramParcel, k, PendingIntent.CREATOR);
        break;
      case 3: 
        localIBinder2 = zza.zzq(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new SensorUnregistrationRequest(i, localIBinder1, localPendingIntent, localIBinder2);
  }
  
  public SensorUnregistrationRequest[] zzfC(int paramInt)
  {
    return new SensorUnregistrationRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.zzw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */