.class public Lcom/google/android/gms/internal/zznq;
.super Ljava/lang/Object;


# static fields
.field public static final zzatT:Lcom/google/android/gms/drive/metadata/MetadataField;

.field public static final zzatU:Lcom/google/android/gms/drive/metadata/MetadataField;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const v2, 0x419ce0

    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/zzf;

    const-string v1, "contentAvailability"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/zzf;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/zznq;->zzatT:Lcom/google/android/gms/drive/metadata/MetadataField;

    new-instance v0, Lcom/google/android/gms/drive/metadata/internal/zzb;

    const-string v1, "isPinnable"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/drive/metadata/internal/zzb;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/zznq;->zzatU:Lcom/google/android/gms/drive/metadata/MetadataField;

    return-void
.end method
