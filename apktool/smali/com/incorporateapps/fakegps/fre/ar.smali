.class final Lcom/incorporateapps/fakegps/fre/ar;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/ar;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ar;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v0, v0, Lcom/incorporateapps/fakegps/fre/Maps;->p:Landroid/content/SharedPreferences$Editor;

    const-string v1, "prefDisclosureAdd"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ar;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v0, v0, Lcom/incorporateapps/fakegps/fre/Maps;->p:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ar;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v0, v0, Lcom/incorporateapps/fakegps/fre/Maps;->v:Lcom/google/android/gms/analytics/GoogleAnalytics;

    const/high16 v1, 0x7f050000

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->newTracker(I)Lcom/google/android/gms/analytics/Tracker;

    move-result-object v0

    const-string v1, "Accept View"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/Tracker;->setScreenName(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;

    invoke-direct {v1}, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;->build()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    return-void
.end method
