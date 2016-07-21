.class final Lcom/incorporateapps/fakegps/fre/an;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/incorporateapps/fakegps/fre/an;)Lcom/incorporateapps/fakegps/fre/Maps;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    return-object v0
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->h(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    new-instance v1, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v2, v2, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v3}, Lcom/incorporateapps/fakegps/fre/Maps;->c(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/MapView;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;-><init>(Landroid/content/Context;Lcom/google/android/maps/MapView;)V

    invoke-static {v0, v1}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/incorporateapps/fakegps/fre/Maps;Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;)V

    :cond_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->c(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/MapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/maps/MapView;->getOverlays()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->h(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->h(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->isCompassEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->h(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    move-result-object v1

    invoke-virtual {v1}, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->enableCompass()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/incorporateapps/fakegps/fre/Maps;Z)V

    :cond_1
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->h(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->isMyLocationEnabled()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->h(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    move-result-object v1

    invoke-virtual {v1}, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->enableMyLocation()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/incorporateapps/fakegps/fre/Maps;->b(Lcom/incorporateapps/fakegps/fre/Maps;Z)V

    :cond_2
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->h(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    move-result-object v0

    new-instance v1, Lcom/incorporateapps/fakegps/fre/ao;

    invoke-direct {v1, p0}, Lcom/incorporateapps/fakegps/fre/ao;-><init>(Lcom/incorporateapps/fakegps/fre/an;)V

    invoke-virtual {v0, v1}, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->runOnFirstFix(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->i(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/app/ProgressDialog;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->i(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/app/ProgressDialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/an;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->i(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/app/ProgressDialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V

    :cond_3
    const-string v1, "Show My Location Exception"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
