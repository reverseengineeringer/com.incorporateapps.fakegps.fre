.class public Lcom/google/android/gms/location/places/PlaceBuffer;
.super Lcom/google/android/gms/common/data/AbstractDataBuffer;

# interfaces
.implements Lcom/google/android/gms/common/api/Result;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzUX:Lcom/google/android/gms/common/api/Status;

.field private final zzaPy:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/data/AbstractDataBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object p2, p0, Lcom/google/android/gms/location/places/PlaceBuffer;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->getStatusCode()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/location/places/PlacesStatusCodes;->zzhU(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/location/places/PlaceBuffer;->zzUX:Lcom/google/android/gms/common/api/Status;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->zzpZ()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->zzpZ()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/location/places/PlaceBuffer;->zzaPy:Ljava/lang/String;

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/location/places/PlaceBuffer;->zzaPy:Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method public get(I)Lcom/google/android/gms/location/places/Place;
    .locals 3

    new-instance v0, Lcom/google/android/gms/location/places/internal/zzr;

    iget-object v1, p0, Lcom/google/android/gms/location/places/PlaceBuffer;->zzahi:Lcom/google/android/gms/common/data/DataHolder;

    iget-object v2, p0, Lcom/google/android/gms/location/places/PlaceBuffer;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1, p1, v2}, Lcom/google/android/gms/location/places/internal/zzr;-><init>(Lcom/google/android/gms/common/data/DataHolder;ILandroid/content/Context;)V

    return-object v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/PlaceBuffer;->get(I)Lcom/google/android/gms/location/places/Place;

    move-result-object v0

    return-object v0
.end method

.method public getAttributions()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/PlaceBuffer;->zzaPy:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/PlaceBuffer;->zzUX:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method