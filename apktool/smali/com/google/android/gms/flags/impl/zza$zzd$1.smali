.class final Lcom/google/android/gms/flags/impl/zza$zzd$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic zzaBT:Landroid/content/SharedPreferences;

.field final synthetic zzaBU:Ljava/lang/String;

.field final synthetic zzaBY:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/flags/impl/zza$zzd$1;->zzaBT:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lcom/google/android/gms/flags/impl/zza$zzd$1;->zzaBU:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/flags/impl/zza$zzd$1;->zzaBY:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/flags/impl/zza$zzd$1;->zzkp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzkp()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/flags/impl/zza$zzd$1;->zzaBT:Landroid/content/SharedPreferences;

    iget-object v1, p0, Lcom/google/android/gms/flags/impl/zza$zzd$1;->zzaBU:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/flags/impl/zza$zzd$1;->zzaBY:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
