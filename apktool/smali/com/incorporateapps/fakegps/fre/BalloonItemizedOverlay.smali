.class public abstract Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;
.super Lcom/google/android/maps/ItemizedOverlay;


# instance fields
.field final a:Lcom/google/android/maps/MapController;

.field b:Z

.field private c:Lcom/google/android/maps/MapView;

.field private d:Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;

.field private e:Landroid/view/View;

.field private f:I

.field private g:Lcom/google/android/maps/OverlayItem;

.field private h:Lcom/google/android/maps/GeoPoint;

.field private i:I

.field private j:I

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Landroid/graphics/Paint;

.field private n:Landroid/graphics/Paint;

.field private o:Landroid/graphics/Point;

.field private p:Landroid/graphics/drawable/Drawable;

.field private q:Landroid/graphics/drawable/Drawable;

.field private r:I

.field private s:I

.field private t:Z


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Lcom/google/android/maps/MapView;)V
    .locals 1

    invoke-static {p1}, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->boundCenterBottom(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/maps/ItemizedOverlay;-><init>(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->j:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->t:Z

    iput-object p2, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->c:Lcom/google/android/maps/MapView;

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->q:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->f:I

    invoke-virtual {p2}, Lcom/google/android/maps/MapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->a:Lcom/google/android/maps/MapController;

    return-void
.end method

.method static synthetic a(Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;)Lcom/google/android/maps/GeoPoint;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->h:Lcom/google/android/maps/GeoPoint;

    return-object v0
.end method

.method public static a(Lcom/google/android/maps/GeoPoint;Landroid/content/Context;)V
    .locals 6

    const-wide v4, 0x412e848000000000L    # 1000000.0

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "google.streetview:cbll="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/maps/GeoPoint;->getLatitudeE6()I

    move-result v1

    int-to-double v2, v1

    div-double/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/maps/GeoPoint;->getLongitudeE6()I

    move-result v1

    int-to-double v2, v1

    div-double/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&cbp=1,0,0,0,0.0&mz=1.0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "exception street view"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method static synthetic b(Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;)Lcom/google/android/maps/MapView;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->c:Lcom/google/android/maps/MapView;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->i:I

    return v0
.end method

.method public final a(I)V
    .locals 0

    iput p1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->i:I

    return-void
.end method

.method public final a(Lcom/google/android/maps/GeoPoint;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->h:Lcom/google/android/maps/GeoPoint;

    return-void
.end method

.method public final a(Lcom/google/android/maps/OverlayItem;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->g:Lcom/google/android/maps/OverlayItem;

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->l:Ljava/lang/String;

    return-void
.end method

.method public final b()Lcom/google/android/maps/GeoPoint;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->h:Lcom/google/android/maps/GeoPoint;

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->k:Ljava/lang/String;

    return-void
.end method

.method protected b(I)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected final c()V
    .locals 2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->d:Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->d:Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 9

    const/4 v6, -0x2

    const/4 v1, 0x1

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->h:Lcom/google/android/maps/GeoPoint;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->d:Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;

    if-nez v0, :cond_2

    new-instance v0, Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->c:Lcom/google/android/maps/MapView;

    invoke-virtual {v2}, Lcom/google/android/maps/MapView;->getContext()Landroid/content/Context;

    move-result-object v2

    iget v5, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->f:I

    invoke-direct {v0, v2, v5}, Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->d:Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->d:Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;

    const v2, 0x7f0a0067

    invoke-virtual {v0, v2}, Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->e:Landroid/view/View;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->d:Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;

    const v2, 0x7f0a006b

    invoke-virtual {v0, v2}, Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    new-instance v2, Lcom/incorporateapps/fakegps/fre/a;

    invoke-direct {v2, p0}, Lcom/incorporateapps/fakegps/fre/a;-><init>(Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move v2, v3

    :goto_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->d:Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;

    const/16 v5, 0x8

    invoke-virtual {v0, v5}, Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;->setVisibility(I)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->c:Lcom/google/android/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/maps/MapView;->getOverlays()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-le v5, v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->d:Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->g:Lcom/google/android/maps/OverlayItem;

    invoke-virtual {v0, v1}, Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;->a(Lcom/google/android/maps/OverlayItem;)V

    new-instance v0, Lcom/google/android/maps/MapView$LayoutParams;

    const/16 v1, 0x51

    invoke-direct {v0, v6, v6, v4, v1}, Lcom/google/android/maps/MapView$LayoutParams;-><init>(IILcom/google/android/maps/GeoPoint;I)V

    iput v3, v0, Lcom/google/android/maps/MapView$LayoutParams;->mode:I

    iget v1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->i:I

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-string v5, "onBalloonTap"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v7, 0x0

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v8, v6, v7

    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    iget-object v4, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->e:Landroid/view/View;

    new-instance v5, Lcom/incorporateapps/fakegps/fre/b;

    invoke-direct {v5, p0, v1}, Lcom/incorporateapps/fakegps/fre/b;-><init>(Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;I)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_2
    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->d:Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;

    invoke-virtual {v1, v3}, Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;->setVisibility(I)V

    if-eqz v2, :cond_4

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->d:Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;

    invoke-virtual {v1, v0}, Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_3
    return-void

    :cond_2
    move v2, v1

    goto :goto_0

    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/maps/Overlay;

    instance-of v0, v1, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;

    if-eqz v0, :cond_0

    if-eq v1, p0, :cond_0

    move-object v0, v1

    check-cast v0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->c()V

    check-cast v1, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;

    iput-boolean v3, v1, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->t:Z

    goto :goto_1

    :catch_0
    move-exception v1

    const-string v1, "BalloonItemizedOverlay"

    const-string v4, "setBalloonTouchListener reflection SecurityException"

    invoke-static {v1, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->c:Lcom/google/android/maps/MapView;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->d:Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/maps/MapView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_3

    :catch_1
    move-exception v1

    goto :goto_2
.end method

.method public draw(Landroid/graphics/Canvas;Lcom/google/android/maps/MapView;Z)V
    .locals 6

    if-nez p3, :cond_3

    :try_start_0
    iget-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->t:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->p:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/google/android/maps/MapView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200b8

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->p:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->p:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->r:I

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->p:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->s:I

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->o:Landroid/graphics/Point;

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/maps/MapView;->getProjection()Lcom/google/android/maps/Projection;

    move-result-object v0

    iget v1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->j:I

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->h:Lcom/google/android/maps/GeoPoint;

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->o:Landroid/graphics/Point;

    invoke-interface {v0, v2, v3}, Lcom/google/android/maps/Projection;->toPixels(Lcom/google/android/maps/GeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    invoke-virtual {p2}, Lcom/google/android/maps/MapView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    int-to-float v0, v1

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->h:Lcom/google/android/maps/GeoPoint;

    invoke-virtual {v1}, Lcom/google/android/maps/GeoPoint;->getLatitudeE6()I

    move-result v1

    int-to-double v2, v1

    const-wide v4, 0x412e848000000000L    # 1000000.0

    div-double/2addr v2, v4

    const-string v1, "meters"

    const-string v4, "feet"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x4051f948

    div-float/2addr v0, v1

    float-to-int v0, v0

    int-to-float v0, v0

    :cond_1
    invoke-virtual {p2}, Lcom/google/android/maps/MapView;->getProjection()Lcom/google/android/maps/Projection;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/maps/Projection;->metersToEquatorPixels(F)F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    div-double v2, v4, v2

    mul-double/2addr v0, v2

    double-to-int v2, v0

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->n:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->m:Landroid/graphics/Paint;

    const/16 v0, 0x64

    const/16 v1, 0x13

    const/16 v3, 0x3d

    const/16 v4, 0xff

    invoke-static {v0, v1, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    const/16 v0, 0x32

    const/16 v3, 0x13

    const/16 v4, 0x3d

    const/16 v5, 0xff

    invoke-static {v0, v3, v4, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iget-boolean v3, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->b:Z

    if-eqz v3, :cond_2

    const/16 v0, 0x32

    const/16 v1, 0xff

    const/16 v3, 0x45

    const/4 v4, 0x0

    invoke-static {v0, v1, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x64

    const/16 v3, 0xff

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v3, v4, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    :cond_2
    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->n:Landroid/graphics/Paint;

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->n:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->n:Landroid/graphics/Paint;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->n:Landroid/graphics/Paint;

    const/high16 v3, 0x40000000    # 2.0f

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->m:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->m:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->m:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->m:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->o:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->o:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    int-to-float v3, v2

    iget-object v4, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->m:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->o:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->o:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    int-to-float v2, v2

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->n:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_0
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/maps/ItemizedOverlay;->draw(Landroid/graphics/Canvas;Lcom/google/android/maps/MapView;Z)V

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Draw circle exception"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method protected final onTap(I)Z
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->t:Z

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->d()V

    const/4 v0, 0x1

    return v0
.end method
