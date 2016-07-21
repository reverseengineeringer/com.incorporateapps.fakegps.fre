package com.google.android.gms.games.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.zza;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.events.EventIncrementManager;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomBuffer;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.video.VideoConfiguration;
import com.google.android.gms.signin.internal.zzh;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public final class GamesClientImpl
  extends zzj
{
  EventIncrementManager zzaDZ = new GamesClientImpl.1(this);
  private final String zzaEa;
  private PlayerEntity zzaEb;
  private GameEntity zzaEc;
  private final PopupManager zzaEd;
  private boolean zzaEe = false;
  private final Binder zzaEf;
  private final long zzaEg;
  private final Games.GamesOptions zzaEh;
  
  public GamesClientImpl(Context paramContext, Looper paramLooper, zzf paramzzf, Games.GamesOptions paramGamesOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 1, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    zzaEa = paramzzf.zzqv();
    zzaEf = new Binder();
    zzaEd = PopupManager.zza(this, paramzzf.zzqr());
    zzo(paramzzf.zzqx());
    zzaEg = hashCode();
    zzaEh = paramGamesOptions;
  }
  
  private static Room zzY(DataHolder paramDataHolder)
  {
    RoomBuffer localRoomBuffer = new RoomBuffer(paramDataHolder);
    paramDataHolder = null;
    try
    {
      if (localRoomBuffer.getCount() > 0) {
        paramDataHolder = (Room)((Room)localRoomBuffer.get(0)).freeze();
      }
      return paramDataHolder;
    }
    finally
    {
      localRoomBuffer.release();
    }
  }
  
  private void zzb(RemoteException paramRemoteException)
  {
    GamesLog.zzb("GamesClientImpl", "service died", paramRemoteException);
  }
  
  private void zzwv()
  {
    zzaEb = null;
    zzaEc = null;
  }
  
  public final void disconnect()
  {
    zzaEe = false;
    if (isConnected()) {}
    try
    {
      IGamesService localIGamesService = (IGamesService)zzqJ();
      localIGamesService.zzwR();
      zzaDZ.flush();
      localIGamesService.zzF(zzaEg);
      super.disconnect();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        GamesLog.zzz("GamesClientImpl", "Failed to notify client disconnect.");
      }
    }
  }
  
  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    super.onConnectionFailed(paramConnectionResult);
    zzaEe = false;
  }
  
  public final int zza(zzq paramzzq, byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    try
    {
      int i = ((IGamesService)zzqJ()).zza(new GamesClientImpl.RealTimeReliableMessageBinderCallbacks(paramzzq), paramArrayOfByte, paramString1, paramString2);
      return i;
    }
    catch (RemoteException paramzzq)
    {
      zzb(paramzzq);
    }
    return -1;
  }
  
  public final int zza(byte[] paramArrayOfByte, String paramString, String[] paramArrayOfString)
  {
    zzx.zzb(paramArrayOfString, "Participant IDs must not be null");
    try
    {
      int i = ((IGamesService)zzqJ()).zzb(paramArrayOfByte, paramString, paramArrayOfString);
      return i;
    }
    catch (RemoteException paramArrayOfByte)
    {
      zzb(paramArrayOfByte);
    }
    return -1;
  }
  
  public final Intent zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, Bitmap paramBitmap, String paramString)
  {
    try
    {
      paramArrayOfByte = ((IGamesService)zzqJ()).zza(paramInt1, paramArrayOfByte, paramInt2, paramString);
      zzx.zzb(paramBitmap, "Must provide a non null icon");
      paramArrayOfByte.putExtra("com.google.android.gms.games.REQUEST_ITEM_ICON", paramBitmap);
      return paramArrayOfByte;
    }
    catch (RemoteException paramArrayOfByte)
    {
      zzb(paramArrayOfByte);
    }
    return null;
  }
  
  public final Intent zza(PlayerEntity paramPlayerEntity)
  {
    try
    {
      paramPlayerEntity = ((IGamesService)zzqJ()).zza(paramPlayerEntity);
      return paramPlayerEntity;
    }
    catch (RemoteException paramPlayerEntity)
    {
      zzb(paramPlayerEntity);
    }
    return null;
  }
  
  public final Intent zza(Room paramRoom, int paramInt)
  {
    try
    {
      paramRoom = ((IGamesService)zzqJ()).zza((RoomEntity)paramRoom.freeze(), paramInt);
      return paramRoom;
    }
    catch (RemoteException paramRoom)
    {
      zzb(paramRoom);
    }
    return null;
  }
  
  public final Intent zza(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    try
    {
      paramString = ((IGamesService)zzqJ()).zza(paramString, paramBoolean1, paramBoolean2, paramInt);
      return paramString;
    }
    catch (RemoteException paramString)
    {
      zzb(paramString);
    }
    return null;
  }
  
  protected final void zza(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramBundle != null))
    {
      paramBundle.setClassLoader(GamesClientImpl.class.getClassLoader());
      zzaEe = paramBundle.getBoolean("show_welcome_popup");
      zzaEb = ((PlayerEntity)paramBundle.getParcelable("com.google.android.gms.games.current_player"));
      zzaEc = ((GameEntity)paramBundle.getParcelable("com.google.android.gms.games.current_game"));
    }
    super.zza(paramInt1, paramIBinder, paramBundle, paramInt2);
  }
  
  public final void zza(IBinder paramIBinder, Bundle paramBundle)
  {
    if (isConnected()) {}
    try
    {
      ((IGamesService)zzqJ()).zza(paramIBinder, paramBundle);
      return;
    }
    catch (RemoteException paramIBinder)
    {
      zzb(paramIBinder);
    }
  }
  
  public final void zza(GoogleApiClient.zza paramzza)
  {
    zzwv();
    super.zza(paramzza);
  }
  
  public final void zza(zza.zzb paramzzb, int paramInt)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.InvitationsLoadedBinderCallback(paramzzb), paramInt);
  }
  
  public final void zza(zza.zzb paramzzb, int paramInt1, int paramInt2, int paramInt3)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.RequestsLoadedBinderCallbacks(paramzzb), paramInt1, paramInt2, paramInt3);
  }
  
  public final void zza(zza.zzb paramzzb, int paramInt, String paramString, String[] paramArrayOfString, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.AppContentLoadedBinderCallbacks(paramzzb), paramInt, paramString, paramArrayOfString, paramBoolean);
  }
  
  public final void zza(zza.zzb paramzzb, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.PlayersLoadedBinderCallback(paramzzb), paramInt, paramBoolean1, paramBoolean2);
  }
  
  public final void zza(zza.zzb paramzzb, int paramInt, int[] paramArrayOfInt)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.TurnBasedMatchesLoadedBinderCallbacks(paramzzb), paramInt, paramArrayOfInt);
  }
  
  public final void zza(zza.zzb paramzzb, LeaderboardScoreBuffer paramLeaderboardScoreBuffer, int paramInt1, int paramInt2)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.LeaderboardScoresLoadedBinderCallback(paramzzb), paramLeaderboardScoreBuffer.zzxJ().asBundle(), paramInt1, paramInt2);
  }
  
  public final void zza(zza.zzb paramzzb, TurnBasedMatchConfig paramTurnBasedMatchConfig)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.TurnBasedMatchInitiatedBinderCallbacks(paramzzb), paramTurnBasedMatchConfig.getVariant(), paramTurnBasedMatchConfig.zzxP(), paramTurnBasedMatchConfig.getInvitedPlayerIds(), paramTurnBasedMatchConfig.getAutoMatchCriteria());
  }
  
  public final void zza(zza.zzb paramzzb, Snapshot paramSnapshot, SnapshotMetadataChange paramSnapshotMetadataChange)
  {
    SnapshotContents localSnapshotContents = paramSnapshot.getSnapshotContents();
    if (!localSnapshotContents.isClosed()) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Snapshot already closed");
      Object localObject = paramSnapshotMetadataChange.zzxU();
      if (localObject != null) {
        ((BitmapTeleporter)localObject).zzc(getContext().getCacheDir());
      }
      localObject = localSnapshotContents.zzsx();
      localSnapshotContents.close();
      ((IGamesService)zzqJ()).zza(new GamesClientImpl.SnapshotCommittedBinderCallbacks(paramzzb), paramSnapshot.getMetadata().getSnapshotId(), (SnapshotMetadataChangeEntity)paramSnapshotMetadataChange, (Contents)localObject);
      return;
    }
  }
  
  public final void zza(zza.zzb paramzzb, String paramString)
  {
    if (paramzzb == null) {}
    for (paramzzb = null;; paramzzb = new GamesClientImpl.AchievementUpdatedBinderCallback(paramzzb))
    {
      ((IGamesService)zzqJ()).zza(paramzzb, paramString, zzaEd.zzxj(), zzaEd.zzxi());
      return;
    }
  }
  
  public final void zza(zza.zzb paramzzb, String paramString, int paramInt)
  {
    if (paramzzb == null) {}
    for (paramzzb = null;; paramzzb = new GamesClientImpl.AchievementUpdatedBinderCallback(paramzzb))
    {
      ((IGamesService)zzqJ()).zza(paramzzb, paramString, paramInt, zzaEd.zzxj(), zzaEd.zzxi());
      return;
    }
  }
  
  public final void zza(zza.zzb paramzzb, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.LeaderboardScoresLoadedBinderCallback(paramzzb), paramString, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = -1;
    switch (paramString.hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        throw new IllegalArgumentException("Invalid player collection: " + paramString);
        if (paramString.equals("played_with")) {
          i = 0;
        }
        break;
      }
    }
    ((IGamesService)zzqJ()).zzd(new GamesClientImpl.PlayersLoadedBinderCallback(paramzzb), paramString, paramInt, paramBoolean1, paramBoolean2);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString, int paramInt, int[] paramArrayOfInt)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.TurnBasedMatchesLoadedBinderCallbacks(paramzzb), paramString, paramInt, paramArrayOfInt);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString1, long paramLong, String paramString2)
  {
    if (paramzzb == null) {}
    for (paramzzb = null;; paramzzb = new GamesClientImpl.SubmitScoreBinderCallbacks(paramzzb))
    {
      ((IGamesService)zzqJ()).zza(paramzzb, paramString1, paramLong, paramString2);
      return;
    }
  }
  
  public final void zza(zza.zzb paramzzb, String paramString1, String paramString2)
  {
    ((IGamesService)zzqJ()).zzc(new GamesClientImpl.TurnBasedMatchLeftBinderCallbacks(paramzzb), paramString1, paramString2);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.PlayerLeaderboardScoreLoadedBinderCallback(paramzzb), paramString1, paramString2, paramInt1, paramInt2);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.RequestsLoadedBinderCallbacks(paramzzb), paramString1, paramString2, paramInt1, paramInt2, paramInt3);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.LeaderboardScoresLoadedBinderCallback(paramzzb), paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString1, String paramString2, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = -1;
    switch (paramString1.hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        throw new IllegalArgumentException("Invalid player collection: " + paramString1);
        if (paramString1.equals("circled"))
        {
          i = 0;
          continue;
          if (paramString1.equals("played_with"))
          {
            i = 1;
            continue;
            if (paramString1.equals("nearby")) {
              i = 2;
            }
          }
        }
        break;
      }
    }
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.PlayersLoadedBinderCallback(paramzzb), paramString1, paramString2, paramInt, paramBoolean1, paramBoolean2);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString1, String paramString2, SnapshotMetadataChange paramSnapshotMetadataChange, SnapshotContents paramSnapshotContents)
  {
    if (!paramSnapshotContents.isClosed()) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "SnapshotContents already closed");
      Object localObject = paramSnapshotMetadataChange.zzxU();
      if (localObject != null) {
        ((BitmapTeleporter)localObject).zzc(getContext().getCacheDir());
      }
      localObject = paramSnapshotContents.zzsx();
      paramSnapshotContents.close();
      ((IGamesService)zzqJ()).zza(new GamesClientImpl.SnapshotOpenedBinderCallbacks(paramzzb), paramString1, paramString2, (SnapshotMetadataChangeEntity)paramSnapshotMetadataChange, (Contents)localObject);
      return;
    }
  }
  
  public final void zza(zza.zzb paramzzb, String paramString1, String paramString2, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zzb(new GamesClientImpl.LeaderboardsLoadedBinderCallback(paramzzb), paramString1, paramString2, paramBoolean);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString1, String paramString2, boolean paramBoolean, String[] paramArrayOfString)
  {
    zzaDZ.flush();
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.QuestsLoadedBinderCallbacks(paramzzb), paramString1, paramString2, paramArrayOfString, paramBoolean);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString1, String paramString2, int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    zzaDZ.flush();
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.QuestsLoadedBinderCallbacks(paramzzb), paramString1, paramString2, paramArrayOfInt, paramInt, paramBoolean);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString1, String paramString2, String[] paramArrayOfString)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.RequestsUpdatedBinderCallbacks(paramzzb), paramString1, paramString2, paramArrayOfString);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zzf(new GamesClientImpl.PlayersLoadedBinderCallback(paramzzb), paramString, paramBoolean);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString, boolean paramBoolean, int paramInt)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.SnapshotOpenedBinderCallbacks(paramzzb), paramString, paramBoolean, paramInt);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString1, byte[] paramArrayOfByte, String paramString2, ParticipantResult[] paramArrayOfParticipantResult)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.TurnBasedMatchUpdatedBinderCallbacks(paramzzb), paramString1, paramArrayOfByte, paramString2, paramArrayOfParticipantResult);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString, byte[] paramArrayOfByte, ParticipantResult[] paramArrayOfParticipantResult)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.TurnBasedMatchUpdatedBinderCallbacks(paramzzb), paramString, paramArrayOfByte, paramArrayOfParticipantResult);
  }
  
  public final void zza(zza.zzb paramzzb, String paramString, String[] paramArrayOfString, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.RequestSentBinderCallbacks(paramzzb), paramString, paramArrayOfString, paramInt1, paramArrayOfByte, paramInt2);
  }
  
  public final void zza(zza.zzb paramzzb, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zzc(new GamesClientImpl.PlayersLoadedBinderCallback(paramzzb), paramBoolean);
  }
  
  public final void zza(zza.zzb paramzzb, boolean paramBoolean, Bundle paramBundle)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.ContactSettingsUpdatedBinderCallback(paramzzb), paramBoolean, paramBundle);
  }
  
  public final void zza(zza.zzb paramzzb, boolean paramBoolean, String... paramVarArgs)
  {
    zzaDZ.flush();
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.EventsLoadedBinderCallback(paramzzb), paramBoolean, paramVarArgs);
  }
  
  public final void zza(zza.zzb paramzzb, int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    zzaDZ.flush();
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.QuestsLoadedBinderCallbacks(paramzzb), paramArrayOfInt, paramInt, paramBoolean);
  }
  
  public final void zza(zza.zzb paramzzb, String[] paramArrayOfString)
  {
    ((IGamesService)zzqJ()).zzc(new GamesClientImpl.PlayersLoadedBinderCallback(paramzzb), paramArrayOfString);
  }
  
  public final void zza(zzq paramzzq)
  {
    try
    {
      paramzzq = new GamesClientImpl.InvitationReceivedBinderCallback(paramzzq);
      ((IGamesService)zzqJ()).zza(paramzzq, zzaEg);
      return;
    }
    catch (RemoteException paramzzq)
    {
      zzb(paramzzq);
    }
  }
  
  public final void zza(zzq paramzzq1, zzq paramzzq2, zzq paramzzq3, RoomConfig paramRoomConfig)
  {
    try
    {
      paramzzq1 = new GamesClientImpl.RoomBinderCallbacks(paramzzq1, paramzzq2, paramzzq3);
      ((IGamesService)zzqJ()).zza(paramzzq1, zzaEf, paramRoomConfig.getVariant(), paramRoomConfig.getInvitedPlayerIds(), paramRoomConfig.getAutoMatchCriteria(), false, zzaEg);
      return;
    }
    catch (RemoteException paramzzq1)
    {
      zzb(paramzzq1);
    }
  }
  
  public final void zza(zzq paramzzq, String paramString)
  {
    try
    {
      ((IGamesService)zzqJ()).zzc(new GamesClientImpl.RoomBinderCallbacks(paramzzq), paramString);
      return;
    }
    catch (RemoteException paramzzq)
    {
      zzb(paramzzq);
    }
  }
  
  public final void zza(Games.BaseGamesApiMethodImpl paramBaseGamesApiMethodImpl, String paramString1, String paramString2, VideoConfiguration paramVideoConfiguration)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.StartRecordingBinderCallback(paramBaseGamesApiMethodImpl), paramString1, paramString2, paramVideoConfiguration);
  }
  
  public final void zza(IGamesService paramIGamesService)
  {
    super.zza(paramIGamesService);
    if (zzaEe)
    {
      zzaEd.zzxh();
      zzaEe = false;
    }
    if (!zzaEh.zzaCE) {
      zzb(paramIGamesService);
    }
  }
  
  public final void zza(Snapshot paramSnapshot)
  {
    paramSnapshot = paramSnapshot.getSnapshotContents();
    if (!paramSnapshot.isClosed()) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Snapshot already closed");
      Contents localContents = paramSnapshot.zzsx();
      paramSnapshot.close();
      try
      {
        ((IGamesService)zzqJ()).zza(localContents);
        return;
      }
      catch (RemoteException paramSnapshot)
      {
        zzb(paramSnapshot);
      }
    }
  }
  
  public final String zzah(boolean paramBoolean)
  {
    if ((paramBoolean) && (zzaEb != null)) {
      return zzaEb.getPlayerId();
    }
    try
    {
      String str = ((IGamesService)zzqJ()).zzwT();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return null;
  }
  
  public final Intent zzb(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      Intent localIntent = ((IGamesService)zzqJ()).zzb(paramInt1, paramInt2, paramBoolean);
      return localIntent;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return null;
  }
  
  public final Intent zzb(int[] paramArrayOfInt)
  {
    try
    {
      paramArrayOfInt = ((IGamesService)zzqJ()).zzb(paramArrayOfInt);
      return paramArrayOfInt;
    }
    catch (RemoteException paramArrayOfInt)
    {
      zzb(paramArrayOfInt);
    }
    return null;
  }
  
  protected final Set zzb(Set paramSet)
  {
    Scope localScope1 = new Scope("https://www.googleapis.com/auth/games");
    Scope localScope2 = new Scope("https://www.googleapis.com/auth/games.firstparty");
    Iterator localIterator = paramSet.iterator();
    int i = 0;
    boolean bool = false;
    while (localIterator.hasNext())
    {
      Scope localScope3 = (Scope)localIterator.next();
      if (localScope3.equals(localScope1))
      {
        bool = true;
      }
      else
      {
        if (!localScope3.equals(localScope2)) {
          break label147;
        }
        i = 1;
      }
    }
    label147:
    for (;;)
    {
      break;
      if (i != 0)
      {
        if (!bool) {}
        for (bool = true;; bool = false)
        {
          zzx.zza(bool, "Cannot have both %s and %s!", new Object[] { "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty" });
          return paramSet;
        }
      }
      zzx.zza(bool, "Games APIs requires %s to function.", new Object[] { "https://www.googleapis.com/auth/games" });
      return paramSet;
    }
  }
  
  public final void zzb(zza.zzb paramzzb, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    ((IGamesService)zzqJ()).zzb(new GamesClientImpl.PlayersLoadedBinderCallback(paramzzb), paramInt, paramBoolean1, paramBoolean2);
  }
  
  public final void zzb(zza.zzb paramzzb, String paramString)
  {
    if (paramzzb == null) {}
    for (paramzzb = null;; paramzzb = new GamesClientImpl.AchievementUpdatedBinderCallback(paramzzb))
    {
      ((IGamesService)zzqJ()).zzb(paramzzb, paramString, zzaEd.zzxj(), zzaEd.zzxi());
      return;
    }
  }
  
  public final void zzb(zza.zzb paramzzb, String paramString, int paramInt)
  {
    if (paramzzb == null) {}
    for (paramzzb = null;; paramzzb = new GamesClientImpl.AchievementUpdatedBinderCallback(paramzzb))
    {
      ((IGamesService)zzqJ()).zzb(paramzzb, paramString, paramInt, zzaEd.zzxj(), zzaEd.zzxi());
      return;
    }
  }
  
  public final void zzb(zza.zzb paramzzb, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zzb(new GamesClientImpl.LeaderboardScoresLoadedBinderCallback(paramzzb), paramString, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
  
  public final void zzb(zza.zzb paramzzb, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    ((IGamesService)zzqJ()).zzb(new GamesClientImpl.PlayersLoadedBinderCallback(paramzzb), paramString, paramInt, paramBoolean1, paramBoolean2);
  }
  
  public final void zzb(zza.zzb paramzzb, String paramString1, String paramString2)
  {
    zzaDZ.flush();
    ((IGamesService)zzqJ()).zzf(new GamesClientImpl.QuestMilestoneClaimBinderCallbacks(paramzzb, paramString2), paramString1, paramString2);
  }
  
  public final void zzb(zza.zzb paramzzb, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zzb(new GamesClientImpl.LeaderboardScoresLoadedBinderCallback(paramzzb), paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
  
  public final void zzb(zza.zzb paramzzb, String paramString1, String paramString2, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    ((IGamesService)zzqJ()).zzb(new GamesClientImpl.PlayersLoadedBinderCallback(paramzzb), paramString1, paramString2, paramInt, paramBoolean1, paramBoolean2);
  }
  
  public final void zzb(zza.zzb paramzzb, String paramString1, String paramString2, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.AchievementsLoadedBinderCallback(paramzzb), paramString1, paramString2, paramBoolean);
  }
  
  public final void zzb(zza.zzb paramzzb, String paramString, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zzc(new GamesClientImpl.LeaderboardsLoadedBinderCallback(paramzzb), paramString, paramBoolean);
  }
  
  public final void zzb(zza.zzb paramzzb, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zzb(new GamesClientImpl.LeaderboardsLoadedBinderCallback(paramzzb), paramBoolean);
  }
  
  public final void zzb(zza.zzb paramzzb, boolean paramBoolean, String[] paramArrayOfString)
  {
    zzaDZ.flush();
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.QuestsLoadedBinderCallbacks(paramzzb), paramArrayOfString, paramBoolean);
  }
  
  public final void zzb(zza.zzb paramzzb, String[] paramArrayOfString)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.RequestsUpdatedBinderCallbacks(paramzzb), paramArrayOfString);
  }
  
  public final void zzb(zzq paramzzq)
  {
    try
    {
      paramzzq = new GamesClientImpl.MatchUpdateReceivedBinderCallback(paramzzq);
      ((IGamesService)zzqJ()).zzb(paramzzq, zzaEg);
      return;
    }
    catch (RemoteException paramzzq)
    {
      zzb(paramzzq);
    }
  }
  
  public final void zzb(zzq paramzzq1, zzq paramzzq2, zzq paramzzq3, RoomConfig paramRoomConfig)
  {
    try
    {
      paramzzq1 = new GamesClientImpl.RoomBinderCallbacks(paramzzq1, paramzzq2, paramzzq3);
      ((IGamesService)zzqJ()).zza(paramzzq1, zzaEf, paramRoomConfig.getInvitationId(), false, zzaEg);
      return;
    }
    catch (RemoteException paramzzq1)
    {
      zzb(paramzzq1);
    }
  }
  
  public final void zzb(IGamesService paramIGamesService)
  {
    try
    {
      paramIGamesService.zza(new GamesClientImpl.PopupLocationInfoBinderCallbacks(zzaEd), zzaEg);
      return;
    }
    catch (RemoteException paramIGamesService)
    {
      zzb(paramIGamesService);
    }
  }
  
  public final void zzb(String paramString, zza.zzb paramzzb)
  {
    zzx.zzh(paramString, "Please provide a valid serverClientId");
    ((IGamesService)zzqJ()).zza(paramString, new GamesClientImpl.GetServerAuthCodeBinderCallbacks(paramzzb));
  }
  
  protected final IGamesService zzbV(IBinder paramIBinder)
  {
    return IGamesService.Stub.zzbY(paramIBinder);
  }
  
  public final Intent zzc(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      Intent localIntent = ((IGamesService)zzqJ()).zzc(paramInt1, paramInt2, paramBoolean);
      return localIntent;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return null;
  }
  
  public final void zzc(zza.zzb paramzzb, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    ((IGamesService)zzqJ()).zzc(new GamesClientImpl.PlayersLoadedBinderCallback(paramzzb), paramInt, paramBoolean1, paramBoolean2);
  }
  
  public final void zzc(zza.zzb paramzzb, String paramString)
  {
    ((IGamesService)zzqJ()).zzl(new GamesClientImpl.TurnBasedMatchInitiatedBinderCallbacks(paramzzb), paramString);
  }
  
  public final void zzc(zza.zzb paramzzb, String paramString, int paramInt)
  {
    ((IGamesService)zzqJ()).zzb(new GamesClientImpl.PlayerXpStreamLoadedBinderCallback(paramzzb), paramString, paramInt);
  }
  
  public final void zzc(zza.zzb paramzzb, String paramString1, String paramString2)
  {
    ((IGamesService)zzqJ()).zzd(new GamesClientImpl.TurnBasedMatchInitiatedBinderCallbacks(paramzzb), paramString1, paramString2);
  }
  
  public final void zzc(zza.zzb paramzzb, String paramString1, String paramString2, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zzc(new GamesClientImpl.SnapshotsLoadedBinderCallbacks(paramzzb), paramString1, paramString2, paramBoolean);
  }
  
  public final void zzc(zza.zzb paramzzb, String paramString, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zzd(new GamesClientImpl.LeaderboardsLoadedBinderCallback(paramzzb), paramString, paramBoolean);
  }
  
  public final void zzc(zza.zzb paramzzb, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.AchievementsLoadedBinderCallback(paramzzb), paramBoolean);
  }
  
  public final void zzc(zza.zzb paramzzb, String[] paramArrayOfString)
  {
    ((IGamesService)zzqJ()).zzb(new GamesClientImpl.RequestsUpdatedBinderCallbacks(paramzzb), paramArrayOfString);
  }
  
  public final void zzc(zzq paramzzq)
  {
    try
    {
      paramzzq = new GamesClientImpl.QuestUpdateBinderCallback(paramzzq);
      ((IGamesService)zzqJ()).zzd(paramzzq, zzaEg);
      return;
    }
    catch (RemoteException paramzzq)
    {
      zzb(paramzzq);
    }
  }
  
  public final int zzd(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      int i = ((IGamesService)zzqJ()).zzb(paramArrayOfByte, paramString, null);
      return i;
    }
    catch (RemoteException paramArrayOfByte)
    {
      zzb(paramArrayOfByte);
    }
    return -1;
  }
  
  public final void zzd(zza.zzb paramzzb)
  {
    ((IGamesService)zzqJ()).zzk(new GamesClientImpl.GetAuthTokenBinderCallbacks(paramzzb));
  }
  
  public final void zzd(zza.zzb paramzzb, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    ((IGamesService)zzqJ()).zze(new GamesClientImpl.PlayersLoadedBinderCallback(paramzzb), paramInt, paramBoolean1, paramBoolean2);
  }
  
  public final void zzd(zza.zzb paramzzb, String paramString)
  {
    ((IGamesService)zzqJ()).zzm(new GamesClientImpl.TurnBasedMatchInitiatedBinderCallbacks(paramzzb), paramString);
  }
  
  public final void zzd(zza.zzb paramzzb, String paramString, int paramInt)
  {
    ((IGamesService)zzqJ()).zzc(new GamesClientImpl.PlayerXpStreamLoadedBinderCallback(paramzzb), paramString, paramInt);
  }
  
  public final void zzd(zza.zzb paramzzb, String paramString1, String paramString2)
  {
    ((IGamesService)zzqJ()).zze(new GamesClientImpl.TurnBasedMatchInitiatedBinderCallbacks(paramzzb), paramString1, paramString2);
  }
  
  public final void zzd(zza.zzb paramzzb, String paramString, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.GameMuteStatusChangedBinderCallback(paramzzb), paramString, paramBoolean);
  }
  
  public final void zzd(zza.zzb paramzzb, boolean paramBoolean)
  {
    zzaDZ.flush();
    ((IGamesService)zzqJ()).zzf(new GamesClientImpl.EventsLoadedBinderCallback(paramzzb), paramBoolean);
  }
  
  public final void zzd(zzq paramzzq)
  {
    try
    {
      paramzzq = new GamesClientImpl.RequestReceivedBinderCallback(paramzzq);
      ((IGamesService)zzqJ()).zzc(paramzzq, zzaEg);
      return;
    }
    catch (RemoteException paramzzq)
    {
      zzb(paramzzq);
    }
  }
  
  public final void zzdH(String paramString)
  {
    try
    {
      ((IGamesService)zzqJ()).zzdP(paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      zzb(paramString);
    }
  }
  
  public final Intent zzdI(String paramString)
  {
    try
    {
      paramString = ((IGamesService)zzqJ()).zzdI(paramString);
      return paramString;
    }
    catch (RemoteException paramString)
    {
      zzb(paramString);
    }
    return null;
  }
  
  public final void zzdJ(String paramString)
  {
    try
    {
      ((IGamesService)zzqJ()).zza(paramString, zzaEd.zzxj(), zzaEd.zzxi());
      return;
    }
    catch (RemoteException paramString)
    {
      zzb(paramString);
    }
  }
  
  public final void zze(zza.zzb paramzzb)
  {
    ((IGamesService)zzqJ()).zzd(new GamesClientImpl.GamesLoadedBinderCallback(paramzzb));
  }
  
  public final void zze(zza.zzb paramzzb, String paramString)
  {
    ((IGamesService)zzqJ()).zzo(new GamesClientImpl.TurnBasedMatchLeftBinderCallbacks(paramzzb), paramString);
  }
  
  public final void zze(zza.zzb paramzzb, String paramString, int paramInt)
  {
    ((IGamesService)zzqJ()).zzb(new GamesClientImpl.InvitationsLoadedBinderCallback(paramzzb), paramString, paramInt, false);
  }
  
  public final void zze(zza.zzb paramzzb, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zzi(new GamesClientImpl.PlayerStatsLoadedBinderCallbacks(paramzzb), paramBoolean);
  }
  
  public final void zzf(zza.zzb paramzzb)
  {
    zzaDZ.flush();
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.SignOutCompleteBinderCallbacks(paramzzb));
  }
  
  public final void zzf(zza.zzb paramzzb, String paramString)
  {
    ((IGamesService)zzqJ()).zzn(new GamesClientImpl.TurnBasedMatchCanceledBinderCallbacks(paramzzb), paramString);
  }
  
  public final void zzf(zza.zzb paramzzb, String paramString, int paramInt)
  {
    ((IGamesService)zzqJ()).zza(new GamesClientImpl.RequestSummariesLoadedBinderCallbacks(paramzzb), paramString, paramInt);
  }
  
  public final void zzf(zza.zzb paramzzb, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zzd(new GamesClientImpl.SnapshotsLoadedBinderCallbacks(paramzzb), paramBoolean);
  }
  
  public final void zzg(zza.zzb paramzzb)
  {
    ((IGamesService)zzqJ()).zzm(new GamesClientImpl.VideoRecordingCapabilitiesBinderCallback(paramzzb));
  }
  
  public final void zzg(zza.zzb paramzzb, String paramString)
  {
    ((IGamesService)zzqJ()).zzp(new GamesClientImpl.TurnBasedMatchLoadedBinderCallbacks(paramzzb), paramString);
  }
  
  public final void zzg(zza.zzb paramzzb, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zzg(new GamesClientImpl.ProfileSettingsLoadedBinderCallback(paramzzb), paramBoolean);
  }
  
  public final void zzgs(int paramInt)
  {
    zzaEd.setGravity(paramInt);
  }
  
  public final void zzgt(int paramInt)
  {
    try
    {
      ((IGamesService)zzqJ()).zzgt(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
  }
  
  protected final String zzgu()
  {
    return "com.google.android.gms.games.service.START";
  }
  
  protected final String zzgv()
  {
    return "com.google.android.gms.games.internal.IGamesService";
  }
  
  public final void zzh(zza.zzb paramzzb)
  {
    ((IGamesService)zzqJ()).zzn(new GamesClientImpl.VideoRecordingAvailableBinderCallback(paramzzb));
  }
  
  public final void zzh(zza.zzb paramzzb, String paramString)
  {
    zzaDZ.flush();
    ((IGamesService)zzqJ()).zzu(new GamesClientImpl.QuestAcceptedBinderCallbacks(paramzzb), paramString);
  }
  
  public final void zzh(zza.zzb paramzzb, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zzh(new GamesClientImpl.ProfileSettingsUpdatedBinderCallback(paramzzb), paramBoolean);
  }
  
  public final void zzi(zza.zzb paramzzb)
  {
    ((IGamesService)zzqJ()).zzl(new GamesClientImpl.ListVideosBinderCallback(paramzzb));
  }
  
  public final void zzi(zza.zzb paramzzb, String paramString)
  {
    ((IGamesService)zzqJ()).zzr(new GamesClientImpl.SnapshotDeletedBinderCallbacks(paramzzb), paramString);
  }
  
  public final void zzi(zza.zzb paramzzb, boolean paramBoolean)
  {
    ((IGamesService)zzqJ()).zze(new GamesClientImpl.ContactSettingsLoadedBinderCallback(paramzzb), paramBoolean);
  }
  
  public final void zzj(zza.zzb paramzzb)
  {
    ((IGamesService)zzqJ()).zzh(new GamesClientImpl.NotifyAclLoadedBinderCallback(paramzzb));
  }
  
  public final void zzj(zza.zzb paramzzb, String paramString)
  {
    ((IGamesService)zzqJ()).zzf(new GamesClientImpl.GameInstancesLoadedBinderCallback(paramzzb), paramString);
  }
  
  public final void zzk(zza.zzb paramzzb)
  {
    ((IGamesService)zzqJ()).zzt(new GamesClientImpl.InboxCountsLoadedBinderCallback(paramzzb), null);
  }
  
  public final void zzk(zza.zzb paramzzb, String paramString)
  {
    ((IGamesService)zzqJ()).zzq(new GamesClientImpl.GameSearchSuggestionsLoadedBinderCallback(paramzzb), paramString);
  }
  
  public final Intent zzl(String paramString, int paramInt1, int paramInt2)
  {
    try
    {
      paramString = ((IGamesService)zzqJ()).zzm(paramString, paramInt1, paramInt2);
      return paramString;
    }
    catch (RemoteException paramString)
    {
      zzb(paramString);
    }
    return null;
  }
  
  public final void zzl(zza.zzb paramzzb)
  {
    ((IGamesService)zzqJ()).zzo(new GamesClientImpl.ExperimentsLoadedBinderCallback(paramzzb));
  }
  
  public final void zzl(zza.zzb paramzzb, String paramString)
  {
    ((IGamesService)zzqJ()).zzs(new GamesClientImpl.PlayerXpForGameCategoriesLoadedBinderCallback(paramzzb), paramString);
  }
  
  public final void zzm(zza.zzb paramzzb, String paramString)
  {
    ((IGamesService)zzqJ()).zzk(new GamesClientImpl.InvitationsLoadedBinderCallback(paramzzb), paramString);
  }
  
  public final boolean zzmE()
  {
    return true;
  }
  
  protected final Bundle zzml()
  {
    String str = getContextgetResourcesgetConfigurationlocale.toString();
    Bundle localBundle = zzaEh.zzvD();
    localBundle.putString("com.google.android.gms.games.key.gamePackageName", zzaEa);
    localBundle.putString("com.google.android.gms.games.key.desiredLocale", str);
    localBundle.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(zzaEd.zzxj()));
    localBundle.putInt("com.google.android.gms.games.key.API_VERSION", 3);
    localBundle.putBundle("com.google.android.gms.games.key.signInOptions", zzh.zza(zzqH()));
    return localBundle;
  }
  
  public final void zzn(zza.zzb paramzzb, String paramString)
  {
    ((IGamesService)zzqJ()).zzj(new GamesClientImpl.NotifyAclUpdatedBinderCallback(paramzzb), paramString);
  }
  
  public final void zzo(View paramView)
  {
    zzaEd.zzp(paramView);
  }
  
  public final void zzo(zza.zzb paramzzb, String paramString)
  {
    ((IGamesService)zzqJ()).zzi(new GamesClientImpl.GameMuteStatusLoadedBinderCallback(paramzzb), paramString);
  }
  
  public final Bundle zzoi()
  {
    try
    {
      Bundle localBundle = ((IGamesService)zzqJ()).zzoi();
      if (localBundle != null) {
        localBundle.setClassLoader(GamesClientImpl.class.getClassLoader());
      }
      return localBundle;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return null;
  }
  
  public final void zzp(String paramString, int paramInt)
  {
    zzaDZ.zzp(paramString, paramInt);
  }
  
  public final void zzq(String paramString, int paramInt)
  {
    try
    {
      ((IGamesService)zzqJ()).zzq(paramString, paramInt);
      return;
    }
    catch (RemoteException paramString)
    {
      zzb(paramString);
    }
  }
  
  public final void zzr(String paramString, int paramInt)
  {
    try
    {
      ((IGamesService)zzqJ()).zzr(paramString, paramInt);
      return;
    }
    catch (RemoteException paramString)
    {
      zzb(paramString);
    }
  }
  
  public final Intent zzwA()
  {
    try
    {
      Intent localIntent = ((IGamesService)zzqJ()).zzwA();
      return localIntent;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return null;
  }
  
  public final Intent zzwB()
  {
    try
    {
      Intent localIntent = ((IGamesService)zzqJ()).zzwB();
      return localIntent;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return null;
  }
  
  public final Intent zzwC()
  {
    try
    {
      Intent localIntent = ((IGamesService)zzqJ()).zzwC();
      return localIntent;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return null;
  }
  
  public final void zzwD()
  {
    try
    {
      ((IGamesService)zzqJ()).zzG(zzaEg);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
  }
  
  public final void zzwE()
  {
    try
    {
      ((IGamesService)zzqJ()).zzH(zzaEg);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
  }
  
  public final void zzwF()
  {
    try
    {
      ((IGamesService)zzqJ()).zzJ(zzaEg);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
  }
  
  public final void zzwG()
  {
    try
    {
      ((IGamesService)zzqJ()).zzI(zzaEg);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
  }
  
  public final Intent zzwH()
  {
    try
    {
      Intent localIntent = ((IGamesService)zzqJ()).zzwH();
      return localIntent;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return null;
  }
  
  public final Intent zzwI()
  {
    try
    {
      Intent localIntent = ((IGamesService)zzqJ()).zzwI();
      return localIntent;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return null;
  }
  
  public final int zzwJ()
  {
    try
    {
      int i = ((IGamesService)zzqJ()).zzwJ();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return 4368;
  }
  
  public final String zzwK()
  {
    try
    {
      String str = ((IGamesService)zzqJ()).zzwK();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return null;
  }
  
  public final int zzwL()
  {
    try
    {
      int i = ((IGamesService)zzqJ()).zzwL();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return -1;
  }
  
  public final Intent zzwM()
  {
    try
    {
      Intent localIntent = ((IGamesService)zzqJ()).zzwM();
      return localIntent;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return null;
  }
  
  public final int zzwN()
  {
    try
    {
      int i = ((IGamesService)zzqJ()).zzwN();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return -1;
  }
  
  public final int zzwO()
  {
    try
    {
      int i = ((IGamesService)zzqJ()).zzwO();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return -1;
  }
  
  public final int zzwP()
  {
    try
    {
      int i = ((IGamesService)zzqJ()).zzwP();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return -1;
  }
  
  public final int zzwQ()
  {
    try
    {
      int i = ((IGamesService)zzqJ()).zzwQ();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return -1;
  }
  
  public final void zzwR()
  {
    if (isConnected()) {}
    try
    {
      ((IGamesService)zzqJ()).zzwR();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
  }
  
  public final String zzww()
  {
    try
    {
      String str = ((IGamesService)zzqJ()).zzww();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return null;
  }
  
  /* Error */
  public final com.google.android.gms.games.Player zzwx()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 1103	com/google/android/gms/games/internal/GamesClientImpl:zzqI	()V
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 124	com/google/android/gms/games/internal/GamesClientImpl:zzaEb	Lcom/google/android/gms/games/PlayerEntity;
    //   10: astore_1
    //   11: aload_1
    //   12: ifnonnull +51 -> 63
    //   15: new 1105	com/google/android/gms/games/PlayerBuffer
    //   18: dup
    //   19: aload_0
    //   20: invokevirtual 137	com/google/android/gms/games/internal/GamesClientImpl:zzqJ	()Landroid/os/IInterface;
    //   23: checkcast 139	com/google/android/gms/games/internal/IGamesService
    //   26: invokeinterface 1109 1 0
    //   31: invokespecial 1110	com/google/android/gms/games/PlayerBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   34: astore_1
    //   35: aload_1
    //   36: invokevirtual 1111	com/google/android/gms/games/PlayerBuffer:getCount	()I
    //   39: ifle +20 -> 59
    //   42: aload_0
    //   43: aload_1
    //   44: iconst_0
    //   45: invokevirtual 1114	com/google/android/gms/games/PlayerBuffer:get	(I)Lcom/google/android/gms/games/Player;
    //   48: invokeinterface 1117 1 0
    //   53: checkcast 241	com/google/android/gms/games/PlayerEntity
    //   56: putfield 124	com/google/android/gms/games/internal/GamesClientImpl:zzaEb	Lcom/google/android/gms/games/PlayerEntity;
    //   59: aload_1
    //   60: invokevirtual 1118	com/google/android/gms/games/PlayerBuffer:release	()V
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_0
    //   66: getfield 124	com/google/android/gms/games/internal/GamesClientImpl:zzaEb	Lcom/google/android/gms/games/PlayerEntity;
    //   69: areturn
    //   70: astore_2
    //   71: aload_1
    //   72: invokevirtual 1118	com/google/android/gms/games/PlayerBuffer:release	()V
    //   75: aload_2
    //   76: athrow
    //   77: astore_1
    //   78: aload_0
    //   79: aload_1
    //   80: invokespecial 112	com/google/android/gms/games/internal/GamesClientImpl:zzb	(Landroid/os/RemoteException;)V
    //   83: goto -20 -> 63
    //   86: astore_1
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_1
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	GamesClientImpl
    //   10	62	1	localObject1	Object
    //   77	3	1	localRemoteException	RemoteException
    //   86	4	1	localObject2	Object
    //   70	6	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   35	59	70	finally
    //   15	35	77	android/os/RemoteException
    //   59	63	77	android/os/RemoteException
    //   71	77	77	android/os/RemoteException
    //   6	11	86	finally
    //   15	35	86	finally
    //   59	63	86	finally
    //   63	65	86	finally
    //   71	77	86	finally
    //   78	83	86	finally
  }
  
  /* Error */
  public final com.google.android.gms.games.Game zzwy()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 1103	com/google/android/gms/games/internal/GamesClientImpl:zzqI	()V
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 126	com/google/android/gms/games/internal/GamesClientImpl:zzaEc	Lcom/google/android/gms/games/GameEntity;
    //   10: astore_1
    //   11: aload_1
    //   12: ifnonnull +51 -> 63
    //   15: new 1122	com/google/android/gms/games/GameBuffer
    //   18: dup
    //   19: aload_0
    //   20: invokevirtual 137	com/google/android/gms/games/internal/GamesClientImpl:zzqJ	()Landroid/os/IInterface;
    //   23: checkcast 139	com/google/android/gms/games/internal/IGamesService
    //   26: invokeinterface 1125 1 0
    //   31: invokespecial 1126	com/google/android/gms/games/GameBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   34: astore_1
    //   35: aload_1
    //   36: invokevirtual 1127	com/google/android/gms/games/GameBuffer:getCount	()I
    //   39: ifle +20 -> 59
    //   42: aload_0
    //   43: aload_1
    //   44: iconst_0
    //   45: invokevirtual 1130	com/google/android/gms/games/GameBuffer:get	(I)Lcom/google/android/gms/games/Game;
    //   48: invokeinterface 1133 1 0
    //   53: checkcast 245	com/google/android/gms/games/GameEntity
    //   56: putfield 126	com/google/android/gms/games/internal/GamesClientImpl:zzaEc	Lcom/google/android/gms/games/GameEntity;
    //   59: aload_1
    //   60: invokevirtual 1134	com/google/android/gms/games/GameBuffer:release	()V
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_0
    //   66: getfield 126	com/google/android/gms/games/internal/GamesClientImpl:zzaEc	Lcom/google/android/gms/games/GameEntity;
    //   69: areturn
    //   70: astore_2
    //   71: aload_1
    //   72: invokevirtual 1134	com/google/android/gms/games/GameBuffer:release	()V
    //   75: aload_2
    //   76: athrow
    //   77: astore_1
    //   78: aload_0
    //   79: aload_1
    //   80: invokespecial 112	com/google/android/gms/games/internal/GamesClientImpl:zzb	(Landroid/os/RemoteException;)V
    //   83: goto -20 -> 63
    //   86: astore_1
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_1
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	GamesClientImpl
    //   10	62	1	localObject1	Object
    //   77	3	1	localRemoteException	RemoteException
    //   86	4	1	localObject2	Object
    //   70	6	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   35	59	70	finally
    //   15	35	77	android/os/RemoteException
    //   59	63	77	android/os/RemoteException
    //   71	77	77	android/os/RemoteException
    //   6	11	86	finally
    //   15	35	86	finally
    //   59	63	86	finally
    //   63	65	86	finally
    //   71	77	86	finally
    //   78	83	86	finally
  }
  
  public final Intent zzwz()
  {
    try
    {
      Intent localIntent = ((IGamesService)zzqJ()).zzwz();
      return localIntent;
    }
    catch (RemoteException localRemoteException)
    {
      zzb(localRemoteException);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */