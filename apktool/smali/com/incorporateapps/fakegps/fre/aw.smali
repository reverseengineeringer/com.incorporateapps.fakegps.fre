.class final Lcom/incorporateapps/fakegps/fre/aw;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Test;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Test;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/aw;->a:Lcom/incorporateapps/fakegps/fre/Test;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "market://details?id="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/aw;->a:Lcom/incorporateapps/fakegps/fre/Test;

    invoke-virtual {v3}, Lcom/incorporateapps/fakegps/fre/Test;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/aw;->a:Lcom/incorporateapps/fakegps/fre/Test;

    invoke-virtual {v1, v0}, Lcom/incorporateapps/fakegps/fre/Test;->startActivity(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/aw;->a:Lcom/incorporateapps/fakegps/fre/Test;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/Test;->finish()V

    return-void
.end method
