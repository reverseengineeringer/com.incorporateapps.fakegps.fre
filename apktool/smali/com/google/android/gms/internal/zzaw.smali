.class public final Lcom/google/android/gms/internal/zzaw;
.super Ljava/lang/Object;


# instance fields
.field private final zzsA:Z

.field private final zzsv:Ljava/lang/String;

.field private final zzsw:Lorg/json/JSONObject;

.field private final zzsx:Ljava/lang/String;

.field private final zzsy:Ljava/lang/String;

.field private final zzsz:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;Lorg/json/JSONObject;ZZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->afmaVersion:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzaw;->zzsy:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzaw;->zzsw:Lorg/json/JSONObject;

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaw;->zzsx:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzaw;->zzsv:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/zzaw;->zzsz:Z

    iput-boolean p6, p0, Lcom/google/android/gms/internal/zzaw;->zzsA:Z

    return-void
.end method


# virtual methods
.method public final zzcr()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaw;->zzsv:Ljava/lang/String;

    return-object v0
.end method

.method public final zzcs()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaw;->zzsy:Ljava/lang/String;

    return-object v0
.end method

.method public final zzct()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaw;->zzsw:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final zzcu()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaw;->zzsx:Ljava/lang/String;

    return-object v0
.end method

.method public final zzcv()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaw;->zzsz:Z

    return v0
.end method

.method public final zzcw()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzaw;->zzsA:Z

    return v0
.end method
