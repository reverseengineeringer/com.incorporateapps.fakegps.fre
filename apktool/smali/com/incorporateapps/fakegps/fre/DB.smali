.class public Lcom/incorporateapps/fakegps/fre/DB;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/database/sqlite/SQLiteDatabase;

.field private final b:Landroid/content/Context;

.field private c:Lcom/incorporateapps/fakegps/fre/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/DB;->b:Landroid/content/Context;

    new-instance v0, Lcom/incorporateapps/fakegps/fre/h;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/DB;->b:Landroid/content/Context;

    const-string v2, "FakeGPSInc.db"

    invoke-direct {v0, v1, v2}, Lcom/incorporateapps/fakegps/fre/h;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/DB;->c:Lcom/incorporateapps/fakegps/fre/h;

    return-void
.end method


# virtual methods
.method public final a()Lcom/incorporateapps/fakegps/fre/DB;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/DB;->c:Lcom/incorporateapps/fakegps/fre/h;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/h;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/DB;->a:Landroid/database/sqlite/SQLiteDatabase;

    return-object p0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/DB;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/DB;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    return-void
.end method
