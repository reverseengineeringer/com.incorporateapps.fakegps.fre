package com.google.android.gms.vision;

import java.util.List;

public class MultiDetector$Builder
{
  private MultiDetector zzbnp = new MultiDetector(null);
  
  public Builder add(Detector paramDetector)
  {
    MultiDetector.zza(zzbnp).add(paramDetector);
    return this;
  }
  
  public MultiDetector build()
  {
    if (MultiDetector.zza(zzbnp).size() == 0) {
      throw new RuntimeException("No underlying detectors added to MultiDetector.");
    }
    return zzbnp;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.MultiDetector.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */