.class public final Lcom/google/android/gms/nearby/sharing/internal/ProvideContentRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field final versionCode:I

.field public zzbdk:Landroid/os/IBinder;

.field public zzbdl:Lcom/google/android/gms/nearby/sharing/internal/zzb;

.field public zzbdm:Ljava/util/List;

.field public zzbdn:J

.field public zzbdo:Lcom/google/android/gms/nearby/sharing/internal/zzc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/sharing/internal/zzf;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/sharing/internal/zzf;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/sharing/internal/ProvideContentRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/nearby/sharing/internal/ProvideContentRequest;->versionCode:I

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Landroid/os/IBinder;Ljava/util/List;JLandroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/sharing/internal/ProvideContentRequest;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/nearby/sharing/internal/ProvideContentRequest;->zzbdk:Landroid/os/IBinder;

    invoke-static {p3}, Lcom/google/android/gms/nearby/sharing/internal/zzb$zza;->zzdG(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/sharing/internal/zzb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/sharing/internal/ProvideContentRequest;->zzbdl:Lcom/google/android/gms/nearby/sharing/internal/zzb;

    iput-object p4, p0, Lcom/google/android/gms/nearby/sharing/internal/ProvideContentRequest;->zzbdm:Ljava/util/List;

    iput-wide p5, p0, Lcom/google/android/gms/nearby/sharing/internal/ProvideContentRequest;->zzbdn:J

    invoke-static {p7}, Lcom/google/android/gms/nearby/sharing/internal/zzc$zza;->zzdH(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/sharing/internal/zzc;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/sharing/internal/ProvideContentRequest;->zzbdo:Lcom/google/android/gms/nearby/sharing/internal/zzc;

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

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/sharing/internal/zzf;->zza(Lcom/google/android/gms/nearby/sharing/internal/ProvideContentRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method final zzED()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/sharing/internal/ProvideContentRequest;->zzbdo:Lcom/google/android/gms/nearby/sharing/internal/zzc;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/sharing/internal/zzc;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method final zzEP()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/sharing/internal/ProvideContentRequest;->zzbdl:Lcom/google/android/gms/nearby/sharing/internal/zzb;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/sharing/internal/ProvideContentRequest;->zzbdl:Lcom/google/android/gms/nearby/sharing/internal/zzb;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/sharing/internal/zzb;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method
