package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;

public abstract interface zzok
  extends IInterface
{
  public abstract void zza(ClaimBleDeviceRequest paramClaimBleDeviceRequest);
  
  public abstract void zza(ListClaimedBleDevicesRequest paramListClaimedBleDevicesRequest);
  
  public abstract void zza(StartBleScanRequest paramStartBleScanRequest);
  
  public abstract void zza(StopBleScanRequest paramStopBleScanRequest);
  
  public abstract void zza(UnclaimBleDeviceRequest paramUnclaimBleDeviceRequest);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzok
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */