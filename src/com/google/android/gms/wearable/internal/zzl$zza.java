package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi.OpenChannelResult;

final class zzl$zza
  implements ChannelApi.OpenChannelResult
{
  private final Status zzUX;
  private final Channel zzbrY;
  
  zzl$zza(Status paramStatus, Channel paramChannel)
  {
    zzUX = ((Status)zzx.zzz(paramStatus));
    zzbrY = paramChannel;
  }
  
  public final Channel getChannel()
  {
    return zzbrY;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzl.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */