.class public Lcom/google/android/gms/vision/MultiProcessor$Builder;
.super Ljava/lang/Object;


# instance fields
.field private zzbns:Lcom/google/android/gms/vision/MultiProcessor;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/vision/MultiProcessor$Factory;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/vision/MultiProcessor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/vision/MultiProcessor;-><init>(Lcom/google/android/gms/vision/MultiProcessor$1;)V

    iput-object v0, p0, Lcom/google/android/gms/vision/MultiProcessor$Builder;->zzbns:Lcom/google/android/gms/vision/MultiProcessor;

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No factory supplied."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/MultiProcessor$Builder;->zzbns:Lcom/google/android/gms/vision/MultiProcessor;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/MultiProcessor;->zza(Lcom/google/android/gms/vision/MultiProcessor;Lcom/google/android/gms/vision/MultiProcessor$Factory;)Lcom/google/android/gms/vision/MultiProcessor$Factory;

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/gms/vision/MultiProcessor;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/MultiProcessor$Builder;->zzbns:Lcom/google/android/gms/vision/MultiProcessor;

    return-object v0
.end method

.method public setMaxGapFrames(I)Lcom/google/android/gms/vision/MultiProcessor$Builder;
    .locals 3

    if-gez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid max gap: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/MultiProcessor$Builder;->zzbns:Lcom/google/android/gms/vision/MultiProcessor;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/MultiProcessor;->zza(Lcom/google/android/gms/vision/MultiProcessor;I)I

    return-object p0
.end method
