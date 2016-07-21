package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import java.util.ArrayList;

abstract class GamesClientImpl$AbstractPeerStatusNotifier
  extends GamesClientImpl.AbstractRoomStatusNotifier
{
  private final ArrayList zzaEj = new ArrayList();
  
  GamesClientImpl$AbstractPeerStatusNotifier(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    super(paramDataHolder);
    int i = 0;
    int j = paramArrayOfString.length;
    while (i < j)
    {
      zzaEj.add(paramArrayOfString[i]);
      i += 1;
    }
  }
  
  protected void zza(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom)
  {
    zza(paramRoomStatusUpdateListener, paramRoom, zzaEj);
  }
  
  protected abstract void zza(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom, ArrayList paramArrayList);
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.AbstractPeerStatusNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */