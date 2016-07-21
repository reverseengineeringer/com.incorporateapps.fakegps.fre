package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Channel.GetInputStreamResult;

class ChannelImpl$3
  extends zzi
{
  ChannelImpl$3(ChannelImpl paramChannelImpl, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zzu(this, ChannelImpl.zza(zzbsd));
  }
  
  public Channel.GetInputStreamResult zzbt(Status paramStatus)
  {
    return new ChannelImpl.zza(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.ChannelImpl.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */