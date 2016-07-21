package com.google.android.gms.nearby.messages;

public final class SubscribeOptions
{
  public static final SubscribeOptions DEFAULT = new SubscribeOptions.Builder().build();
  private final Strategy zzbbI;
  private final MessageFilter zzbbV;
  private final SubscribeCallback zzbbW;
  
  private SubscribeOptions(Strategy paramStrategy, MessageFilter paramMessageFilter, SubscribeCallback paramSubscribeCallback)
  {
    zzbbI = paramStrategy;
    zzbbV = paramMessageFilter;
    zzbbW = paramSubscribeCallback;
  }
  
  public final SubscribeCallback getCallback()
  {
    return zzbbW;
  }
  
  public final MessageFilter getFilter()
  {
    return zzbbV;
  }
  
  public final Strategy getStrategy()
  {
    return zzbbI;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.SubscribeOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */