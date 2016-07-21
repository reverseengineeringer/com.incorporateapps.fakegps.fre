package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.BleDevice;

public class zza
  extends zzq.zza
{
  private final BleScanCallback zzaAy;
  
  private zza(BleScanCallback paramBleScanCallback)
  {
    zzaAy = ((BleScanCallback)zzx.zzz(paramBleScanCallback));
  }
  
  public void onDeviceFound(BleDevice paramBleDevice)
  {
    zzaAy.onDeviceFound(paramBleDevice);
  }
  
  public void onScanStopped()
  {
    zzaAy.onScanStopped();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */