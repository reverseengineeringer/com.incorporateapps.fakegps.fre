package com.google.android.gms.vision;

public class MultiProcessor$Builder
{
  private MultiProcessor zzbns = new MultiProcessor(null);
  
  public MultiProcessor$Builder(MultiProcessor.Factory paramFactory)
  {
    if (paramFactory == null) {
      throw new IllegalArgumentException("No factory supplied.");
    }
    MultiProcessor.zza(zzbns, paramFactory);
  }
  
  public MultiProcessor build()
  {
    return zzbns;
  }
  
  public Builder setMaxGapFrames(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("Invalid max gap: " + paramInt);
    }
    MultiProcessor.zza(zzbns, paramInt);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.MultiProcessor.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */