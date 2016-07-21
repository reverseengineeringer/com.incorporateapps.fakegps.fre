.class final Lcom/incorporateapps/fakegps/fre/ak;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/ak;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ak;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v0, v0, Lcom/incorporateapps/fakegps/fre/Maps;->p:Landroid/content/SharedPreferences$Editor;

    const-string v1, "dontRate"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ak;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v0, v0, Lcom/incorporateapps/fakegps/fre/Maps;->p:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    return-void
.end method
