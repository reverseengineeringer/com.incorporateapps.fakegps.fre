.class abstract Lcom/google/android/gms/games/internal/api/VideosImpl$CapabilitiesImpl;
.super Lcom/google/android/gms/games/Games$BaseGamesApiMethodImpl;


# virtual methods
.method public zzaP(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/video/Videos$VideoCapabilitiesResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/api/VideosImpl$CapabilitiesImpl$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/api/VideosImpl$CapabilitiesImpl$1;-><init>(Lcom/google/android/gms/games/internal/api/VideosImpl$CapabilitiesImpl;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/api/VideosImpl$CapabilitiesImpl;->zzaP(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/video/Videos$VideoCapabilitiesResult;

    move-result-object v0

    return-object v0
.end method
