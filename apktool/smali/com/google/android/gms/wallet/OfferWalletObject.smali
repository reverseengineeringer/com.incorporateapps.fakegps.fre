.class public final Lcom/google/android/gms/wallet/OfferWalletObject;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private final mVersionCode:I

.field zzboB:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

.field zzbpB:Ljava/lang/String;

.field zzio:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/zzo;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/zzo;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/OfferWalletObject;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/wallet/OfferWalletObject;->mVersionCode:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/wallet/wobs/CommonWalletObject;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/OfferWalletObject;->mVersionCode:I

    iput-object p3, p0, Lcom/google/android/gms/wallet/OfferWalletObject;->zzbpB:Ljava/lang/String;

    const/4 v0, 0x3

    if-ge p1, v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzIr()Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgK(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzIs()Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/wallet/OfferWalletObject;->zzboB:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    :goto_0
    return-void

    :cond_0
    iput-object p4, p0, Lcom/google/android/gms/wallet/OfferWalletObject;->zzboB:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    goto :goto_0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/OfferWalletObject;->zzboB:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    invoke-virtual {v0}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getRedemptionCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/OfferWalletObject;->zzbpB:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/OfferWalletObject;->mVersionCode:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/zzo;->zza(Lcom/google/android/gms/wallet/OfferWalletObject;Landroid/os/Parcel;I)V

    return-void
.end method