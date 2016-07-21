.class final Lcom/incorporateapps/fakegps/fre/aa;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/aa;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    const/4 v2, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/aa;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->c(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/MapView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/maps/MapView;->setSatellite(Z)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/aa;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->c(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/MapView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/maps/MapView;->setStreetView(Z)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/aa;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0, p2}, Lcom/incorporateapps/fakegps/fre/Maps;->b(Lcom/incorporateapps/fakegps/fre/Maps;I)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/aa;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v0, v0, Lcom/incorporateapps/fakegps/fre/Maps;->p:Landroid/content/SharedPreferences$Editor;

    const-string v1, "prefMapMode"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/aa;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v0, v0, Lcom/incorporateapps/fakegps/fre/Maps;->p:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void

    :cond_1
    if-ne p2, v2, :cond_2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/aa;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->c(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/MapView;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/maps/MapView;->setSatellite(Z)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/aa;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->c(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/MapView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/maps/MapView;->setStreetView(Z)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/aa;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0, p2}, Lcom/incorporateapps/fakegps/fre/Maps;->b(Lcom/incorporateapps/fakegps/fre/Maps;I)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/aa;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->c(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/MapView;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/maps/MapView;->setStreetView(Z)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/aa;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0, p2}, Lcom/incorporateapps/fakegps/fre/Maps;->b(Lcom/incorporateapps/fakegps/fre/Maps;I)V

    goto :goto_0
.end method
