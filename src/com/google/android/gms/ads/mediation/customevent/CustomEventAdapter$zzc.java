package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.internal.zzin;

class CustomEventAdapter$zzc
  implements CustomEventNativeListener
{
  private final CustomEventAdapter zzOt;
  private final MediationNativeListener zzbe;
  
  public CustomEventAdapter$zzc(CustomEventAdapter paramCustomEventAdapter, MediationNativeListener paramMediationNativeListener)
  {
    zzOt = paramCustomEventAdapter;
    zzbe = paramMediationNativeListener;
  }
  
  public void onAdClicked()
  {
    zzin.zzaI("Custom event adapter called onAdClicked.");
    zzbe.onAdClicked(zzOt);
  }
  
  public void onAdClosed()
  {
    zzin.zzaI("Custom event adapter called onAdClosed.");
    zzbe.onAdClosed(zzOt);
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    zzin.zzaI("Custom event adapter called onAdFailedToLoad.");
    zzbe.onAdFailedToLoad(zzOt, paramInt);
  }
  
  public void onAdLeftApplication()
  {
    zzin.zzaI("Custom event adapter called onAdLeftApplication.");
    zzbe.onAdLeftApplication(zzOt);
  }
  
  public void onAdLoaded(NativeAdMapper paramNativeAdMapper)
  {
    zzin.zzaI("Custom event adapter called onAdLoaded.");
    zzbe.onAdLoaded(zzOt, paramNativeAdMapper);
  }
  
  public void onAdOpened()
  {
    zzin.zzaI("Custom event adapter called onAdOpened.");
    zzbe.onAdOpened(zzOt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */