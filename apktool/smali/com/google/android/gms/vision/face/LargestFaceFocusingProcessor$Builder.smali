.class public Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor$Builder;
.super Ljava/lang/Object;


# instance fields
.field private zzbnO:Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/vision/Detector;Lcom/google/android/gms/vision/Tracker;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor;-><init>(Lcom/google/android/gms/vision/Detector;Lcom/google/android/gms/vision/Tracker;)V

    iput-object v0, p0, Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor$Builder;->zzbnO:Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor;

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor$Builder;->zzbnO:Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor;

    return-object v0
.end method

.method public setMaxGapFrames(I)Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor$Builder;->zzbnO:Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor;->zza(Lcom/google/android/gms/vision/face/LargestFaceFocusingProcessor;I)V

    return-object p0
.end method
