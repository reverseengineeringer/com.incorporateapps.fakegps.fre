package com.google.android.gms.games.multiplayer.realtime;

public abstract interface RoomUpdateListener
{
  public abstract void onJoinedRoom(int paramInt, Room paramRoom);
  
  public abstract void onLeftRoom(int paramInt, String paramString);
  
  public abstract void onRoomConnected(int paramInt, Room paramRoom);
  
  public abstract void onRoomCreated(int paramInt, Room paramRoom);
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */