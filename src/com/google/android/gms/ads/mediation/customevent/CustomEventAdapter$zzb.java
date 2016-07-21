package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.zzin;

class CustomEventAdapter$zzb
  implements CustomEventInterstitialListener
{
  private final CustomEventAdapter zzOt;
  private final MediationInterstitialListener zzbd;
  
  public CustomEventAdapter$zzb(CustomEventAdapter paramCustomEventAdapter1, CustomEventAdapter paramCustomEventAdapter2, MediationInterstitialListener paramMediationInterstitialListener)
  {
    zzOt = paramCustomEventAdapter2;
    zzbd = paramMediationInterstitialListener;
  }
  
  public void onAdClicked()
  {
    zzin.zzaI("Custom event adapter called onAdClicked.");
    zzbd.onAdClicked(zzOt);
  }
  
  public void onAdClosed()
  {
    zzin.zzaI("Custom event adapter called onAdClosed.");
    zzbd.onAdClosed(zzOt);
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    zzin.zzaI("Custom event adapter called onFailedToReceiveAd.");
    zzbd.onAdFailedToLoad(zzOt, paramInt);
  }
  
  public void onAdLeftApplication()
  {
    zzin.zzaI("Custom event adapter called onAdLeftApplication.");
    zzbd.onAdLeftApplication(zzOt);
  }
  
  public void onAdLoaded()
  {
    zzin.zzaI("Custom event adapter called onReceivedAd.");
    zzbd.onAdLoaded(zzOu);
  }
  
  public void onAdOpened()
  {
    zzin.zzaI("Custom event adapter called onAdOpened.");
    zzbd.onAdOpened(zzOt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */