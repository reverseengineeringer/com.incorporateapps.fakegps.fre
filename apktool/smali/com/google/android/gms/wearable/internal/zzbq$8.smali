.class final Lcom/google/android/gms/wearable/internal/zzbq$8;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/internal/zzq$zzb;


# instance fields
.field final synthetic zzbrz:Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/zzbq$8;->zzbrz:Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/zzbq$8;->zzbrz:Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->zza(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;)V

    return-void
.end method

.method public final zzpr()V
    .locals 0

    return-void
.end method

.method public final synthetic zzt(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzbq$8;->zzb(Lcom/google/android/gms/wearable/ChannelApi$ChannelListener;)V

    return-void
.end method
