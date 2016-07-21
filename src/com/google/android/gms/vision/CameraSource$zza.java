package com.google.android.gms.vision;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;

class CameraSource$zza
  implements Camera.PreviewCallback
{
  private CameraSource$zza(CameraSource paramCameraSource) {}
  
  public void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    CameraSource.zzc(zzbmP).zza(paramArrayOfByte, paramCamera);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.CameraSource.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */