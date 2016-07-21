.class abstract Lcom/google/android/gms/games/Games$GetTokenImpl;
.super Lcom/google/android/gms/games/Games$BaseGamesApiMethodImpl;


# virtual methods
.method public zzY(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/Games$GetTokenResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/Games$GetTokenImpl$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/Games$GetTokenImpl$1;-><init>(Lcom/google/android/gms/games/Games$GetTokenImpl;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/Games$GetTokenImpl;->zzY(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/Games$GetTokenResult;

    move-result-object v0

    return-object v0
.end method
