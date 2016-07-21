.class public Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;
.super Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;


# instance fields
.field c:Landroid/content/res/Resources;

.field d:Z

.field e:Z

.field f:Landroid/os/Bundle;

.field g:I

.field h:I

.field i:Landroid/content/SharedPreferences;

.field j:Landroid/content/SharedPreferences$Editor;

.field k:Z

.field private l:Ljava/util/ArrayList;

.field private m:Landroid/content/Context;

.field private n:Lcom/incorporateapps/fakegps/fre/Maps;

.field private o:Lcom/google/android/maps/MapView;

.field private p:Landroid/graphics/drawable/Drawable;

.field private q:Lcom/google/android/maps/OverlayItem;

.field private r:Landroid/widget/ImageView;

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:Landroid/app/ProgressDialog;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Lcom/google/android/maps/MapView;Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-static {p1}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->boundCenter(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;-><init>(Landroid/graphics/drawable/Drawable;Lcom/google/android/maps/MapView;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->l:Ljava/util/ArrayList;

    iput-object v2, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->o:Lcom/google/android/maps/MapView;

    iput-object v2, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->p:Landroid/graphics/drawable/Drawable;

    iput-object v2, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->q:Lcom/google/android/maps/OverlayItem;

    iput-object v2, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->r:Landroid/widget/ImageView;

    iput-boolean v1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->d:Z

    iput-boolean v1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->e:Z

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->f:Landroid/os/Bundle;

    iput v1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->s:I

    iput v1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->t:I

    iput v1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->u:I

    iput v1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->v:I

    iput-object v2, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->w:Landroid/app/ProgressDialog;

    iput-boolean v1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->k:Z

    invoke-virtual {p2}, Lcom/google/android/maps/MapView;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->m:Landroid/content/Context;

    iput-object p3, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->n:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->m:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->i:Landroid/content/SharedPreferences;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->i:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->j:Landroid/content/SharedPreferences$Editor;

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->p:Landroid/graphics/drawable/Drawable;

    iput-object p2, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->o:Lcom/google/android/maps/MapView;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->d:Z

    iput-boolean v1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->e:Z

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->m:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->c:Landroid/content/res/Resources;

    const v0, 0x7f0200bc

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->h:I

    iget-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->d:Z

    if-eqz v0, :cond_0

    const v0, 0x7f0a007c

    invoke-virtual {p3, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->r:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->r:Landroid/widget/ImageView;

    iget v1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->h:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->s:I

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->t:I

    :cond_0
    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->populate()V

    return-void
.end method

.method static synthetic a(Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->m:Landroid/content/Context;

    return-object v0
.end method

.method private a(II)V
    .locals 5

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->r:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->r:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->s:I

    sub-int v1, p1, v1

    iget v2, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->u:I

    sub-int/2addr v1, v2

    iget v2, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->t:I

    sub-int v2, p2, v2

    iget v3, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->v:I

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v2, v4, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->r:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/maps/OverlayItem;)V
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->setLastFocusedIndex(I)V

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->populate()V

    return-void
.end method

.method protected final b(I)Z
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput p1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->g:I

    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->m:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0200b1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f080066

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f080067

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f08009b

    new-instance v2, Lcom/incorporateapps/fakegps/fre/av;

    invoke-direct {v2, p0}, Lcom/incorporateapps/fakegps/fre/av;-><init>(Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    const/4 v0, 0x1

    return v0
.end method

.method public final c(I)V
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->setLastFocusedIndex(I)V

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->populate()V

    return-void
.end method

.method protected createItem(I)Lcom/google/android/maps/OverlayItem;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->a(I)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/maps/OverlayItem;

    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;Lcom/google/android/maps/MapView;)Z
    .locals 10

    const v7, 0x49742400    # 1000000.0f

    const/4 v2, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v4, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v5, v0

    iget-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->d:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->n:Lcom/incorporateapps/fakegps/fre/Maps;

    const v6, 0x7f0a007c

    invoke-virtual {v0, v6}, Lcom/incorporateapps/fakegps/fre/Maps;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->r:Landroid/widget/ImageView;

    iget v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->h:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->r:Landroid/widget/ImageView;

    iget v6, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->h:I

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->p:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->p:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->s:I

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->p:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->t:I

    :cond_1
    if-nez v3, :cond_5

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->c()V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    move v0, v1

    :goto_0
    if-nez v0, :cond_8

    invoke-super {p0, p1, p2}, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->onTouchEvent(Landroid/view/MotionEvent;Lcom/google/android/maps/MapView;)Z

    move-result v0

    if-nez v0, :cond_8

    move v0, v1

    :goto_1
    return v0

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/maps/OverlayItem;

    new-instance v6, Landroid/graphics/Point;

    invoke-direct {v6, v1, v1}, Landroid/graphics/Point;-><init>(II)V

    iget-object v7, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->o:Lcom/google/android/maps/MapView;

    invoke-virtual {v7}, Lcom/google/android/maps/MapView;->getProjection()Lcom/google/android/maps/Projection;

    move-result-object v7

    invoke-virtual {v0}, Lcom/google/android/maps/OverlayItem;->getPoint()Lcom/google/android/maps/GeoPoint;

    move-result-object v8

    invoke-interface {v7, v8, v6}, Lcom/google/android/maps/Projection;->toPixels(Lcom/google/android/maps/GeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    iget-object v7, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->p:Landroid/graphics/drawable/Drawable;

    iget v8, v6, Landroid/graphics/Point;->x:I

    sub-int v8, v4, v8

    iget v9, v6, Landroid/graphics/Point;->y:I

    sub-int v9, v5, v9

    invoke-virtual {p0, v0, v7, v8, v9}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->hitTest(Lcom/google/android/maps/OverlayItem;Landroid/graphics/drawable/Drawable;II)Z

    move-result v7

    if-eqz v7, :cond_2

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->q:Lcom/google/android/maps/OverlayItem;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->l:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->q:Lcom/google/android/maps/OverlayItem;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->populate()V

    iput v1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->u:I

    iput v1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->v:I

    iget v0, v6, Landroid/graphics/Point;->x:I

    iget v3, v6, Landroid/graphics/Point;->y:I

    invoke-direct {p0, v0, v3}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->a(II)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->r:Landroid/widget/ImageView;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->r:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_4
    iget v0, v6, Landroid/graphics/Point;->x:I

    sub-int v0, v4, v0

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->u:I

    iget v0, v6, Landroid/graphics/Point;->y:I

    sub-int v0, v5, v0

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->v:I

    move v0, v2

    goto :goto_0

    :cond_5
    const/4 v0, 0x2

    if-ne v3, v0, :cond_7

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->q:Lcom/google/android/maps/OverlayItem;

    if-eqz v0, :cond_7

    iget-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->k:Z

    if-nez v0, :cond_6

    iput-boolean v2, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->k:Z

    :cond_6
    invoke-direct {p0, v4, v5}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->a(II)V

    move v0, v2

    goto :goto_0

    :cond_7
    if-ne v3, v2, :cond_9

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->q:Lcom/google/android/maps/OverlayItem;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->r:Landroid/widget/ImageView;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->o:Lcom/google/android/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/maps/MapView;->getProjection()Lcom/google/android/maps/Projection;

    move-result-object v0

    iget v3, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->u:I

    sub-int v3, v4, v3

    iget v4, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->v:I

    sub-int v4, v5, v4

    invoke-interface {v0, v3, v4}, Lcom/google/android/maps/Projection;->fromPixels(II)Lcom/google/android/maps/GeoPoint;

    move-result-object v0

    new-instance v3, Lcom/google/android/maps/OverlayItem;

    iget-object v4, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->q:Lcom/google/android/maps/OverlayItem;

    invoke-virtual {v4}, Lcom/google/android/maps/OverlayItem;->getTitle()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->q:Lcom/google/android/maps/OverlayItem;

    invoke-virtual {v5}, Lcom/google/android/maps/OverlayItem;->getSnippet()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v0, v4, v5}, Lcom/google/android/maps/OverlayItem;-><init>(Lcom/google/android/maps/GeoPoint;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->populate()V

    const/4 v3, 0x0

    iput-object v3, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->q:Lcom/google/android/maps/OverlayItem;

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->a(Lcom/google/android/maps/GeoPoint;)V

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->l:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    const/4 v3, -0x1

    invoke-virtual {p0, v3}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->setLastFocusedIndex(I)V

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->populate()V

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->n:Lcom/incorporateapps/fakegps/fre/Maps;

    const-string v4, ""

    iget-object v5, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->c:Landroid/content/res/Resources;

    const v6, 0x7f080057

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v0, v4, v5, p0}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/google/android/maps/GeoPoint;Ljava/lang/String;Ljava/lang/String;Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;)V

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->n:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-virtual {v3, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->b(Lcom/google/android/maps/GeoPoint;)V

    iput-boolean v1, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->k:Z

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->j:Landroid/content/SharedPreferences$Editor;

    const-string v4, "CurrentLat"

    invoke-virtual {v0}, Lcom/google/android/maps/GeoPoint;->getLatitudeE6()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v7

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->j:Landroid/content/SharedPreferences$Editor;

    const-string v4, "CurrentLon"

    invoke-virtual {v0}, Lcom/google/android/maps/GeoPoint;->getLongitudeE6()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v7

    invoke-interface {v3, v4, v0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->j:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move v0, v2

    goto/16 :goto_0

    :cond_8
    move v0, v2

    goto/16 :goto_1

    :cond_9
    move v0, v1

    goto/16 :goto_0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method
