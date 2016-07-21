.class Lcom/google/android/gms/games/Games$GetServerAuthCodeImpl$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/Games$GetServerAuthCodeResult;


# instance fields
.field final synthetic zzZR:Lcom/google/android/gms/common/api/Status;

.field final synthetic zzaCM:Lcom/google/android/gms/games/Games$GetServerAuthCodeImpl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/Games$GetServerAuthCodeImpl;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/Games$GetServerAuthCodeImpl$1;->zzaCM:Lcom/google/android/gms/games/Games$GetServerAuthCodeImpl;

    iput-object p2, p0, Lcom/google/android/gms/games/Games$GetServerAuthCodeImpl$1;->zzZR:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCode()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/Games$GetServerAuthCodeImpl$1;->zzZR:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
