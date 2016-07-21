.class public abstract Lcom/google/android/gms/vision/Detector;
.super Ljava/lang/Object;


# instance fields
.field private zzbmY:Ljava/lang/Object;

.field private zzbmZ:Lcom/google/android/gms/vision/Detector$Processor;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/Detector;->zzbmY:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public abstract detect(Lcom/google/android/gms/vision/Frame;)Landroid/util/SparseArray;
.end method

.method public isOperational()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public receiveFrame(Lcom/google/android/gms/vision/Frame;)V
    .locals 5

    iget-object v1, p0, Lcom/google/android/gms/vision/Detector;->zzbmY:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/vision/Detector;->zzbmZ:Lcom/google/android/gms/vision/Detector$Processor;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Detector processor must first be set with setProcessor in order to receive detection results."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/android/gms/vision/Frame$Metadata;

    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame;->getMetadata()Lcom/google/android/gms/vision/Frame$Metadata;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/android/gms/vision/Frame$Metadata;-><init>(Lcom/google/android/gms/vision/Frame$Metadata;)V

    invoke-virtual {v0}, Lcom/google/android/gms/vision/Frame$Metadata;->zzIf()V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/vision/Detector;->detect(Lcom/google/android/gms/vision/Frame;)Landroid/util/SparseArray;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/vision/Detector;->isOperational()Z

    move-result v3

    new-instance v4, Lcom/google/android/gms/vision/Detector$Detections;

    invoke-direct {v4, v2, v0, v3}, Lcom/google/android/gms/vision/Detector$Detections;-><init>(Landroid/util/SparseArray;Lcom/google/android/gms/vision/Frame$Metadata;Z)V

    iget-object v0, p0, Lcom/google/android/gms/vision/Detector;->zzbmZ:Lcom/google/android/gms/vision/Detector$Processor;

    invoke-interface {v0, v4}, Lcom/google/android/gms/vision/Detector$Processor;->receiveDetections(Lcom/google/android/gms/vision/Detector$Detections;)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public release()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/vision/Detector;->zzbmY:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/vision/Detector;->zzbmZ:Lcom/google/android/gms/vision/Detector$Processor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/vision/Detector;->zzbmZ:Lcom/google/android/gms/vision/Detector$Processor;

    invoke-interface {v0}, Lcom/google/android/gms/vision/Detector$Processor;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/vision/Detector;->zzbmZ:Lcom/google/android/gms/vision/Detector$Processor;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public setFocus(I)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setProcessor(Lcom/google/android/gms/vision/Detector$Processor;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/vision/Detector;->zzbmZ:Lcom/google/android/gms/vision/Detector$Processor;

    return-void
.end method
