.class final Lcom/incorporateapps/fakegps/fre/g;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/CrashMap;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/CrashMap;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/g;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/g;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "com.android.settings"

    const-string v3, "com.android.settings.DevelopmentSettings"

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/incorporateapps/fakegps/fre/CrashMap;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
