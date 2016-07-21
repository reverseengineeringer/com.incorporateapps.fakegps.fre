package com.google.android.gms.vision.face;

import android.graphics.PointF;
import java.util.Arrays;
import java.util.List;

public class Face
{
  public static final float UNCOMPUTED_PROBABILITY = -1.0F;
  private int mId;
  private float zzaTm;
  private float zzaTn;
  private float zzbnA;
  private float zzbnB;
  private List zzbnC;
  private float zzbnD;
  private float zzbnE;
  private float zzbnF;
  private PointF zzbnz;
  
  public Face(int paramInt, PointF paramPointF, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Landmark[] paramArrayOfLandmark, float paramFloat5, float paramFloat6, float paramFloat7)
  {
    mId = paramInt;
    zzbnz = paramPointF;
    zzaTm = paramFloat1;
    zzaTn = paramFloat2;
    zzbnA = paramFloat3;
    zzbnB = paramFloat4;
    zzbnC = Arrays.asList(paramArrayOfLandmark);
    if ((paramFloat5 >= 0.0F) && (paramFloat5 <= 1.0F))
    {
      zzbnD = paramFloat5;
      if ((paramFloat6 < 0.0F) || (paramFloat6 > 1.0F)) {
        break label120;
      }
    }
    label120:
    for (zzbnE = paramFloat6;; zzbnE = -1.0F)
    {
      if ((zzbnF < 0.0F) || (zzbnF > 1.0F)) {
        break label129;
      }
      zzbnF = paramFloat7;
      return;
      zzbnD = -1.0F;
      break;
    }
    label129:
    zzbnF = -1.0F;
  }
  
  public float getEulerY()
  {
    return zzbnA;
  }
  
  public float getEulerZ()
  {
    return zzbnB;
  }
  
  public float getHeight()
  {
    return zzaTn;
  }
  
  public int getId()
  {
    return mId;
  }
  
  public float getIsLeftEyeOpenProbability()
  {
    return zzbnD;
  }
  
  public float getIsRightEyeOpenProbability()
  {
    return zzbnE;
  }
  
  public float getIsSmilingProbability()
  {
    return zzbnF;
  }
  
  public List getLandmarks()
  {
    return zzbnC;
  }
  
  public PointF getPosition()
  {
    return new PointF(zzbnz.x - zzaTm / 2.0F, zzbnz.y - zzaTn / 2.0F);
  }
  
  public float getWidth()
  {
    return zzaTm;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.face.Face
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */