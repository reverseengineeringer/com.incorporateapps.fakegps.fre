.class final Lcom/incorporateapps/fakegps/fre/ao;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/an;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/an;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/ao;->a:Lcom/incorporateapps/fakegps/fre/an;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ao;->a:Lcom/incorporateapps/fakegps/fre/an;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/an;->a(Lcom/incorporateapps/fakegps/fre/an;)Lcom/incorporateapps/fakegps/fre/Maps;

    move-result-object v0

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->i(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/app/ProgressDialog;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ao;->a:Lcom/incorporateapps/fakegps/fre/an;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/an;->a(Lcom/incorporateapps/fakegps/fre/an;)Lcom/incorporateapps/fakegps/fre/Maps;

    move-result-object v0

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->i(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    :cond_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ao;->a:Lcom/incorporateapps/fakegps/fre/an;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/an;->a(Lcom/incorporateapps/fakegps/fre/an;)Lcom/incorporateapps/fakegps/fre/Maps;

    move-result-object v0

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->h(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->getMyLocation()Lcom/google/android/maps/GeoPoint;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/ao;->a:Lcom/incorporateapps/fakegps/fre/an;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/an;->a(Lcom/incorporateapps/fakegps/fre/an;)Lcom/incorporateapps/fakegps/fre/Maps;

    move-result-object v1

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->j(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/MapController;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/maps/MapController;->animateTo(Lcom/google/android/maps/GeoPoint;)V

    :cond_1
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ao;->a:Lcom/incorporateapps/fakegps/fre/an;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/an;->a(Lcom/incorporateapps/fakegps/fre/an;)Lcom/incorporateapps/fakegps/fre/Maps;

    move-result-object v0

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/ao;->a:Lcom/incorporateapps/fakegps/fre/an;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/an;->a(Lcom/incorporateapps/fakegps/fre/an;)Lcom/incorporateapps/fakegps/fre/Maps;

    move-result-object v1

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->h(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    move-result-object v1

    invoke-virtual {v1}, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->getLastFix()Landroid/location/Location;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/incorporateapps/fakegps/fre/Maps;Landroid/location/Location;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ao;->a:Lcom/incorporateapps/fakegps/fre/an;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/an;->a(Lcom/incorporateapps/fakegps/fre/an;)Lcom/incorporateapps/fakegps/fre/Maps;

    move-result-object v0

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->k(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ao;->a:Lcom/incorporateapps/fakegps/fre/an;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/an;->a(Lcom/incorporateapps/fakegps/fre/an;)Lcom/incorporateapps/fakegps/fre/Maps;

    move-result-object v0

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->l(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_2
    return-void
.end method
