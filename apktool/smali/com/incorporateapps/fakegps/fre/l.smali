.class final Lcom/incorporateapps/fakegps/fre/l;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/l;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    const v3, 0x7f080056

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/l;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/l;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    const v1, 0x7f080098

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void

    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/l;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->b(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/GeoPoint;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/l;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/l;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->b(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/GeoPoint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/google/android/maps/GeoPoint;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/l;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->c(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/MapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/maps/MapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v0

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/l;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->b(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/GeoPoint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/maps/MapController;->animateTo(Lcom/google/android/maps/GeoPoint;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/l;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/l;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
