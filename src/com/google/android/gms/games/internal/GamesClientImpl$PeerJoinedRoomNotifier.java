package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import java.util.ArrayList;

final class GamesClientImpl$PeerJoinedRoomNotifier
  extends GamesClientImpl.AbstractPeerStatusNotifier
{
  GamesClientImpl$PeerJoinedRoomNotifier(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    super(paramDataHolder, paramArrayOfString);
  }
  
  protected final void zza(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom, ArrayList paramArrayList)
  {
    paramRoomStatusUpdateListener.onPeerJoined(paramRoom, paramArrayList);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.PeerJoinedRoomNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */