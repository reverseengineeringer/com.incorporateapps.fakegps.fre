.class final Lcom/incorporateapps/fakegps/fre/ah;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/ah;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 5

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ah;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->a()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ah;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->b()V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/ah;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/maps/GeoPoint;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/ah;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v2, v2, Lcom/incorporateapps/fakegps/fre/Maps;->g:Ljava/lang/String;

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/ah;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v3, v3, Lcom/incorporateapps/fakegps/fre/Maps;->h:Ljava/lang/String;

    iget-object v4, p0, Lcom/incorporateapps/fakegps/fre/ah;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v4, v4, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/google/android/maps/GeoPoint;Ljava/lang/String;Ljava/lang/String;Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ah;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->f(Lcom/incorporateapps/fakegps/fre/Maps;)V

    :cond_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ah;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->g(Lcom/incorporateapps/fakegps/fre/Maps;)I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ah;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->g(Lcom/incorporateapps/fakegps/fre/Maps;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/incorporateapps/fakegps/fre/Maps;I)V

    :cond_1
    return-void
.end method
