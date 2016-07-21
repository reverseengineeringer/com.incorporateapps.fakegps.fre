.class final Lcom/incorporateapps/fakegps/fre/af;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/af;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/af;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget v0, v0, Lcom/incorporateapps/fakegps/fre/Maps;->y:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/af;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget v0, v0, Lcom/incorporateapps/fakegps/fre/Maps;->y:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/af;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/incorporateapps/fakegps/fre/Maps;->w:Z

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/af;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/incorporateapps/fakegps/fre/Maps;->x:Z

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/af;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->q(Lcom/incorporateapps/fakegps/fre/Maps;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/af;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->r(Lcom/incorporateapps/fakegps/fre/Maps;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/af;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->p(Lcom/incorporateapps/fakegps/fre/Maps;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/af;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->d()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/af;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->d()V

    goto :goto_0
.end method
