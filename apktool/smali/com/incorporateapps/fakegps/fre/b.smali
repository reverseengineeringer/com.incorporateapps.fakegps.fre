.class final Lcom/incorporateapps/fakegps/fre/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;

.field private final synthetic b:I


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;I)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/b;->a:Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;

    iput p2, p0, Lcom/incorporateapps/fakegps/fre/b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    const/4 v2, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const v3, 0x7f0a0066

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-nez v3, :cond_1

    new-array v3, v1, [I

    const v4, 0x10100a7

    aput v4, v3, v2

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    move v0, v1

    :goto_0
    return v0

    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-ne v3, v1, :cond_3

    new-array v2, v2, [I

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_2
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/b;->a:Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;

    iget v2, p0, Lcom/incorporateapps/fakegps/fre/b;->b:I

    invoke-virtual {v0, v2}, Lcom/incorporateapps/fakegps/fre/BalloonItemizedOverlay;->b(I)Z

    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_0
.end method
