package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

final class GamesClientImpl$RoomBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zzq zzaFn;
  private final zzq zzaFo;
  private final zzq zzaFp;
  
  public GamesClientImpl$RoomBinderCallbacks(zzq paramzzq)
  {
    zzaFn = ((zzq)zzx.zzb(paramzzq, "Callbacks must not be null"));
    zzaFo = null;
    zzaFp = null;
  }
  
  public GamesClientImpl$RoomBinderCallbacks(zzq paramzzq1, zzq paramzzq2, zzq paramzzq3)
  {
    zzaFn = ((zzq)zzx.zzb(paramzzq1, "Callbacks must not be null"));
    zzaFo = paramzzq2;
    zzaFp = paramzzq3;
  }
  
  public final void onLeftRoom(int paramInt, String paramString)
  {
    zzaFn.zza(new GamesClientImpl.LeftRoomNotifier(paramInt, paramString));
  }
  
  public final void onP2PConnected(String paramString)
  {
    if (zzaFo != null) {
      zzaFo.zza(new GamesClientImpl.P2PConnectedNotifier(paramString));
    }
  }
  
  public final void onP2PDisconnected(String paramString)
  {
    if (zzaFo != null) {
      zzaFo.zza(new GamesClientImpl.P2PDisconnectedNotifier(paramString));
    }
  }
  
  public final void onRealTimeMessageReceived(RealTimeMessage paramRealTimeMessage)
  {
    if (zzaFp != null) {
      zzaFp.zza(new GamesClientImpl.MessageReceivedNotifier(paramRealTimeMessage));
    }
  }
  
  public final void zzA(DataHolder paramDataHolder)
  {
    zzaFn.zza(new GamesClientImpl.JoinedRoomNotifier(paramDataHolder));
  }
  
  public final void zzB(DataHolder paramDataHolder)
  {
    if (zzaFo != null) {
      zzaFo.zza(new GamesClientImpl.RoomConnectingNotifier(paramDataHolder));
    }
  }
  
  public final void zzC(DataHolder paramDataHolder)
  {
    if (zzaFo != null) {
      zzaFo.zza(new GamesClientImpl.RoomAutoMatchingNotifier(paramDataHolder));
    }
  }
  
  public final void zzD(DataHolder paramDataHolder)
  {
    zzaFn.zza(new GamesClientImpl.RoomConnectedNotifier(paramDataHolder));
  }
  
  public final void zzE(DataHolder paramDataHolder)
  {
    if (zzaFo != null) {
      zzaFo.zza(new GamesClientImpl.ConnectedToRoomNotifier(paramDataHolder));
    }
  }
  
  public final void zzF(DataHolder paramDataHolder)
  {
    if (zzaFo != null) {
      zzaFo.zza(new GamesClientImpl.DisconnectedFromRoomNotifier(paramDataHolder));
    }
  }
  
  public final void zza(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    if (zzaFo != null) {
      zzaFo.zza(new GamesClientImpl.PeerInvitedToRoomNotifier(paramDataHolder, paramArrayOfString));
    }
  }
  
  public final void zzb(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    if (zzaFo != null) {
      zzaFo.zza(new GamesClientImpl.PeerJoinedRoomNotifier(paramDataHolder, paramArrayOfString));
    }
  }
  
  public final void zzc(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    if (zzaFo != null) {
      zzaFo.zza(new GamesClientImpl.PeerLeftRoomNotifier(paramDataHolder, paramArrayOfString));
    }
  }
  
  public final void zzd(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    if (zzaFo != null) {
      zzaFo.zza(new GamesClientImpl.PeerDeclinedNotifier(paramDataHolder, paramArrayOfString));
    }
  }
  
  public final void zze(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    if (zzaFo != null) {
      zzaFo.zza(new GamesClientImpl.PeerConnectedNotifier(paramDataHolder, paramArrayOfString));
    }
  }
  
  public final void zzf(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    if (zzaFo != null) {
      zzaFo.zza(new GamesClientImpl.PeerDisconnectedNotifier(paramDataHolder, paramArrayOfString));
    }
  }
  
  public final void zzz(DataHolder paramDataHolder)
  {
    zzaFn.zza(new GamesClientImpl.RoomCreatedNotifier(paramDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.RoomBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */