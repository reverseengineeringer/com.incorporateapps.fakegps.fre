.class public Lcom/google/android/gms/internal/zzks;
.super Lcom/google/android/gms/common/internal/zzj;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/zzf;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
    .locals 7

    const/16 v3, 0x4a

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/zzj;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/zzf;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    return-void
.end method


# virtual methods
.method protected synthetic zzW(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzks;->zzaq(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzku;

    move-result-object v0

    return-object v0
.end method

.method protected zzaq(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzku;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/zzku$zza;->zzas(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzku;

    move-result-object v0

    return-object v0
.end method

.method protected zzgu()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.accountstatus.START"

    return-object v0
.end method

.method protected zzgv()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService"

    return-object v0
.end method