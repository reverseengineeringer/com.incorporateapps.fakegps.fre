package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;

final class zzbj
  implements ChannelApi.ChannelListener
{
  private final String zzVo;
  private final ChannelApi.ChannelListener zzbtb;
  
  zzbj(String paramString, ChannelApi.ChannelListener paramChannelListener)
  {
    zzVo = ((String)zzx.zzz(paramString));
    zzbtb = ((ChannelApi.ChannelListener)zzx.zzz(paramChannelListener));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzbj)) {
        return false;
      }
      paramObject = (zzbj)paramObject;
    } while ((zzbtb.equals(zzbtb)) && (zzVo.equals(zzVo)));
    return false;
  }
  
  public final int hashCode()
  {
    return zzVo.hashCode() * 31 + zzbtb.hashCode();
  }
  
  public final void onChannelClosed(Channel paramChannel, int paramInt1, int paramInt2)
  {
    zzbtb.onChannelClosed(paramChannel, paramInt1, paramInt2);
  }
  
  public final void onChannelOpened(Channel paramChannel)
  {
    zzbtb.onChannelOpened(paramChannel);
  }
  
  public final void onInputClosed(Channel paramChannel, int paramInt1, int paramInt2)
  {
    zzbtb.onInputClosed(paramChannel, paramInt1, paramInt2);
  }
  
  public final void onOutputClosed(Channel paramChannel, int paramInt1, int paramInt2)
  {
    zzbtb.onOutputClosed(paramChannel, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */