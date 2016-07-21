.class Lcom/google/android/gms/internal/zzdg$zzb;
.super Ljava/lang/Object;


# instance fields
.field private final zzzp:Ljava/lang/String;

.field private final zzzq:Ljava/net/URL;

.field private final zzzr:Ljava/util/ArrayList;

.field private final zzzs:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/net/URL;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzdg$zzb;->zzzp:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzdg$zzb;->zzzq:Ljava/net/URL;

    if-nez p3, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzdg$zzb;->zzzr:Ljava/util/ArrayList;

    :goto_0
    iput-object p4, p0, Lcom/google/android/gms/internal/zzdg$zzb;->zzzs:Ljava/lang/String;

    return-void

    :cond_0
    iput-object p3, p0, Lcom/google/android/gms/internal/zzdg$zzb;->zzzr:Ljava/util/ArrayList;

    goto :goto_0
.end method


# virtual methods
.method public zzdU()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdg$zzb;->zzzp:Ljava/lang/String;

    return-object v0
.end method

.method public zzdV()Ljava/net/URL;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdg$zzb;->zzzq:Ljava/net/URL;

    return-object v0
.end method

.method public zzdW()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdg$zzb;->zzzr:Ljava/util/ArrayList;

    return-object v0
.end method

.method public zzdX()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzdg$zzb;->zzzs:Ljava/lang/String;

    return-object v0
.end method
