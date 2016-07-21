package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class GoogleSignInResult
  implements Result
{
  private Status zzUX;
  private GoogleSignInAccount zzXg;
  
  public GoogleSignInResult(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus)
  {
    zzXg = paramGoogleSignInAccount;
    zzUX = paramStatus;
  }
  
  public GoogleSignInAccount getSignInAccount()
  {
    return zzXg;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  public boolean isSuccess()
  {
    return zzUX.isSuccess();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.GoogleSignInResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */