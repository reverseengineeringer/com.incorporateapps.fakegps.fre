.class Lcom/google/android/gms/nearby/messages/internal/zzm$zzc$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/internal/zzq$zzb;


# instance fields
.field final synthetic zzbcC:Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;

.field final synthetic zzbcD:Lcom/google/android/gms/nearby/messages/internal/zzm$zzc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/messages/internal/zzm$zzc;Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/zzm$zzc$1;->zzbcD:Lcom/google/android/gms/nearby/messages/internal/zzm$zzc;

    iput-object p2, p0, Lcom/google/android/gms/nearby/messages/internal/zzm$zzc$1;->zzbcC:Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/nearby/messages/MessageListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/zzm$zzc$1;->zzbcC:Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;

    iget-object v0, v0, Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;->zzbcu:Lcom/google/android/gms/nearby/messages/Message;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/nearby/messages/MessageListener;->onFound(Lcom/google/android/gms/nearby/messages/Message;)V

    return-void
.end method

.method public zzpr()V
    .locals 0

    return-void
.end method

.method public synthetic zzt(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/nearby/messages/MessageListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/zzm$zzc$1;->zza(Lcom/google/android/gms/nearby/messages/MessageListener;)V

    return-void
.end method
