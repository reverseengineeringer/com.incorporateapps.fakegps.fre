package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Channel.GetOutputStreamResult;

class ChannelImpl$4
  extends zzi
{
  ChannelImpl$4(ChannelImpl paramChannelImpl, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    paramzzbp.zzv(this, ChannelImpl.zza(zzbsd));
  }
  
  public Channel.GetOutputStreamResult zzbu(Status paramStatus)
  {
    return new ChannelImpl.zzb(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.ChannelImpl.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */