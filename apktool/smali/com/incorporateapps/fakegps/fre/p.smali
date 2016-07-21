.class final Lcom/incorporateapps/fakegps/fre/p;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/p;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/p;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->finish()V

    return-void
.end method
