package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class GoogleSignInOptions$Builder
{
  private Account zzTI;
  private boolean zzXa;
  private boolean zzXb;
  private boolean zzXc;
  private String zzXd;
  private String zzXe;
  private Set zzXf = new HashSet();
  
  public GoogleSignInOptions$Builder() {}
  
  public GoogleSignInOptions$Builder(GoogleSignInOptions paramGoogleSignInOptions)
  {
    zzx.zzz(paramGoogleSignInOptions);
    zzXf = new HashSet(GoogleSignInOptions.zzb(paramGoogleSignInOptions));
    zzXb = GoogleSignInOptions.zzc(paramGoogleSignInOptions);
    zzXc = GoogleSignInOptions.zzd(paramGoogleSignInOptions);
    zzXa = GoogleSignInOptions.zze(paramGoogleSignInOptions);
    zzXd = GoogleSignInOptions.zzf(paramGoogleSignInOptions);
    zzTI = GoogleSignInOptions.zzg(paramGoogleSignInOptions);
    zzXe = GoogleSignInOptions.zzh(paramGoogleSignInOptions);
  }
  
  private String zzbK(String paramString)
  {
    zzx.zzcM(paramString);
    if ((zzXd == null) || (zzXd.equals(paramString))) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "two different server client ids provided");
      return paramString;
    }
  }
  
  public final GoogleSignInOptions build()
  {
    if ((zzXa) && ((zzTI == null) || (!zzXf.isEmpty()))) {
      requestId();
    }
    return new GoogleSignInOptions(zzXf, zzTI, zzXa, zzXb, zzXc, zzXd, zzXe, null);
  }
  
  public final Builder requestEmail()
  {
    zzXf.add(GoogleSignInOptions.zzWX);
    return this;
  }
  
  public final Builder requestId()
  {
    zzXf.add(GoogleSignInOptions.zzWY);
    return this;
  }
  
  public final Builder requestIdToken(String paramString)
  {
    zzXa = true;
    zzXd = zzbK(paramString);
    return this;
  }
  
  public final Builder requestProfile()
  {
    zzXf.add(GoogleSignInOptions.zzWW);
    return this;
  }
  
  public final Builder requestScopes(Scope paramScope, Scope... paramVarArgs)
  {
    zzXf.add(paramScope);
    zzXf.addAll(Arrays.asList(paramVarArgs));
    return this;
  }
  
  public final Builder requestServerAuthCode(String paramString)
  {
    return requestServerAuthCode(paramString, false);
  }
  
  public final Builder requestServerAuthCode(String paramString, boolean paramBoolean)
  {
    zzXb = true;
    zzXd = zzbK(paramString);
    zzXc = paramBoolean;
    return this;
  }
  
  public final Builder setAccountName(String paramString)
  {
    zzTI = new Account(zzx.zzcM(paramString), "com.google");
    return this;
  }
  
  public final Builder setHostedDomain(String paramString)
  {
    zzXe = zzx.zzcM(paramString);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */