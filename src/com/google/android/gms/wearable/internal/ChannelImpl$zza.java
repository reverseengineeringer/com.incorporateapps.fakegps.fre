package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Channel.GetInputStreamResult;
import java.io.IOException;
import java.io.InputStream;

final class ChannelImpl$zza
  implements Channel.GetInputStreamResult
{
  private final Status zzUX;
  private final InputStream zzbsh;
  
  ChannelImpl$zza(Status paramStatus, InputStream paramInputStream)
  {
    zzUX = ((Status)zzx.zzz(paramStatus));
    zzbsh = paramInputStream;
  }
  
  public final InputStream getInputStream()
  {
    return zzbsh;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
  
  public final void release()
  {
    if (zzbsh != null) {}
    try
    {
      zzbsh.close();
      return;
    }
    catch (IOException localIOException) {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.ChannelImpl.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */