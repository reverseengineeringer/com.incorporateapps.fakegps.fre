.class public Lcom/google/android/gms/flags/impl/zza$zzd;
.super Lcom/google/android/gms/flags/impl/zza;


# direct methods
.method public static zza(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    new-instance v0, Lcom/google/android/gms/flags/impl/zza$zzd$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/flags/impl/zza$zzd$1;-><init>(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/zzpl;->zzb(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
