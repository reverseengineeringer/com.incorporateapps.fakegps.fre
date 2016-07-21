package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zze;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;

abstract class GamesClientImpl$AbstractRoomNotifier
  extends zze
{
  GamesClientImpl$AbstractRoomNotifier(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected void zza(RoomUpdateListener paramRoomUpdateListener, DataHolder paramDataHolder)
  {
    zza(paramRoomUpdateListener, GamesClientImpl.zzZ(paramDataHolder), paramDataHolder.getStatusCode());
  }
  
  protected abstract void zza(RoomUpdateListener paramRoomUpdateListener, Room paramRoom, int paramInt);
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.AbstractRoomNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */