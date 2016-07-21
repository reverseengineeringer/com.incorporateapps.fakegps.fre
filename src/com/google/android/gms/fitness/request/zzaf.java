package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Subscription;

public class zzaf
  implements Parcelable.Creator
{
  static void zza(SubscribeRequest paramSubscribeRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramSubscribeRequest.zzvh(), paramInt, false);
    zzb.zzc(paramParcel, 1000, paramSubscribeRequest.getVersionCode());
    zzb.zza(paramParcel, 2, paramSubscribeRequest.zzvi());
    zzb.zza(paramParcel, 3, paramSubscribeRequest.getCallbackBinder(), false);
    zzb.zzI(paramParcel, i);
  }
  
  public SubscribeRequest zzdK(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    boolean bool = false;
    Subscription localSubscription = null;
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
        localSubscription = (Subscription)zza.zza(paramParcel, k, Subscription.CREATOR);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 3: 
        localIBinder = zza.zzq(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new SubscribeRequest(i, localSubscription, bool, localIBinder);
  }
  
  public SubscribeRequest[] zzfL(int paramInt)
  {
    return new SubscribeRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.zzaf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */