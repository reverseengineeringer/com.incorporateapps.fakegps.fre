.class public Lcom/google/android/gms/internal/zzje;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzjg;


# instance fields
.field private final zzNc:Ljava/lang/Object;

.field private final zzNe:Lcom/google/android/gms/internal/zzjh;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzje;->zzNc:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/zzjh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzjh;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzje;->zzNe:Lcom/google/android/gms/internal/zzjh;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzje;->zzNe:Lcom/google/android/gms/internal/zzjh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzjh;->zzhK()V

    return-void
.end method


# virtual methods
.method public cancel(Z)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzje;->zzNc:Ljava/lang/Object;

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzje;->zzNc:Ljava/lang/Object;

    return-object v0
.end method

.method public isCancelled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isDone()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public zzb(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzje;->zzNe:Lcom/google/android/gms/internal/zzjh;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzjh;->zzb(Ljava/lang/Runnable;)V

    return-void
.end method
