package com.google.android.gms.vision;

import android.util.SparseArray;

public abstract class Detector
{
  private Object zzbmY = new Object();
  private Detector.Processor zzbmZ;
  
  public abstract SparseArray detect(Frame paramFrame);
  
  public boolean isOperational()
  {
    return true;
  }
  
  public void receiveFrame(Frame paramFrame)
  {
    synchronized (zzbmY)
    {
      if (zzbmZ == null) {
        throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
      }
    }
    Frame.Metadata localMetadata = new Frame.Metadata(paramFrame.getMetadata());
    localMetadata.zzIf();
    paramFrame = new Detector.Detections(detect(paramFrame), localMetadata, isOperational());
    zzbmZ.receiveDetections(paramFrame);
  }
  
  public void release()
  {
    synchronized (zzbmY)
    {
      if (zzbmZ != null)
      {
        zzbmZ.release();
        zzbmZ = null;
      }
      return;
    }
  }
  
  public boolean setFocus(int paramInt)
  {
    return true;
  }
  
  public void setProcessor(Detector.Processor paramProcessor)
  {
    zzbmZ = paramProcessor;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.Detector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */