.class final Lcom/incorporateapps/fakegps/fre/k;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/ManagePreferences;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/ManagePreferences;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/k;->a:Lcom/incorporateapps/fakegps/fre/ManagePreferences;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 5

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/k;->a:Lcom/incorporateapps/fakegps/fre/ManagePreferences;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->getPackageName()Ljava/lang/String;

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

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/k;->a:Lcom/incorporateapps/fakegps/fre/ManagePreferences;

    invoke-virtual {v0, v1}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->startActivity(Landroid/content/Intent;)V

    const/4 v0, 0x1

    return v0
.end method
