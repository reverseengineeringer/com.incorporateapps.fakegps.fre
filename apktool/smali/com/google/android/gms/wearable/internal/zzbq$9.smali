.class final Lcom/google/android/gms/wearable/internal/zzbq$9;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/internal/zzq$zzb;


# instance fields
.field final synthetic zzbtx:Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzbq$9;->zzbtx:Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq$9;->zzbtx:Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;

    invoke-interface {p1, v0}, Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;->onCapabilityChanged(Lcom/google/android/gms/wearable/CapabilityInfo;)V

    return-void
.end method

.method public final zzpr()V
    .locals 0

    return-void
.end method

.method public final synthetic zzt(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzbq$9;->zza(Lcom/google/android/gms/wearable/CapabilityApi$CapabilityListener;)V

    return-void
.end method
