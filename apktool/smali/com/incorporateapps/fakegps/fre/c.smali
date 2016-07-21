.class final Lcom/incorporateapps/fakegps/fre/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/c;->a:Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/c;->a:Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;->a(Lcom/incorporateapps/fakegps/fre/BalloonOverlayView;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method
