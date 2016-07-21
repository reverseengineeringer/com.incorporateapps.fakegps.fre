.class public final Lcom/google/android/gms/games/internal/GamesClientImpl$ListVideosResultImpl;
.super Lcom/google/android/gms/games/internal/GamesClientImpl$GamesDataHolderResult;

# interfaces
.implements Lcom/google/android/gms/games/video/Videos$ListVideosResult;


# instance fields
.field private final zzaEx:Lcom/google/android/gms/games/video/VideoBuffer;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$GamesDataHolderResult;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    new-instance v0, Lcom/google/android/gms/games/video/VideoBuffer;

    invoke-direct {v0, p1}, Lcom/google/android/gms/games/video/VideoBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$ListVideosResultImpl;->zzaEx:Lcom/google/android/gms/games/video/VideoBuffer;

    return-void
.end method
