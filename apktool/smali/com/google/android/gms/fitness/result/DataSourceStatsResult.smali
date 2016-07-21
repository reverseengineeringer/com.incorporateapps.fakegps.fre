.class public Lcom/google/android/gms/fitness/result/DataSourceStatsResult;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field final mVersionCode:I

.field public final zzUZ:J

.field public final zzaBI:Z

.field public final zzaBJ:J

.field public final zzaBK:J

.field public final zzavU:Lcom/google/android/gms/fitness/data/DataSource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/result/zzd;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/result/zzd;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/result/DataSourceStatsResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/fitness/data/DataSource;JZJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/result/DataSourceStatsResult;->mVersionCode:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/result/DataSourceStatsResult;->zzavU:Lcom/google/android/gms/fitness/data/DataSource;

    iput-wide p3, p0, Lcom/google/android/gms/fitness/result/DataSourceStatsResult;->zzUZ:J

    iput-boolean p5, p0, Lcom/google/android/gms/fitness/result/DataSourceStatsResult;->zzaBI:Z

    iput-wide p6, p0, Lcom/google/android/gms/fitness/result/DataSourceStatsResult;->zzaBJ:J

    iput-wide p8, p0, Lcom/google/android/gms/fitness/result/DataSourceStatsResult;->zzaBK:J

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

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/result/zzd;->zza(Lcom/google/android/gms/fitness/result/DataSourceStatsResult;Landroid/os/Parcel;I)V

    return-void
.end method
