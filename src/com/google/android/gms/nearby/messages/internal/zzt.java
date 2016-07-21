package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzt
  implements Parcelable.Creator
{
  static void zza(UnpublishRequest paramUnpublishRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, zzbcT, paramInt, false);
    zzb.zza(paramParcel, 3, paramUnpublishRequest.zzED(), false);
    zzb.zza(paramParcel, 4, zzbbF, false);
    zzb.zza(paramParcel, 5, zzbco, false);
    zzb.zza(paramParcel, 6, zzbbH);
    zzb.zza(paramParcel, 7, zzbcs, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public UnpublishRequest zzgo(Parcel paramParcel)
  {
    boolean bool = false;
    ClientAppContext localClientAppContext = null;
    int j = zza.zzau(paramParcel);
    String str1 = null;
    String str2 = null;
    IBinder localIBinder = null;
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
        localIBinder = zza.zzq(paramParcel, k);
        break;
      case 4: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 7: 
        localClientAppContext = (ClientAppContext)zza.zza(paramParcel, k, ClientAppContext.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new UnpublishRequest(i, localMessageWrapper, localIBinder, str2, str1, bool, localClientAppContext);
  }
  
  public UnpublishRequest[] zzju(int paramInt)
  {
    return new UnpublishRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */