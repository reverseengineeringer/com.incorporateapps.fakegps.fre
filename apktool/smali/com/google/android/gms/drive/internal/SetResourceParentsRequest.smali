.class public Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field final mVersionCode:I

.field final zzaqf:Lcom/google/android/gms/drive/DriveId;

.field final zzasC:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/zzbt;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/zzbt;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/DriveId;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;->mVersionCode:I

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;->zzaqf:Lcom/google/android/gms/drive/DriveId;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;->zzasC:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/DriveId;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;-><init>(ILcom/google/android/gms/drive/DriveId;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/zzbt;->zza(Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;Landroid/os/Parcel;I)V

    return-void
.end method
