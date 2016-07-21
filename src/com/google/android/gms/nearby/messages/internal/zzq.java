package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.Strategy;

public class zzq
  implements Parcelable.Creator
{
  static void zza(PublishRequest paramPublishRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzbcT, paramInt, false);
    zzb.zza(paramParcel, 3, zzbcU, paramInt, false);
    zzb.zza(paramParcel, 4, paramPublishRequest.zzED(), false);
    zzb.zza(paramParcel, 5, zzbbF, false);
    zzb.zza(paramParcel, 6, zzbco, false);
    zzb.zza(paramParcel, 7, zzbbG);
    zzb.zza(paramParcel, 8, paramPublishRequest.zzEF(), false);
    zzb.zza(paramParcel, 9, zzbbH);
    zzb.zza(paramParcel, 10, zzbcs, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PublishRequest zzgl(Parcel paramParcel)
  {
    boolean bool1 = false;
    ClientAppContext localClientAppContext = null;
    int j = zza.zzau(paramParcel);
    IBinder localIBinder1 = null;
    boolean bool2 = false;
    String str1 = null;
    String str2 = null;
    IBinder localIBinder2 = null;
    Strategy localStrategy = null;
    MessageWrapper localMessageWrapper = null;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzca(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localMessageWrapper = (MessageWrapper)zza.zza(paramParcel, k, MessageWrapper.CREATOR);
        break;
      case 3: 
        localStrategy = (Strategy)zza.zza(paramParcel, k, Strategy.CREATOR);
        break;
      case 4: 
        localIBinder2 = zza.zzq(paramParcel, k);
        break;
      case 5: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 8: 
        localIBinder1 = zza.zzq(paramParcel, k);
        break;
      case 9: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 10: 
        localClientAppContext = (ClientAppContext)zza.zza(paramParcel, k, ClientAppContext.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new PublishRequest(i, localMessageWrapper, localStrategy, localIBinder2, str2, str1, bool2, localIBinder1, bool1, localClientAppContext);
  }
  
  public PublishRequest[] zzjr(int paramInt)
  {
    return new PublishRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */