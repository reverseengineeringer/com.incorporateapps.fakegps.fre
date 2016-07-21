.class final Lcom/incorporateapps/fakegps/fre/v;
.super Lcom/google/android/maps/Overlay;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/v;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-direct {p0}, Lcom/google/android/maps/Overlay;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouchEvent(Landroid/view/MotionEvent;Lcom/google/android/maps/MapView;)Z
    .locals 5

    const/4 v4, 0x0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/v;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/incorporateapps/fakegps/fre/Maps;->d:J

    :cond_0
    :goto_0
    return v4

    :cond_1
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/v;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/incorporateapps/fakegps/fre/Maps;->d:J

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/v;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-wide v0, v0, Lcom/incorporateapps/fakegps/fre/Maps;->d:J

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/v;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-wide v2, v2, Lcom/incorporateapps/fakegps/fre/Maps;->e:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xfa

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/v;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->c(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/MapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/maps/MapView;->getProjection()Lcom/google/android/maps/Projection;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/v;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-interface {v0, v1, v2}, Lcom/google/android/maps/Projection;->fromPixels(II)Lcom/google/android/maps/GeoPoint;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/incorporateapps/fakegps/fre/Maps;Lcom/google/android/maps/GeoPoint;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/v;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/v;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v1}, Lcom/incorporateapps/fakegps/fre/Maps;->e(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/GeoPoint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/google/android/maps/GeoPoint;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/v;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    const-wide/16 v2, -0x1

    iput-wide v2, v0, Lcom/incorporateapps/fakegps/fre/Maps;->e:J

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/v;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/v;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-wide v2, v1, Lcom/incorporateapps/fakegps/fre/Maps;->d:J

    iput-wide v2, v0, Lcom/incorporateapps/fakegps/fre/Maps;->e:J

    goto :goto_0
.end method
