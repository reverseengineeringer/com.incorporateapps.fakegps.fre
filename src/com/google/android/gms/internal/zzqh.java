package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;

public abstract interface zzqh
  extends IInterface
{
  public abstract String getToken();
  
  public abstract void zza(zzqg paramzzqg);
  
  public abstract void zza(ConnectRequest paramConnectRequest);
  
  public abstract void zza(ContinueConnectRequest paramContinueConnectRequest);
  
  public abstract void zza(DisableTargetRequest paramDisableTargetRequest);
  
  public abstract void zza(DisconnectRequest paramDisconnectRequest);
  
  public abstract void zza(EnableTargetRequest paramEnableTargetRequest);
  
  public abstract void zza(SendDataRequest paramSendDataRequest);
  
  public abstract void zza(StartScanRequest paramStartScanRequest);
  
  public abstract void zza(StopScanRequest paramStopScanRequest);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */