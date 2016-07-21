.class final Lcom/incorporateapps/fakegps/fre/e;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/CrashMap;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/CrashMap;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/e;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    const/4 v1, 0x0

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v2, 0x17

    if-lt v0, v2, :cond_2

    :try_start_1
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/e;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    const-string v2, "appops"

    invoke-virtual {v0, v2}, Lcom/incorporateapps/fakegps/fre/CrashMap;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AppOpsManager;

    const-string v2, "android:mock_location"

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v3

    iget-object v4, p0, Lcom/incorporateapps/fakegps/fre/e;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    invoke-virtual {v4}, Lcom/incorporateapps/fakegps/fre/CrashMap;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Landroid/app/AppOpsManager;->checkOp(Ljava/lang/String;ILjava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    :try_start_2
    const-string v1, "Crashmap"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/e;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->a()V

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
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/e;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->a(Lcom/incorporateapps/fakegps/fre/CrashMap;)V
    :try_end_2
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/e;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->a(Lcom/incorporateapps/fakegps/fre/CrashMap;)V

    goto :goto_1

    :cond_2
    :try_start_3
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/e;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "mock_location"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v0

    if-gtz v0, :cond_3

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/e;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->a(Lcom/incorporateapps/fakegps/fre/CrashMap;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/e;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->a()V
    :try_end_3
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1
.end method
