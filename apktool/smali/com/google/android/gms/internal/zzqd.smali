.class public Lcom/google/android/gms/internal/zzqd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/nearby/bootstrap/zza;


# static fields
.field public static final zzUI:Lcom/google/android/gms/common/api/Api$zzc;

.field public static final zzUJ:Lcom/google/android/gms/common/api/Api$zza;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/api/Api$zzc;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/Api$zzc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzqd;->zzUI:Lcom/google/android/gms/common/api/Api$zzc;

    new-instance v0, Lcom/google/android/gms/internal/zzqd$1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzqd$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzqd;->zzUJ:Lcom/google/android/gms/common/api/Api$zza;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
