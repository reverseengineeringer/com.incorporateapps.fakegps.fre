package com.google.android.gms.vision;

import android.util.SparseArray;

public class Detector$Detections
{
  private SparseArray zzbna;
  private Frame.Metadata zzbnb;
  private boolean zzbnc;
  
  public Detector$Detections(SparseArray paramSparseArray, Frame.Metadata paramMetadata, boolean paramBoolean)
  {
    zzbna = paramSparseArray;
    zzbnb = paramMetadata;
    zzbnc = paramBoolean;
  }
  
  public boolean detectorIsOperational()
  {
    return zzbnc;
  }
  
  public SparseArray getDetectedItems()
  {
    return zzbna;
  }
  
  public Frame.Metadata getFrameMetadata()
  {
    return zzbnb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.Detector.Detections
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */