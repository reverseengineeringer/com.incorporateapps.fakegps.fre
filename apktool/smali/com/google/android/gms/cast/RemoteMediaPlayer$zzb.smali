.class abstract Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;
.super Lcom/google/android/gms/cast/internal/zzb;


# instance fields
.field zzacm:Lcom/google/android/gms/cast/internal/zzo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/internal/zzb;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb$1;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;->zzacm:Lcom/google/android/gms/cast/internal/zzo;

    return-void
.end method


# virtual methods
.method public synthetic zzc(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;->zzq(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;

    move-result-object v0

    return-object v0
.end method

.method public zzq(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb$2;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb$2;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer$zzb;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method