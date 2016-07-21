.class final Lcom/google/android/gms/internal/zzhd$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic zzIU:Lcom/google/android/gms/internal/zzhc;

.field final synthetic zzIV:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

.field final synthetic zzIW:Landroid/os/Bundle;

.field final synthetic zzxh:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzhc;Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzhd$1;->zzIU:Lcom/google/android/gms/internal/zzhc;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzhd$1;->zzxh:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzhd$1;->zzIV:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzhd$1;->zzIW:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzhd$1;->zzdt()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public final zzdt()Ljava/lang/Void;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzhd$1;->zzIU:Lcom/google/android/gms/internal/zzhc;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzhc;->zzIP:Lcom/google/android/gms/internal/zzhh;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzhd$1;->zzxh:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzhd$1;->zzIV:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzHu:Landroid/content/pm/PackageInfo;

    iget-object v2, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzhd$1;->zzIW:Landroid/os/Bundle;

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzhh;->zza(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    const/4 v0, 0x0

    return-object v0
.end method
