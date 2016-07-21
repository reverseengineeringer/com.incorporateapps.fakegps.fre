.class final Lcom/google/android/gms/common/internal/BinderWrapper$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/internal/BinderWrapper$1;->zzan(Landroid/os/Parcel;)Lcom/google/android/gms/common/internal/BinderWrapper;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/internal/BinderWrapper$1;->zzbQ(I)[Lcom/google/android/gms/common/internal/BinderWrapper;

    move-result-object v0

    return-object v0
.end method

.method public final zzan(Landroid/os/Parcel;)Lcom/google/android/gms/common/internal/BinderWrapper;
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/internal/BinderWrapper;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/common/internal/BinderWrapper;-><init>(Landroid/os/Parcel;Lcom/google/android/gms/common/internal/BinderWrapper$1;)V

    return-object v0
.end method

.method public final zzbQ(I)[Lcom/google/android/gms/common/internal/BinderWrapper;
    .locals 1

    new-array v0, p1, [Lcom/google/android/gms/common/internal/BinderWrapper;

    return-object v0
.end method
