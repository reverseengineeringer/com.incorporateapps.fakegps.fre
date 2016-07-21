package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;

final class Cast$1
  extends Api.zza
{
  public final zze zza(Context paramContext, Looper paramLooper, zzf paramzzf, Cast.CastOptions paramCastOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzx.zzb(paramCastOptions, "Setting the API options is required.");
    return new zze(paramContext, paramLooper, paramzzf, zzZL, Cast.CastOptions.zza(paramCastOptions), zzZM, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.Cast.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */