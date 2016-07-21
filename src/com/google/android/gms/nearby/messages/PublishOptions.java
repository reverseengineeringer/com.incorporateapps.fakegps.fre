package com.google.android.gms.nearby.messages;

public final class PublishOptions
{
  public static final PublishOptions DEFAULT = new PublishOptions.Builder().build();
  private final Strategy zzbbI;
  private final PublishCallback zzbbJ;
  
  private PublishOptions(Strategy paramStrategy, PublishCallback paramPublishCallback)
  {
    zzbbI = paramStrategy;
    zzbbJ = paramPublishCallback;
  }
  
  public final PublishCallback getCallback()
  {
    return zzbbJ;
  }
  
  public final Strategy getStrategy()
  {
    return zzbbI;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.PublishOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */