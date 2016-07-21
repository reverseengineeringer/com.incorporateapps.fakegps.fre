.class public final Lcom/google/android/gms/games/appcontent/AppContentCardRef;
.super Lcom/google/android/gms/games/appcontent/MultiDataBufferRef;

# interfaces
.implements Lcom/google/android/gms/games/appcontent/AppContentCard;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/games/appcontent/MultiDataBufferRef;-><init>(Ljava/util/ArrayList;II)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/games/appcontent/AppContentCardEntity;->zza(Lcom/google/android/gms/games/appcontent/AppContentCard;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->zzwe()Lcom/google/android/gms/games/appcontent/AppContentCard;

    move-result-object v0

    return-object v0
.end method

.method public final getActions()Ljava/util/List;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->zzahi:Lcom/google/android/gms/common/data/DataHolder;

    iget-object v1, p0, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->zzaDN:Ljava/util/ArrayList;

    const-string v2, "card_actions"

    iget v3, p0, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->zzaje:I

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/games/appcontent/AppContentUtils;->zza(Lcom/google/android/gms/common/data/DataHolder;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    const-string v0, "card_description"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getExtras()Landroid/os/Bundle;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->zzahi:Lcom/google/android/gms/common/data/DataHolder;

    iget-object v1, p0, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->zzaDN:Ljava/util/ArrayList;

    const-string v2, "card_data"

    iget v3, p0, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->zzaje:I

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/games/appcontent/AppContentUtils;->zzd(Lcom/google/android/gms/common/data/DataHolder;Ljava/util/ArrayList;Ljava/lang/String;I)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    const-string v0, "card_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    const-string v0, "card_title"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    const-string v0, "card_type"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/appcontent/AppContentCardEntity;->zza(Lcom/google/android/gms/games/appcontent/AppContentCard;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/appcontent/AppContentCardEntity;->zzb(Lcom/google/android/gms/games/appcontent/AppContentCard;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->zzwe()Lcom/google/android/gms/games/appcontent/AppContentCard;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/appcontent/AppContentCardEntity;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/appcontent/AppContentCardEntity;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zzvP()Ljava/util/List;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->zzahi:Lcom/google/android/gms/common/data/DataHolder;

    iget-object v1, p0, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->zzaDN:Ljava/util/ArrayList;

    const-string v2, "card_conditions"

    iget v3, p0, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->zzaje:I

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/games/appcontent/AppContentUtils;->zzc(Lcom/google/android/gms/common/data/DataHolder;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final zzvQ()Ljava/lang/String;
    .locals 1

    const-string v0, "card_content_description"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzwa()Ljava/util/List;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->zzahi:Lcom/google/android/gms/common/data/DataHolder;

    iget-object v1, p0, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->zzaDN:Ljava/util/ArrayList;

    const-string v2, "card_annotations"

    iget v3, p0, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->zzaje:I

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/games/appcontent/AppContentUtils;->zzb(Lcom/google/android/gms/common/data/DataHolder;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final zzwb()I
    .locals 1

    const-string v0, "card_current_steps"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->getInteger(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public final zzwc()Ljava/lang/String;
    .locals 1

    const-string v0, "card_subtitle"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzwd()I
    .locals 1

    const-string v0, "card_total_steps"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentCardRef;->getInteger(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public final zzwe()Lcom/google/android/gms/games/appcontent/AppContentCard;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/appcontent/AppContentCardEntity;

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/appcontent/AppContentCardEntity;-><init>(Lcom/google/android/gms/games/appcontent/AppContentCard;)V

    return-object v0
.end method
