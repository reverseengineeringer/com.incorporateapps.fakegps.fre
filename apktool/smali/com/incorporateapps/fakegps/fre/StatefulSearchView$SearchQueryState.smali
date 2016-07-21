.class Lcom/incorporateapps/fakegps/fre/StatefulSearchView$SearchQueryState;
.super Landroid/view/View$BaseSavedState;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/StatefulSearchView;

.field private b:Z

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/incorporateapps/fakegps/fre/StatefulSearchView;Landroid/os/Parcelable;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView$SearchQueryState;->a:Lcom/incorporateapps/fakegps/fre/StatefulSearchView;

    invoke-direct {p0, p2}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    iput-object p3, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView$SearchQueryState;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView$SearchQueryState;->b:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView$SearchQueryState;->b:Z

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView$SearchQueryState;->c:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView$SearchQueryState;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/incorporateapps/fakegps/fre/StatefulSearchView$SearchQueryState;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
