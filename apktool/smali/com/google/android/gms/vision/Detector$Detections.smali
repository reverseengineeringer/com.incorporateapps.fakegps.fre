.class public Lcom/google/android/gms/vision/Detector$Detections;
.super Ljava/lang/Object;


# instance fields
.field private zzbna:Landroid/util/SparseArray;

.field private zzbnb:Lcom/google/android/gms/vision/Frame$Metadata;

.field private zzbnc:Z


# direct methods
.method public constructor <init>(Landroid/util/SparseArray;Lcom/google/android/gms/vision/Frame$Metadata;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/vision/Detector$Detections;->zzbna:Landroid/util/SparseArray;

    iput-object p2, p0, Lcom/google/android/gms/vision/Detector$Detections;->zzbnb:Lcom/google/android/gms/vision/Frame$Metadata;

    iput-boolean p3, p0, Lcom/google/android/gms/vision/Detector$Detections;->zzbnc:Z

    return-void
.end method


# virtual methods
.method public detectorIsOperational()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/vision/Detector$Detections;->zzbnc:Z

    return v0
.end method

.method public getDetectedItems()Landroid/util/SparseArray;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/Detector$Detections;->zzbna:Landroid/util/SparseArray;

    return-object v0
.end method

.method public getFrameMetadata()Lcom/google/android/gms/vision/Frame$Metadata;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/Detector$Detections;->zzbnb:Lcom/google/android/gms/vision/Frame$Metadata;

    return-object v0
.end method
