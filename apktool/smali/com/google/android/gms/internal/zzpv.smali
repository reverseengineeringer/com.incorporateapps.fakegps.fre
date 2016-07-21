.class public final Lcom/google/android/gms/internal/zzpv;
.super Lcom/google/android/gms/measurement/zze;


# instance fields
.field public zzaUP:Z

.field public zzaxl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/zze;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpv;->zzaxl:Ljava/lang/String;

    return-object v0
.end method

.method public final setDescription(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpv;->zzaxl:Ljava/lang/String;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "description"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpv;->zzaxl:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "fatal"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzpv;->zzaUP:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzpv;->zzF(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzBa()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzpv;->zzaUP:Z

    return v0
.end method

.method public final zza(Lcom/google/android/gms/internal/zzpv;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpv;->zzaxl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpv;->zzaxl:Ljava/lang/String;

    iput-object v0, p1, Lcom/google/android/gms/internal/zzpv;->zzaxl:Ljava/lang/String;

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzpv;->zzaUP:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzpv;->zzaUP:Z

    iput-boolean v0, p1, Lcom/google/android/gms/internal/zzpv;->zzaUP:Z

    :cond_1
    return-void
.end method

.method public final bridge synthetic zza(Lcom/google/android/gms/measurement/zze;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/zzpv;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzpv;->zza(Lcom/google/android/gms/internal/zzpv;)V

    return-void
.end method

.method public final zzao(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/zzpv;->zzaUP:Z

    return-void
.end method
