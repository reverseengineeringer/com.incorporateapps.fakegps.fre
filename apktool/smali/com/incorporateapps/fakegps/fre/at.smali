.class public Lcom/incorporateapps/fakegps/fre/at;
.super Ljava/lang/Thread;


# static fields
.field private static final g:Ljava/lang/String;


# instance fields
.field protected a:I

.field protected b:F

.field protected c:I

.field d:D

.field e:D

.field f:Landroid/os/Handler;

.field private h:Landroid/content/Context;

.field private i:Landroid/location/LocationManager;

.field private j:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/incorporateapps/fakegps/fre/at;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/incorporateapps/fakegps/fre/at;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/16 v0, 0x12c

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/at;->a:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/at;->b:F

    const/16 v0, 0x7d0

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/at;->c:I

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/at;->f:Landroid/os/Handler;

    new-instance v0, Lcom/incorporateapps/fakegps/fre/au;

    invoke-direct {v0, p0}, Lcom/incorporateapps/fakegps/fre/au;-><init>(Lcom/incorporateapps/fakegps/fre/at;)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/at;->j:Ljava/lang/Runnable;

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/at;->h:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/incorporateapps/fakegps/fre/at;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/at;->h:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lcom/incorporateapps/fakegps/fre/at;Landroid/location/LocationManager;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/at;->i:Landroid/location/LocationManager;

    return-void
.end method

.method static synthetic b(Lcom/incorporateapps/fakegps/fre/at;)Landroid/location/LocationManager;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/at;->i:Landroid/location/LocationManager;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/at;->j:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/at;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/at;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/at;->i:Landroid/location/LocationManager;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeTestProvider(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/at;->i:Landroid/location/LocationManager;

    const-string v1, "network"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeTestProvider(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final a(DD)V
    .locals 3

    iput-wide p1, p0, Lcom/incorporateapps/fakegps/fre/at;->d:D

    iput-wide p3, p0, Lcom/incorporateapps/fakegps/fre/at;->e:D

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/at;->j:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/at;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/at;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/at;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/at;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
