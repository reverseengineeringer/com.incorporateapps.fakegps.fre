.class abstract Lcom/google/android/gms/internal/zzjn;
.super Ljava/lang/Object;


# instance fields
.field private final zzNw:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzjn;->zzNw:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final detach()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzjn;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzjn;->zzb(Landroid/view/ViewTreeObserver;)V

    :cond_0
    return-void
.end method

.method protected getViewTreeObserver()Landroid/view/ViewTreeObserver;
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzjn;->zzNw:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    move-object v0, v1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method protected abstract zza(Landroid/view/ViewTreeObserver;)V
.end method

.method protected abstract zzb(Landroid/view/ViewTreeObserver;)V
.end method

.method public final zzhL()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzjn;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/zzjn;->zza(Landroid/view/ViewTreeObserver;)V

    :cond_0
    return-void
.end method