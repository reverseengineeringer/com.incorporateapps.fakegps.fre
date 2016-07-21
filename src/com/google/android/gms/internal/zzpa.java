package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StartBleScanRequest;

public class zzpa
  implements BleApi
{
  public PendingResult claimBleDevice(GoogleApiClient paramGoogleApiClient, BleDevice paramBleDevice)
  {
    return paramGoogleApiClient.zzb(new zzpa.4(this, paramGoogleApiClient, paramBleDevice));
  }
  
  public PendingResult claimBleDevice(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zzb(new zzpa.3(this, paramGoogleApiClient, paramString));
  }
  
  public PendingResult listClaimedBleDevices(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zza(new zzpa.6(this, paramGoogleApiClient));
  }
  
  public PendingResult startBleScan(GoogleApiClient paramGoogleApiClient, StartBleScanRequest paramStartBleScanRequest)
  {
    return paramGoogleApiClient.zza(new zzpa.1(this, paramGoogleApiClient, paramStartBleScanRequest));
  }
  
  public PendingResult stopBleScan(GoogleApiClient paramGoogleApiClient, BleScanCallback paramBleScanCallback)
  {
    return paramGoogleApiClient.zza(new zzpa.2(this, paramGoogleApiClient, paramBleScanCallback));
  }
  
  public PendingResult unclaimBleDevice(GoogleApiClient paramGoogleApiClient, BleDevice paramBleDevice)
  {
    return unclaimBleDevice(paramGoogleApiClient, paramBleDevice.getAddress());
  }
  
  public PendingResult unclaimBleDevice(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zzb(new zzpa.5(this, paramGoogleApiClient, paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */