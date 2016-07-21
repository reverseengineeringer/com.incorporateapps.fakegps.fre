package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationNativeListener;

final class g
  extends AdListener
  implements NativeAppInstallAd.OnAppInstallAdLoadedListener, NativeContentAd.OnContentAdLoadedListener, zza
{
  final a a;
  final MediationNativeListener b;
  
  public g(a parama, MediationNativeListener paramMediationNativeListener)
  {
    a = parama;
    b = paramMediationNativeListener;
  }
  
  public final void onAdClicked()
  {
    b.onAdClicked(a);
  }
  
  public final void onAdClosed()
  {
    b.onAdClosed(a);
  }
  
  public final void onAdFailedToLoad(int paramInt)
  {
    b.onAdFailedToLoad(a, paramInt);
  }
  
  public final void onAdLeftApplication()
  {
    b.onAdLeftApplication(a);
  }
  
  public final void onAdLoaded() {}
  
  public final void onAdOpened()
  {
    b.onAdOpened(a);
  }
  
  public final void onAppInstallAdLoaded(NativeAppInstallAd paramNativeAppInstallAd)
  {
    b.onAdLoaded(a, new c(paramNativeAppInstallAd));
  }
  
  public final void onContentAdLoaded(NativeContentAd paramNativeContentAd)
  {
    b.onAdLoaded(a, new d(paramNativeContentAd));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.mediation.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */