package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzd;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import java.util.Collections;
import java.util.List;

final class Auth$6
  extends Api.zza
{
  public final zzd zza(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleSignInOptions paramGoogleSignInOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return new zzd(paramContext, paramLooper, paramzzf, paramGoogleSignInOptions, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  public final List zza(GoogleSignInOptions paramGoogleSignInOptions)
  {
    if (paramGoogleSignInOptions == null) {
      return Collections.emptyList();
    }
    return paramGoogleSignInOptions.zzmN();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.Auth.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */