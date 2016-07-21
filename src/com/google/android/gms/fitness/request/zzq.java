package com.google.android.gms.fitness.request;

import android.os.IInterface;
import com.google.android.gms.fitness.data.BleDevice;

public abstract interface zzq
  extends IInterface
{
  public abstract void onDeviceFound(BleDevice paramBleDevice);
  
  public abstract void onScanStopped();
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.zzq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */