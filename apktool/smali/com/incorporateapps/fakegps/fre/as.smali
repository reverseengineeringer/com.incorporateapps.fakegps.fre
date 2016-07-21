.class final Lcom/incorporateapps/fakegps/fre/as;
.super Lcom/google/android/gms/ads/AdListener;


# instance fields
.field final synthetic a:Lcom/incorporateapps/fakegps/fre/Maps;


# direct methods
.method constructor <init>(Lcom/incorporateapps/fakegps/fre/Maps;)V
    .locals 0

    iput-object p1, p0, Lcom/incorporateapps/fakegps/fre/as;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdClosed()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdClosed()V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/as;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-boolean v0, v0, Lcom/incorporateapps/fakegps/fre/Maps;->x:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/as;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->d()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/as;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    iget-boolean v0, v0, Lcom/incorporateapps/fakegps/fre/Maps;->w:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/as;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-virtual {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->finish()V

    goto :goto_0
.end method

.method public final onAdLoaded()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdLoaded()V

    iget-object v0, p0, Lcom/incorporateapps/fakegps/fre/as;->a:Lcom/incorporateapps/fakegps/fre/Maps;

    invoke-static {v0}, Lcom/incorporateapps/fakegps/fre/Maps;->m(Lcom/incorporateapps/fakegps/fre/Maps;)V

    return-void
.end method
