package com.google.android.gms.vision;

import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;

class CameraSource$zzc
  implements Camera.PictureCallback
{
  private CameraSource.PictureCallback zzbmU;
  
  private CameraSource$zzc(CameraSource paramCameraSource) {}
  
  public void onPictureTaken(byte[] arg1, Camera paramCamera)
  {
    if (zzbmU != null) {
      zzbmU.onPictureTaken(???);
    }
    synchronized (CameraSource.zza(zzbmP))
    {
      if (CameraSource.zzb(zzbmP) != null) {
        CameraSource.zzb(zzbmP).startPreview();
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.CameraSource.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */