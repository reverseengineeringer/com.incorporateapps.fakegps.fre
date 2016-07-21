package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;

public final class zzl
  implements ChannelApi
{
  private static zzb.zza zza(IntentFilter[] paramArrayOfIntentFilter)
  {
    return new zzl.2(paramArrayOfIntentFilter);
  }
  
  public final PendingResult addListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener)
  {
    zzx.zzb(paramGoogleApiClient, "client is null");
    zzx.zzb(paramChannelListener, "listener is null");
    return zzb.zza(paramGoogleApiClient, zza(new IntentFilter[] { zzbn.zzgM("com.google.android.gms.wearable.CHANNEL_EVENT") }), paramChannelListener);
  }
  
  public final PendingResult openChannel(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    zzx.zzb(paramGoogleApiClient, "client is null");
    zzx.zzb(paramString1, "nodeId is null");
    zzx.zzb(paramString2, "path is null");
    return paramGoogleApiClient.zza(new zzl.1(this, paramGoogleApiClient, paramString1, paramString2));
  }
  
  public final PendingResult removeListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener)
  {
    zzx.zzb(paramGoogleApiClient, "client is null");
    zzx.zzb(paramChannelListener, "listener is null");
    return paramGoogleApiClient.zza(new zzl.zzb(paramGoogleApiClient, paramChannelListener, null));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */