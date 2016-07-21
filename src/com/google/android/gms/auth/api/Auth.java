package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.consent.zza;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.internal.zzd;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.internal.zzc;
import com.google.android.gms.auth.api.signin.internal.zzn;
import com.google.android.gms.auth.api.signin.zzf;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.internal.zzkq;
import com.google.android.gms.internal.zzkr;
import com.google.android.gms.internal.zzkv;
import com.google.android.gms.internal.zzld;

public final class Auth
{
  public static final Api CREDENTIALS_API;
  public static final CredentialsApi CredentialsApi;
  public static final Api GOOGLE_SIGN_IN_API;
  public static final GoogleSignInApi GoogleSignInApi = new zzc();
  public static final Api PROXY_API;
  public static final ProxyApi ProxyApi;
  private static final Api.zza zzVA;
  private static final Api.zza zzVB;
  private static final Api.zza zzVC;
  private static final Api.zza zzVD;
  private static final Api.zza zzVE;
  public static final Api zzVF;
  public static final Api zzVG;
  public static final Api zzVH;
  public static final zzkq zzVI;
  public static final zzf zzVJ;
  public static final zza zzVK = new zzkv();
  public static final Api.zzc zzVt = new Api.zzc();
  public static final Api.zzc zzVu = new Api.zzc();
  public static final Api.zzc zzVv = new Api.zzc();
  public static final Api.zzc zzVw = new Api.zzc();
  public static final Api.zzc zzVx = new Api.zzc();
  public static final Api.zzc zzVy = new Api.zzc();
  private static final Api.zza zzVz = new Auth.1();
  
  static
  {
    zzVA = new Auth.2();
    zzVB = new Auth.3();
    zzVC = new Auth.4();
    zzVD = new Auth.5();
    zzVE = new Auth.6();
    PROXY_API = new Api("Auth.PROXY_API", zzVz, zzVt);
    CREDENTIALS_API = new Api("Auth.CREDENTIALS_API", zzVA, zzVu);
    zzVF = new Api("Auth.SIGN_IN_API", zzVD, zzVw);
    GOOGLE_SIGN_IN_API = new Api("Auth.GOOGLE_SIGN_IN_API", zzVE, zzVx);
    zzVG = new Api("Auth.ACCOUNT_STATUS_API", zzVB, zzVv);
    zzVH = new Api("Auth.CONSENT_API", zzVC, zzVy);
    ProxyApi = new zzld();
    CredentialsApi = new zzd();
    zzVI = new zzkr();
    zzVJ = new zzn();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.Auth
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */