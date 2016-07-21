package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.request.OnRequestReceivedListener;

final class GamesClientImpl$RequestRemovedNotifier
  implements zzq.zzb
{
  private final String zzEY;
  
  GamesClientImpl$RequestRemovedNotifier(String paramString)
  {
    zzEY = paramString;
  }
  
  public final void zza(OnRequestReceivedListener paramOnRequestReceivedListener)
  {
    paramOnRequestReceivedListener.onRequestRemoved(zzEY);
  }
  
  public final void zzpr() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.RequestRemovedNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */