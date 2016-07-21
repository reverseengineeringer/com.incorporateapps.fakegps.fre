.class Lcom/google/android/gms/measurement/internal/zzx$6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic zzaYx:Lcom/google/android/gms/measurement/internal/AppMetadata;

.field final synthetic zzaYy:Lcom/google/android/gms/measurement/internal/zzx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzx;Lcom/google/android/gms/measurement/internal/AppMetadata;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzx$6;->zzaYy:Lcom/google/android/gms/measurement/internal/zzx;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzx$6;->zzaYx:Lcom/google/android/gms/measurement/internal/AppMetadata;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/zzx$6;->zzDh()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public zzDh()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzx$6;->zzaYy:Lcom/google/android/gms/measurement/internal/zzx;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzx;->zza(Lcom/google/android/gms/measurement/internal/zzx;)Lcom/google/android/gms/measurement/internal/zzw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzw;->zzCj()Lcom/google/android/gms/measurement/internal/zze;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzx$6;->zzaYx:Lcom/google/android/gms/measurement/internal/AppMetadata;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/AppMetadata;->zzaVt:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zze;->zzeX(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
