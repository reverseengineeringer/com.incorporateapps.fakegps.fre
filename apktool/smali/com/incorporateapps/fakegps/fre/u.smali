.class final Lcom/incorporateapps/fakegps/fre/u;
.super Ljava/lang/Thread;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;

.field private final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/u;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iput-object p2, p0, Lcom/incorporateapps/fakegps/fre/u;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    :try_start_0
    invoke-static {}, Landroid/os/Looper;->prepare()V

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, Landroid/os/Message;->what:I

    new-instance v1, Landroid/location/Geocoder;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/u;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;Ljava/util/Locale;)V

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/u;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/u;->b:Ljava/lang/String;

    const/4 v4, 0x5

    invoke-virtual {v1, v3, v4}, Landroid/location/Geocoder;->getFromLocationName(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/incorporateapps/fakegps/fre/Maps;Ljava/util/List;)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/u;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->n(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/u;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/app/ProgressDialog;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/u;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    :cond_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x1

    iput v1, v0, Landroid/os/Message;->what:I

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/u;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->n(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method
