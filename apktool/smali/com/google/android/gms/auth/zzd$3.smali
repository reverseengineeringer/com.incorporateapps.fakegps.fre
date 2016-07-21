.class final Lcom/google/android/gms/auth/zzd$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/auth/zzd$zza;


# instance fields
.field final synthetic zzVl:Ljava/lang/String;

.field final synthetic zzVm:I


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/zzd$3;->zzVl:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/auth/zzd$3;->zzVm:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zzan(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/zzd$3;->zzap(Landroid/os/IBinder;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final zzap(Landroid/os/IBinder;)Ljava/util/List;
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/internal/zzas$zza;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzas;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/auth/AccountChangeEventsRequest;

    invoke-direct {v1}, Lcom/google/android/gms/auth/AccountChangeEventsRequest;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/auth/zzd$3;->zzVl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->setAccountName(Ljava/lang/String;)Lcom/google/android/gms/auth/AccountChangeEventsRequest;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/auth/zzd$3;->zzVm:I

    invoke-virtual {v1, v2}, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->setEventIndex(I)Lcom/google/android/gms/auth/AccountChangeEventsRequest;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzas;->zza(Lcom/google/android/gms/auth/AccountChangeEventsRequest;)Lcom/google/android/gms/auth/AccountChangeEventsResponse;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/auth/zzd;->zzn(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/auth/AccountChangeEventsResponse;

    invoke-virtual {v0}, Lcom/google/android/gms/auth/AccountChangeEventsResponse;->getEvents()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
