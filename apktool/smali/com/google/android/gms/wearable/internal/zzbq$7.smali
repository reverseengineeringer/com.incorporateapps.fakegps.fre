.class final Lcom/google/android/gms/wearable/internal/zzbq$7;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/internal/zzq$zzb;


# instance fields
.field final synthetic zzbrv:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzbq$7;->zzbrv:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/wearable/NodeApi$zza;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq$7;->zzbrv:Ljava/util/List;

    invoke-interface {p1, v0}, Lcom/google/android/gms/wearable/NodeApi$zza;->onConnectedNodes(Ljava/util/List;)V

    return-void
.end method

.method public final zzpr()V
    .locals 0

    return-void
.end method

.method public final synthetic zzt(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/NodeApi$zza;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzbq$7;->zza(Lcom/google/android/gms/wearable/NodeApi$zza;)V

    return-void
.end method
