.class public Lcom/incorporateapps/fakegps/fre/Maps;
.super Lcom/google/android/maps/MapActivity;


# static fields
.field private static A:Ljava/lang/String;


# instance fields
.field private B:Lcom/incorporateapps/fakegps/fre/DB;

.field private C:Lcom/google/android/maps/MapController;

.field private D:Lcom/google/android/maps/MapView;

.field private E:Lcom/google/android/maps/GeoPoint;

.field private F:Lcom/google/android/maps/Overlay;

.field private G:Landroid/app/ProgressDialog;

.field private H:Landroid/app/ProgressDialog;

.field private I:Landroid/app/ProgressDialog;

.field private J:Landroid/app/ProgressDialog;

.field private K:Ljava/util/List;

.field private L:I

.field private M:Landroid/location/Location;

.field private N:Lcom/google/android/gms/ads/InterstitialAd;

.field private O:Z

.field private P:Z

.field private Q:Z

.field private R:Lcom/google/android/maps/GeoPoint;

.field private S:Landroid/os/Handler;

.field private T:Landroid/os/Handler;

.field private volatile U:I

.field private V:Landroid/os/Handler;

.field private W:Z

.field private X:Z

.field private Y:Z

.field private Z:Z

.field a:Landroid/widget/ImageView;

.field private aa:Z

.field private ab:Z

.field private ac:Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

.field private ad:Landroid/os/Handler;

.field private ae:Landroid/os/Handler;

.field b:Landroid/widget/ImageView;

.field c:Z

.field d:J

.field e:J

.field f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

.field g:Ljava/lang/String;

.field h:Ljava/lang/String;

.field i:Ljava/lang/String;

.field j:Ljava/lang/String;

.field k:Landroid/graphics/drawable/Drawable;

.field l:Landroid/content/Context;

.field m:[Ljava/lang/CharSequence;

.field n:Landroid/app/AlertDialog;

.field o:Landroid/content/SharedPreferences;

.field p:Landroid/content/SharedPreferences$Editor;

.field q:Landroid/content/Intent;

.field r:Ljava/lang/String;

.field s:Ljava/lang/String;

.field t:Ljava/lang/String;

.field u:Ljava/lang/String;

.field v:Lcom/google/android/gms/analytics/GoogleAnalytics;

.field w:Z

.field x:Z

.field y:I

.field z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "Maps"

    sput-object v0, Lcom/incorporateapps/fakegps/fre/Maps;->A:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/google/android/maps/MapActivity;-><init>()V

    iput-boolean v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->c:Z

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->e:J

    iput-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->G:Landroid/app/ProgressDialog;

    iput-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->H:Landroid/app/ProgressDialog;

    iput-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->I:Landroid/app/ProgressDialog;

    iput-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->J:Landroid/app/ProgressDialog;

    iput-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->K:Ljava/util/List;

    iput v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->L:I

    const-string v0, ""

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->g:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->h:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->i:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->j:Ljava/lang/String;

    const-string v0, "217953415"

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->r:Ljava/lang/String;

    const-string v0, "228596641"

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->s:Ljava/lang/String;

    const-string v0, "398701144"

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->t:Ljava/lang/String;

    const-string v0, "669202757"

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->u:Ljava/lang/String;

    iput-boolean v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->w:Z

    iput-boolean v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->x:Z

    iput-boolean v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->O:Z

    iput-boolean v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->P:Z

    iput-boolean v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->Q:Z

    iput v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->y:I

    iput-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->R:Lcom/google/android/maps/GeoPoint;

    new-instance v0, Lcom/incorporateapps/fakegps/fre/l;

    invoke-direct {v0, p0}, Lcom/incorporateapps/fakegps/fre/l;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->S:Landroid/os/Handler;

    new-instance v0, Lcom/incorporateapps/fakegps/fre/w;

    invoke-direct {v0, p0}, Lcom/incorporateapps/fakegps/fre/w;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->T:Landroid/os/Handler;

    iput v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->U:I

    new-instance v0, Lcom/incorporateapps/fakegps/fre/ah;

    invoke-direct {v0, p0}, Lcom/incorporateapps/fakegps/fre/ah;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->V:Landroid/os/Handler;

    iput-boolean v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->W:Z

    iput-boolean v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->X:Z

    iput-boolean v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->Y:Z

    iput-boolean v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->Z:Z

    iput-boolean v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->aa:Z

    iput-boolean v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->ab:Z

    iput-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->ac:Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    new-instance v0, Lcom/incorporateapps/fakegps/fre/an;

    invoke-direct {v0, p0}, Lcom/incorporateapps/fakegps/fre/an;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->ad:Landroid/os/Handler;

    new-instance v0, Lcom/incorporateapps/fakegps/fre/ap;

    invoke-direct {v0, p0}, Lcom/incorporateapps/fakegps/fre/ap;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->ae:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/app/ProgressDialog;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->G:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method static synthetic a(Lcom/incorporateapps/fakegps/fre/Maps;I)V
    .locals 0

    iput p1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->U:I

    return-void
.end method

.method static synthetic a(Lcom/incorporateapps/fakegps/fre/Maps;Landroid/location/Location;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->M:Landroid/location/Location;

    return-void
.end method

.method static synthetic a(Lcom/incorporateapps/fakegps/fre/Maps;Lcom/google/android/maps/GeoPoint;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->E:Lcom/google/android/maps/GeoPoint;

    return-void
.end method

.method static synthetic a(Lcom/incorporateapps/fakegps/fre/Maps;Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->ac:Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    return-void
.end method

.method static synthetic a(Lcom/incorporateapps/fakegps/fre/Maps;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->K:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/incorporateapps/fakegps/fre/Maps;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->aa:Z

    return-void
.end method

.method private static b(Ljava/lang/String;)Landroid/location/Location;
    .locals 7

    const/4 v1, 0x0

    const/4 v6, 0x3

    const/4 v3, 0x2

    const-string v0, ","

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v0, v2

    if-lt v0, v3, :cond_0

    array-length v0, v2

    if-le v0, v6, :cond_2

    :cond_0
    move-object v0, v1

    :cond_1
    :goto_0
    return-object v0

    :cond_2
    :try_start_0
    new-instance v0, Landroid/location/Location;

    const-string v3, "GeoUri"

    invoke-direct {v0, v3}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-static {v3}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Landroid/location/Location;->setLatitude(D)V

    const/4 v3, 0x1

    aget-object v3, v2, v3

    invoke-static {v3}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Landroid/location/Location;->setLongitude(D)V

    array-length v3, v2

    if-ne v3, v6, :cond_1

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-static {v2}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Landroid/location/Location;->setAltitude(D)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0
.end method

.method static synthetic b(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/GeoPoint;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->R:Lcom/google/android/maps/GeoPoint;

    return-object v0
.end method

.method static synthetic b(Lcom/incorporateapps/fakegps/fre/Maps;I)V
    .locals 0

    iput p1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->L:I

    return-void
.end method

.method static synthetic b(Lcom/incorporateapps/fakegps/fre/Maps;Lcom/google/android/maps/GeoPoint;)V
    .locals 8

    const v7, 0x7f080058

    const-wide v4, 0x412e848000000000L    # 1000000.0

    const v0, 0x7f080057

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->h:Ljava/lang/String;

    invoke-virtual {p0, v7}, Lcom/incorporateapps/fakegps/fre/Maps;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->i:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/maps/GeoPoint;->getLatitudeE6()I

    move-result v0

    int-to-double v0, v0

    div-double v2, v0, v4

    invoke-virtual {p1}, Lcom/google/android/maps/GeoPoint;->getLongitudeE6()I

    move-result v0

    int-to-double v0, v0

    div-double v4, v0, v4

    :try_start_0
    new-instance v1, Landroid/location/Geocoder;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;Ljava/util/Locale;)V

    const/4 v6, 0x1

    invoke-virtual/range {v1 .. v6}, Landroid/location/Geocoder;->getFromLocation(DDI)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/Address;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/MyFunctions;->b(Landroid/location/Address;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/MyFunctions;->a(Landroid/location/Address;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->j:Ljava/lang/String;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->j:Ljava/lang/String;

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->h:Ljava/lang/String;

    :goto_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->i:Ljava/lang/String;

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->g:Ljava/lang/String;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->a(Ljava/lang/String;)V

    :goto_1
    return-void

    :cond_0
    const-string v0, ""

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->h:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->i:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0, v7}, Lcom/incorporateapps/fakegps/fre/Maps;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->g:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->h:Ljava/lang/String;

    goto :goto_1
.end method

.method static synthetic b(Lcom/incorporateapps/fakegps/fre/Maps;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->ab:Z

    return-void
.end method

.method static synthetic c(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/MapView;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->D:Lcom/google/android/maps/MapView;

    return-object v0
.end method

.method static synthetic d(Lcom/incorporateapps/fakegps/fre/Maps;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->K:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/GeoPoint;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->E:Lcom/google/android/maps/GeoPoint;

    return-object v0
.end method

.method private e()Z
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/MyFunctions;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v0, v3, :cond_2

    :try_start_0
    const-string v0, "appops"

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AppOpsManager;

    const-string v3, "android:mock_location"

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v4

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v3, v4, v5}, Landroid/app/AppOpsManager;->checkOp(Ljava/lang/String;ILjava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    if-eqz v0, :cond_0

    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0200b1

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v2, 0x7f080072

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v2, 0x7f080073

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v2, 0x7f08007e

    new-instance v3, Lcom/incorporateapps/fakegps/fre/p;

    invoke-direct {v3, p0}, Lcom/incorporateapps/fakegps/fre/p;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v2, 0x7f080086

    new-instance v3, Lcom/incorporateapps/fakegps/fre/q;

    invoke-direct {v3, p0}, Lcom/incorporateapps/fakegps/fre/q;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    move v2, v1

    :cond_0
    return v2

    :cond_1
    move v0, v2

    goto :goto_0

    :catch_0
    move-exception v0

    move v0, v2

    goto :goto_0

    :cond_2
    :try_start_1
    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v3, "mock_location"

    invoke-static {v0, v3}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I
    :try_end_1
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-gtz v0, :cond_3

    move v0, v2

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Landroid/provider/Settings$SettingNotFoundException;->printStackTrace()V

    :cond_3
    move v0, v2

    goto :goto_0
.end method

.method private f()V
    .locals 4

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f080064

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f080065

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f08007e

    new-instance v3, Lcom/incorporateapps/fakegps/fre/m;

    invoke-direct {v3, p0}, Lcom/incorporateapps/fakegps/fre/m;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f080063

    new-instance v3, Lcom/incorporateapps/fakegps/fre/n;

    invoke-direct {v3, p0}, Lcom/incorporateapps/fakegps/fre/n;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method static synthetic f(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 1

    const-string v0, ""

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->g:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->h:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->j:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->i:Ljava/lang/String;

    return-void
.end method

.method static synthetic g(Lcom/incorporateapps/fakegps/fre/Maps;)I
    .locals 1

    iget v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->U:I

    return v0
.end method

.method private g()V
    .locals 4

    const v3, 0x7f08006e

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03001b

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0077

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0200b1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f08006f

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f08009b

    new-instance v2, Lcom/incorporateapps/fakegps/fre/s;

    invoke-direct {v2, p0}, Lcom/incorporateapps/fakegps/fre/s;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f080085

    new-instance v2, Lcom/incorporateapps/fakegps/fre/t;

    invoke-direct {v2, p0}, Lcom/incorporateapps/fakegps/fre/t;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method static synthetic h(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->ac:Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    return-object v0
.end method

.method private h()V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->b()Lcom/google/android/maps/GeoPoint;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->q:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->stopService(Landroid/content/Intent;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->q:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->finish()V

    :goto_1
    return-void

    :cond_1
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    const v1, 0x7f080062

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic i(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/app/ProgressDialog;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->I:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method private i()V
    .locals 3

    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

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

    new-instance v2, Lcom/incorporateapps/fakegps/fre/am;

    invoke-direct {v2, p0}, Lcom/incorporateapps/fakegps/fre/am;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method static synthetic j(Lcom/incorporateapps/fakegps/fre/Maps;)Lcom/google/android/maps/MapController;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->C:Lcom/google/android/maps/MapController;

    return-object v0
.end method

.method static synthetic k(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->M:Landroid/location/Location;

    return-object v0
.end method

.method static synthetic l(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->ae:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic m(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->P:Z

    return-void
.end method

.method static synthetic n(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->T:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic o(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->V:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic p(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->Q:Z

    return-void
.end method

.method static synthetic q(Lcom/incorporateapps/fakegps/fre/Maps;)Z
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->N:Lcom/google/android/gms/ads/InterstitialAd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->N:Lcom/google/android/gms/ads/InterstitialAd;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/InterstitialAd;->isLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->N:Lcom/google/android/gms/ads/InterstitialAd;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/InterstitialAd;->show()V

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic r(Lcom/incorporateapps/fakegps/fre/Maps;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->Q:Z

    return v0
.end method

.method static synthetic s(Lcom/incorporateapps/fakegps/fre/Maps;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->ad:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->U:I

    return v0
.end method

.method final a(Lcom/google/android/maps/GeoPoint;)V
    .locals 6

    const-wide v4, 0x412e848000000000L    # 1000000.0

    :try_start_0
    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200bc

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->b()V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->D:Lcom/google/android/maps/MapView;

    invoke-virtual {v1}, Lcom/google/android/maps/MapView;->getOverlays()Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->D:Lcom/google/android/maps/MapView;

    invoke-direct {v2, v0, v3, p0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;-><init>(Landroid/graphics/drawable/Drawable;Lcom/google/android/maps/MapView;Lcom/incorporateapps/fakegps/fre/Maps;)V

    iput-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    const v0, 0x7f080057

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->h:Ljava/lang/String;

    new-instance v0, Lcom/google/android/maps/OverlayItem;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->g:Ljava/lang/String;

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->h:Ljava/lang/String;

    invoke-direct {v0, p1, v2, v3}, Lcom/google/android/maps/OverlayItem;-><init>(Lcom/google/android/maps/GeoPoint;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    invoke-virtual {v2, v0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->b(Lcom/google/android/maps/OverlayItem;)V

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    invoke-virtual {v2, p1}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->a(Lcom/google/android/maps/GeoPoint;)V

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    invoke-virtual {v2, v0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->a(Lcom/google/android/maps/OverlayItem;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->d()V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->j:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->a(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/incorporateapps/fakegps/fre/Maps;->b(Lcom/google/android/maps/GeoPoint;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/google/android/maps/GeoPoint;->getLatitudeE6()I

    move-result v0

    int-to-double v0, v0

    div-double/2addr v0, v4

    invoke-virtual {p1}, Lcom/google/android/maps/GeoPoint;->getLongitudeE6()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v2, v4

    iget-object v4, p0, Lcom/incorporateapps/fakegps/fre/Maps;->p:Landroid/content/SharedPreferences$Editor;

    const-string v5, "CurrentLat"

    double-to-float v0, v0

    invoke-interface {v4, v5, v0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->p:Landroid/content/SharedPreferences$Editor;

    const-string v1, "CurrentLon"

    double-to-float v2, v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->p:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Exception push pin on map"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public final a(Lcom/google/android/maps/GeoPoint;Ljava/lang/String;Ljava/lang/String;Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;)V
    .locals 2

    new-instance v0, Lcom/google/android/maps/OverlayItem;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/maps/OverlayItem;-><init>(Lcom/google/android/maps/GeoPoint;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    if-nez v1, :cond_0

    iput-object p4, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    :cond_0
    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    invoke-virtual {v1, v0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->b(Lcom/google/android/maps/OverlayItem;)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    invoke-virtual {v1, v0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->a(Lcom/google/android/maps/OverlayItem;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    invoke-virtual {v0, p1}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->a(Lcom/google/android/maps/GeoPoint;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->d()V

    return-void
.end method

.method protected final a(Ljava/lang/String;)V
    .locals 4

    const v0, 0x7f080051

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f080052

    invoke-virtual {p0, v1}, Lcom/incorporateapps/fakegps/fre/Maps;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v2, v3}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->G:Landroid/app/ProgressDialog;

    new-instance v0, Lcom/incorporateapps/fakegps/fre/u;

    invoke-direct {v0, p0, p1}, Lcom/incorporateapps/fakegps/fre/u;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final b()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->f:Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;

    invoke-virtual {v1}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/incorporateapps/fakegps/fre/MyItemizedOverlay;->c(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Delete Marker Exception"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public final declared-synchronized b(Lcom/google/android/maps/GeoPoint;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/incorporateapps/fakegps/fre/x;

    invoke-direct {v0, p0, p1}, Lcom/incorporateapps/fakegps/fre/x;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;Lcom/google/android/maps/GeoPoint;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected final c()V
    .locals 5

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->getPackageName()Ljava/lang/String;

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

    invoke-virtual {p0, v1}, Lcom/incorporateapps/fakegps/fre/Maps;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final d()V
    .locals 5

    const/4 v1, 0x0

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v2, 0x17

    if-lt v0, v2, :cond_2

    :try_start_1
    const-string v0, "appops"

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AppOpsManager;

    const-string v2, "android:mock_location"

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v3

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Landroid/app/AppOpsManager;->checkOp(Ljava/lang/String;ILjava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    if-nez v0, :cond_1

    :try_start_2
    invoke-direct {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->g()V

    :goto_1
    return-void

    :cond_0
    move v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->h()V
    :try_end_2
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-direct {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->g()V

    goto :goto_1

    :cond_2
    :try_start_3
    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "mock_location"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v0

    if-gtz v0, :cond_3

    invoke-direct {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->g()V

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->h()V
    :try_end_3
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1
.end method

.method protected isRouteDisplayed()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 12

    const/4 v11, 0x1

    const v10, 0x7f080054

    const/4 v6, 0x0

    invoke-super {p0, p1, p2, p3}, Lcom/google/android/maps/MapActivity;->onActivityResult(IILandroid/content/Intent;)V

    packed-switch p2, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    packed-switch p1, :pswitch_data_1

    goto :goto_0

    :pswitch_1
    if-eqz p3, :cond_0

    :try_start_0
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/incorporateapps/fakegps/fre/Maps;->managedQuery(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p0, v1}, Lcom/incorporateapps/fakegps/fre/Maps;->startManagingCursor(Landroid/database/Cursor;)V

    invoke-interface {v1}, Landroid/database/Cursor;->getColumnCount()I

    move-result v2

    if-lez v2, :cond_2

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "_id"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "contact_id = ? AND mimetype = ?"

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v4, v2

    const/4 v1, 0x1

    const-string v2, "vnd.android.cursor.item/postal-address_v2"

    aput-object v2, v4, v1

    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/incorporateapps/fakegps/fre/Maps;->startManagingCursor(Landroid/database/Cursor;)V

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->m:[Ljava/lang/CharSequence;

    move v0, v6

    :cond_1
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :cond_2
    :goto_2
    :try_start_1
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->m:[Ljava/lang/CharSequence;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->m:[Ljava/lang/CharSequence;

    array-length v0, v0

    if-le v0, v11, :cond_a

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f080055

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->m:[Ljava/lang/CharSequence;

    new-instance v2, Lcom/incorporateapps/fakegps/fre/ag;

    invoke-direct {v2, p0}, Lcom/incorporateapps/fakegps/fre/ag;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    invoke-static {v0, v10, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    :cond_3
    :try_start_2
    const-string v1, ""

    const-string v3, "data5"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    const-string v3, "data6"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    const-string v3, "data4"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "data7"

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "data8"

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v7, "data9"

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v8, "data10"

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "data2"

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    if-eqz v3, :cond_4

    const-string v9, ""

    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v9, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ","

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_4
    if-eqz v7, :cond_5

    const-string v3, ""

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ","

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_5
    if-eqz v4, :cond_6

    const-string v3, ""

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ","

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_6
    if-eqz v5, :cond_7

    const-string v3, ""

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ","

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_7
    if-eqz v8, :cond_8

    const-string v3, ""

    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_8
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2c

    if-ne v3, v4, :cond_9

    const/4 v3, 0x0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    :cond_9
    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->m:[Ljava/lang/CharSequence;

    aput-object v1, v3, v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_1

    :catch_1
    move-exception v0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    invoke-static {v0, v10, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_2

    :cond_a
    :try_start_3
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->m:[Ljava/lang/CharSequence;

    array-length v0, v0

    if-lez v0, :cond_b

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->m:[Ljava/lang/CharSequence;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_b
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    const v1, 0x7f080054

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    :cond_c
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    const v1, 0x7f080054

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xd
        :pswitch_1
    .end packed-switch
.end method

.method public onBackPressed()V
    .locals 1

    invoke-direct {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onBackPressed()V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 10

    const/16 v7, 0x17

    const-wide v8, 0x412e848000000000L    # 1000000.0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f03001e

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->setContentView(I)V

    iput-object p0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    :try_start_0
    new-instance v0, Lcom/incorporateapps/fakegps/fre/DB;

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    invoke-direct {v0, v3}, Lcom/incorporateapps/fakegps/fre/DB;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->B:Lcom/incorporateapps/fakegps/fre/DB;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->B:Lcom/incorporateapps/fakegps/fre/DB;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/DB;->a()Lcom/incorporateapps/fakegps/fre/DB;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->o:Landroid/content/SharedPreferences;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->o:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->p:Landroid/content/SharedPreferences$Editor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    const-class v3, Landroid/view/ViewConfiguration;

    const-string v4, "sHasPermanentMenuKey"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    if-eqz v3, :cond_0

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_8

    :cond_0
    :goto_0
    :try_start_2
    invoke-static {p0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->v:Lcom/google/android/gms/analytics/GoogleAnalytics;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->o:Landroid/content/SharedPreferences;

    const-string v3, "prefDisclosureAdd"

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    invoke-direct {v0, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v3, 0x7f0200b1

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v3, 0x7f0800df

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v3, 0x7f0800e0

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v3, 0x7f0800dd

    new-instance v4, Lcom/incorporateapps/fakegps/fre/aq;

    invoke-direct {v4, p0}, Lcom/incorporateapps/fakegps/fre/aq;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v3, 0x7f0800de

    new-instance v4, Lcom/incorporateapps/fakegps/fre/ar;

    invoke-direct {v4, p0}, Lcom/incorporateapps/fakegps/fre/ar;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_1
    :try_start_3
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->v:Lcom/google/android/gms/analytics/GoogleAnalytics;

    const/high16 v3, 0x7f050000

    invoke-virtual {v0, v3}, Lcom/google/android/gms/analytics/GoogleAnalytics;->newTracker(I)Lcom/google/android/gms/analytics/Tracker;

    move-result-object v0

    const-string v3, "Map View"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/analytics/Tracker;->setScreenName(Ljava/lang/String;)V

    new-instance v3, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;

    invoke-direct {v3}, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;->build()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7

    :goto_1
    :try_start_4
    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->z:I

    iget v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->z:I

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/ads/InterstitialAd;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/InterstitialAd;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->N:Lcom/google/android/gms/ads/InterstitialAd;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->N:Lcom/google/android/gms/ads/InterstitialAd;

    const v3, 0x7f0800e1

    invoke-virtual {p0, v3}, Lcom/incorporateapps/fakegps/fre/Maps;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/ads/InterstitialAd;->setAdUnitId(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->N:Lcom/google/android/gms/ads/InterstitialAd;

    new-instance v3, Lcom/incorporateapps/fakegps/fre/as;

    invoke-direct {v3, p0}, Lcom/incorporateapps/fakegps/fre/as;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v0, v3}, Lcom/google/android/gms/ads/InterstitialAd;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    new-instance v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    sget-object v3, Lcom/google/android/gms/ads/AdRequest;->DEVICE_ID_EMULATOR:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/ads/AdRequest$Builder;->addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;

    move-result-object v0

    const-string v3, "353627072009106"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/ads/AdRequest$Builder;->addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;

    move-result-object v0

    const-string v3, "00c78aa2278db7af"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/ads/AdRequest$Builder;->addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v0

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->N:Lcom/google/android/gms/ads/InterstitialAd;

    invoke-virtual {v3, v0}, Lcom/google/android/gms/ads/InterstitialAd;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :cond_2
    :goto_2
    const v0, 0x7f0a007b

    :try_start_5
    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/maps/MapView;

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->D:Lcom/google/android/maps/MapView;

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f0200bc

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->k:Landroid/graphics/drawable/Drawable;

    new-instance v0, Lcom/incorporateapps/fakegps/fre/v;

    invoke-direct {v0, p0}, Lcom/incorporateapps/fakegps/fre/v;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->F:Lcom/google/android/maps/Overlay;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->D:Lcom/google/android/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/maps/MapView;->getOverlays()Ljava/util/List;

    move-result-object v0

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->F:Lcom/google/android/maps/Overlay;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Landroid/content/Intent;

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    const-class v4, Lcom/incorporateapps/fakegps/fre/MockGPSService;

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->q:Landroid/content/Intent;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->D:Lcom/google/android/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/maps/MapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->C:Lcom/google/android/maps/MapController;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->D:Lcom/google/android/maps/MapView;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/google/android/maps/MapView;->setBuiltInZoomControls(Z)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->D:Lcom/google/android/maps/MapView;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/google/android/maps/MapView;->displayZoomControls(Z)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->D:Lcom/google/android/maps/MapView;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/google/android/maps/MapView;->setVerticalScrollBarEnabled(Z)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->o:Landroid/content/SharedPreferences;

    const-string v3, "prefMapMode"

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_8

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->D:Lcom/google/android/maps/MapView;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/google/android/maps/MapView;->setSatellite(Z)V

    :goto_3
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->C:Lcom/google/android/maps/MapController;

    const/16 v3, 0xe

    invoke-virtual {v0, v3}, Lcom/google/android/maps/MapController;->setZoom(I)I

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    move-result-object v0

    :try_start_6
    const-string v3, "geo:"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x5

    if-le v3, v4, :cond_3

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "\\?"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    aget-object v3, v0, v3

    invoke-static {v3}, Lcom/incorporateapps/fakegps/fre/Maps;->b(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v3

    const-string v4, "geoLoc"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const/4 v6, 0x0

    aget-object v0, v0, v6

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    mul-double/2addr v4, v8

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    mul-double/2addr v4, v8

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    new-instance v4, Lcom/google/android/maps/GeoPoint;

    invoke-virtual {v0}, Ljava/lang/Double;->intValue()I

    move-result v0

    invoke-virtual {v3}, Ljava/lang/Double;->intValue()I

    move-result v3

    invoke-direct {v4, v0, v3}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    iput-object v4, p0, Lcom/incorporateapps/fakegps/fre/Maps;->E:Lcom/google/android/maps/GeoPoint;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->E:Lcom/google/android/maps/GeoPoint;

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/google/android/maps/GeoPoint;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->D:Lcom/google/android/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/maps/MapView;->getController()Lcom/google/android/maps/MapController;

    move-result-object v0

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/Maps;->E:Lcom/google/android/maps/GeoPoint;

    invoke-virtual {v0, v3}, Lcom/google/android/maps/MapController;->animateTo(Lcom/google/android/maps/GeoPoint;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    :cond_3
    :goto_4
    :try_start_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    if-lt v0, v7, :cond_a

    :try_start_8
    const-string v0, "appops"

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AppOpsManager;

    const-string v3, "android:mock_location"

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v4

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v3, v4, v5}, Landroid/app/AppOpsManager;->checkOp(Ljava/lang/String;ILjava/lang/String;)I
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    move-result v0

    if-nez v0, :cond_9

    move v0, v1

    :goto_5
    if-nez v0, :cond_4

    :try_start_9
    invoke-direct {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->g()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    :cond_4
    :goto_6
    const v0, 0x7f0a007e

    :try_start_a
    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->a:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->a:Landroid/widget/ImageView;

    new-instance v1, Lcom/incorporateapps/fakegps/fre/ae;

    invoke-direct {v1, p0}, Lcom/incorporateapps/fakegps/fre/ae;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a007d

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->b:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->b:Landroid/widget/ImageView;

    new-instance v1, Lcom/incorporateapps/fakegps/fre/af;

    invoke-direct {v1, p0}, Lcom/incorporateapps/fakegps/fre/af;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->o:Landroid/content/SharedPreferences;

    const-string v1, "countOpenApp"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->y:I

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->o:Landroid/content/SharedPreferences;

    const-string v1, "dontRate"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->c:Z

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->o:Landroid/content/SharedPreferences;

    const-string v1, "prefFirstOpen"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0200b1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f080075

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f080074

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f080091

    new-instance v2, Lcom/incorporateapps/fakegps/fre/o;

    invoke-direct {v2, p0}, Lcom/incorporateapps/fakegps/fre/o;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->p:Landroid/content/SharedPreferences$Editor;

    const-string v1, "prefFirstOpen"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->p:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_5
    iget v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->y:I

    if-lez v0, :cond_6

    iget v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->y:I

    rem-int/lit8 v0, v0, 0xb

    if-nez v0, :cond_6

    iget v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->y:I

    if-ge v0, v7, :cond_6

    iget-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->c:Z
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    if-nez v0, :cond_6

    :try_start_b
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0200b1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f08009f

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0800a0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0800a5

    new-instance v2, Lcom/incorporateapps/fakegps/fre/aj;

    invoke-direct {v2, p0}, Lcom/incorporateapps/fakegps/fre/aj;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0800a7

    new-instance v2, Lcom/incorporateapps/fakegps/fre/ak;

    invoke-direct {v2, p0}, Lcom/incorporateapps/fakegps/fre/ak;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0800a6

    new-instance v2, Lcom/incorporateapps/fakegps/fre/al;

    invoke-direct {v2, p0}, Lcom/incorporateapps/fakegps/fre/al;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_6

    :cond_6
    :goto_7
    :try_start_c
    iget v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->y:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->p:Landroid/content/SharedPreferences$Editor;

    const-string v2, "countOpenApp"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->p:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1

    :goto_8
    const-string v0, "location"

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-direct {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->f()V

    :cond_7
    return-void

    :catch_0
    move-exception v0

    :try_start_d
    sget-object v3, Lcom/incorporateapps/fakegps/fre/Maps;->A:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Except "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1

    goto/16 :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->finish()V

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    const-class v2, Lcom/incorporateapps/fakegps/fre/CrashMap;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->startActivity(Landroid/content/Intent;)V

    goto :goto_8

    :catch_2
    move-exception v0

    :try_start_e
    sget-object v3, Lcom/incorporateapps/fakegps/fre/Maps;->A:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Exc"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_2

    :cond_8
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->D:Lcom/google/android/maps/MapView;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lcom/google/android/maps/MapView;->setSatellite(Z)V

    goto/16 :goto_3

    :catch_3
    move-exception v0

    const-string v3, "Maps"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1

    goto/16 :goto_4

    :cond_9
    move v0, v2

    goto/16 :goto_5

    :catch_4
    move-exception v0

    move v0, v2

    goto/16 :goto_5

    :cond_a
    :try_start_f
    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "mock_location"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v0

    if-gtz v0, :cond_4

    invoke-direct {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->g()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_5

    goto/16 :goto_6

    :catch_5
    move-exception v0

    :try_start_10
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_6

    :catch_6
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1

    goto/16 :goto_7

    :catch_7
    move-exception v0

    goto/16 :goto_1

    :catch_8
    move-exception v0

    goto/16 :goto_0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 4

    const v3, 0x108002b

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const/high16 v1, 0x7f0e0000

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const/4 v0, 0x1

    const v1, 0x7f08009b

    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 v0, 0x2

    const v1, 0x7f080049

    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    const v1, 0x108004a

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 v0, 0x3

    const v1, 0x7f080048

    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    const v1, 0x108004e

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 v0, 0x7

    const v1, 0x7f080076

    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    const v1, 0x1080045

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/16 v0, 0x9

    const v1, 0x7f08009c

    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    const v1, 0x1080049

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/16 v0, 0x8

    const v1, 0x7f08004c

    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onDestroy()V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->B:Lcom/incorporateapps/fakegps/fre/DB;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->B:Lcom/incorporateapps/fakegps/fre/DB;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/DB;->b()V

    :cond_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 7

    const/4 v1, 0x0

    const/4 v0, 0x1

    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    :try_start_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    :goto_0
    return v0

    :sswitch_0
    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    invoke-static {v2}, Lcom/incorporateapps/fakegps/fre/MyFunctions;->a(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Landroid/app/ProgressDialog;

    invoke-direct {v2, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->I:Landroid/app/ProgressDialog;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->I:Landroid/app/ProgressDialog;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/app/ProgressDialog;->setProgressStyle(I)V

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->I:Landroid/app/ProgressDialog;

    const v3, 0x7f080053

    invoke-virtual {p0, v3}, Lcom/incorporateapps/fakegps/fre/Maps;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->I:Landroid/app/ProgressDialog;

    const v3, 0x7f080051

    invoke-virtual {v2, v3}, Landroid/app/ProgressDialog;->setTitle(I)V

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->I:Landroid/app/ProgressDialog;

    const/4 v3, -0x2

    const v4, 0x7f08007e

    invoke-virtual {p0, v4}, Lcom/incorporateapps/fakegps/fre/Maps;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/incorporateapps/fakegps/fre/y;

    invoke-direct {v5, p0}, Lcom/incorporateapps/fakegps/fre/y;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v2, v3, v4, v5}, Landroid/app/ProgressDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->I:Landroid/app/ProgressDialog;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->I:Landroid/app/ProgressDialog;

    invoke-virtual {v2}, Landroid/app/ProgressDialog;->show()V

    new-instance v2, Lcom/incorporateapps/fakegps/fre/ai;

    invoke-direct {v2, p0}, Lcom/incorporateapps/fakegps/fre/ai;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "exception start activities menu"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v1

    goto :goto_0

    :cond_0
    const v2, 0x7f080096

    const/4 v3, 0x0

    :try_start_1
    invoke-static {p0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :sswitch_1
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/CharSequence;

    const/4 v3, 0x0

    const v4, 0x7f08005d

    invoke-virtual {p0, v4}, Lcom/incorporateapps/fakegps/fre/Maps;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const v4, 0x7f08005e

    invoke-virtual {p0, v4}, Lcom/incorporateapps/fakegps/fre/Maps;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v4, 0x7f0200a3

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    const v4, 0x7f08005c

    invoke-virtual {p0, v4}, Lcom/incorporateapps/fakegps/fre/Maps;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    const v4, 0x7f08007e

    invoke-virtual {p0, v4}, Lcom/incorporateapps/fakegps/fre/Maps;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/incorporateapps/fakegps/fre/z;

    invoke-direct {v5, p0}, Lcom/incorporateapps/fakegps/fre/z;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v3, v4, v5}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    iget-object v4, p0, Lcom/incorporateapps/fakegps/fre/Maps;->o:Landroid/content/SharedPreferences;

    const-string v5, "prefMapMode"

    iget v6, p0, Lcom/incorporateapps/fakegps/fre/Maps;->L:I

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    new-instance v5, Lcom/incorporateapps/fakegps/fre/aa;

    invoke-direct {v5, p0}, Lcom/incorporateapps/fakegps/fre/aa;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v3, v2, v4, v5}, Landroid/app/AlertDialog$Builder;->setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v2

    iput-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->n:Landroid/app/AlertDialog;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->n:Landroid/app/AlertDialog;

    invoke-virtual {v2}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_0

    :sswitch_2
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v3, 0x7f0800d9

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    new-instance v3, Landroid/widget/EditText;

    invoke-direct {v3, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    const v4, 0x7f0800da

    invoke-virtual {v3, v4}, Landroid/widget/EditText;->setHint(I)V

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v4, 0x7f0800d5

    new-instance v5, Lcom/incorporateapps/fakegps/fre/ab;

    invoke-direct {v5, p0, v3}, Lcom/incorporateapps/fakegps/fre/ab;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;Landroid/widget/EditText;)V

    invoke-virtual {v2, v4, v5}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const/high16 v3, 0x1040000

    new-instance v4, Lcom/incorporateapps/fakegps/fre/ac;

    invoke-direct {v4, p0}, Lcom/incorporateapps/fakegps/fre/ac;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto/16 :goto_0

    :sswitch_3
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v3, "com.android.settings"

    const-string v4, "com.android.settings.DevelopmentSettings"

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/incorporateapps/fakegps/fre/Maps;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    :sswitch_4
    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->v:Lcom/google/android/gms/analytics/GoogleAnalytics;

    const/high16 v3, 0x7f050000

    invoke-virtual {v2, v3}, Lcom/google/android/gms/analytics/GoogleAnalytics;->newTracker(I)Lcom/google/android/gms/analytics/Tracker;

    move-result-object v2

    const-string v3, "Buy View"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/analytics/Tracker;->setScreenName(Ljava/lang/String;)V

    new-instance v3, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;

    invoke-direct {v3}, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/google/android/gms/analytics/HitBuilders$AppViewBuilder;->build()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->c()V

    goto/16 :goto_0

    :sswitch_5
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/incorporateapps/fakegps/fre/ManagePreferences;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v2}, Lcom/incorporateapps/fakegps/fre/Maps;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    :sswitch_6
    :try_start_2
    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->getPackageManager()Landroid/content/pm/PackageManager;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v2

    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, " v"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v4, Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-virtual {v4}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    move-result-object v2

    :goto_1
    :try_start_4
    new-instance v3, Ljava/lang/StringBuilder;

    const v4, 0x7f080038

    invoke-virtual {p0, v4}, Lcom/incorporateapps/fakegps/fre/Maps;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Landroid/app/AlertDialog$Builder;

    iget-object v4, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    invoke-direct {v3, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v4, 0x7f0200b1

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const v3, 0x7f08006b

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const v3, 0x7f080091

    new-instance v4, Lcom/incorporateapps/fakegps/fre/ad;

    invoke-direct {v4, p0}, Lcom/incorporateapps/fakegps/fre/ad;-><init>(Lcom/incorporateapps/fakegps/fre/Maps;)V

    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/AlertDialog;->show()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v2

    :try_start_5
    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->c()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_0

    :catch_2
    move-exception v2

    :try_start_6
    const-string v2, ""
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_1

    :sswitch_7
    :try_start_7
    invoke-direct {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->i()V

    goto/16 :goto_0

    :sswitch_8
    invoke-direct {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->i()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_4
        0x2 -> :sswitch_8
        0x3 -> :sswitch_7
        0x7 -> :sswitch_5
        0x8 -> :sswitch_6
        0x9 -> :sswitch_3
        0x7f0a0088 -> :sswitch_2
        0x7f0a0089 -> :sswitch_1
        0x7f0a008a -> :sswitch_0
    .end sparse-switch
.end method

.method protected onPause()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onPause()V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->ac:Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->aa:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->ac:Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->disableMyLocation()V

    :cond_0
    iget-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->ab:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->ac:Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/FixedMyLocationOverlay;->disableCompass()V

    :cond_1
    return-void
.end method

.method protected onResume()V
    .locals 6

    const/4 v3, 0x0

    const-wide v4, 0x412e848000000000L    # 1000000.0

    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onResume()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->Q:Z

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/MyFunctions;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->o:Landroid/content/SharedPreferences;

    const-string v1, "CurrentLat"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v0

    float-to-double v0, v0

    mul-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/Maps;->o:Landroid/content/SharedPreferences;

    const-string v2, "CurrentLon"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v1

    float-to-double v2, v1

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    new-instance v2, Lcom/google/android/maps/GeoPoint;

    invoke-virtual {v0}, Ljava/lang/Double;->intValue()I

    move-result v0

    invoke-virtual {v1}, Ljava/lang/Double;->intValue()I

    move-result v1

    invoke-direct {v2, v0, v1}, Lcom/google/android/maps/GeoPoint;-><init>(II)V

    iput-object v2, p0, Lcom/incorporateapps/fakegps/fre/Maps;->E:Lcom/google/android/maps/GeoPoint;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/Maps;->E:Lcom/google/android/maps/GeoPoint;

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->a(Lcom/google/android/maps/GeoPoint;)V

    :cond_0
    const-string v0, "location"

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/Maps;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/incorporateapps/fakegps/fre/Maps;->f()V

    :cond_1
    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onStart()V

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->reportActivityStart(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected onStop()V
    .locals 1

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->reportActivityStop(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-super {p0}, Lcom/google/android/maps/MapActivity;->onStop()V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/maps/MapActivity;->onWindowFocusChanged(Z)V

    return-void
.end method
