package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Session;

public class zzaa
  implements Parcelable.Creator
{
  static void zza(SessionStartRequest paramSessionStartRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramSessionStartRequest.getSession(), paramInt, false);
    zzb.zzc(paramParcel, 1000, paramSessionStartRequest.getVersionCode());
    zzb.zza(paramParcel, 2, paramSessionStartRequest.getCallbackBinder(), false);
    zzb.zzI(paramParcel, i);
  }
  
  public SessionStartRequest zzdF(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    Session localSession = null;
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
        localSession = (Session)zza.zza(paramParcel, k, Session.CREATOR);
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
    return new SessionStartRequest(i, localSession, localIBinder);
  }
  
  public SessionStartRequest[] zzfG(int paramInt)
  {
    return new SessionStartRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.zzaa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */