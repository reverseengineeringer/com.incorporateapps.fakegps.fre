.class final Lcom/incorporateapps/fakegps/fre/j;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/ManagePreferences;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/ManagePreferences;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/j;->a:Lcom/incorporateapps/fakegps/fre/ManagePreferences;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/preference/Preference;->setTitle(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/j;->a:Lcom/incorporateapps/fakegps/fre/ManagePreferences;

    invoke-static {v0, p1, p2}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->a(Lcom/incorporateapps/fakegps/fre/ManagePreferences;Landroid/preference/Preference;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
