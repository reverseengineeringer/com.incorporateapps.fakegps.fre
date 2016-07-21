package com.google.android.gms.vision;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiDetector
  extends Detector
{
  private List zzbno = new ArrayList();
  
  public SparseArray detect(Frame paramFrame)
  {
    SparseArray localSparseArray1 = new SparseArray();
    Iterator localIterator = zzbno.iterator();
    while (localIterator.hasNext())
    {
      SparseArray localSparseArray2 = ((Detector)localIterator.next()).detect(paramFrame);
      int i = 0;
      while (i < localSparseArray2.size())
      {
        int j = localSparseArray2.keyAt(i);
        if (localSparseArray1.get(j) != null) {
          throw new IllegalStateException("Detection ID overlap for id = " + j + ".  This means that one of the detectors is not using global IDs.");
        }
        localSparseArray1.append(j, localSparseArray2.valueAt(i));
        i += 1;
      }
    }
    return localSparseArray1;
  }
  
  public boolean isOperational()
  {
    Iterator localIterator = zzbno.iterator();
    while (localIterator.hasNext()) {
      if (!((Detector)localIterator.next()).isOperational()) {
        return false;
      }
    }
    return true;
  }
  
  public void receiveFrame(Frame paramFrame)
  {
    Iterator localIterator = zzbno.iterator();
    while (localIterator.hasNext()) {
      ((Detector)localIterator.next()).receiveFrame(paramFrame);
    }
  }
  
  public void release()
  {
    Iterator localIterator = zzbno.iterator();
    while (localIterator.hasNext()) {
      ((Detector)localIterator.next()).release();
    }
    zzbno.clear();
  }
  
  public void setProcessor(Detector.Processor paramProcessor)
  {
    throw new UnsupportedOperationException("MultiDetector.setProcessor is not supported.  You should set a processor instance on each underlying detector instead.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.MultiDetector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */