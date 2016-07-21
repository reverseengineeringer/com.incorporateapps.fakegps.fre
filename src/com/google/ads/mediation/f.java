package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

final class f
  extends AdListener
  implements zza
{
  final a a;
  final MediationInterstitialListener b;
  
  public f(a parama, MediationInterstitialListener paramMediationInterstitialListener)
  {
    a = parama;
    b = paramMediationInterstitialListener;
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
  
  public final void onAdLoaded()
  {
    b.onAdLoaded(a);
  }
  
  public final void onAdOpened()
  {
    b.onAdOpened(a);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.mediation.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */