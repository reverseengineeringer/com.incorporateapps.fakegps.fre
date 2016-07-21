.class final Lcom/incorporateapps/fakegps/fre/ab;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;

.field private final synthetic b:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/ab;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iput-object p2, p0, Lcom/incorporateapps/fakegps/fre/ab;->b:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ab;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/ab;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-virtual {v1, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    :cond_0
    return-void
.end method
