.class final Lcom/google/android/gms/games/Games$6;
.super Lcom/google/android/gms/games/Games$BaseGamesApiMethodImpl;


# virtual methods
.method protected final zzW(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/Games$LoadExperimentsResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/Games$6$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/Games$6$1;-><init>(Lcom/google/android/gms/games/Games$6;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method protected final synthetic zza(Lcom/google/android/gms/common/api/Api$zzb;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zzl(Lcom/google/android/gms/common/api/internal/zza$zzb;)V

    return-void
.end method

.method protected final zza(Lcom/google/android/gms/games/internal/GamesClientImpl;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->zzl(Lcom/google/android/gms/common/api/internal/zza$zzb;)V

    return-void
.end method

.method protected final synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/Games$6;->zzW(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/Games$LoadExperimentsResult;

    move-result-object v0

    return-object v0
.end method
