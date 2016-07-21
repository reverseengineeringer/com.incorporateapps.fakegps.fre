package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ResolveAccountRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzy();
  final int mVersionCode;
  private final Account zzTI;
  private final int zzamq;
  private final GoogleSignInAccount zzamr;
  
  ResolveAccountRequest(int paramInt1, Account paramAccount, int paramInt2, GoogleSignInAccount paramGoogleSignInAccount)
  {
    mVersionCode = paramInt1;
    zzTI = paramAccount;
    zzamq = paramInt2;
    zzamr = paramGoogleSignInAccount;
  }
  
  public ResolveAccountRequest(Account paramAccount, int paramInt, GoogleSignInAccount paramGoogleSignInAccount)
  {
    this(2, paramAccount, paramInt, paramGoogleSignInAccount);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Account getAccount()
  {
    return zzTI;
  }
  
  public int getSessionId()
  {
    return zzamq;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzy.zza(this, paramParcel, paramInt);
  }
  
  public GoogleSignInAccount zzqW()
  {
    return zzamr;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.ResolveAccountRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */