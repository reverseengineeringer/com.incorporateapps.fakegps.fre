.class final Lcom/incorporateapps/fakegps/fre/ae;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/ae;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ae;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/ae;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v1, v1, Lcom/incorporateapps/fakegps/fre/Maps;->q:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Lcom/incorporateapps/fakegps/fre/Maps;->stopService(Landroid/content/Intent;)Z

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ae;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget v0, v0, Lcom/incorporateapps/fakegps/fre/Maps;->y:I

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ae;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget v0, v0, Lcom/incorporateapps/fakegps/fre/Maps;->y:I

    rem-int/lit8 v0, v0, 0x3

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ae;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->p(Lcom/incorporateapps/fakegps/fre/Maps;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ae;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iput-boolean v2, v0, Lcom/incorporateapps/fakegps/fre/Maps;->x:Z

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ae;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iput-boolean v2, v0, Lcom/incorporateapps/fakegps/fre/Maps;->w:Z

    :cond_0
    return-void
.end method
