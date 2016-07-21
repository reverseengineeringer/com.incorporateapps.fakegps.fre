.class Lcom/google/android/gms/internal/zziw$zzb;
.super Lcom/google/android/gms/internal/zzk;


# instance fields
.field private final zzMD:Lcom/google/android/gms/internal/zziw$zza;

.field private final zzaG:Lcom/google/android/gms/internal/zzm$zzb;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/zziw$zza;Lcom/google/android/gms/internal/zzm$zzb;)V
    .locals 2

    const/4 v0, 0x0

    new-instance v1, Lcom/google/android/gms/internal/zziw$zzb$1;

    invoke-direct {v1, p3, p2}, Lcom/google/android/gms/internal/zziw$zzb$1;-><init>(Lcom/google/android/gms/internal/zzm$zzb;Lcom/google/android/gms/internal/zziw$zza;)V

    invoke-direct {p0, v0, p1, v1}, Lcom/google/android/gms/internal/zzk;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/zzm$zza;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/zziw$zzb;->zzMD:Lcom/google/android/gms/internal/zziw$zza;

    iput-object p3, p0, Lcom/google/android/gms/internal/zziw$zzb;->zzaG:Lcom/google/android/gms/internal/zzm$zzb;

    return-void
.end method


# virtual methods
.method protected zza(Lcom/google/android/gms/internal/zzi;)Lcom/google/android/gms/internal/zzm;
    .locals 2

    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p1, Lcom/google/android/gms/internal/zzi;->data:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {p1}, Lcom/google/android/gms/internal/zzx;->zzb(Lcom/google/android/gms/internal/zzi;)Lcom/google/android/gms/internal/zzb$zza;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzm;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/zzb$zza;)Lcom/google/android/gms/internal/zzm;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic zza(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zziw$zzb;->zzj(Ljava/io/InputStream;)V

    return-void
.end method

.method protected zzj(Ljava/io/InputStream;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zziw$zzb;->zzaG:Lcom/google/android/gms/internal/zzm$zzb;

    iget-object v1, p0, Lcom/google/android/gms/internal/zziw$zzb;->zzMD:Lcom/google/android/gms/internal/zziw$zza;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/zziw$zza;->zzh(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzm$zzb;->zzb(Ljava/lang/Object;)V

    return-void
.end method
