.class final Lcom/incorporateapps/fakegps/fre/au;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/at;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/at;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/au;->a:Lcom/incorporateapps/fakegps/fre/at;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/au;->a:Lcom/incorporateapps/fakegps/fre/at;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/au;->a:Lcom/incorporateapps/fakegps/fre/at;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/at;->a(Lcom/incorporateapps/fakegps/fre/at;)Landroid/content/Context;

    move-result-object v0

    const-string v2, "location"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    invoke-static {v1, v0}, Lcom/incorporateapps/fakegps/fre/at;->a(Lcom/incorporateapps/fakegps/fre/at;Landroid/location/LocationManager;)V

    new-instance v11, Landroid/location/Location;

    const-string v0, "gps"

    invoke-direct {v11, v0}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/au;->a:Lcom/incorporateapps/fakegps/fre/at;

    iget-wide v0, v0, Lcom/incorporateapps/fakegps/fre/at;->e:D

    invoke-virtual {v11, v0, v1}, Landroid/location/Location;->setLongitude(D)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/au;->a:Lcom/incorporateapps/fakegps/fre/at;

    iget-wide v0, v0, Lcom/incorporateapps/fakegps/fre/at;->d:D

    invoke-virtual {v11, v0, v1}, Landroid/location/Location;->setLatitude(D)V

    sget v0, Lcom/incorporateapps/fakegps/fre/MockGPSService;->b:F

    invoke-virtual {v11, v0}, Landroid/location/Location;->setAccuracy(F)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v11, v0, v1}, Landroid/location/Location;->setTime(J)V

    :try_start_0
    const-class v0, Landroid/location/Location;

    const-string v1, "makeComplete"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v11, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_0
    :goto_0
    :try_start_2
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/au;->a:Lcom/incorporateapps/fakegps/fre/at;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/at;->b(Lcom/incorporateapps/fakegps/fre/at;)Landroid/location/LocationManager;

    move-result-object v0

    const-string v1, "gps"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x1

    invoke-virtual/range {v0 .. v10}, Landroid/location/LocationManager;->addTestProvider(Ljava/lang/String;ZZZZZZZII)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/au;->a:Lcom/incorporateapps/fakegps/fre/at;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/at;->b(Lcom/incorporateapps/fakegps/fre/at;)Landroid/location/LocationManager;

    move-result-object v0

    const-string v1, "gps"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->setTestProviderStatus(Ljava/lang/String;ILandroid/os/Bundle;J)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/au;->a:Lcom/incorporateapps/fakegps/fre/at;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/at;->b(Lcom/incorporateapps/fakegps/fre/at;)Landroid/location/LocationManager;

    move-result-object v0

    const-string v1, "network"

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x2

    invoke-virtual/range {v0 .. v10}, Landroid/location/LocationManager;->addTestProvider(Ljava/lang/String;ZZZZZZZII)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/au;->a:Lcom/incorporateapps/fakegps/fre/at;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/at;->b(Lcom/incorporateapps/fakegps/fre/at;)Landroid/location/LocationManager;

    move-result-object v0

    const-string v1, "network"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->setTestProviderStatus(Ljava/lang/String;ILandroid/os/Bundle;J)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/au;->a:Lcom/incorporateapps/fakegps/fre/at;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/at;->b(Lcom/incorporateapps/fakegps/fre/at;)Landroid/location/LocationManager;

    move-result-object v0

    const-string v1, "gps"

    invoke-virtual {v0, v1, v11}, Landroid/location/LocationManager;->setTestProviderLocation(Ljava/lang/String;Landroid/location/Location;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/au;->a:Lcom/incorporateapps/fakegps/fre/at;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/at;->b(Lcom/incorporateapps/fakegps/fre/at;)Landroid/location/LocationManager;

    move-result-object v0

    const-string v1, "network"

    invoke-virtual {v0, v1, v11}, Landroid/location/LocationManager;->setTestProviderLocation(Ljava/lang/String;Landroid/location/Location;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    :goto_1
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/au;->a:Lcom/incorporateapps/fakegps/fre/at;

    iget-object v0, v0, Lcom/incorporateapps/fakegps/fre/at;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/au;->a:Lcom/incorporateapps/fakegps/fre/at;

    iget v1, v1, Lcom/incorporateapps/fakegps/fre/at;->c:I

    int-to-long v2, v1

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V

    goto :goto_0

    :catch_2
    move-exception v0

    :try_start_4
    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_0

    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    :catch_4
    move-exception v0

    goto :goto_1
.end method
