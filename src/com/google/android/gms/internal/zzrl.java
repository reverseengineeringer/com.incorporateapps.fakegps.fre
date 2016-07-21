package com.google.android.gms.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.zzg;

public final class zzrl
{
  public static final Api API = new Api("SignIn.API", zzUJ, zzUI);
  public static final Api.zzc zzUI = new Api.zzc();
  public static final Api.zza zzUJ;
  public static final Scope zzWW;
  public static final Scope zzWX;
  public static final Api zzaoG = new Api("SignIn.INTERNAL_API", zzbgS, zzavN);
  public static final Api.zzc zzavN = new Api.zzc();
  static final Api.zza zzbgS;
  public static final zzrm zzbgT = new zzg();
  
  static
  {
    zzUJ = new zzrl.1();
    zzbgS = new zzrl.2();
    zzWW = new Scope("profile");
    zzWX = new Scope("email");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */