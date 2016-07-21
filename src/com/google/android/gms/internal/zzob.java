package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;

public class zzob
  extends zzny
{
  public zzob(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 57, paramConnectionCallbacks, paramOnConnectionFailedListener, paramzzf);
  }
  
  protected zzom zzbw(IBinder paramIBinder)
  {
    return zzom.zza.zzbH(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.fitness.HistoryApi";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzob
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */