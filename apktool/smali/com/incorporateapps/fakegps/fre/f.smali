.class final Lcom/incorporateapps/fakegps/fre/f;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/CrashMap;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/CrashMap;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/f;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/f;->a:Lcom/incorporateapps/fakegps/fre/CrashMap;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/CrashMap;->b()V

    return-void
.end method
