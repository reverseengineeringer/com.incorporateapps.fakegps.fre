package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj
  implements Parcelable.Creator
{
  static void zza(SignInResponse paramSignInResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, paramSignInResponse.zzqY(), paramInt, false);
    zzb.zza(paramParcel, 3, paramSignInResponse.zzFP(), paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SignInResponse zzgV(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    ConnectionResult localConnectionResult = null;
    int i = 0;
    ResolveAccountResponse localResolveAccountResponse = null;
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
        localConnectionResult = (ConnectionResult)zza.zza(paramParcel, k, ConnectionResult.CREATOR);
        break;
      case 3: 
        localResolveAccountResponse = (ResolveAccountResponse)zza.zza(paramParcel, k, ResolveAccountResponse.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new SignInResponse(i, localConnectionResult, localResolveAccountResponse);
  }
  
  public SignInResponse[] zzkd(int paramInt)
  {
    return new SignInResponse[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.signin.internal.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */