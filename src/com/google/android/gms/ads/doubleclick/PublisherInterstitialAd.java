package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.internal.client.zzac;

public final class PublisherInterstitialAd
{
  private final zzac zzoL = new zzac(paramContext, this);
  
  public PublisherInterstitialAd(Context paramContext) {}
  
  public final AdListener getAdListener()
  {
    return zzoL.getAdListener();
  }
  
  public final String getAdUnitId()
  {
    return zzoL.getAdUnitId();
  }
  
  public final AppEventListener getAppEventListener()
  {
    return zzoL.getAppEventListener();
  }
  
  public final String getMediationAdapterClassName()
  {
    return zzoL.getMediationAdapterClassName();
  }
  
  public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
  {
    return zzoL.getOnCustomRenderedAdLoadedListener();
  }
  
  public final boolean isLoaded()
  {
    return zzoL.isLoaded();
  }
  
  public final boolean isLoading()
  {
    return zzoL.isLoading();
  }
  
  public final void loadAd(PublisherAdRequest paramPublisherAdRequest)
  {
    zzoL.zza(paramPublisherAdRequest.zzaE());
  }
  
  public final void setAdListener(AdListener paramAdListener)
  {
    zzoL.setAdListener(paramAdListener);
  }
  
  public final void setAdUnitId(String paramString)
  {
    zzoL.setAdUnitId(paramString);
  }
  
  public final void setAppEventListener(AppEventListener paramAppEventListener)
  {
    zzoL.setAppEventListener(paramAppEventListener);
  }
  
  public final void setCorrelator(Correlator paramCorrelator)
  {
    zzoL.setCorrelator(paramCorrelator);
  }
  
  public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener paramOnCustomRenderedAdLoadedListener)
  {
    zzoL.setOnCustomRenderedAdLoadedListener(paramOnCustomRenderedAdLoadedListener);
  }
  
  public final void show()
  {
    zzoL.show();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.doubleclick.PublisherInterstitialAd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */