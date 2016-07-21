.class public final Lcom/google/android/gms/wallet/Cart;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private final mVersionCode:I

.field zzboh:Ljava/lang/String;

.field zzboi:Ljava/lang/String;

.field zzboj:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/zzb;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/zzb;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/Cart;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/wallet/Cart;->mVersionCode:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wallet/Cart;->zzboj:Ljava/util/ArrayList;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/Cart;->mVersionCode:I

    iput-object p2, p0, Lcom/google/android/gms/wallet/Cart;->zzboh:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/wallet/Cart;->zzboi:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/wallet/Cart;->zzboj:Ljava/util/ArrayList;

    return-void
.end method

.method public static newBuilder()Lcom/google/android/gms/wallet/Cart$Builder;
    .locals 3

    new-instance v0, Lcom/google/android/gms/wallet/Cart$Builder;

    new-instance v1, Lcom/google/android/gms/wallet/Cart;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/Cart;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/Cart$Builder;-><init>(Lcom/google/android/gms/wallet/Cart;Lcom/google/android/gms/wallet/Cart$1;)V

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getCurrencyCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/Cart;->zzboi:Ljava/lang/String;

    return-object v0
.end method

.method public final getLineItems()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/Cart;->zzboj:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getTotalPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/Cart;->zzboh:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/Cart;->mVersionCode:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/zzb;->zza(Lcom/google/android/gms/wallet/Cart;Landroid/os/Parcel;I)V

    return-void
.end method
