.class public Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;
.super Lcom/google/android/maps/MyLocationOverlay;


# instance fields
.field a:Landroid/content/SharedPreferences;

.field b:Landroid/content/SharedPreferences$Editor;

.field c:Landroid/location/Location;

.field private d:Z

.field private e:Landroid/graphics/Paint;

.field private f:Landroid/graphics/Point;

.field private g:Landroid/graphics/Point;

.field private h:Landroid/graphics/drawable/Drawable;

.field private i:I

.field private j:I

.field private k:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/maps/MapView;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/maps/MyLocationOverlay;-><init>(Landroid/content/Context;Lcom/google/android/maps/MapView;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->d:Z

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->k:Landroid/content/Context;

    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->a:Landroid/content/SharedPreferences;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->b:Landroid/content/SharedPreferences$Editor;

    return-void
.end method


# virtual methods
.method public dispatchTap()Z
    .locals 8

    const/4 v5, 0x0

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->getLastFix()Landroid/location/Location;

    move-result-object v0

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->c:Landroid/location/Location;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->c:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->c:Landroid/location/Location;

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const-string v1, "meters"

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->k:Landroid/content/Context;

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->k:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f080097

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v6, v0

    invoke-static {v6, v7}, Lcom/incorporateapps/fakegps/fre/MyFunctions;->a(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_1
    return v5
.end method

.method protected drawMyLocation(Landroid/graphics/Canvas;Lcom/google/android/maps/MapView;Landroid/location/Location;Lcom/google/android/maps/GeoPoint;J)V
    .locals 11

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->c:Landroid/location/Location;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->c:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    invoke-virtual {p3}, Landroid/location/Location;->getAccuracy()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    iget-object v4, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->c:Landroid/location/Location;

    :goto_0
    iget-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->d:Z

    if-nez v0, :cond_0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p4

    move-wide/from16 v6, p5

    :try_start_0
    invoke-super/range {v1 .. v7}, Lcom/google/android/maps/MyLocationOverlay;->drawMyLocation(Landroid/graphics/Canvas;Lcom/google/android/maps/MapView;Landroid/location/Location;Lcom/google/android/maps/GeoPoint;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    iget-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->h:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->e:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->e:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->e:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p2}, Lcom/google/android/maps/MapView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200bb

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->h:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->i:I

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->j:I

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->f:Landroid/graphics/Point;

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->g:Landroid/graphics/Point;

    :cond_1
    invoke-virtual {p2}, Lcom/google/android/maps/MapView;->getProjection()Lcom/google/android/maps/Projection;

    move-result-object v9

    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-virtual {v4}, Landroid/location/Location;->getAccuracy()F

    move-result v10

    const/4 v4, 0x1

    new-array v8, v4, [F

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    add-double v6, v2, v4

    move-wide v4, v0

    invoke-static/range {v0 .. v8}, Landroid/location/Location;->distanceBetween(DDDD[F)V

    const/4 v4, 0x0

    aget v4, v8, v4

    new-instance v5, Lcom/google/android/maps/GeoPoint;

    const-wide v6, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v0, v6

    double-to-int v0, v0

    div-float v1, v10, v4

    float-to-double v6, v1

    sub-double/2addr v2, v6

    const-wide v6, 0x412e848000000000L    # 1000000.0

    mul-double/2addr v2, v6

    double-to-int v1, v2

    invoke-direct {v5, v0, v1}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->g:Landroid/graphics/Point;

    invoke-interface {v9, v5, v0}, Lcom/google/android/maps/Projection;->toPixels(Lcom/google/android/maps/GeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->f:Landroid/graphics/Point;

    invoke-interface {v9, p4, v0}, Lcom/google/android/maps/Projection;->toPixels(Lcom/google/android/maps/GeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->f:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->g:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->e:Landroid/graphics/Paint;

    const v2, -0x999901

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->e:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->f:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->f:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    int-to-float v3, v0

    iget-object v4, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->e:Landroid/graphics/Paint;

    const v2, 0x186666ff

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->e:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->f:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->f:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    int-to-float v0, v0

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->h:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->f:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    iget v2, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->i:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->f:Landroid/graphics/Point;

    iget v2, v2, Landroid/graphics/Point;->y:I

    iget v3, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->j:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->f:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->x:I

    iget v4, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->i:I

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v3, v4

    iget-object v4, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->f:Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->y:I

    iget v5, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->j:I

    div-int/lit8 v5, v5, 0x2

    add-int/2addr v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_2
    return-void

    :cond_3
    move-object v4, p3

    goto/16 :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->d:Z

    goto/16 :goto_1
.end method
