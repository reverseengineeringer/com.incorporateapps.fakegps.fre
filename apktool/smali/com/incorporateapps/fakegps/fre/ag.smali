.class final Lcom/incorporateapps/fakegps/fre/ag;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/ag;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/ag;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ag;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v0, v0, Lcom/incorporateapps/fakegps/fre/Maps;->m:[Ljava/lang/CharSequence;

    aget-object v0, v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Ljava/lang/String;)V

    return-void
.end method
