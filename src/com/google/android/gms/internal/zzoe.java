package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;

public class zzoe
  extends zzny
{
  public zzoe(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 55, paramConnectionCallbacks, paramOnConnectionFailedListener, paramzzf);
  }
  
  protected zzop zzbz(IBinder paramIBinder)
  {
    return zzop.zza.zzbK(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.fitness.SensorsApi";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzoe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */