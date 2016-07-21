.class public Lcom/incorporateapps/fakegps/fre/MockGPSService;
.super Landroid/app/Service;


# static fields
.field protected static a:I

.field public static b:F

.field public static c:F

.field private static final l:Ljava/lang/String;


# instance fields
.field d:Landroid/content/SharedPreferences;

.field e:Lcom/incorporateapps/fakegps/fre/at;

.field f:Landroid/app/NotificationManager;

.field g:Landroid/content/Context;

.field h:I

.field i:Landroid/app/NotificationManager;

.field j:D

.field k:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x42

    sput v0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->a:I

    const-class v0, Lcom/incorporateapps/fakegps/fre/MockGPSService;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->l:Ljava/lang/String;

    const/high16 v0, 0x3f800000    # 1.0f

    sput v0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->b:F

    const/high16 v0, 0x41200000    # 10.0f

    sput v0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->c:F

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/16 v0, 0x277f

    iput v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->h:I

    return-void
.end method

.method private a()V
    .locals 9

    const v8, 0x7f080038

    const/4 v7, 0x1

    const/4 v2, 0x0

    const/4 v6, 0x0

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/MockGPSService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->g:Landroid/content/Context;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->g:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->d:Landroid/content/SharedPreferences;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->d:Landroid/content/SharedPreferences;

    const-string v1, "CurrentLat"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v0

    float-to-double v0, v0

    iput-wide v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->j:D

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->d:Landroid/content/SharedPreferences;

    const-string v1, "CurrentLon"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v0

    float-to-double v0, v0

    iput-wide v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->k:D

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->e:Lcom/incorporateapps/fakegps/fre/at;

    iget-wide v2, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->j:D

    iget-wide v4, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->k:D

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/incorporateapps/fakegps/fre/at;->a(DD)V

    invoke-virtual {p0, v8}, Lcom/incorporateapps/fakegps/fre/MockGPSService;->getString(I)Ljava/lang/String;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200b1

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "0.00000000"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v8}, Lcom/incorporateapps/fakegps/fre/MockGPSService;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "lat:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->j:D

    invoke-virtual {v0, v4, v5}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " lon: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v4, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->k:D

    invoke-virtual {v0, v4, v5}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v0, "notification"

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/MockGPSService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->i:Landroid/app/NotificationManager;

    new-instance v0, Landroid/content/Intent;

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->g:Landroid/content/Context;

    const-class v4, Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v3, 0x4000000

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->g:Landroid/content/Context;

    invoke-static {v3, v6, v0, v6}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    new-instance v3, Landroid/support/v4/app/NotificationCompat$Builder;

    iget-object v4, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->g:Landroid/content/Context;

    invoke-direct {v3, v4}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v3

    const v4, 0x7f0200b3

    invoke-virtual {v3, v4}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Landroid/support/v4/app/NotificationCompat$Builder;->setWhen(J)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/support/v4/app/NotificationCompat$Builder;->setOngoing(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    new-instance v3, Landroid/widget/RemoteViews;

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/MockGPSService;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f03001a

    invoke-direct {v3, v4, v5}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    const v4, 0x7f0a0054

    invoke-virtual {v3, v4, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    const v1, 0x7f0a0076

    invoke-virtual {v3, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    const/16 v1, 0x22

    iput v1, v0, Landroid/app/Notification;->flags:I

    iput-object v3, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.incorporateapps.fakegps.fre.ACTION_STOP"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v2, 0x8000000

    invoke-static {p0, v6, v1, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    const v2, 0x7f0a0075

    invoke-virtual {v3, v2, v1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->i:Landroid/app/NotificationManager;

    iget v2, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->h:I

    invoke-virtual {v1, v2, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->g:Landroid/content/Context;

    const v1, 0x7f080060

    invoke-static {v0, v1, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    new-instance v0, Lcom/incorporateapps/fakegps/fre/at;

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/MockGPSService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/incorporateapps/fakegps/fre/at;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->e:Lcom/incorporateapps/fakegps/fre/at;

    const-string v0, "notification"

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/MockGPSService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->f:Landroid/app/NotificationManager;

    return-void
.end method

.method public onDestroy()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->e:Lcom/incorporateapps/fakegps/fre/at;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/at;->a()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->i:Landroid/app/NotificationManager;

    iget v1, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->h:I

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->g:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->g:Landroid/content/Context;

    const v1, 0x7f080061

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x1

    :try_start_2
    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/MockGPSService;->stopForeground(Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 0

    invoke-direct {p0}, Lcom/incorporateapps/fakegps/fre/MockGPSService;->a()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    invoke-direct {p0}, Lcom/incorporateapps/fakegps/fre/MockGPSService;->a()V

    const/4 v0, 0x1

    return v0
.end method
