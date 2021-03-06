package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import java.util.List;

public final class RealTimeMultiplayerImpl
  implements RealTimeMultiplayer
{
  private static zzq zza(GoogleApiClient paramGoogleApiClient, Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    return paramGoogleApiClient.zzr(paramObject);
  }
  
  public final void create(GoogleApiClient paramGoogleApiClient, RoomConfig paramRoomConfig)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl == null) {
      return;
    }
    localGamesClientImpl.zza(paramGoogleApiClient.zzr(paramRoomConfig.getRoomUpdateListener()), zza(paramGoogleApiClient, paramRoomConfig.getRoomStatusUpdateListener()), zza(paramGoogleApiClient, paramRoomConfig.getMessageReceivedListener()), paramRoomConfig);
  }
  
  public final void declineInvitation(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    paramGoogleApiClient = Games.zzb(paramGoogleApiClient, false);
    if (paramGoogleApiClient != null) {
      paramGoogleApiClient.zzr(paramString, 0);
    }
  }
  
  public final void dismissInvitation(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    paramGoogleApiClient = Games.zzb(paramGoogleApiClient, false);
    if (paramGoogleApiClient != null) {
      paramGoogleApiClient.zzq(paramString, 0);
    }
  }
  
  public final Intent getSelectOpponentsIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2)
  {
    return Games.zzh(paramGoogleApiClient).zzc(paramInt1, paramInt2, true);
  }
  
  public final Intent getSelectOpponentsIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return Games.zzh(paramGoogleApiClient).zzc(paramInt1, paramInt2, paramBoolean);
  }
  
  public final Intent getWaitingRoomIntent(GoogleApiClient paramGoogleApiClient, Room paramRoom, int paramInt)
  {
    return Games.zzh(paramGoogleApiClient).zza(paramRoom, paramInt);
  }
  
  public final void join(GoogleApiClient paramGoogleApiClient, RoomConfig paramRoomConfig)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl == null) {
      return;
    }
    localGamesClientImpl.zzb(paramGoogleApiClient.zzr(paramRoomConfig.getRoomUpdateListener()), zza(paramGoogleApiClient, paramRoomConfig.getRoomStatusUpdateListener()), zza(paramGoogleApiClient, paramRoomConfig.getMessageReceivedListener()), paramRoomConfig);
  }
  
  public final void leave(GoogleApiClient paramGoogleApiClient, RoomUpdateListener paramRoomUpdateListener, String paramString)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zza(paramGoogleApiClient.zzr(paramRoomUpdateListener), paramString);
    }
  }
  
  public final int sendReliableMessage(GoogleApiClient paramGoogleApiClient, RealTimeMultiplayer.ReliableMessageSentCallback paramReliableMessageSentCallback, byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    paramReliableMessageSentCallback = zza(paramGoogleApiClient, paramReliableMessageSentCallback);
    return Games.zzh(paramGoogleApiClient).zza(paramReliableMessageSentCallback, paramArrayOfByte, paramString1, paramString2);
  }
  
  public final int sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    return Games.zzh(paramGoogleApiClient).zza(paramArrayOfByte, paramString1, new String[] { paramString2 });
  }
  
  public final int sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, byte[] paramArrayOfByte, String paramString, List paramList)
  {
    paramList = (String[])paramList.toArray(new String[paramList.size()]);
    return Games.zzh(paramGoogleApiClient).zza(paramArrayOfByte, paramString, paramList);
  }
  
  public final int sendUnreliableMessageToOthers(GoogleApiClient paramGoogleApiClient, byte[] paramArrayOfByte, String paramString)
  {
    return Games.zzh(paramGoogleApiClient).zzd(paramArrayOfByte, paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.RealTimeMultiplayerImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */