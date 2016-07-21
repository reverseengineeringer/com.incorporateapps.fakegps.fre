package com.google.android.gms.vision;

import android.content.Context;

public class CameraSource$Builder
{
  private final Detector zzbmN;
  private CameraSource zzbmO = new CameraSource(null);
  
  public CameraSource$Builder(Context paramContext, Detector paramDetector)
  {
    if (paramContext == null) {
      throw new IllegalArgumentException("No context supplied.");
    }
    if (paramDetector == null) {
      throw new IllegalArgumentException("No detector supplied.");
    }
    zzbmN = paramDetector;
    CameraSource.zza(zzbmO, paramContext);
  }
  
  public CameraSource build()
  {
    CameraSource localCameraSource1 = zzbmO;
    CameraSource localCameraSource2 = zzbmO;
    localCameraSource2.getClass();
    CameraSource.zza(localCameraSource1, new CameraSource.zzb(localCameraSource2, zzbmN));
    return zzbmO;
  }
  
  public Builder setAutoFocusEnabled(boolean paramBoolean)
  {
    CameraSource.zza(zzbmO, paramBoolean);
    return this;
  }
  
  public Builder setFacing(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("Invalid camera: " + paramInt);
    }
    CameraSource.zzc(zzbmO, paramInt);
    return this;
  }
  
  public Builder setRequestedFps(float paramFloat)
  {
    if (paramFloat <= 0.0F) {
      throw new IllegalArgumentException("Invalid fps: " + paramFloat);
    }
    CameraSource.zza(zzbmO, paramFloat);
    return this;
  }
  
  public Builder setRequestedPreviewSize(int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= 0) || (paramInt1 > 1000000) || (paramInt2 <= 0) || (paramInt2 > 1000000)) {
      throw new IllegalArgumentException("Invalid preview size: " + paramInt1 + "x" + paramInt2);
    }
    CameraSource.zza(zzbmO, paramInt1);
    CameraSource.zzb(zzbmO, paramInt2);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.CameraSource.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */