.class final Lcom/incorporateapps/fakegps/fre/w;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/w;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 8

    const v3, 0x7f080056

    const-wide v6, 0x412e848000000000L    # 1000000.0

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/w;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/w;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    const v1, 0x7f080099

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/w;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->d(Lcom/incorporateapps/fakegps/fre/Maps;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/w;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->d(Lcom/incorporateapps/fakegps/fre/Maps;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/w;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->d(Lcom/incorporateapps/fakegps/fre/Maps;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/Address;

    invoke-virtual {v0}, Landroid/location/Address;->getLatitude()D

    move-result-wide v2

    mul-double/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0}, Landroid/location/Address;->getLongitude()D

    move-result-wide v4

    mul-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/w;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    new-instance v4, Lcom/google/android/maps/GeoPoint;

    invoke-virtual {v2}, Ljava/lang/Double;->intValue()I

    move-result v2

    invoke-virtual {v0}, Ljava/lang/Double;->intValue()I

    move-result v0

    invoke-direct {v4, v2, v0}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    invoke-static {v3, v4}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/incorporateapps/fakegps/fre/Maps;Lcom/google/android/maps/GeoPoint;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/w;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/w;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v2}, Lcom/incorporateapps/fakegps/fre/Maps;->e(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/GeoPoint;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/google/android/maps/GeoPoint;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/w;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->c(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/MapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/maps/MapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v0

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/w;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v2}, Lcom/incorporateapps/fakegps/fre/Maps;->e(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/GeoPoint;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/maps/MapController;->animateTo(Lcom/google/android/maps/GeoPoint;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/w;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/w;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0
.end method
