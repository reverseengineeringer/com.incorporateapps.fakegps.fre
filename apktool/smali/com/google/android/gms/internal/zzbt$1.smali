.class final Lcom/google/android/gms/internal/zzbt$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic zzxh:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzbt$1;->zzxh:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzbt$1;->zzdt()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public final zzdt()Ljava/lang/Void;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzr;->zzbL()Lcom/google/android/gms/internal/zzbs;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzbt$1;->zzxh:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzbs;->initialize(Landroid/content/Context;)V

    const/4 v0, 0x0

    return-object v0
.end method
