package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzx;

public class zzc
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  public final Api zzagT;
  private final int zzagU;
  private zzl zzagV;
  
  public zzc(Api paramApi, int paramInt)
  {
    zzagT = paramApi;
    zzagU = paramInt;
  }
  
  private void zzpi()
  {
    zzx.zzb(zzagV, "Callbacks must be attached to a GoogleApiClient instance before connecting the client.");
  }
  
  public void onConnected(Bundle paramBundle)
  {
    zzpi();
    zzagV.onConnected(paramBundle);
  }
  
  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    zzpi();
    zzagV.zza(paramConnectionResult, zzagT, zzagU);
  }
  
  public void onConnectionSuspended(int paramInt)
  {
    zzpi();
    zzagV.onConnectionSuspended(paramInt);
  }
  
  public void zza(zzl paramzzl)
  {
    zzagV = paramzzl;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */