.class public final Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;
.super Lcom/google/android/gms/common/server/response/FastSafeParcelableJsonResponse;

# interfaces
.implements Lcom/google/android/gms/plus/model/moments/ItemScope;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/plus/internal/model/moments/zza;

.field private static final zzbeM:Ljava/util/HashMap;


# instance fields
.field mName:Ljava/lang/String;

.field final mVersionCode:I

.field zzF:Ljava/lang/String;

.field zzJN:Ljava/lang/String;

.field zzaNF:D

.field zzaNG:D

.field zzaxl:Ljava/lang/String;

.field final zzbeN:Ljava/util/Set;

.field zzbeO:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

.field zzbeP:Ljava/util/List;

.field zzbeQ:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

.field zzbeR:Ljava/lang/String;

.field zzbeS:Ljava/lang/String;

.field zzbeT:Ljava/lang/String;

.field zzbeU:Ljava/util/List;

.field zzbeV:I

.field zzbeW:Ljava/util/List;

.field zzbeX:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

.field zzbeY:Ljava/util/List;

.field zzbeZ:Ljava/lang/String;

.field zzbfA:Ljava/lang/String;

.field zzbfB:Ljava/lang/String;

.field zzbfC:Ljava/lang/String;

.field zzbfD:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

.field zzbfE:Ljava/lang/String;

.field zzbfF:Ljava/lang/String;

.field zzbfG:Ljava/lang/String;

.field zzbfH:Ljava/lang/String;

.field zzbfa:Ljava/lang/String;

.field zzbfb:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

.field zzbfc:Ljava/lang/String;

.field zzbfd:Ljava/lang/String;

.field zzbfe:Ljava/util/List;

.field zzbff:Ljava/lang/String;

.field zzbfg:Ljava/lang/String;

.field zzbfh:Ljava/lang/String;

.field zzbfi:Ljava/lang/String;

.field zzbfj:Ljava/lang/String;

.field zzbfk:Ljava/lang/String;

.field zzbfl:Ljava/lang/String;

.field zzbfm:Ljava/lang/String;

.field zzbfn:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

.field zzbfo:Ljava/lang/String;

.field zzbfp:Ljava/lang/String;

.field zzbfq:Ljava/lang/String;

.field zzbfr:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

.field zzbfs:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

.field zzbft:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

.field zzbfu:Ljava/util/List;

.field zzbfv:Ljava/lang/String;

.field zzbfw:Ljava/lang/String;

.field zzbfx:Ljava/lang/String;

.field zzbfy:Ljava/lang/String;

.field zzbfz:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

.field zztZ:Ljava/lang/String;

