.class Lcom/google/android/gms/maps/GoogleMap$5;
.super Lcom/google/android/gms/maps/internal/zzr$zza;


# instance fields
.field final synthetic zzaRu:Lcom/google/android/gms/maps/GoogleMap;

.field final synthetic zzaRy:Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/GoogleMap$5;->zzaRu:Lcom/google/android/gms/maps/GoogleMap;

    iput-object p2, p0, Lcom/google/android/gms/maps/GoogleMap$5;->zzaRy:Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;

    invoke-direct {p0}, Lcom/google/android/gms/maps/internal/zzr$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public onMyLocationButtonClick()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap$5;->zzaRy:Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;

    invoke-interface {v0}, Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;->onMyLocationButtonClick()Z

    move-result v0

    return v0
.end method
