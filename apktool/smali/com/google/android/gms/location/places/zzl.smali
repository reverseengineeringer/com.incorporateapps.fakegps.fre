.class public Lcom/google/android/gms/location/places/zzl;
.super Lcom/google/android/gms/location/places/internal/zzi$zza;


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzaPP:Lcom/google/android/gms/location/places/zzl$zzd;

.field private final zzaPQ:Lcom/google/android/gms/location/places/zzl$zza;

.field private final zzaPR:Lcom/google/android/gms/location/places/zzl$zze;

.field private final zzaPS:Lcom/google/android/gms/location/places/zzl$zzf;

.field private final zzaPT:Lcom/google/android/gms/location/places/zzl$zzc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/location/places/zzl;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/location/places/zzl;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/places/zzl$zza;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/zzi$zza;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPP:Lcom/google/android/gms/location/places/zzl$zzd;

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzl;->zzaPQ:Lcom/google/android/gms/location/places/zzl$zza;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPR:Lcom/google/android/gms/location/places/zzl$zze;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPS:Lcom/google/android/gms/location/places/zzl$zzf;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPT:Lcom/google/android/gms/location/places/zzl$zzc;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->mContext:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/places/zzl$zzc;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/zzi$zza;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPP:Lcom/google/android/gms/location/places/zzl$zzd;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPQ:Lcom/google/android/gms/location/places/zzl$zza;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPR:Lcom/google/android/gms/location/places/zzl$zze;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPS:Lcom/google/android/gms/location/places/zzl$zzf;

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzl;->zzaPT:Lcom/google/android/gms/location/places/zzl$zzc;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->mContext:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/places/zzl$zzd;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/zzi$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzl;->zzaPP:Lcom/google/android/gms/location/places/zzl$zzd;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPQ:Lcom/google/android/gms/location/places/zzl$zza;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPR:Lcom/google/android/gms/location/places/zzl$zze;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPS:Lcom/google/android/gms/location/places/zzl$zzf;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPT:Lcom/google/android/gms/location/places/zzl$zzc;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->mContext:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/places/zzl$zzf;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/internal/zzi$zza;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPP:Lcom/google/android/gms/location/places/zzl$zzd;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPQ:Lcom/google/android/gms/location/places/zzl$zza;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPR:Lcom/google/android/gms/location/places/zzl$zze;

    iput-object p1, p0, Lcom/google/android/gms/location/places/zzl;->zzaPS:Lcom/google/android/gms/location/places/zzl$zzf;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPT:Lcom/google/android/gms/location/places/zzl$zzc;

    iput-object v0, p0, Lcom/google/android/gms/location/places/zzl;->mContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public zzaU(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPS:Lcom/google/android/gms/location/places/zzl$zzf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/places/zzl$zzf;->zza(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method

.method public zzac(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPP:Lcom/google/android/gms/location/places/zzl$zzd;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v1, "placeEstimator cannot be null"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/zzx;->zza(ZLjava/lang/Object;)V

    if-nez p1, :cond_2

    sget-object v0, Lcom/google/android/gms/location/places/zzl;->TAG:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/location/places/zzl;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onPlaceEstimated received null DataHolder: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/zzng;->zzso()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPP:Lcom/google/android/gms/location/places/zzl$zzd;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->zzagE:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/zzl$zzd;->zzw(Lcom/google/android/gms/common/api/Status;)V

    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->zzpZ()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_3

    const/16 v0, 0x64

    :goto_2
    new-instance v1, Lcom/google/android/gms/location/places/PlaceLikelihoodBuffer;

    iget-object v2, p0, Lcom/google/android/gms/location/places/zzl;->mContext:Landroid/content/Context;

    invoke-direct {v1, p1, v0, v2}, Lcom/google/android/gms/location/places/PlaceLikelihoodBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;ILandroid/content/Context;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPP:Lcom/google/android/gms/location/places/zzl$zzd;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/zzl$zzd;->zza(Lcom/google/android/gms/common/api/Result;)V

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lcom/google/android/gms/location/places/PlaceLikelihoodBuffer;->zzH(Landroid/os/Bundle;)I

    move-result v0

    goto :goto_2
.end method

.method public zzad(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3

    if-nez p1, :cond_1

    sget-object v0, Lcom/google/android/gms/location/places/zzl;->TAG:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/location/places/zzl;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onAutocompletePrediction received null DataHolder: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/zzng;->zzso()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPQ:Lcom/google/android/gms/location/places/zzl$zza;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->zzagE:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/zzl$zza;->zzw(Lcom/google/android/gms/common/api/Status;)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPQ:Lcom/google/android/gms/location/places/zzl$zza;

    new-instance v1, Lcom/google/android/gms/location/places/AutocompletePredictionBuffer;

    invoke-direct {v1, p1}, Lcom/google/android/gms/location/places/AutocompletePredictionBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/zzl$zza;->zza(Lcom/google/android/gms/common/api/Result;)V

    goto :goto_0
.end method

.method public zzae(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3

    if-nez p1, :cond_1

    sget-object v0, Lcom/google/android/gms/location/places/zzl;->TAG:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/location/places/zzl;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onPlaceUserDataFetched received null DataHolder: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/zzng;->zzso()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPR:Lcom/google/android/gms/location/places/zzl$zze;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->zzagE:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/zzl$zze;->zzw(Lcom/google/android/gms/common/api/Status;)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/location/places/zzl;->zzaPR:Lcom/google/android/gms/location/places/zzl$zze;

    new-instance v1, Lcom/google/android/gms/location/places/personalized/zzd;

    invoke-direct {v1, p1}, Lcom/google/android/gms/location/places/personalized/zzd;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/places/zzl$zze;->zza(Lcom/google/android/gms/common/api/Result;)V

    goto :goto_0
.end method

.method public zzaf(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/location/places/PlaceBuffer;

    iget-object v1, p0, Lcom/google/android/gms/location/places/zzl;->mContext:Landroid/content/Context;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/location/places/PlaceBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;Landroid/content/Context;)V

    iget-object v1, p0, Lcom/google/android/gms/location/places/zzl;->zzaPT:Lcom/google/android/gms/location/places/zzl$zzc;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/location/places/zzl$zzc;->zza(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method