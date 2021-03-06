package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

final class GamesClientImpl$DisconnectedFromRoomNotifier
  extends GamesClientImpl.AbstractRoomStatusNotifier
{
  GamesClientImpl$DisconnectedFromRoomNotifier(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public final void zza(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom)
  {
    paramRoomStatusUpdateListener.onDisconnectedFromRoom(paramRoom);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.DisconnectedFromRoomNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */