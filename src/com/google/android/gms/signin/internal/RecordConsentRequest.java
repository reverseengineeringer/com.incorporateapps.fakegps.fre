package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class RecordConsentRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzf();
  final int mVersionCode;
  private final Account zzTI;
  private final String zzXd;
  private final Scope[] zzbhh;
  
  RecordConsentRequest(int paramInt, Account paramAccount, Scope[] paramArrayOfScope, String paramString)
  {
    mVersionCode = paramInt;
    zzTI = paramAccount;
    zzbhh = paramArrayOfScope;
    zzXd = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Account getAccount()
  {
    return zzTI;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public Scope[] zzFM()
  {
    return zzbhh;
  }
  
  public String zzmR()
  {
    return zzXd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.signin.internal.RecordConsentRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */