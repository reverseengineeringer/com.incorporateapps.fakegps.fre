package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

final class GamesClientImpl$ConnectedToRoomNotifier
  extends GamesClientImpl.AbstractRoomStatusNotifier
{
  GamesClientImpl$ConnectedToRoomNotifier(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public final void zza(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom)
  {
    paramRoomStatusUpdateListener.onConnectedToRoom(paramRoom);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.ConnectedToRoomNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */