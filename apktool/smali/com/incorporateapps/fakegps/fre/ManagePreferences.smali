.class public Lcom/incorporateapps/fakegps/fre/ManagePreferences;
.super Landroid/preference/PreferenceActivity;


# instance fields
.field a:Landroid/preference/Preference;

.field b:Landroid/preference/Preference;

.field c:Landroid/preference/Preference;

.field d:Landroid/preference/CheckBoxPreference;

.field e:Landroid/content/SharedPreferences;

.field f:Z

.field g:Landroid/content/Context;

.field h:Landroid/content/SharedPreferences$Editor;

.field private i:Landroid/content/res/Resources;

.field private j:Landroid/preference/Preference$OnPreferenceChangeListener;

.field private k:Landroid/preference/Preference$OnPreferenceChangeListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/preference/PreferenceActivity;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->f:Z

    new-instance v0, Lcom/incorporateapps/fakegps/fre/i;

    invoke-direct {v0, p0}, Lcom/incorporateapps/fakegps/fre/i;-><init>(Lcom/incorporateapps/fakegps/fre/ManagePreferences;)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->j:Landroid/preference/Preference$OnPreferenceChangeListener;

    new-instance v0, Lcom/incorporateapps/fakegps/fre/j;

    invoke-direct {v0, p0}, Lcom/incorporateapps/fakegps/fre/j;-><init>(Lcom/incorporateapps/fakegps/fre/ManagePreferences;)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->k:Landroid/preference/Preference$OnPreferenceChangeListener;

    return-void
.end method

.method static synthetic a(Lcom/incorporateapps/fakegps/fre/ManagePreferences;Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 6

    const/4 v1, 0x1

    const/4 v0, 0x0

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->e:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-virtual {p1}, Landroid/preference/Preference;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Ljava/lang/Boolean;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    :goto_0
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->d:Landroid/preference/CheckBoxPreference;

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->d:Landroid/preference/CheckBoxPreference;

    invoke-virtual {v2}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->c:Landroid/preference/Preference;

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setEnabled(Z)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->b:Landroid/preference/Preference;

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setEnabled(Z)V

    :cond_0
    :goto_1
    move v0, v1

    :cond_1
    return v0

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    check-cast p2, Ljava/lang/String;

    invoke-interface {v2, v3, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->c:Landroid/preference/Preference;

    invoke-virtual {v2, v0}, Landroid/preference/Preference;->setEnabled(Z)V

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->b:Landroid/preference/Preference;

    invoke-virtual {v2, v0}, Landroid/preference/Preference;->setEnabled(Z)V

    goto :goto_1
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->i:Landroid/content/res/Resources;

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->g:Landroid/content/Context;

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->e:Landroid/content/SharedPreferences;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->h:Landroid/content/SharedPreferences$Editor;

    const v0, 0x7f050001

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->addPreferencesFromResource(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const v0, 0x7f0800b9

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->a:Landroid/preference/Preference;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->a:Landroid/preference/Preference;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->j:Landroid/preference/Preference$OnPreferenceChangeListener;

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    const v0, 0x7f0800a9

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Landroid/preference/CheckBoxPreference;

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->d:Landroid/preference/CheckBoxPreference;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->d:Landroid/preference/CheckBoxPreference;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->j:Landroid/preference/Preference$OnPreferenceChangeListener;

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    const v0, 0x7f0800ad

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->c:Landroid/preference/Preference;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->c:Landroid/preference/Preference;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->j:Landroid/preference/Preference$OnPreferenceChangeListener;

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    const v0, 0x7f0800b5

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->b:Landroid/preference/Preference;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->b:Landroid/preference/Preference;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->j:Landroid/preference/Preference$OnPreferenceChangeListener;

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    const v0, 0x7f080069

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    new-instance v1, Lcom/incorporateapps/fakegps/fre/k;

    invoke-direct {v1, p0}, Lcom/incorporateapps/fakegps/fre/k;-><init>(Lcom/incorporateapps/fakegps/fre/ManagePreferences;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->d:Landroid/preference/CheckBoxPreference;

    invoke-virtual {v0}, Landroid/preference/CheckBoxPreference;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->c:Landroid/preference/Preference;

    invoke-virtual {v0, v3}, Landroid/preference/Preference;->setEnabled(Z)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->b:Landroid/preference/Preference;

    invoke-virtual {v0, v3}, Landroid/preference/Preference;->setEnabled(Z)V

    :goto_1
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Add Preferences From Resource exception"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->c:Landroid/preference/Preference;

    invoke-virtual {v0, v2}, Landroid/preference/Preference;->setEnabled(Z)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/ManagePreferences;->b:Landroid/preference/Preference;

    invoke-virtual {v0, v2}, Landroid/preference/Preference;->setEnabled(Z)V

    goto :goto_1
.end method

.method public onDestroy()V
    .locals 0

    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onDestroy()V

    return-void
.end method
