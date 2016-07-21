package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;

final class zzl$zzb
  extends zzi
{
  private final String zzVo;
  private ChannelApi.ChannelListener zzbrZ;
  
  zzl$zzb(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener, String paramString)
  {
    super(paramGoogleApiClient);
    zzbrZ = ((ChannelApi.ChannelListener)zzx.zzz(paramChannelListener));
    zzVo = paramString;
  }
  
  protected final void zza(zzbp paramzzbp)
  {
    paramzzbp.zza(this, zzbrZ, zzVo);
    zzbrZ = null;
  }
  
  public final Status zzb(Status paramStatus)
  {
    zzbrZ = null;
    return paramStatus;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzl.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */