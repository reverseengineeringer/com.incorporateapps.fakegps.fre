package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(GetInstrumentsRequest paramGetInstrumentsRequest, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramGetInstrumentsRequest.getVersionCode());
    zzb.zza(paramParcel, 2, zzbpS, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public GetInstrumentsRequest zzhI(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    int i = 0;
    int[] arrayOfInt = null;
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
        arrayOfInt = zza.zzv(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new GetInstrumentsRequest(i, arrayOfInt);
  }
  
  public GetInstrumentsRequest[] zzlg(int paramInt)
  {
    return new GetInstrumentsRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.firstparty.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */