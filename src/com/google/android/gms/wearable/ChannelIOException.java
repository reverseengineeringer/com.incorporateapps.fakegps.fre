package com.google.android.gms.wearable;

import java.io.IOException;

public class ChannelIOException
  extends IOException
{
  private final int zzbqW;
  private final int zzbqX;
  
  public ChannelIOException(String paramString, int paramInt1, int paramInt2)
  {
    super(paramString);
    zzbqW = paramInt1;
    zzbqX = paramInt2;
  }
  
  public int getAppSpecificErrorCode()
  {
    return zzbqX;
  }
  
  public int getCloseReason()
  {
    return zzbqW;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.ChannelIOException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */