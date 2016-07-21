.class public Landroid/support/v7/widget/WindowCallbackWrapper;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v7/internal/app/WindowCallback;


# instance fields
.field private mWrapped:Landroid/support/v7/internal/app/WindowCallback;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/app/WindowCallback;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Window callback may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Landroid/support/v7/widget/WindowCallbackWrapper;->mWrapped:Landroid/support/v7/internal/app/WindowCallback;

    return-void
.end method


# virtual methods
.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/WindowCallbackWrapper;->mWrapped:Landroid/support/v7/internal/app/WindowCallback;

    invoke-interface {v0, p1, p2}, Landroid/support/v7/internal/app/WindowCallback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onCreatePanelView(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/WindowCallbackWrapper;->mWrapped:Landroid/support/v7/internal/app/WindowCallback;

    invoke-interface {v0, p1}, Landroid/support/v7/internal/app/WindowCallback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/WindowCallbackWrapper;->mWrapped:Landroid/support/v7/internal/app/WindowCallback;

    invoke-interface {v0, p1, p2}, Landroid/support/v7/internal/app/WindowCallback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/WindowCallbackWrapper;->mWrapped:Landroid/support/v7/internal/app/WindowCallback;

    invoke-interface {v0, p1, p2}, Landroid/support/v7/internal/app/WindowCallback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/WindowCallbackWrapper;->mWrapped:Landroid/support/v7/internal/app/WindowCallback;

    invoke-interface {v0, p1, p2}, Landroid/support/v7/internal/app/WindowCallback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/WindowCallbackWrapper;->mWrapped:Landroid/support/v7/internal/app/WindowCallback;

    invoke-interface {v0, p1, p2, p3}, Landroid/support/v7/internal/app/WindowCallback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public startActionMode(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/WindowCallbackWrapper;->mWrapped:Landroid/support/v7/internal/app/WindowCallback;

    invoke-interface {v0, p1}, Landroid/support/v7/internal/app/WindowCallback;->startActionMode(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;

    move-result-object v0

    return-object v0
.end method
