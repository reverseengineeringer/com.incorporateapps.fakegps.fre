package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Arrays;

public final class RoomConfig$Builder
{
  int zzaJJ = -1;
  final RoomUpdateListener zzaJU;
  RoomStatusUpdateListener zzaJV;
  RealTimeMessageReceivedListener zzaJW;
  String zzaJX = null;
  ArrayList zzaJY = new ArrayList();
  Bundle zzaJZ;
  
  private RoomConfig$Builder(RoomUpdateListener paramRoomUpdateListener)
  {
    zzaJU = ((RoomUpdateListener)zzx.zzb(paramRoomUpdateListener, "Must provide a RoomUpdateListener"));
  }
  
  public final Builder addPlayersToInvite(ArrayList paramArrayList)
  {
    zzx.zzz(paramArrayList);
    zzaJY.addAll(paramArrayList);
    return this;
  }
  
  public final Builder addPlayersToInvite(String... paramVarArgs)
  {
    zzx.zzz(paramVarArgs);
    zzaJY.addAll(Arrays.asList(paramVarArgs));
    return this;
  }
  
  public final RoomConfig build()
  {
    return new RoomConfigImpl(this);
  }
  
  public final Builder setAutoMatchCriteria(Bundle paramBundle)
  {
    zzaJZ = paramBundle;
    return this;
  }
  
  public final Builder setInvitationIdToAccept(String paramString)
  {
    zzx.zzz(paramString);
    zzaJX = paramString;
    return this;
  }
  
  public final Builder setMessageReceivedListener(RealTimeMessageReceivedListener paramRealTimeMessageReceivedListener)
  {
    zzaJW = paramRealTimeMessageReceivedListener;
    return this;
  }
  
  public final Builder setRoomStatusUpdateListener(RoomStatusUpdateListener paramRoomStatusUpdateListener)
  {
    zzaJV = paramRoomStatusUpdateListener;
    return this;
  }
  
  public final Builder setVariant(int paramInt)
  {
    if ((paramInt == -1) || (paramInt > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Variant must be a positive integer or Room.ROOM_VARIANT_ANY");
      zzaJJ = paramInt;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */