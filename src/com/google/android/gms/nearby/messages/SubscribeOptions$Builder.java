package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.zzx;

public class SubscribeOptions$Builder
{
  private Strategy zzbbI = Strategy.DEFAULT;
  private MessageFilter zzbbV = MessageFilter.INCLUDE_ALL_MY_TYPES;
  private SubscribeCallback zzbbW;
  
  public SubscribeOptions build()
  {
    return new SubscribeOptions(zzbbI, zzbbV, zzbbW, null);
  }
  
  public Builder setCallback(SubscribeCallback paramSubscribeCallback)
  {
    zzbbW = ((SubscribeCallback)zzx.zzz(paramSubscribeCallback));
    return this;
  }
  
  public Builder setFilter(MessageFilter paramMessageFilter)
  {
    zzbbV = paramMessageFilter;
    return this;
  }
  
  public Builder setStrategy(Strategy paramStrategy)
  {
    zzbbI = paramStrategy;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.SubscribeOptions.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */