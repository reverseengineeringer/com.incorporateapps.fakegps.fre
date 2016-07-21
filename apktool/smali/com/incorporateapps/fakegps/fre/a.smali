.class final Lcom/incorporateapps/fakegps/fre/a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/a;->a:Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/a;->a:Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->a(Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;)Lcom/google/android/maps/GeoPoint;

    move-result-object v0

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/a;->a:Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->b(Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;)Lcom/google/android/maps/MapView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/maps/MapView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->a(Lcom/google/android/maps/GeoPoint;Landroid/content/Context;)V

    return-void
.end method
