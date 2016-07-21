package com.google.android.gms.auth.api.signin;

import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.internal.zzx;

public class zzg$zza
{
  private final SignInConfiguration zzXo;
  
  public zzg$zza(String paramString)
  {
    zzx.zzcM(paramString);
    zzXo = new SignInConfiguration(paramString);
  }
  
  public zza zzi(GoogleSignInOptions paramGoogleSignInOptions)
  {
    zzx.zzz(paramGoogleSignInOptions);
    zzXo.zzj(paramGoogleSignInOptions);
    return this;
  }
  
  public zzg zzmY()
  {
    if ((zzXo.zznl() != null) || (zzXo.zznm() != null)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Must support either Facebook, Google or Email sign-in.");
      return new zzg(zzXo, null);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.zzg.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */