.class final Lcom/google/android/gms/wearable/internal/zzbb$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/internal/zzb$zza;


# instance fields
.field final synthetic zzbrP:[Landroid/content/IntentFilter;


# direct methods
.method constructor <init>([Landroid/content/IntentFilter;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzbb$3;->zzbrP:[Landroid/content/IntentFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/wearable/internal/zzbp;Lcom/google/android/gms/common/api/internal/zza$zzb;Lcom/google/android/gms/wearable/NodeApi$NodeListener;Lcom/google/android/gms/common/api/internal/zzq;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbb$3;->zzbrP:[Landroid/content/IntentFilter;

    invoke-virtual {p1, p2, p3, p4, v0}, Lcom/google/android/gms/wearable/internal/zzbp;->zza(Lcom/google/android/gms/common/api/internal/zza$zzb;Lcom/google/android/gms/wearable/NodeApi$NodeListener;Lcom/google/android/gms/common/api/internal/zzq;[Landroid/content/IntentFilter;)V

    return-void
.end method

.method public final bridge synthetic zza(Lcom/google/android/gms/wearable/internal/zzbp;Lcom/google/android/gms/common/api/internal/zza$zzb;Ljava/lang/Object;Lcom/google/android/gms/common/api/internal/zzq;)V
    .locals 0

    check-cast p3, Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/wearable/internal/zzbb$3;->zza(Lcom/google/android/gms/wearable/internal/zzbp;Lcom/google/android/gms/common/api/internal/zza$zzb;Lcom/google/android/gms/wearable/NodeApi$NodeListener;Lcom/google/android/gms/common/api/internal/zzq;)V

    return-void
.end method
