package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.NodeApi.NodeListener;

public final class zzbb
  implements NodeApi
{
  private static zzb.zza zza(IntentFilter[] paramArrayOfIntentFilter)
  {
    return new zzbb.3(paramArrayOfIntentFilter);
  }
  
  public final PendingResult addListener(GoogleApiClient paramGoogleApiClient, NodeApi.NodeListener paramNodeListener)
  {
    return zzb.zza(paramGoogleApiClient, zza(new IntentFilter[] { zzbn.zzgM("com.google.android.gms.wearable.NODE_CHANGED") }), paramNodeListener);
  }
  
  public final PendingResult getConnectedNodes(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zza(new zzbb.2(this, paramGoogleApiClient));
  }
  
  public final PendingResult getLocalNode(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zza(new zzbb.1(this, paramGoogleApiClient));
  }
  
  public final PendingResult removeListener(GoogleApiClient paramGoogleApiClient, NodeApi.NodeListener paramNodeListener)
  {
    return paramGoogleApiClient.zza(new zzbb.4(this, paramGoogleApiClient, paramNodeListener));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */