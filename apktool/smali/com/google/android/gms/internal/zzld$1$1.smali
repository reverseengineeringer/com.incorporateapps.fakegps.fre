.class Lcom/google/android/gms/internal/zzld$1$1;
.super Lcom/google/android/gms/internal/zzky;


# instance fields
.field final synthetic zzWJ:Lcom/google/android/gms/internal/zzld$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzld$1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzld$1$1;->zzWJ:Lcom/google/android/gms/internal/zzld$1;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzky;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/auth/api/proxy/ProxyResponse;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzld$1$1;->zzWJ:Lcom/google/android/gms/internal/zzld$1;

    new-instance v1, Lcom/google/android/gms/internal/zzle;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/zzle;-><init>(Lcom/google/android/gms/auth/api/proxy/ProxyResponse;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzld$1;->zza(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
