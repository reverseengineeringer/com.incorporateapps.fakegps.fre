package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzac;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public final class InterstitialAd
{
  private final zzac zzoL;
  
  public InterstitialAd(Context paramContext)
  {
    zzoL = new zzac(paramContext);
  }
  
  public final AdListener getAdListener()
  {
    return zzoL.getAdListener();
  }
  
  public final String getAdUnitId()
  {
    return zzoL.getAdUnitId();
  }
  
  public final InAppPurchaseListener getInAppPurchaseListener()
  {
    return zzoL.getInAppPurchaseListener();
  }
  
  public final String getMediationAdapterClassName()
  {
    return zzoL.getMediationAdapterClassName();
  }
  
  public final boolean isLoaded()
  {
    return zzoL.isLoaded();
  }
  
  public final boolean isLoading()
  {
    return zzoL.isLoading();
  }
  
  public final void loadAd(AdRequest paramAdRequest)
  {
    zzoL.zza(paramAdRequest.zzaE());
  }
  
  public final void setAdListener(AdListener paramAdListener)
  {
    zzoL.setAdListener(paramAdListener);
    if ((paramAdListener != null) && ((paramAdListener instanceof zza))) {
      zzoL.zza((zza)paramAdListener);
    }
    while (paramAdListener != null) {
      return;
    }
    zzoL.zza(null);
  }
  
  public final void setAdUnitId(String paramString)
  {
    zzoL.setAdUnitId(paramString);
  }
  
  public final void setInAppPurchaseListener(InAppPurchaseListener paramInAppPurchaseListener)
  {
    zzoL.setInAppPurchaseListener(paramInAppPurchaseListener);
  }
  
  public final void setPlayStorePurchaseParams(PlayStorePurchaseListener paramPlayStorePurchaseListener, String paramString)
  {
    zzoL.setPlayStorePurchaseParams(paramPlayStorePurchaseListener, paramString);
  }
  
  public final void setRewardedVideoAdListener(RewardedVideoAdListener paramRewardedVideoAdListener)
  {
    zzoL.setRewardedVideoAdListener(paramRewardedVideoAdListener);
  }
  
  public final void show()
  {
    zzoL.show();
  }
  
  public final void zza(boolean paramBoolean)
  {
    zzoL.zza(paramBoolean);
  }
  
  public final void zzm(String paramString)
  {
    zzoL.setUserId(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.InterstitialAd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */