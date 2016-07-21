package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;

public abstract class RoomConfig
{
  public static RoomConfig.Builder builder(RoomUpdateListener paramRoomUpdateListener)
  {
    return new RoomConfig.Builder(paramRoomUpdateListener, null);
  }
  
  public static Bundle createAutoMatchCriteria(int paramInt1, int paramInt2, long paramLong)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("min_automatch_players", paramInt1);
    localBundle.putInt("max_automatch_players", paramInt2);
    localBundle.putLong("exclusive_bit_mask", paramLong);
    return localBundle;
  }
  
  public abstract Bundle getAutoMatchCriteria();
  
  public abstract String getInvitationId();
  
  public abstract String[] getInvitedPlayerIds();
  
  public abstract RealTimeMessageReceivedListener getMessageReceivedListener();
  
  public abstract RoomStatusUpdateListener getRoomStatusUpdateListener();
  
  public abstract RoomUpdateListener getRoomUpdateListener();
  
  public abstract int getVariant();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RoomConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */