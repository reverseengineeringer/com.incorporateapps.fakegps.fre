package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;

public class zzqr
  extends zzj
{
  public zzqr(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 3, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  public zzqp zzdM(IBinder paramIBinder)
  {
    return zzqp.zza.zzdL(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.panorama.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.panorama.internal.IPanoramaService";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */