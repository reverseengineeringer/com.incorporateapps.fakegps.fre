package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.zzin;

final class CustomEventAdapter$zza
  implements CustomEventBannerListener
{
  private final CustomEventAdapter zzOt;
  private final MediationBannerListener zzbc;
  
  public CustomEventAdapter$zza(CustomEventAdapter paramCustomEventAdapter, MediationBannerListener paramMediationBannerListener)
  {
    zzOt = paramCustomEventAdapter;
    zzbc = paramMediationBannerListener;
  }
  
  public final void onAdClicked()
  {
    zzin.zzaI("Custom event adapter called onAdClicked.");
    zzbc.onAdClicked(zzOt);
  }
  
  public final void onAdClosed()
  {
    zzin.zzaI("Custom event adapter called onAdClosed.");
    zzbc.onAdClosed(zzOt);
  }
  
  public final void onAdFailedToLoad(int paramInt)
  {
    zzin.zzaI("Custom event adapter called onAdFailedToLoad.");
    zzbc.onAdFailedToLoad(zzOt, paramInt);
  }
  
  public final void onAdLeftApplication()
  {
    zzin.zzaI("Custom event adapter called onAdLeftApplication.");
    zzbc.onAdLeftApplication(zzOt);
  }
  
  public final void onAdLoaded(View paramView)
  {
    zzin.zzaI("Custom event adapter called onAdLoaded.");
    CustomEventAdapter.zza(zzOt, paramView);
    zzbc.onAdLoaded(zzOt);
  }
  
  public final void onAdOpened()
  {
    zzin.zzaI("Custom event adapter called onAdOpened.");
    zzbc.onAdOpened(zzOt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */