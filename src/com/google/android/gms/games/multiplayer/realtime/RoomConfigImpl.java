package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;

public final class RoomConfigImpl
  extends RoomConfig
{
  private final String zzUO;
  private final int zzaJJ;
  private final RoomUpdateListener zzaJU;
  private final RoomStatusUpdateListener zzaJV;
  private final RealTimeMessageReceivedListener zzaJW;
  private final Bundle zzaJZ;
  private final String[] zzaKa;
  
  RoomConfigImpl(RoomConfig.Builder paramBuilder)
  {
    zzaJU = zzaJU;
    zzaJV = zzaJV;
    zzaJW = zzaJW;
    zzUO = zzaJX;
    zzaJJ = zzaJJ;
    zzaJZ = zzaJZ;
    int i = zzaJY.size();
    zzaKa = ((String[])zzaJY.toArray(new String[i]));
    zzx.zzb(zzaJW, "Must specify a message listener");
  }
  
  public final Bundle getAutoMatchCriteria()
  {
    return zzaJZ;
  }
  
  public final String getInvitationId()
  {
    return zzUO;
  }
  
  public final String[] getInvitedPlayerIds()
  {
    return zzaKa;
  }
  
  public final RealTimeMessageReceivedListener getMessageReceivedListener()
  {
    return zzaJW;
  }
  
  public final RoomStatusUpdateListener getRoomStatusUpdateListener()
  {
    return zzaJV;
  }
  
  public final RoomUpdateListener getRoomUpdateListener()
  {
    return zzaJU;
  }
  
  public final int getVariant()
  {
    return zzaJJ;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RoomConfigImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */