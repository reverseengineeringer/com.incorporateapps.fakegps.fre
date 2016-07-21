.class Lcom/google/android/gms/internal/zzkk$1;
.super Lcom/google/android/gms/internal/zzkk$zzc;


# instance fields
.field final synthetic zzUA:Ljava/lang/String;

.field final synthetic zzUB:[Lcom/google/android/gms/appdatasearch/UsageInfo;

.field final synthetic zzUC:Lcom/google/android/gms/internal/zzkk;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzkk;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;[Lcom/google/android/gms/appdatasearch/UsageInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzkk$1;->zzUC:Lcom/google/android/gms/internal/zzkk;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzkk$1;->zzUA:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzkk$1;->zzUB:[Lcom/google/android/gms/appdatasearch/UsageInfo;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/zzkk$zzc;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected zza(Lcom/google/android/gms/internal/zzkf;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/zzkk$zzd;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzkk$zzd;-><init>(Lcom/google/android/gms/common/api/internal/zza$zzb;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzkk$1;->zzUA:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzkk$1;->zzUB:[Lcom/google/android/gms/appdatasearch/UsageInfo;

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/zzkf;->zza(Lcom/google/android/gms/internal/zzkg;Ljava/lang/String;[Lcom/google/android/gms/appdatasearch/UsageInfo;)V

    return-void
.end method
