.class public Lcom/google/android/gms/wearable/internal/zzj$zzd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/CapabilityApi$GetAllCapabilitiesResult;


# instance fields
.field private final zzUX:Lcom/google/android/gms/common/api/Status;

.field private final zzbrT:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzj$zzd;->zzUX:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/zzj$zzd;->zzbrT:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getAllCapabilities()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzj$zzd;->zzbrT:Ljava/util/Map;

    return-object v0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzj$zzd;->zzUX:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
