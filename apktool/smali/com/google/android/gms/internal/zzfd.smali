.class public final Lcom/google/android/gms/internal/zzfd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/mediation/MediationAdRequest;


# instance fields
.field private final zzCH:I

.field private final zzbf:Ljava/util/Date;

.field private final zzbh:Ljava/util/Set;

.field private final zzbi:Z

.field private final zzbj:Landroid/location/Location;

.field private final zztT:I

.field private final zzuf:Z


# direct methods
.method public constructor <init>(Ljava/util/Date;ILjava/util/Set;Landroid/location/Location;ZIZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzfd;->zzbf:Ljava/util/Date;

    iput p2, p0, Lcom/google/android/gms/internal/zzfd;->zztT:I

    iput-object p3, p0, Lcom/google/android/gms/internal/zzfd;->zzbh:Ljava/util/Set;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzfd;->zzbj:Landroid/location/Location;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/zzfd;->zzbi:Z

    iput p6, p0, Lcom/google/android/gms/internal/zzfd;->zzCH:I

    iput-boolean p7, p0, Lcom/google/android/gms/internal/zzfd;->zzuf:Z

    return-void
.end method


# virtual methods
.method public final getBirthday()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfd;->zzbf:Ljava/util/Date;

    return-object v0
.end method

.method public final getGender()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzfd;->zztT:I

    return v0
.end method

.method public final getKeywords()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfd;->zzbh:Ljava/util/Set;

    return-object v0
.end method

.method public final getLocation()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfd;->zzbj:Landroid/location/Location;

    return-object v0
.end method

.method public final isDesignedForFamilies()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzfd;->zzuf:Z

    return v0
.end method

.method public final isTesting()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzfd;->zzbi:Z

    return v0
.end method

.method public final taggedForChildDirectedTreatment()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzfd;->zzCH:I

    return v0
.end method
