package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf
  implements Parcelable.Creator
{
  static void zza(InitializeBuyFlowRequest paramInitializeBuyFlowRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramInitializeBuyFlowRequest.getVersionCode());
    zzb.zza(paramParcel, 2, zzbpV, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public InitializeBuyFlowRequest zzhK(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    int i = 0;
    byte[][] arrayOfByte = null;
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
        arrayOfByte = zza.zzt(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new InitializeBuyFlowRequest(i, arrayOfByte);
  }
  
  public InitializeBuyFlowRequest[] zzli(int paramInt)
  {
    return new InitializeBuyFlowRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.firstparty.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */