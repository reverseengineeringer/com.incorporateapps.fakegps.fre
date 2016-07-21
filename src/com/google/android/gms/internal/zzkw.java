package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;

public class zzkw
  extends zzj
{
  public zzkw(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 92, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  protected zzkx zzat(IBinder paramIBinder)
  {
    return zzkx.zza.zzau(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.auth.api.consent.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.auth.api.consent.internal.IConsentService";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */