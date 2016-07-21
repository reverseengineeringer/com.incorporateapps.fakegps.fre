package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzd;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzcx;
import com.google.android.gms.internal.zzcy;
import com.google.android.gms.internal.zzcz;
import com.google.android.gms.internal.zzew;

public class AdLoader$Builder
{
  private final Context mContext;
  private final zzs zzoD;
  
  AdLoader$Builder(Context paramContext, zzs paramzzs)
  {
    mContext = paramContext;
    zzoD = paramzzs;
  }
  
  public AdLoader$Builder(Context paramContext, String paramString)
  {
    this((Context)zzx.zzb(paramContext, "context cannot be null"), zzd.zza(paramContext, paramString, new zzew()));
  }
  
  public AdLoader build()
  {
    try
    {
      AdLoader localAdLoader = new AdLoader(mContext, zzoD.zzbn());
      return localAdLoader;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Failed to build AdLoader.", localRemoteException);
    }
    return null;
  }
  
  public Builder forAppInstallAd(NativeAppInstallAd.OnAppInstallAdLoadedListener paramOnAppInstallAdLoadedListener)
  {
    try
    {
      zzoD.zza(new zzcw(paramOnAppInstallAdLoadedListener));
      return this;
    }
    catch (RemoteException paramOnAppInstallAdLoadedListener)
    {
      zzb.zzd("Failed to add app install ad listener", paramOnAppInstallAdLoadedListener);
    }
    return this;
  }
  
  public Builder forContentAd(NativeContentAd.OnContentAdLoadedListener paramOnContentAdLoadedListener)
  {
    try
    {
      zzoD.zza(new zzcx(paramOnContentAdLoadedListener));
      return this;
    }
    catch (RemoteException paramOnContentAdLoadedListener)
    {
      zzb.zzd("Failed to add content ad listener", paramOnContentAdLoadedListener);
    }
    return this;
  }
  
  public Builder forCustomTemplateAd(String paramString, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener paramOnCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener paramOnCustomClickListener)
  {
    try
    {
      zzs localzzs = zzoD;
      zzcz localzzcz = new zzcz(paramOnCustomTemplateAdLoadedListener);
      if (paramOnCustomClickListener == null) {}
      for (paramOnCustomTemplateAdLoadedListener = null;; paramOnCustomTemplateAdLoadedListener = new zzcy(paramOnCustomClickListener))
      {
        localzzs.zza(paramString, localzzcz, paramOnCustomTemplateAdLoadedListener);
        return this;
      }
      return this;
    }
    catch (RemoteException paramString)
    {
      zzb.zzd("Failed to add custom template ad listener", paramString);
    }
  }
  
  public Builder withAdListener(AdListener paramAdListener)
  {
    try
    {
      zzoD.zzb(new zzc(paramAdListener));
      return this;
    }
    catch (RemoteException paramAdListener)
    {
      zzb.zzd("Failed to set AdListener.", paramAdListener);
    }
    return this;
  }
  
  public Builder withCorrelator(Correlator paramCorrelator)
  {
    zzx.zzz(paramCorrelator);
    try
    {
      zzoD.zzb(paramCorrelator.zzaF());
      return this;
    }
    catch (RemoteException paramCorrelator)
    {
      zzb.zzd("Failed to set correlator.", paramCorrelator);
    }
    return this;
  }
  
  public Builder withNativeAdOptions(NativeAdOptions paramNativeAdOptions)
  {
    try
    {
      zzoD.zza(new NativeAdOptionsParcel(paramNativeAdOptions));
      return this;
    }
    catch (RemoteException paramNativeAdOptions)
    {
      zzb.zzd("Failed to specify native ad options", paramNativeAdOptions);
    }
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.AdLoader.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */