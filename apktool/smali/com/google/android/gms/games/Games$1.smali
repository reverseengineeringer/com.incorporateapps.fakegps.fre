.class final Lcom/google/android/gms/games/Games$1;
.super Lcom/google/android/gms/games/Games$GamesClientBuilder;


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/games/Games$GamesClientBuilder;-><init>(Lcom/google/android/gms/games/Games$1;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/games/Games$GamesOptions;)Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/google/android/gms/games/Games;->SCOPE_GAMES:Lcom/google/android/gms/common/api/Scope;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic zzo(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    check-cast p1, Lcom/google/android/gms/games/Games$GamesOptions;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/Games$1;->zza(Lcom/google/android/gms/games/Games$GamesOptions;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
