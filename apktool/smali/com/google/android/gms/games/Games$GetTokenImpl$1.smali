.class Lcom/google/android/gms/games/Games$GetTokenImpl$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/Games$GetTokenResult;


# instance fields
.field final synthetic zzZR:Lcom/google/android/gms/common/api/Status;

.field final synthetic zzaCN:Lcom/google/android/gms/games/Games$GetTokenImpl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/Games$GetTokenImpl;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/Games$GetTokenImpl$1;->zzaCN:Lcom/google/android/gms/games/Games$GetTokenImpl;

    iput-object p2, p0, Lcom/google/android/gms/games/Games$GetTokenImpl$1;->zzZR:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/Games$GetTokenImpl$1;->zzZR:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
