.class final Lcom/google/android/gms/internal/zznm$2;
.super Lcom/google/android/gms/drive/metadata/internal/zzk;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/drive/metadata/internal/zzk;-><init>(Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;I)V

    return-void
.end method


# virtual methods
.method protected final synthetic zzc(Lcom/google/android/gms/common/data/DataHolder;II)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/zznm$2;->zzk(Lcom/google/android/gms/common/data/DataHolder;II)Lcom/google/android/gms/common/data/BitmapTeleporter;

    move-result-object v0

    return-object v0
.end method

.method protected final zzk(Lcom/google/android/gms/common/data/DataHolder;II)Lcom/google/android/gms/common/data/BitmapTeleporter;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Thumbnail field is write only"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
