package com.google.android.gms.vision;

import android.hardware.Camera.ShutterCallback;

class CameraSource$zzd
  implements Camera.ShutterCallback
{
  private CameraSource.ShutterCallback zzbmV;
  
  private CameraSource$zzd(CameraSource paramCameraSource) {}
  
  public void onShutter()
  {
    if (zzbmV != null) {
      zzbmV.onShutter();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.CameraSource.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */