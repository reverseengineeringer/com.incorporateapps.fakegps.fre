package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf
  implements Parcelable.Creator
{
  static void zza(RecordConsentRequest paramRecordConsentRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, mVersionCode);
    zzb.zza(paramParcel, 2, paramRecordConsentRequest.getAccount(), paramInt, false);
    zzb.zza(paramParcel, 3, paramRecordConsentRequest.zzFM(), paramInt, false);
    zzb.zza(paramParcel, 4, paramRecordConsentRequest.zzmR(), false);
    zzb.zzI(paramParcel, i);
  }
  
  public RecordConsentRequest zzgT(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    Scope[] arrayOfScope = null;
    Account localAccount = null;
    int i = 0;
    String str = null;
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
        localAccount = (Account)zza.zza(paramParcel, k, Account.CREATOR);
        break;
      case 3: 
        arrayOfScope = (Scope[])zza.zzb(paramParcel, k, Scope.CREATOR);
        break;
      case 4: 
        str = zza.zzp(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new RecordConsentRequest(i, localAccount, arrayOfScope, str);
  }
  
  public RecordConsentRequest[] zzkb(int paramInt)
  {
    return new RecordConsentRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.signin.internal.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */