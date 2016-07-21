.class Lcom/google/android/gms/auth/api/signin/internal/zzm$zzb;
.super Ljava/util/LinkedHashMap;


# instance fields
.field private final zzav:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    iput p1, p0, Lcom/google/android/gms/auth/api/signin/internal/zzm$zzb;->zzav:I

    return-void
.end method


# virtual methods
.method protected removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/signin/internal/zzm$zzb;->size()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/auth/api/signin/internal/zzm$zzb;->zzav:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
