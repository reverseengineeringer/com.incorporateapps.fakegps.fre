.class final Lcom/google/android/gms/auth/zzd$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/auth/zzd$zza;


# instance fields
.field final synthetic zzVj:Ljava/lang/String;

.field final synthetic zzVk:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/zzd$2;->zzVj:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/auth/zzd$2;->zzVk:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zzan(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/zzd$2;->zzao(Landroid/os/IBinder;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public final zzao(Landroid/os/IBinder;)Ljava/lang/Void;
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/internal/zzas$zza;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzas;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/auth/zzd$2;->zzVj:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/auth/zzd$2;->zzVk:Landroid/os/Bundle;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/zzas;->zza(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/auth/zzd;->zzn(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    const-string v1, "Error"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "booleanResult"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/auth/GoogleAuthException;

    invoke-direct {v0, v1}, Lcom/google/android/gms/auth/GoogleAuthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
