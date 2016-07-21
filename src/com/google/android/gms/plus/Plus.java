package com.google.android.gms.plus;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqv;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqx;
import com.google.android.gms.internal.zzqy;
import com.google.android.gms.internal.zzqz;
import com.google.android.gms.plus.internal.zze;

public final class Plus
{
  public static final Api API;
  public static final Account AccountApi = new zzqv();
  public static final Moments MomentsApi;
  public static final People PeopleApi;
  public static final Scope SCOPE_PLUS_LOGIN;
  public static final Scope SCOPE_PLUS_PROFILE;
  public static final Api.zzc zzUI = new Api.zzc();
  static final Api.zza zzUJ = new Plus.1();
  public static final zzb zzbdW = new zzqx();
  public static final zza zzbdX = new zzqw();
  
  static
  {
    API = new Api("Plus.API", zzUJ, zzUI);
    SCOPE_PLUS_LOGIN = new Scope("https://www.googleapis.com/auth/plus.login");
    SCOPE_PLUS_PROFILE = new Scope("https://www.googleapis.com/auth/plus.me");
    MomentsApi = new zzqy();
    PeopleApi = new zzqz();
  }
  
  public static zze zzf(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    if (paramGoogleApiClient != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "GoogleApiClient parameter is required.");
      zzx.zza(paramGoogleApiClient.isConnected(), "GoogleApiClient must be connected.");
      zzx.zza(paramGoogleApiClient.zza(API), "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
      bool = paramGoogleApiClient.hasConnectedApi(API);
      if ((!paramBoolean) || (bool)) {
        break;
      }
      throw new IllegalStateException("GoogleApiClient has an optional Plus.API and is not connected to Plus. Use GoogleApiClient.hasConnectedApi(Plus.API) to guard this call.");
    }
    if (bool) {
      return (zze)paramGoogleApiClient.zza(zzUI);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.Plus
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */