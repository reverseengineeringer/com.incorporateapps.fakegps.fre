.class final Lcom/incorporateapps/fakegps/fre/x;
.super Ljava/lang/Thread;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;

.field private final synthetic b:Lcom/google/android/maps/GeoPoint;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;Lcom/google/android/maps/GeoPoint;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/x;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iput-object p2, p0, Lcom/incorporateapps/fakegps/fre/x;->b:Lcom/google/android/maps/GeoPoint;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/x;->b:Lcom/google/android/maps/GeoPoint;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    :try_start_0
    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/x;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->g(Lcom/incorporateapps/fakegps/fre/Maps;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v1, v2}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/incorporateapps/fakegps/fre/Maps;I)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/x;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/x;->b:Lcom/google/android/maps/GeoPoint;

    invoke-static {v1, v2}, Lcom/incorporateapps/fakegps/fre/Maps;->b(Lcom/incorporateapps/fakegps/fre/Maps;Lcom/google/android/maps/GeoPoint;)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/x;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->o(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v1

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/x;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->f(Lcom/incorporateapps/fakegps/fre/Maps;)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/x;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/x;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    const v3, 0x7f080058

    invoke-virtual {v2, v3}, Lcom/incorporateapps/fakegps/fre/Maps;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/incorporateapps/fakegps/fre/Maps;->g:Ljava/lang/String;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/x;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->o(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method
