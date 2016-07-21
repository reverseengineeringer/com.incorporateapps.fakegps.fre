package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzac
  implements Parcelable.Creator
{
  static void zza(SessionUnregistrationRequest paramSessionUnregistrationRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramSessionUnregistrationRequest.getIntent(), paramInt, false);
    zzb.zzc(paramParcel, 1000, paramSessionUnregistrationRequest.getVersionCode());
    zzb.zza(paramParcel, 2, paramSessionUnregistrationRequest.getCallbackBinder(), false);
    zzb.zzI(paramParcel, i);
  }
  
  public SessionUnregistrationRequest zzdH(Parcel paramParcel)
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
    return new SessionUnregistrationRequest(i, localPendingIntent, localIBinder);
  }
  
  public SessionUnregistrationRequest[] zzfI(int paramInt)
  {
    return new SessionUnregistrationRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.zzac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */