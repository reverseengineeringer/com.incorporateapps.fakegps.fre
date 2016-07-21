package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.OnRequestReceivedListener;

final class GamesClientImpl$RequestReceivedNotifier
  implements zzq.zzb
{
  private final GameRequest zzaFi;
  
  GamesClientImpl$RequestReceivedNotifier(GameRequest paramGameRequest)
  {
    zzaFi = paramGameRequest;
  }
  
  public final void zza(OnRequestReceivedListener paramOnRequestReceivedListener)
  {
    paramOnRequestReceivedListener.onRequestReceived(zzaFi);
  }
  
  public final void zzpr() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.RequestReceivedNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */