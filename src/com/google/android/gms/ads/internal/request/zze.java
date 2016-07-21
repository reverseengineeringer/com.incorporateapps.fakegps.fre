package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;

public class zze
  extends com.google.android.gms.common.internal.zzj
{
  final int zzHr;
  
  public zze(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, int paramInt)
  {
    super(paramContext, paramLooper, 8, zzf.zzat(paramContext), paramConnectionCallbacks, paramOnConnectionFailedListener);
    zzHr = paramInt;
  }
  
  protected zzj zzV(IBinder paramIBinder)
  {
    return zzj.zza.zzX(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.ads.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.ads.internal.request.IAdRequestService";
  }
  
  public zzj zzgw()
  {
    return (zzj)super.zzqJ();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */