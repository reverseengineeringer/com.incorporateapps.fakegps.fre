.class public final Lcom/google/android/gms/internal/zzpu;
.super Lcom/google/android/gms/measurement/zze;


# instance fields
.field private mCategory:Ljava/lang/String;

.field private zzSU:Ljava/lang/String;

.field private zzaDV:J

.field private zzaUO:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/zze;-><init>()V

    return-void
.end method


# virtual methods
.method public final getAction()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpu;->zzSU:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpu;->zzaUO:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzpu;->zzaDV:J

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "category"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpu;->mCategory:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "action"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpu;->zzSU:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "label"

    iget-object v2, p0, Lcom/google/android/gms/internal/zzpu;->zzaUO:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "value"

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzpu;->zzaDV:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzpu;->zzF(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzAZ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpu;->mCategory:Ljava/lang/String;

    return-object v0
.end method

.method public final zzN(J)V
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/internal/zzpu;->zzaDV:J

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/zzpu;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpu;->mCategory:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpu;->mCategory:Ljava/lang/String;

    iput-object v0, p1, Lcom/google/android/gms/internal/zzpu;->mCategory:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzpu;->zzSU:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpu;->zzSU:Ljava/lang/String;

    iput-object v0, p1, Lcom/google/android/gms/internal/zzpu;->zzSU:Ljava/lang/String;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzpu;->zzaUO:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzpu;->zzaUO:Ljava/lang/String;

    iput-object v0, p1, Lcom/google/android/gms/internal/zzpu;->zzaUO:Ljava/lang/String;

    :cond_2
    iget-wide v0, p0, Lcom/google/android/gms/internal/zzpu;->zzaDV:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzpu;->zzaDV:J

    iput-wide v0, p1, Lcom/google/android/gms/internal/zzpu;->zzaDV:J

    :cond_3
    return-void
.end method

.method public final bridge synthetic zza(Lcom/google/android/gms/measurement/zze;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/zzpu;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzpu;->zza(Lcom/google/android/gms/internal/zzpu;)V

    return-void
.end method

.method public final zzeE(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpu;->mCategory:Ljava/lang/String;

    return-void
.end method

.method public final zzeF(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpu;->zzSU:Ljava/lang/String;

    return-void
.end method

.method public final zzeG(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzpu;->zzaUO:Ljava/lang/String;

    return-void
.end method