.field zzyv:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/plus/internal/model/moments/zza;

    invoke-direct {v0}, Lcom/google/android/gms/plus/internal/model/moments/zza;-><init>()V

    sput-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->CREATOR:Lcom/google/android/gms/plus/internal/model/moments/zza;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "about"

    const-string v2, "about"

    const/4 v3, 0x2

    const-class v4, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zza(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "additionalName"

    const-string v2, "additionalName"

    const/4 v3, 0x3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzm(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "address"

    const-string v2, "address"

    const/4 v3, 0x4

    const-class v4, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zza(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "addressCountry"

    const-string v2, "addressCountry"

    const/4 v3, 0x5

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "addressLocality"

    const-string v2, "addressLocality"

    const/4 v3, 0x6

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "addressRegion"

    const-string v2, "addressRegion"

    const/4 v3, 0x7

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "associated_media"

    const-string v2, "associated_media"

    const/16 v3, 0x8

    const-class v4, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzb(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "attendeeCount"

    const-string v2, "attendeeCount"

    const/16 v3, 0x9

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzi(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "attendees"

    const-string v2, "attendees"

    const/16 v3, 0xa

    const-class v4, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzb(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "audio"

    const-string v2, "audio"

    const/16 v3, 0xb

    const-class v4, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zza(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "author"

    const-string v2, "author"

    const/16 v3, 0xc

    const-class v4, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzb(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "bestRating"

    const-string v2, "bestRating"

    const/16 v3, 0xd

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "birthDate"

    const-string v2, "birthDate"

    const/16 v3, 0xe

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "byArtist"

    const-string v2, "byArtist"

    const/16 v3, 0xf

    const-class v4, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zza(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "caption"

    const-string v2, "caption"

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "contentSize"

    const-string v2, "contentSize"

    const/16 v3, 0x11

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "contentUrl"

    const-string v2, "contentUrl"

    const/16 v3, 0x12

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "contributor"

    const-string v2, "contributor"

    const/16 v3, 0x13

    const-class v4, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzb(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "dateCreated"

    const-string v2, "dateCreated"

    const/16 v3, 0x14

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "dateModified"

    const-string v2, "dateModified"

    const/16 v3, 0x15

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "datePublished"

    const-string v2, "datePublished"

    const/16 v3, 0x16

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "description"

    const-string v2, "description"

    const/16 v3, 0x17

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "duration"

    const-string v2, "duration"

    const/16 v3, 0x18

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "embedUrl"

    const-string v2, "embedUrl"

    const/16 v3, 0x19

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "endDate"

    const-string v2, "endDate"

    const/16 v3, 0x1a

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "familyName"

    const-string v2, "familyName"

    const/16 v3, 0x1b

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "gender"

    const-string v2, "gender"

    const/16 v3, 0x1c

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "geo"

    const-string v2, "geo"

    const/16 v3, 0x1d

    const-class v4, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zza(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "givenName"

    const-string v2, "givenName"

    const/16 v3, 0x1e

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "height"

    const-string v2, "height"

    const/16 v3, 0x1f

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "id"

    const-string v2, "id"

    const/16 v3, 0x20

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "image"

    const-string v2, "image"

    const/16 v3, 0x21

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "inAlbum"

    const-string v2, "inAlbum"

    const/16 v3, 0x22

    const-class v4, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zza(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "latitude"

    const-string v2, "latitude"

    const/16 v3, 0x24

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzj(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "location"

    const-string v2, "location"

    const/16 v3, 0x25

    const-class v4, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zza(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "longitude"

    const-string v2, "longitude"

    const/16 v3, 0x26

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzj(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "name"

    const-string v2, "name"

    const/16 v3, 0x27

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "partOfTVSeries"

    const-string v2, "partOfTVSeries"

    const/16 v3, 0x28

    const-class v4, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zza(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "performers"

    const-string v2, "performers"

    const/16 v3, 0x29

    const-class v4, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzb(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "playerType"

    const-string v2, "playerType"

    const/16 v3, 0x2a

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "postOfficeBoxNumber"

    const-string v2, "postOfficeBoxNumber"

    const/16 v3, 0x2b

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "postalCode"

    const-string v2, "postalCode"

    const/16 v3, 0x2c

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "ratingValue"

    const-string v2, "ratingValue"

    const/16 v3, 0x2d

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "reviewRating"

    const-string v2, "reviewRating"

    const/16 v3, 0x2e

    const-class v4, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zza(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "startDate"

    const-string v2, "startDate"

    const/16 v3, 0x2f

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "streetAddress"

    const-string v2, "streetAddress"

    const/16 v3, 0x30

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "text"

    const-string v2, "text"

    const/16 v3, 0x31

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "thumbnail"

    const-string v2, "thumbnail"

    const/16 v3, 0x32

    const-class v4, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zza(Ljava/lang/String;ILjava/lang/Class;)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "thumbnailUrl"

    const-string v2, "thumbnailUrl"

    const/16 v3, 0x33

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "tickerSymbol"

    const-string v2, "tickerSymbol"

    const/16 v3, 0x34

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "type"

    const-string v2, "type"

    const/16 v3, 0x35

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "url"

    const-string v2, "url"

    const/16 v3, 0x36

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "width"

    const-string v2, "width"

    const/16 v3, 0x37

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    const-string v1, "worstRating"

    const-string v2, "worstRating"

    const/16 v3, 0x38

    invoke-static {v2, v3}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzl(Ljava/lang/String;I)Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/server/response/FastSafeParcelableJsonResponse;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->mVersionCode:I

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    return-void
.end method

.method constructor <init>(Ljava/util/Set;ILcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/util/List;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;DLcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;DLjava/lang/String;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/server/response/FastSafeParcelableJsonResponse;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    iput p2, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->mVersionCode:I

    iput-object p3, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeO:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    iput-object p4, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeP:Ljava/util/List;

    iput-object p5, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeQ:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    iput-object p6, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeR:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeS:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeT:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeU:Ljava/util/List;

    iput p10, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeV:I

    iput-object p11, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeW:Ljava/util/List;

    iput-object p12, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeX:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    iput-object p13, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeY:Ljava/util/List;

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeZ:Ljava/lang/String;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfa:Ljava/lang/String;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfb:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfc:Ljava/lang/String;

    move-object/from16 v0, p18

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfd:Ljava/lang/String;

    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zztZ:Ljava/lang/String;

    move-object/from16 v0, p20

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfe:Ljava/util/List;

    move-object/from16 v0, p21

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbff:Ljava/lang/String;

    move-object/from16 v0, p22

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfg:Ljava/lang/String;

    move-object/from16 v0, p23

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfh:Ljava/lang/String;

    move-object/from16 v0, p24

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzaxl:Ljava/lang/String;

    move-object/from16 v0, p25

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfi:Ljava/lang/String;

    move-object/from16 v0, p26

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfj:Ljava/lang/String;

    move-object/from16 v0, p27

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfk:Ljava/lang/String;

    move-object/from16 v0, p28

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfl:Ljava/lang/String;

    move-object/from16 v0, p29

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfm:Ljava/lang/String;

    move-object/from16 v0, p30

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfn:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    move-object/from16 v0, p31

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfo:Ljava/lang/String;

    move-object/from16 v0, p32

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfp:Ljava/lang/String;

    move-object/from16 v0, p33

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzyv:Ljava/lang/String;

    move-object/from16 v0, p34

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfq:Ljava/lang/String;

    move-object/from16 v0, p35

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfr:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    move-wide/from16 v0, p36

    iput-wide v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzaNF:D

    move-object/from16 v0, p38

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfs:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    move-wide/from16 v0, p39

    iput-wide v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzaNG:D

    move-object/from16 v0, p41

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->mName:Ljava/lang/String;

    move-object/from16 v0, p42

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbft:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    move-object/from16 v0, p43

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfu:Ljava/util/List;

    move-object/from16 v0, p44

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfv:Ljava/lang/String;

    move-object/from16 v0, p45

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfw:Ljava/lang/String;

    move-object/from16 v0, p46

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfx:Ljava/lang/String;

    move-object/from16 v0, p47

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfy:Ljava/lang/String;

    move-object/from16 v0, p48

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfz:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    move-object/from16 v0, p49

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfA:Ljava/lang/String;

    move-object/from16 v0, p50

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfB:Ljava/lang/String;

    move-object/from16 v0, p51

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfC:Ljava/lang/String;

    move-object/from16 v0, p52

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfD:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    move-object/from16 v0, p53

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfE:Ljava/lang/String;

    move-object/from16 v0, p54

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfF:Ljava/lang/String;

    move-object/from16 v0, p55

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzJN:Ljava/lang/String;

    move-object/from16 v0, p56

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzF:Ljava/lang/String;

    move-object/from16 v0, p57

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfG:Ljava/lang/String;

    move-object/from16 v0, p58

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfH:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/util/List;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;DLcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;DLjava/lang/String;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/common/server/response/FastSafeParcelableJsonResponse;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/4 v2, 0x1

    iput v2, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->mVersionCode:I

    iput-object p2, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeO:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    iput-object p3, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeP:Ljava/util/List;

    iput-object p4, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeQ:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    iput-object p5, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeR:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeS:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeT:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeU:Ljava/util/List;

    iput p9, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeV:I

    iput-object p10, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeW:Ljava/util/List;

    iput-object p11, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeX:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    iput-object p12, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeY:Ljava/util/List;

    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeZ:Ljava/lang/String;

    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfa:Ljava/lang/String;

    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfb:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfc:Ljava/lang/String;

    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfd:Ljava/lang/String;

    move-object/from16 v0, p18

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zztZ:Ljava/lang/String;

    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfe:Ljava/util/List;

    move-object/from16 v0, p20

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbff:Ljava/lang/String;

    move-object/from16 v0, p21

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfg:Ljava/lang/String;

    move-object/from16 v0, p22

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfh:Ljava/lang/String;

    move-object/from16 v0, p23

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzaxl:Ljava/lang/String;

    move-object/from16 v0, p24

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfi:Ljava/lang/String;

    move-object/from16 v0, p25

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfj:Ljava/lang/String;

    move-object/from16 v0, p26

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfk:Ljava/lang/String;

    move-object/from16 v0, p27

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfl:Ljava/lang/String;

    move-object/from16 v0, p28

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfm:Ljava/lang/String;

    move-object/from16 v0, p29

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfn:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    move-object/from16 v0, p30

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfo:Ljava/lang/String;

    move-object/from16 v0, p31

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfp:Ljava/lang/String;

    move-object/from16 v0, p32

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzyv:Ljava/lang/String;

    move-object/from16 v0, p33

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfq:Ljava/lang/String;

    move-object/from16 v0, p34

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfr:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    move-wide/from16 v0, p35

    iput-wide v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzaNF:D

    move-object/from16 v0, p37

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfs:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    move-wide/from16 v0, p38

    iput-wide v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzaNG:D

    move-object/from16 v0, p40

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->mName:Ljava/lang/String;

    move-object/from16 v0, p41

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbft:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    move-object/from16 v0, p42

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfu:Ljava/util/List;

    move-object/from16 v0, p43

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfv:Ljava/lang/String;

    move-object/from16 v0, p44

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfw:Ljava/lang/String;

    move-object/from16 v0, p45

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfx:Ljava/lang/String;

    move-object/from16 v0, p46

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfy:Ljava/lang/String;

    move-object/from16 v0, p47

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfz:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    move-object/from16 v0, p48

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfA:Ljava/lang/String;

    move-object/from16 v0, p49

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfB:Ljava/lang/String;

    move-object/from16 v0, p50

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfC:Ljava/lang/String;

    move-object/from16 v0, p51

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfD:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    move-object/from16 v0, p52

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfE:Ljava/lang/String;

    move-object/from16 v0, p53

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfF:Ljava/lang/String;

    move-object/from16 v0, p54

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzJN:Ljava/lang/String;

    move-object/from16 v0, p55

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzF:Ljava/lang/String;

    move-object/from16 v0, p56

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfG:Ljava/lang/String;

    move-object/from16 v0, p57

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfH:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->CREATOR:Lcom/google/android/gms/plus/internal/model/moments/zza;

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v2, 0x1

    const/4 v1, 0x0

    instance-of v0, p1, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    if-ne p0, p1, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zza(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p1, v0}, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zza(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzb(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p1, v0}, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzb(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    invoke-virtual {p1, v0}, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zza(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_5
    move v0, v2

    goto :goto_0
.end method

.method public final synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzFm()Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    move-result-object v0

    return-object v0
.end method

.method public final getAbout()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeO:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    return-object v0
.end method

.method public final getAdditionalName()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeP:Ljava/util/List;

    return-object v0
.end method

.method public final getAddress()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeQ:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    return-object v0
.end method

.method public final getAddressCountry()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeR:Ljava/lang/String;

    return-object v0
.end method

.method public final getAddressLocality()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeS:Ljava/lang/String;

    return-object v0
.end method

.method public final getAddressRegion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeT:Ljava/lang/String;

    return-object v0
.end method

.method public final getAssociated_media()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeU:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getAttendeeCount()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeV:I

    return v0
.end method

.method public final getAttendees()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeW:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getAudio()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeX:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    return-object v0
.end method

.method public final getAuthor()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeY:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getBestRating()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeZ:Ljava/lang/String;

    return-object v0
.end method

.method public final getBirthDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfa:Ljava/lang/String;

    return-object v0
.end method

.method public final getByArtist()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfb:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    return-object v0
.end method

.method public final getCaption()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfc:Ljava/lang/String;

    return-object v0
.end method

.method public final getContentSize()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfd:Ljava/lang/String;

    return-object v0
.end method

.method public final getContentUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zztZ:Ljava/lang/String;

    return-object v0
.end method

.method public final getContributor()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfe:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getDateCreated()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbff:Ljava/lang/String;

    return-object v0
.end method

.method public final getDateModified()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfg:Ljava/lang/String;

    return-object v0
.end method

.method public final getDatePublished()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfh:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzaxl:Ljava/lang/String;

    return-object v0
.end method

.method public final getDuration()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfi:Ljava/lang/String;

    return-object v0
.end method

.method public final getEmbedUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfj:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfk:Ljava/lang/String;

    return-object v0
.end method

.method public final getFamilyName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfl:Ljava/lang/String;

    return-object v0
.end method

.method public final getGender()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfm:Ljava/lang/String;

    return-object v0
.end method

.method public final getGeo()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfn:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    return-object v0
.end method

.method public final getGivenName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfo:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeight()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfp:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzyv:Ljava/lang/String;

    return-object v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfq:Ljava/lang/String;

    return-object v0
.end method

.method public final getInAlbum()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfr:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    return-object v0
.end method

.method public final getLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzaNF:D

    return-wide v0
.end method

.method public final getLocation()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfs:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    return-object v0
.end method

.method public final getLongitude()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzaNG:D

    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public final getPartOfTVSeries()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbft:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    return-object v0
.end method

.method public final getPerformers()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfu:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getPlayerType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfv:Ljava/lang/String;

    return-object v0
.end method

.method public final getPostOfficeBoxNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfw:Ljava/lang/String;

    return-object v0
.end method

.method public final getPostalCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfx:Ljava/lang/String;

    return-object v0
.end method

.method public final getRatingValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfy:Ljava/lang/String;

    return-object v0
.end method

.method public final getReviewRating()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfz:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    return-object v0
.end method

.method public final getStartDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfA:Ljava/lang/String;

    return-object v0
.end method

.method public final getStreetAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfB:Ljava/lang/String;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfC:Ljava/lang/String;

    return-object v0
.end method

.method public final getThumbnail()Lcom/google/android/gms/plus/model/moments/ItemScope;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfD:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    return-object v0
.end method

.method public final getThumbnailUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfE:Ljava/lang/String;

    return-object v0
.end method

.method public final getTickerSymbol()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfF:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzJN:Ljava/lang/String;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzF:Ljava/lang/String;

    return-object v0
.end method

.method public final getWidth()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfG:Ljava/lang/String;

    return-object v0
.end method

.method public final getWorstRating()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfH:Ljava/lang/String;

    return-object v0
.end method

.method public final hasAbout()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasAdditionalName()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasAddress()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasAddressCountry()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasAddressLocality()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasAddressRegion()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasAssociated_media()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasAttendeeCount()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasAttendees()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasAudio()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0xb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasAuthor()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasBestRating()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0xd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasBirthDate()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasByArtist()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0xf

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasCaption()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasContentSize()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasContentUrl()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x12

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasContributor()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x13

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasDateCreated()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x14

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasDateModified()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x15

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasDatePublished()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x16

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasDescription()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x17

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasDuration()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasEmbedUrl()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasEndDate()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x1a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasFamilyName()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x1b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasGender()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x1c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasGeo()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x1d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasGivenName()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasHeight()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x1f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasId()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasImage()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x21

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasInAlbum()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x22

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasLatitude()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x24

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasLocation()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x25

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasLongitude()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x26

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasName()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x27

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasPartOfTVSeries()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x28

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasPerformers()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x29

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasPlayerType()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x2a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasPostOfficeBoxNumber()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x2b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasPostalCode()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x2c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasRatingValue()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x2d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasReviewRating()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x2e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasStartDate()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x2f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasStreetAddress()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x30

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasText()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x31

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasThumbnail()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x32

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasThumbnailUrl()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x33

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasTickerSymbol()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x34

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasType()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x35

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasUrl()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x36

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasWidth()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x37

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hasWorstRating()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    const/16 v1, 0x38

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x0

    sget-object v1, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zza(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzrs()I

    move-result v3

    add-int/2addr v1, v3

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzb(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method public final isDataValid()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->CREATOR:Lcom/google/android/gms/plus/internal/model/moments/zza;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/plus/internal/model/moments/zza;->zza(Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zzFl()Ljava/util/HashMap;
    .locals 1

    sget-object v0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeM:Ljava/util/HashMap;

    return-object v0
.end method

.method public final zzFm()Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;
    .locals 0

    return-object p0
.end method

.method protected final zza(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeN:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzrs()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method protected final zzb(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzrs()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown safe parcelable id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->zzrs()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeO:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    :goto_0
    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeP:Ljava/util/List;

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeQ:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeR:Ljava/lang/String;

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeS:Ljava/lang/String;

    goto :goto_0

    :pswitch_6
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeT:Ljava/lang/String;

    goto :goto_0

    :pswitch_7
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeU:Ljava/util/List;

    goto :goto_0

    :pswitch_8
    iget v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeV:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :pswitch_9
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeW:Ljava/util/List;

    goto :goto_0

    :pswitch_a
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeX:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    goto :goto_0

    :pswitch_b
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeY:Ljava/util/List;

    goto :goto_0

    :pswitch_c
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbeZ:Ljava/lang/String;

    goto :goto_0

    :pswitch_d
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfa:Ljava/lang/String;

    goto :goto_0

    :pswitch_e
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfb:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    goto :goto_0

    :pswitch_f
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfc:Ljava/lang/String;

    goto :goto_0

    :pswitch_10
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfd:Ljava/lang/String;

    goto :goto_0

    :pswitch_11
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zztZ:Ljava/lang/String;

    goto :goto_0

    :pswitch_12
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfe:Ljava/util/List;

    goto :goto_0

    :pswitch_13
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbff:Ljava/lang/String;

    goto :goto_0

    :pswitch_14
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfg:Ljava/lang/String;

    goto :goto_0

    :pswitch_15
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfh:Ljava/lang/String;

    goto :goto_0

    :pswitch_16
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzaxl:Ljava/lang/String;

    goto :goto_0

    :pswitch_17
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfi:Ljava/lang/String;

    goto :goto_0

    :pswitch_18
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfj:Ljava/lang/String;

    goto :goto_0

    :pswitch_19
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfk:Ljava/lang/String;

    goto :goto_0

    :pswitch_1a
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfl:Ljava/lang/String;

    goto :goto_0

    :pswitch_1b
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfm:Ljava/lang/String;

    goto :goto_0

    :pswitch_1c
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfn:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    goto :goto_0

    :pswitch_1d
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfo:Ljava/lang/String;

    goto :goto_0

    :pswitch_1e
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfp:Ljava/lang/String;

    goto :goto_0

    :pswitch_1f
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzyv:Ljava/lang/String;

    goto :goto_0

    :pswitch_20
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfq:Ljava/lang/String;

    goto :goto_0

    :pswitch_21
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfr:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    goto :goto_0

    :pswitch_22
    iget-wide v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzaNF:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0

    :pswitch_23
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfs:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    goto :goto_0

    :pswitch_24
    iget-wide v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzaNG:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0

    :pswitch_25
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->mName:Ljava/lang/String;

    goto :goto_0

    :pswitch_26
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbft:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    goto :goto_0

    :pswitch_27
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfu:Ljava/util/List;

    goto :goto_0

    :pswitch_28
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfv:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_29
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfw:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_2a
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfx:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_2b
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfy:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_2c
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfz:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    goto/16 :goto_0

    :pswitch_2d
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfA:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_2e
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfB:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_2f
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfC:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_30
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfD:Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;

    goto/16 :goto_0

    :pswitch_31
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfE:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_32
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfF:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_33
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzJN:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_34
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzF:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_35
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfG:Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_36
    iget-object v0, p0, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzbfH:Ljava/lang/String;

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
        :pswitch_20
        :pswitch_21
        :pswitch_0
        :pswitch_22
        :pswitch_23
        :pswitch_24
        :pswitch_25
        :pswitch_26
        :pswitch_27
        :pswitch_28
        :pswitch_29
        :pswitch_2a
        :pswitch_2b
        :pswitch_2c
        :pswitch_2d
        :pswitch_2e
        :pswitch_2f
        :pswitch_30
        :pswitch_31
        :pswitch_32
        :pswitch_33
        :pswitch_34
        :pswitch_35
        :pswitch_36
    .end packed-switch
.end method

.method public final synthetic zzrl()Ljava/util/Map;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/model/moments/ItemScopeEntity;->zzFl()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method
