package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzy
  implements Parcelable.Creator
{
  static void zza(ResolveAccountRequest paramResolveAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, paramResolveAccountRequest.getAccount(), paramInt, false);
    zzb.zzc(paramParcel, 3, paramResolveAccountRequest.getSessionId());
    zzb.zza(paramParcel, 4, paramResolveAccountRequest.zzqW(), paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ResolveAccountRequest zzap(Parcel paramParcel)
  {
    int k = zza.zzau(paramParcel);
    int j = 0;
    Account localAccount = null;
    int i = 0;
    GoogleSignInAccount localGoogleSignInAccount = null;
    while (paramParcel.dataPosition() < k)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzca(m))
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        i = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localAccount = (Account)zza.zza(paramParcel, m, Account.CREATOR);
        break;
      case 3: 
        j = zza.zzg(paramParcel, m);
        break;
      case 4: 
        localGoogleSignInAccount = (GoogleSignInAccount)zza.zza(paramParcel, m, GoogleSignInAccount.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new ResolveAccountRequest(i, localAccount, j, localGoogleSignInAccount);
  }
  
  public ResolveAccountRequest[] zzbW(int paramInt)
  {
    return new ResolveAccountRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zzy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */