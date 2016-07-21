package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(GetInstrumentsResponse paramGetInstrumentsResponse, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramGetInstrumentsResponse.getVersionCode());
    zzb.zza(paramParcel, 2, zzbpT, false);
    zzb.zza(paramParcel, 3, zzbpU, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public GetInstrumentsResponse zzhJ(Parcel paramParcel)
  {
    byte[][] arrayOfByte = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    String[] arrayOfString = null;
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
        arrayOfString = zza.zzB(paramParcel, k);
        break;
      case 3: 
        arrayOfByte = zza.zzt(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new GetInstrumentsResponse(i, arrayOfString, arrayOfByte);
  }
  
  public GetInstrumentsResponse[] zzlh(int paramInt)
  {
    return new GetInstrumentsResponse[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.firstparty.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */