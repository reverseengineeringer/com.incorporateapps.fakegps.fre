package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Channel.GetOutputStreamResult;
import java.io.IOException;
import java.io.OutputStream;

final class ChannelImpl$zzb
  implements Channel.GetOutputStreamResult
{
  private final Status zzUX;
  private final OutputStream zzbsi;
  
  ChannelImpl$zzb(Status paramStatus, OutputStream paramOutputStream)
  {
    zzUX = ((Status)zzx.zzz(paramStatus));
    zzbsi = paramOutputStream;
  }
  
  public final OutputStream getOutputStream()
  {
    return zzbsi;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
  
  public final void release()
  {
    if (zzbsi != null) {}
    try
    {
      zzbsi.close();
      return;
    }
    catch (IOException localIOException) {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.ChannelImpl.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */