package com.google.android.gms.vision;

import android.util.Log;
import android.util.SparseArray;

public abstract class FocusingProcessor
  implements Detector.Processor
{
  private Detector zzbmN;
  private Tracker zzbnd;
  private int zzbne = 3;
  private boolean zzbnf = false;
  private int zzbng;
  private int zzbnh = 0;
  
  public FocusingProcessor(Detector paramDetector, Tracker paramTracker)
  {
    zzbmN = paramDetector;
    zzbnd = paramTracker;
  }
  
  public void receiveDetections(Detector.Detections paramDetections)
  {
    Object localObject1 = paramDetections.getDetectedItems();
    if (((SparseArray)localObject1).size() == 0)
    {
      if (zzbnh == zzbne)
      {
        zzbnd.onDone();
        zzbnf = false;
      }
      for (;;)
      {
        zzbnh += 1;
        return;
        zzbnd.onMissing(paramDetections);
      }
    }
    zzbnh = 0;
    if (zzbnf)
    {
      Object localObject2 = ((SparseArray)localObject1).get(zzbng);
      if (localObject2 != null)
      {
        zzbnd.onUpdate(paramDetections, localObject2);
        return;
      }
      zzbnd.onDone();
      zzbnf = false;
    }
    int i = selectFocus(paramDetections);
    localObject1 = ((SparseArray)localObject1).get(i);
    if (localObject1 == null)
    {
      Log.w("FocusingProcessor", "Invalid focus selected: " + i);
      return;
    }
    zzbnf = true;
    zzbng = i;
    zzbmN.setFocus(zzbng);
    zzbnd.onNewItem(zzbng, localObject1);
    zzbnd.onUpdate(paramDetections, localObject1);
  }
  
  public void release()
  {
    zzbnd.onDone();
  }
  
  public abstract int selectFocus(Detector.Detections paramDetections);
  
  protected void zzkq(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("Invalid max gap: " + paramInt);
    }
    zzbne = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.FocusingProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */