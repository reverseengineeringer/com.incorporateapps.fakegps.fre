package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;

final class GamesClientImpl$JoinedRoomNotifier
  extends GamesClientImpl.AbstractRoomNotifier
{
  public GamesClientImpl$JoinedRoomNotifier(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public final void zza(RoomUpdateListener paramRoomUpdateListener, Room paramRoom, int paramInt)
  {
    paramRoomUpdateListener.onJoinedRoom(paramInt, paramRoom);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.JoinedRoomNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */