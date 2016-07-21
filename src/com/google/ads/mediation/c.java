package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;

final class c
  extends NativeAppInstallAdMapper
{
  private final NativeAppInstallAd a;
  
  public c(NativeAppInstallAd paramNativeAppInstallAd)
  {
    a = paramNativeAppInstallAd;
    setHeadline(paramNativeAppInstallAd.getHeadline().toString());
    setImages(paramNativeAppInstallAd.getImages());
    setBody(paramNativeAppInstallAd.getBody().toString());
    setIcon(paramNativeAppInstallAd.getIcon());
    setCallToAction(paramNativeAppInstallAd.getCallToAction().toString());
    setStarRating(paramNativeAppInstallAd.getStarRating().doubleValue());
    setStore(paramNativeAppInstallAd.getStore().toString());
    setPrice(paramNativeAppInstallAd.getPrice().toString());
    setOverrideImpressionRecording(true);
    setOverrideClickHandling(true);
  }
  
  public final void trackView(View paramView)
  {
    if ((paramView instanceof NativeAdView)) {
      ((NativeAdView)paramView).setNativeAd(a);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.mediation.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */