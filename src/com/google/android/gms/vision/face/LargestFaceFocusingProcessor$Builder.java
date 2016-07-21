package com.google.android.gms.vision.face;

import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Tracker;

public class LargestFaceFocusingProcessor$Builder
{
  private LargestFaceFocusingProcessor zzbnO;
  
  public LargestFaceFocusingProcessor$Builder(Detector paramDetector, Tracker paramTracker)
  {
    zzbnO = new LargestFaceFocusingProcessor(paramDetector, paramTracker);
  }
  
  public LargestFaceFocusingProcessor build()
  {
    return zzbnO;
  }
  
  public Builder setMaxGapFrames(int paramInt)
  {
    LargestFaceFocusingProcessor.zza(zzbnO, paramInt);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.face.LargestFaceFocusingProcessor.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */