.class final Lcom/incorporateapps/fakegps/fre/i;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/ManagePreferences;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/ManagePreferences;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/i;->a:Lcom/incorporateapps/fakegps/fre/ManagePreferences;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/i;->a:Lcom/incorporateapps/fakegps/fre/ManagePreferences;

    invoke-static {v0, p1, p2}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->a(Lcom/incorporateapps/fakegps/fre/ManagePreferences;Landroid/preference/Preference;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
