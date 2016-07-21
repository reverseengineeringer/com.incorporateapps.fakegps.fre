.class public Lcom/incorporateapps/fakegps/fre/AnalyticsHelper;
.super Landroid/app/Application;


# static fields
.field public static a:I


# instance fields
.field b:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput v0, Lcom/incorporateapps/fakegps/fre/AnalyticsHelper;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/AnalyticsHelper;->b:Ljava/util/HashMap;

    return-void
.end method
