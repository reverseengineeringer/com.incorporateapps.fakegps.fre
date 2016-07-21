.class Lcom/google/android/gms/tagmanager/zzba$1;
.super Landroid/util/LruCache;


# instance fields
.field final synthetic zzbjr:Lcom/google/android/gms/tagmanager/zzm$zza;

.field final synthetic zzbjs:Lcom/google/android/gms/tagmanager/zzba;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/zzba;ILcom/google/android/gms/tagmanager/zzm$zza;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzba$1;->zzbjs:Lcom/google/android/gms/tagmanager/zzba;

    iput-object p3, p0, Lcom/google/android/gms/tagmanager/zzba$1;->zzbjr:Lcom/google/android/gms/tagmanager/zzm$zza;

    invoke-direct {p0, p2}, Landroid/util/LruCache;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzba$1;->zzbjr:Lcom/google/android/gms/tagmanager/zzm$zza;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/tagmanager/zzm$zza;->sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
