package com.google.android.gms.fitness;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StartBleScanRequest;

public abstract interface BleApi
{
  public abstract PendingResult claimBleDevice(GoogleApiClient paramGoogleApiClient, BleDevice paramBleDevice);
  
  public abstract PendingResult claimBleDevice(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult listClaimedBleDevices(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult startBleScan(GoogleApiClient paramGoogleApiClient, StartBleScanRequest paramStartBleScanRequest);
  
  public abstract PendingResult stopBleScan(GoogleApiClient paramGoogleApiClient, BleScanCallback paramBleScanCallback);
  
  public abstract PendingResult unclaimBleDevice(GoogleApiClient paramGoogleApiClient, BleDevice paramBleDevice);
  
  public abstract PendingResult unclaimBleDevice(GoogleApiClient paramGoogleApiClient, String paramString);
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.BleApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */