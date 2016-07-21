package com.google.android.gms.vision.face;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Detector.Detections;
import com.google.android.gms.vision.FocusingProcessor;
import com.google.android.gms.vision.Tracker;

public class LargestFaceFocusingProcessor
  extends FocusingProcessor
{
  public LargestFaceFocusingProcessor(Detector paramDetector, Tracker paramTracker)
  {
    super(paramDetector, paramTracker);
  }
  
  public int selectFocus(Detector.Detections paramDetections)
  {
    paramDetections = paramDetections.getDetectedItems();
    if (paramDetections.size() == 0) {
      throw new IllegalArgumentException("No faces for selectFocus.");
    }
    int j = paramDetections.keyAt(0);
    float f1 = ((Face)paramDetections.valueAt(0)).getWidth();
    int i = 1;
    while (i < paramDetections.size())
    {
      int k = paramDetections.keyAt(i);
      float f3 = ((Face)paramDetections.valueAt(i)).getWidth();
      float f2 = f1;
      if (f3 > f1)
      {
        f2 = f3;
        j = k;
      }
      i += 1;
      f1 = f2;
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.face.LargestFaceFocusingProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */