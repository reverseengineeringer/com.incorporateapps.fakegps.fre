package com.google.android.gms.games;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.api.AchievementsImpl;
import com.google.android.gms.games.internal.api.AclsImpl;
import com.google.android.gms.games.internal.api.AppContentsImpl;
import com.google.android.gms.games.internal.api.EventsImpl;
import com.google.android.gms.games.internal.api.GamesMetadataImpl;
import com.google.android.gms.games.internal.api.InvitationsImpl;
import com.google.android.gms.games.internal.api.LeaderboardsImpl;
import com.google.android.gms.games.internal.api.MultiplayerImpl;
import com.google.android.gms.games.internal.api.NotificationsImpl;
import com.google.android.gms.games.internal.api.PlayersImpl;
import com.google.android.gms.games.internal.api.QuestsImpl;
import com.google.android.gms.games.internal.api.RealTimeMultiplayerImpl;
import com.google.android.gms.games.internal.api.RequestsImpl;
import com.google.android.gms.games.internal.api.SnapshotsImpl;
import com.google.android.gms.games.internal.api.StatsImpl;
import com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl;
import com.google.android.gms.games.internal.api.VideosImpl;
import com.google.android.gms.games.internal.game.Acls;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.games.stats.Stats;
import com.google.android.gms.games.video.Videos;

public final class Games
{
  public static final Api API;
  public static final Achievements Achievements;
  public static final String EXTRA_PLAYER_IDS = "players";
  public static final String EXTRA_STATUS = "status";
  public static final Events Events;
  public static final GamesMetadata GamesMetadata;
  public static final Invitations Invitations;
  public static final Leaderboards Leaderboards;
  public static final Notifications Notifications = new NotificationsImpl();
  public static final Players Players;
  public static final Quests Quests = new QuestsImpl();
  public static final RealTimeMultiplayer RealTimeMultiplayer;
  public static final Requests Requests = new RequestsImpl();
  public static final Scope SCOPE_GAMES;
  public static final Snapshots Snapshots = new SnapshotsImpl();
  public static final Stats Stats = new StatsImpl();
  public static final TurnBasedMultiplayer TurnBasedMultiplayer;
  static final Api.zzc zzUI = new Api.zzc();
  private static final Api.zza zzUJ = new Games.1();
  public static final Videos zzaCA = new VideosImpl();
  public static final Acls zzaCB = new AclsImpl();
  private static final Api.zza zzaCv = new Games.2();
  public static final Scope zzaCw;
  public static final Api zzaCx;
  public static final AppContents zzaCy;
  public static final Multiplayer zzaCz;
  
  static
  {
    SCOPE_GAMES = new Scope("https://www.googleapis.com/auth/games");
    API = new Api("Games.API", zzUJ, zzUI);
    zzaCw = new Scope("https://www.googleapis.com/auth/games.firstparty");
    zzaCx = new Api("Games.API_1P", zzaCv, zzUI);
    GamesMetadata = new GamesMetadataImpl();
    Achievements = new AchievementsImpl();
    zzaCy = new AppContentsImpl();
    Events = new EventsImpl();
    Leaderboards = new LeaderboardsImpl();
    Invitations = new InvitationsImpl();
    TurnBasedMultiplayer = new TurnBasedMultiplayerImpl();
    RealTimeMultiplayer = new RealTimeMultiplayerImpl();
    zzaCz = new MultiplayerImpl();
    Players = new PlayersImpl();
  }
  
  public static String getAppId(GoogleApiClient paramGoogleApiClient)
  {
    return zzh(paramGoogleApiClient).zzwK();
  }
  
  public static String getCurrentAccountName(GoogleApiClient paramGoogleApiClient)
  {
    return zzh(paramGoogleApiClient).zzww();
  }
  
  public static PendingResult getGamesServerAuthCode(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzx.zzh(paramString, "Please provide a valid serverClientId");
    return paramGoogleApiClient.zzb(new Games.4(paramGoogleApiClient, paramString));
  }
  
  public static int getSdkVariant(GoogleApiClient paramGoogleApiClient)
  {
    return zzh(paramGoogleApiClient).zzwJ();
  }
  
  public static Intent getSettingsIntent(GoogleApiClient paramGoogleApiClient)
  {
    return zzh(paramGoogleApiClient).zzwI();
  }
  
  public static void setGravityForPopups(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    paramGoogleApiClient = zzb(paramGoogleApiClient, false);
    if (paramGoogleApiClient != null) {
      paramGoogleApiClient.zzgs(paramInt);
    }
  }
  
  public static void setViewForPopups(GoogleApiClient paramGoogleApiClient, View paramView)
  {
    zzx.zzz(paramView);
    paramGoogleApiClient = zzb(paramGoogleApiClient, false);
    if (paramGoogleApiClient != null) {
      paramGoogleApiClient.zzo(paramView);
    }
  }
  
  public static PendingResult signOut(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zzb(new Games.5(paramGoogleApiClient));
  }
  
  public static GamesClientImpl zzb(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    if (paramGoogleApiClient != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "GoogleApiClient parameter is required.");
      zzx.zza(paramGoogleApiClient.isConnected(), "GoogleApiClient must be connected.");
      return zzc(paramGoogleApiClient, paramBoolean);
    }
  }
  
  public static GamesClientImpl zzc(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    zzx.zza(paramGoogleApiClient.zza(API), "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
    boolean bool = paramGoogleApiClient.hasConnectedApi(API);
    if ((paramBoolean) && (!bool)) {
      throw new IllegalStateException("GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call.");
    }
    if (bool) {
      return (GamesClientImpl)paramGoogleApiClient.zza(zzUI);
    }
    return null;
  }
  
  public static GamesClientImpl zzh(GoogleApiClient paramGoogleApiClient)
  {
    return zzb(paramGoogleApiClient, true);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.Games
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */