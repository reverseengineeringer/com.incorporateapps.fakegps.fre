package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

public abstract interface zzg
  extends IInterface
{
  public abstract void zza(GoogleSignInAccount paramGoogleSignInAccount, Status paramStatus);
  
  public abstract void zza(Status paramStatus, SignInAccount paramSignInAccount);
  
  public abstract void zza(Status paramStatus, String paramString1, String paramString2, long paramLong);
  
  public abstract void zzk(Status paramStatus);
  
  public abstract void zzl(Status paramStatus);
  
  public abstract void zzm(Status paramStatus);
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */