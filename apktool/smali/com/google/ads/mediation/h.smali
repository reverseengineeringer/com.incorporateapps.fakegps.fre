.class public final Lcom/google/ads/mediation/h;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/util/Date;

.field private final b:Lcom/google/ads/c;

.field private final c:Ljava/util/Set;

.field private final d:Z

.field private final e:Landroid/location/Location;


# direct methods
.method public constructor <init>(Ljava/util/Date;Lcom/google/ads/c;Ljava/util/Set;ZLandroid/location/Location;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/ads/mediation/h;->a:Ljava/util/Date;

    iput-object p2, p0, Lcom/google/ads/mediation/h;->b:Lcom/google/ads/c;

    iput-object p3, p0, Lcom/google/ads/mediation/h;->c:Ljava/util/Set;

    iput-boolean p4, p0, Lcom/google/ads/mediation/h;->d:Z

    iput-object p5, p0, Lcom/google/ads/mediation/h;->e:Landroid/location/Location;

    return-void
.end method
