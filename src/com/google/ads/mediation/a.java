package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdLoader.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter.zza;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzka;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public abstract class a
  implements MediationBannerAdapter, MediationNativeAdapter, MediationRewardedVideoAdAdapter, zzka
{
  protected AdView a;
  protected InterstitialAd b;
  final RewardedVideoAdListener c = new b(this);
  private AdLoader d;
  private Context e;
  private InterstitialAd f;
  private MediationRewardedVideoAdListener g;
  private String h;
  
  private AdRequest a(Context paramContext, MediationAdRequest paramMediationAdRequest, Bundle paramBundle1, Bundle paramBundle2)
  {
    AdRequest.Builder localBuilder = new AdRequest.Builder();
    Object localObject = paramMediationAdRequest.getBirthday();
    if (localObject != null) {
      localBuilder.setBirthday((Date)localObject);
    }
    int i = paramMediationAdRequest.getGender();
    if (i != 0) {
      localBuilder.setGender(i);
    }
    localObject = paramMediationAdRequest.getKeywords();
    if (localObject != null)
    {
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        localBuilder.addKeyword((String)((Iterator)localObject).next());
      }
    }
    localObject = paramMediationAdRequest.getLocation();
    if (localObject != null) {
      localBuilder.setLocation((Location)localObject);
    }
    if (paramMediationAdRequest.isTesting()) {
      localBuilder.addTestDevice(zzn.zzcS().zzT(paramContext));
    }
    if (paramMediationAdRequest.taggedForChildDirectedTreatment() != -1) {
      if (paramMediationAdRequest.taggedForChildDirectedTreatment() != 1) {
        break label209;
      }
    }
    label209:
    for (boolean bool = true;; bool = false)
    {
      localBuilder.tagForChildDirectedTreatment(bool);
      localBuilder.setIsDesignedForFamilies(paramMediationAdRequest.isDesignedForFamilies());
      localBuilder.addNetworkExtrasBundle(AdMobAdapter.class, a(paramBundle1, paramBundle2));
      return localBuilder.build();
    }
  }
  
  protected abstract Bundle a(Bundle paramBundle1, Bundle paramBundle2);
  
  public String a(Bundle paramBundle)
  {
    return paramBundle.getString("pubid");
  }
  
  public View getBannerView()
  {
    return a;
  }
  
  public Bundle getInterstitialAdapterInfo()
  {
    return new MediationAdapter.zza().zzS(1).zziw();
  }
  
  public void initialize(Context paramContext, MediationAdRequest paramMediationAdRequest, String paramString, MediationRewardedVideoAdListener paramMediationRewardedVideoAdListener, Bundle paramBundle1, Bundle paramBundle2)
  {
    e = paramContext.getApplicationContext();
    h = paramString;
    g = paramMediationRewardedVideoAdListener;
    g.onInitializationSucceeded(this);
  }
  
  public boolean isInitialized()
  {
    return g != null;
  }
  
  public void loadAd(MediationAdRequest paramMediationAdRequest, Bundle paramBundle1, Bundle paramBundle2)
  {
    if ((e == null) || (g == null))
    {
      zzin.e("AdMobAdapter.loadAd called before initialize.");
      return;
    }
    f = new InterstitialAd(e);
    f.zza(true);
    f.setAdUnitId(a(paramBundle1));
    f.setRewardedVideoAdListener(c);
    f.zzm(h);
    f.loadAd(a(e, paramMediationAdRequest, paramBundle2, paramBundle1));
  }
  
  public void onDestroy()
  {
    if (a != null)
    {
      a.destroy();
      a = null;
    }
    if (b != null) {
      b = null;
    }
    if (d != null) {
      d = null;
    }
    if (f != null) {
      f = null;
    }
  }
  
  public void onPause()
  {
    if (a != null) {
      a.pause();
    }
  }
  
  public void onResume()
  {
    if (a != null) {
      a.resume();
    }
  }
  
  public void requestBannerAd(Context paramContext, MediationBannerListener paramMediationBannerListener, Bundle paramBundle1, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    a = new AdView(paramContext);
    a.setAdSize(new AdSize(paramAdSize.getWidth(), paramAdSize.getHeight()));
    a.setAdUnitId(a(paramBundle1));
    a.setAdListener(new e(this, paramMediationBannerListener));
    a.loadAd(a(paramContext, paramMediationAdRequest, paramBundle2, paramBundle1));
  }
  
  public void requestInterstitialAd(Context paramContext, MediationInterstitialListener paramMediationInterstitialListener, Bundle paramBundle1, MediationAdRequest paramMediationAdRequest, Bundle paramBundle2)
  {
    b = new InterstitialAd(paramContext);
    b.setAdUnitId(a(paramBundle1));
    b.setAdListener(new f(this, paramMediationInterstitialListener));
    b.loadAd(a(paramContext, paramMediationAdRequest, paramBundle2, paramBundle1));
  }
  
  public void requestNativeAd(Context paramContext, MediationNativeListener paramMediationNativeListener, Bundle paramBundle1, NativeMediationAdRequest paramNativeMediationAdRequest, Bundle paramBundle2)
  {
    paramMediationNativeListener = new g(this, paramMediationNativeListener);
    AdLoader.Builder localBuilder = new AdLoader.Builder(paramContext, paramBundle1.getString("pubid")).withAdListener(paramMediationNativeListener);
    NativeAdOptions localNativeAdOptions = paramNativeMediationAdRequest.getNativeAdOptions();
    if (localNativeAdOptions != null) {
      localBuilder.withNativeAdOptions(localNativeAdOptions);
    }
    if (paramNativeMediationAdRequest.isAppInstallAdRequested()) {
      localBuilder.forAppInstallAd(paramMediationNativeListener);
    }
    if (paramNativeMediationAdRequest.isContentAdRequested()) {
      localBuilder.forContentAd(paramMediationNativeListener);
    }
    d = localBuilder.build();
    d.loadAd(a(paramContext, paramNativeMediationAdRequest, paramBundle2, paramBundle1));
  }
  
  public void showInterstitial()
  {
    b.show();
  }
  
  public void showVideo()
  {
    f.show();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.mediation.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */