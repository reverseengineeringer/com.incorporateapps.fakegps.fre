.class public Lcom/incorporateapps/fakegps/fre/CrashMap;
.super Landroid/app/Activity;


# instance fields
.field a:Landroid/content/SharedPreferences$Editor;

.field b:Landroid/content/SharedPreferences;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:Ljava/lang/String;

.field g:Landroid/content/Context;

.field h:Landroid/content/Intent;

.field i:Landroid/widget/EditText;

.field j:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const-string v0, "217953415"

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->c:Ljava/lang/String;

    const-string v0, "228596641"

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->d:Ljava/lang/String;

    const-string v0, "386497341"

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->e:Ljava/lang/String;

    const-string v0, "669202757"

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->f:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/incorporateapps/fakegps/fre/CrashMap;)V
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

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->g:Landroid/content/Context;

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

    new-instance v2, Lcom/incorporateapps/fakegps/fre/f;

    invoke-direct {v2, p0}, Lcom/incorporateapps/fakegps/fre/f;-><init>(Lcom/incorporateapps/fakegps/fre/CrashMap;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f080084

    new-instance v2, Lcom/incorporateapps/fakegps/fre/g;

    invoke-direct {v2, p0}, Lcom/incorporateapps/fakegps/fre/g;-><init>(Lcom/incorporateapps/fakegps/fre/CrashMap;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 6

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->j:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->j:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget-object v4, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->a:Landroid/content/SharedPreferences$Editor;

    const-string v5, "CurrentLat"

    double-to-float v2, v2

    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->a:Landroid/content/SharedPreferences$Editor;

    const-string v3, "CurrentLon"

    double-to-float v0, v0

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->a:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :try_start_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->h:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->stopService(Landroid/content/Intent;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->h:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->finish()V

    :goto_1
    return-void

    :cond_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->g:Landroid/content/Context;

    const v1, 0x7f080041

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected final b()V
    .locals 5

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".free"

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

    invoke-virtual {p0, v1}, Lcom/incorporateapps/fakegps/fre/CrashMap;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7

    const/16 v6, 0x2d8

    const/16 v5, 0x280

    const/4 v4, 0x0

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    iput-object p0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->g:Landroid/content/Context;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->g:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->b:Landroid/content/SharedPreferences;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->a:Landroid/content/SharedPreferences$Editor;

    const v0, 0x7f030019

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->setContentView(I)V

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->g:Landroid/content/Context;

    const-class v2, Lcom/incorporateapps/fakegps/fre/MockGPSService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->h:Landroid/content/Intent;

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const v0, 0x7f0a0065

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    new-instance v2, Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->g:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/16 v2, 0x1d4

    if-lt v1, v2, :cond_0

    if-ge v1, v5, :cond_0

    const-string v2, "107612707"

    iput-object v2, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->c:Ljava/lang/String;

    const-string v2, "517128541"

    iput-object v2, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->d:Ljava/lang/String;

    :cond_0
    if-lt v1, v5, :cond_1

    if-ge v1, v6, :cond_1

    const-string v2, "566661413"

    iput-object v2, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->d:Ljava/lang/String;

    :cond_1
    if-lt v1, v6, :cond_2

    const-string v1, "679802592"

    iput-object v1, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->d:Ljava/lang/String;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const/16 v2, 0x5a

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->requestLayout()V

    :cond_2
    const v0, 0x7f0a006f

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->i:Landroid/widget/EditText;

    const v0, 0x7f0a006d

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->j:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->b:Landroid/content/SharedPreferences;

    const-string v1, "CurrentLat"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v0

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->b:Landroid/content/SharedPreferences;

    const-string v2, "CurrentLon"

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v1

    cmpl-float v2, v0, v4

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->i:Landroid/widget/EditText;

    invoke-static {v0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    cmpl-float v0, v1, v4

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/CrashMap;->j:Landroid/widget/EditText;

    invoke-static {v1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    const v0, 0x7f0a0071

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    new-instance v1, Lcom/incorporateapps/fakegps/fre/d;

    invoke-direct {v1, p0}, Lcom/incorporateapps/fakegps/fre/d;-><init>(Lcom/incorporateapps/fakegps/fre/CrashMap;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0072

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    new-instance v1, Lcom/incorporateapps/fakegps/fre/e;

    invoke-direct {v1, p0}, Lcom/incorporateapps/fakegps/fre/e;-><init>(Lcom/incorporateapps/fakegps/fre/CrashMap;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method
