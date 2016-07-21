package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

final class GamesClientImpl$P2PConnectedNotifier
  implements zzq.zzb
{
  private final String zzaFa;
  
  GamesClientImpl$P2PConnectedNotifier(String paramString)
  {
    zzaFa = paramString;
  }
  
  public final void zza(RoomStatusUpdateListener paramRoomStatusUpdateListener)
  {
    paramRoomStatusUpdateListener.onP2PConnected(zzaFa);
  }
  
  public final void zzpr() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.P2PConnectedNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */