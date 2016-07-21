.class final Lcom/incorporateapps/fakegps/fre/av;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/av;->a:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/av;->a:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->a(Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".fre"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "market://details?id="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/av;->a:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->a(Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    return-void
.end method
