package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzz
  implements Parcelable.Creator
{
  static void zza(SessionRegistrationRequest paramSessionRegistrationRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramSessionRegistrationRequest.getIntent(), paramInt, false);
    zzb.zzc(paramParcel, 1000, paramSessionRegistrationRequest.getVersionCode());
    zzb.zza(paramParcel, 2, paramSessionRegistrationRequest.getCallbackBinder(), false);
    zzb.zzc(paramParcel, 4, paramSessionRegistrationRequest.zzvf());
    zzb.zzI(paramParcel, i);
  }
  
  public SessionRegistrationRequest zzdE(Parcel paramParcel)
  {
    int k = zza.zzau(paramParcel);
    IBinder localIBinder = null;
    PendingIntent localPendingIntent = null;
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
        localPendingIntent = (PendingIntent)zza.zza(paramParcel, m, PendingIntent.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localIBinder = zza.zzq(paramParcel, m);
        break;
      case 4: 
        j = zza.zzg(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new SessionRegistrationRequest(i, localPendingIntent, localIBinder, j);
  }
  
  public SessionRegistrationRequest[] zzfF(int paramInt)
  {
    return new SessionRegistrationRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.zzz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */