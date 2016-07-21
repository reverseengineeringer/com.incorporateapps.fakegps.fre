.class public final Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final versionCode:I

.field public final zzbcs:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

.field public final zzbct:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/zzc;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/zzc;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/nearby/messages/internal/ClientAppContext;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;->zzbcs:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    iput p3, p0, Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;->zzbct:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;I)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;-><init>(ILcom/google/android/gms/nearby/messages/internal/ClientAppContext;I)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/zzc;->zza(Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;Landroid/os/Parcel;I)V

    return-void
.end method
