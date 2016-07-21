package com.google.android.gms.nearby.messages.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.nearby.messages.MessagesOptions;

final class zzn$1
  extends Api.zza
{
  public final int getPriority()
  {
    return Integer.MAX_VALUE;
  }
  
  public final zzm zza(Context paramContext, Looper paramLooper, zzf paramzzf, MessagesOptions paramMessagesOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return new zzm(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramzzf, paramMessagesOptions);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzn.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */