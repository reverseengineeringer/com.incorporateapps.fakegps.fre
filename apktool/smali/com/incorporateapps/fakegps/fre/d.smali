.class final Lcom/incorporateapps/fakegps/fre/d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/CrashMap;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/CrashMap;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/d;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/d;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/d;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    iget-object v1, v1, Lcom/incorporateapps/fakegps/fre/CrashMap;->h:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Lcom/incorporateapps/fakegps/fre/CrashMap;->stopService(Landroid/content/Intent;)Z

    return-void
.end method
