.class public Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/barcode/zzl;


# instance fields
.field public title:Ljava/lang/String;

.field public url:Ljava/lang/String;

.field final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/barcode/zzl;

    invoke-direct {v0}, Lcom/google/android/gms/vision/barcode/zzl;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;->CREATOR:Lcom/google/android/gms/vision/barcode/zzl;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;->versionCode:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;->url:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;->CREATOR:Lcom/google/android/gms/vision/barcode/zzl;

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;->CREATOR:Lcom/google/android/gms/vision/barcode/zzl;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/barcode/zzl;->zza(Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;Landroid/os/Parcel;I)V

    return-void
.end method
