package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.zzg;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;

public class zzo
  extends zzj
{
  private final zzg zzXK;
  
  public zzo(Context paramContext, Looper paramLooper, zzf paramzzf, zzg paramzzg, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 87, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    zzXK = ((zzg)zzx.zzz(paramzzg));
  }
  
  protected zzh zzaB(IBinder paramIBinder)
  {
    return zzh.zza.zzaD(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.auth.api.signin.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.auth.api.signin.internal.ISignInService";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */