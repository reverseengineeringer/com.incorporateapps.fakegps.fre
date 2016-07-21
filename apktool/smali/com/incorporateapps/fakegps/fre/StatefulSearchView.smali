.class public Lcom/incorporateapps/fakegps/fre/StatefulSearchView;
.super Landroid/support/v7/widget/SearchView;

# interfaces
.implements Landroid/support/v7/widget/SearchView$OnCloseListener;
.implements Landroid/support/v7/widget/SearchView$OnQueryTextListener;
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field private a:Z

.field private b:Landroid/support/v7/widget/SearchView$OnQueryTextListener;

.field private c:Ljava/lang/String;

.field private d:Landroid/support/v7/widget/SearchView$OnCloseListener;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->a:Z

    iput-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->e:Z

    invoke-virtual {p0, p0}, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    invoke-super {p0, p0}, Landroid/support/v7/widget/SearchView;->setOnCloseListener(Landroid/support/v7/widget/SearchView$OnCloseListener;)V

    return-void
.end method


# virtual methods
.method public onClose()Z
    .locals 2

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->e:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->c:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->e:Z

    :cond_0
    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->d:Landroid/support/v7/widget/SearchView$OnCloseListener;

    if-nez v1, :cond_1

    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->d:Landroid/support/v7/widget/SearchView$OnCloseListener;

    invoke-interface {v0}, Landroid/support/v7/widget/SearchView$OnCloseListener;->onClose()Z

    move-result v0

    goto :goto_0
.end method

.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 4

    const/4 v3, 0x0

    invoke-super {p0}, Landroid/support/v7/widget/SearchView;->isIconfiedByDefault()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/support/v7/widget/SearchView;->isIconified()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->a:Z

    if-eqz v0, :cond_2

    :cond_0
    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->c:Ljava/lang/String;

    invoke-super {p0, v3}, Landroid/support/v7/widget/SearchView;->setOnQueryTextListener(Landroid/support/v7/widget/SearchView$OnQueryTextListener;)V

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v2, "android:id/search_src_text"

    invoke-virtual {v0, v2, v3, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    check-cast v0, Landroid/widget/EditText;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    :cond_1
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->b:Landroid/support/v7/widget/SearchView$OnQueryTextListener;

    invoke-super {p0, v0}, Landroid/support/v7/widget/SearchView;->setOnQueryTextListener(Landroid/support/v7/widget/SearchView$OnQueryTextListener;)V

    :cond_2
    return-void
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 2

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->c:Ljava/lang/String;

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->b:Landroid/support/v7/widget/SearchView$OnQueryTextListener;

    iget-object v1, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Landroid/support/v7/widget/SearchView$OnQueryTextListener;->onQueryTextChange(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->b:Landroid/support/v7/widget/SearchView$OnQueryTextListener;

    invoke-interface {v0, p1}, Landroid/support/v7/widget/SearchView$OnQueryTextListener;->onQueryTextSubmit(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    check-cast p1, Lcom/incorporateapps/fakegps/fre/StatefulSearchView$SearchQueryState;

    invoke-virtual {p1}, Lcom/incorporateapps/fakegps/fre/StatefulSearchView$SearchQueryState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/support/v7/widget/SearchView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    invoke-virtual {p1}, Lcom/incorporateapps/fakegps/fre/StatefulSearchView$SearchQueryState;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/incorporateapps/fakegps/fre/StatefulSearchView$SearchQueryState;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->a:Z

    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    invoke-super {p0}, Landroid/support/v7/widget/SearchView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/incorporateapps/fakegps/fre/StatefulSearchView$SearchQueryState;

    iget-object v2, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->c:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->a:Z

    invoke-direct {v1, p0, v0, v2, v3}, Lcom/incorporateapps/fakegps/fre/StatefulSearchView$SearchQueryState;-><init>(Lcom/incorporateapps/fakegps/fre/StatefulSearchView;Landroid/os/Parcelable;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public setIconified(Z)V
    .locals 1

    invoke-virtual {p0}, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->getQuery()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->c:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-super {p0, v0}, Landroid/support/v7/widget/SearchView;->setOnCloseListener(Landroid/support/v7/widget/SearchView$OnCloseListener;)V

    invoke-super {p0, p1}, Landroid/support/v7/widget/SearchView;->setIconified(Z)V

    invoke-super {p0, p1}, Landroid/support/v7/widget/SearchView;->setIconified(Z)V

    invoke-super {p0, p0}, Landroid/support/v7/widget/SearchView;->setOnCloseListener(Landroid/support/v7/widget/SearchView$OnCloseListener;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->e:Z

    return-void
.end method

.method public setOnCloseListener(Landroid/support/v7/widget/SearchView$OnCloseListener;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView;->d:Landroid/support/v7/widget/SearchView$OnCloseListener;

    invoke-super {p0, p0}, Landroid/support/v7/widget/SearchView;->setOnCloseListener(Landroid/support/v7/widget/SearchView$OnCloseListener;)V

    return-void
.end method
