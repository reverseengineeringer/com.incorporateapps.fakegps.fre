package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zze;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;

abstract class GamesClientImpl$AbstractRoomStatusNotifier
  extends zze
{
  GamesClientImpl$AbstractRoomStatusNotifier(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected void zza(RoomStatusUpdateListener paramRoomStatusUpdateListener, DataHolder paramDataHolder)
  {
    zza(paramRoomStatusUpdateListener, GamesClientImpl.zzZ(paramDataHolder));
  }
  
  protected abstract void zza(RoomStatusUpdateListener paramRoomStatusUpdateListener, Room paramRoom);
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.AbstractRoomStatusNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */