package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;

final class GamesClientImpl$LeftRoomNotifier
  implements zzq.zzb
{
  private final String zzaEw;
  private final int zzade;
  
  GamesClientImpl$LeftRoomNotifier(int paramInt, String paramString)
  {
    zzade = paramInt;
    zzaEw = paramString;
  }
  
  public final void zza(RoomUpdateListener paramRoomUpdateListener)
  {
    paramRoomUpdateListener.onLeftRoom(zzade, zzaEw);
  }
  
  public final void zzpr() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.LeftRoomNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */