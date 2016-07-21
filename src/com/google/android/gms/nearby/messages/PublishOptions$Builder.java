package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.zzx;

public class PublishOptions$Builder
{
  private Strategy zzbbI = Strategy.DEFAULT;
  private PublishCallback zzbbJ;
  
  public PublishOptions build()
  {
    return new PublishOptions(zzbbI, zzbbJ, null);
  }
  
  public Builder setCallback(PublishCallback paramPublishCallback)
  {
    zzbbJ = ((PublishCallback)zzx.zzz(paramPublishCallback));
    return this;
  }
  
  public Builder setStrategy(Strategy paramStrategy)
  {
    zzbbI = ((Strategy)zzx.zzz(paramStrategy));
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.PublishOptions.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */