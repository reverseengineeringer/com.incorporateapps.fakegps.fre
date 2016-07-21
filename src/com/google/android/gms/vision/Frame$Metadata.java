package com.google.android.gms.vision;

public class Frame$Metadata
{
  private int mId;
  private int zzDE;
  private long zzaJi;
  private int zzoG;
  private int zzoH;
  
  public Frame$Metadata() {}
  
  public Frame$Metadata(Metadata paramMetadata)
  {
    zzoG = paramMetadata.getWidth();
    zzoH = paramMetadata.getHeight();
    mId = paramMetadata.getId();
    zzaJi = paramMetadata.getTimestampMillis();
    zzDE = paramMetadata.getRotation();
  }
  
  public int getHeight()
  {
    return zzoH;
  }
  
  public int getId()
  {
    return mId;
  }
  
  public int getRotation()
  {
    return zzDE;
  }
  
  public long getTimestampMillis()
  {
    return zzaJi;
  }
  
  public int getWidth()
  {
    return zzoG;
  }
  
  public void zzIf()
  {
    if (zzDE % 2 != 0)
    {
      int i = zzoG;
      zzoG = zzoH;
      zzoH = i;
    }
    zzDE = 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.Frame.Metadata
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */