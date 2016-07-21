package com.google.android.gms.vision.face;

import android.content.Context;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;
import com.google.android.gms.vision.face.internal.client.zzg;

public class FaceDetector$Builder
{
  private final Context mContext;
  private int zzaoy = 0;
  private int zzbnJ = 0;
  private boolean zzbnK = false;
  private int zzbnL = 0;
  private boolean zzbnM = true;
  private float zzbnN = -1.0F;
  
  public FaceDetector$Builder(Context paramContext)
  {
    mContext = paramContext;
  }
  
  public FaceDetector build()
  {
    FaceSettingsParcel localFaceSettingsParcel = new FaceSettingsParcel();
    mode = zzaoy;
    zzbnV = zzbnJ;
    zzbnW = zzbnL;
    zzbnX = zzbnK;
    zzbnY = zzbnM;
    zzbnZ = zzbnN;
    return new FaceDetector(new zzg(mContext, localFaceSettingsParcel), null);
  }
  
  public Builder setClassificationType(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("Invalid classification type: " + paramInt);
    }
    zzbnL = paramInt;
    return this;
  }
  
  public Builder setLandmarkType(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("Invalid landmark type: " + paramInt);
    }
    zzbnJ = paramInt;
    return this;
  }
  
  public Builder setMinFaceSize(float paramFloat)
  {
    if ((paramFloat < 0.0F) || (paramFloat > 1.0F)) {
      throw new IllegalArgumentException("Invalid proportional face size: " + paramFloat);
    }
    zzbnN = paramFloat;
    return this;
  }
  
  public Builder setMode(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Invalid mode: " + paramInt);
    }
    zzaoy = paramInt;
    return this;
  }
  
  public Builder setProminentFaceOnly(boolean paramBoolean)
  {
    zzbnK = paramBoolean;
    return this;
  }
  
  public Builder setTrackingEnabled(boolean paramBoolean)
  {
    zzbnM = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.face.FaceDetector.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */