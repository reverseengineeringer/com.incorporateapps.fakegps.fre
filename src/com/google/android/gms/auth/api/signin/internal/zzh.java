package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;

public abstract interface zzh
  extends IInterface
{
  public abstract void zza(zzg paramzzg, GoogleSignInOptions paramGoogleSignInOptions);
  
  public abstract void zza(zzg paramzzg, SignInConfiguration paramSignInConfiguration);
  
  public abstract void zza(zzg paramzzg, SignInConfiguration paramSignInConfiguration, SignInAccount paramSignInAccount, String paramString);
  
  public abstract void zzb(zzg paramzzg, GoogleSignInOptions paramGoogleSignInOptions);
  
  public abstract void zzb(zzg paramzzg, SignInConfiguration paramSignInConfiguration);
  
  public abstract void zzc(zzg paramzzg, GoogleSignInOptions paramGoogleSignInOptions);
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */