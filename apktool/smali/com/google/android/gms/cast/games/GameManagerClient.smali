.class public final Lcom/google/android/gms/cast/games/GameManagerClient;
.super Ljava/lang/Object;


# static fields
.field public static final GAMEPLAY_STATE_LOADING:I = 0x1

.field public static final GAMEPLAY_STATE_PAUSED:I = 0x3

.field public static final GAMEPLAY_STATE_RUNNING:I = 0x2

.field public static final GAMEPLAY_STATE_SHOWING_INFO_SCREEN:I = 0x4

.field public static final GAMEPLAY_STATE_UNKNOWN:I = 0x0

.field public static final LOBBY_STATE_CLOSED:I = 0x2

.field public static final LOBBY_STATE_OPEN:I = 0x1

.field public static final LOBBY_STATE_UNKNOWN:I = 0x0

.field public static final PLAYER_STATE_AVAILABLE:I = 0x3

.field public static final PLAYER_STATE_DROPPED:I = 0x1

.field public static final PLAYER_STATE_IDLE:I = 0x5

.field public static final PLAYER_STATE_PLAYING:I = 0x6

.field public static final PLAYER_STATE_QUIT:I = 0x2

.field public static final PLAYER_STATE_READY:I = 0x4

.field public static final PLAYER_STATE_UNKNOWN:I = 0x0

.field public static final STATUS_INCORRECT_VERSION:I = 0x866

.field public static final STATUS_TOO_MANY_PLAYERS:I = 0x867


# instance fields
.field private final zzacy:Lcom/google/android/gms/internal/zzli;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzli;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzacy:Lcom/google/android/gms/internal/zzli;

    return-void
.end method

.method public static getInstanceFor(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/zzli;

    sget-object v1, Lcom/google/android/gms/cast/Cast;->CastApi:Lcom/google/android/gms/cast/Cast$CastApi;

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/internal/zzli;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Lcom/google/android/gms/cast/Cast$CastApi;)V

    invoke-static {v0}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Lcom/google/android/gms/internal/zzli;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method static zza(Lcom/google/android/gms/internal/zzli;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/cast/games/GameManagerClient;

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/games/GameManagerClient;-><init>(Lcom/google/android/gms/internal/zzli;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzli;->zza(Lcom/google/android/gms/cast/games/GameManagerClient;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method private zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzacy:Lcom/google/android/gms/internal/zzli;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/zzli;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzacy:Lcom/google/android/gms/internal/zzli;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzli;->dispose()V

    return-void
.end method

.method public final declared-synchronized getCurrentState()Lcom/google/android/gms/cast/games/GameManagerState;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzacy:Lcom/google/android/gms/internal/zzli;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzli;->getCurrentState()Lcom/google/android/gms/cast/games/GameManagerState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final getLastUsedPlayerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzacy:Lcom/google/android/gms/internal/zzli;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzli;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isDisposed()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzacy:Lcom/google/android/gms/internal/zzli;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzli;->isDisposed()Z

    move-result v0

    return v0
.end method

.method public final sendGameMessage(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzacy:Lcom/google/android/gms/internal/zzli;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzli;->sendGameMessage(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final sendGameMessage(Lorg/json/JSONObject;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/cast/games/GameManagerClient;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/cast/games/GameManagerClient;->sendGameMessage(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public final sendGameRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzacy:Lcom/google/android/gms/internal/zzli;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzli;->sendGameRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public final sendGameRequest(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/cast/games/GameManagerClient;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/cast/games/GameManagerClient;->sendGameRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public final sendPlayerAvailableRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public final sendPlayerAvailableRequest(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/games/GameManagerClient;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public final sendPlayerIdleRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public final sendPlayerIdleRequest(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/games/GameManagerClient;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public final sendPlayerPlayingRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1

    const/4 v0, 0x6

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public final sendPlayerPlayingRequest(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/games/GameManagerClient;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public final sendPlayerQuitRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public final sendPlayerQuitRequest(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/games/GameManagerClient;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public final sendPlayerReadyRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public final sendPlayerReadyRequest(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/games/GameManagerClient;->getLastUsedPlayerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/cast/games/GameManagerClient;->zza(Ljava/lang/String;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public final setListener(Lcom/google/android/gms/cast/games/GameManagerClient$Listener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzacy:Lcom/google/android/gms/internal/zzli;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzli;->setListener(Lcom/google/android/gms/cast/games/GameManagerClient$Listener;)V

    return-void
.end method

.method public final setSessionLabel(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/games/GameManagerClient;->zzacy:Lcom/google/android/gms/internal/zzli;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzli;->setSessionLabel(Ljava/lang/String;)V

    return-void
.end method
