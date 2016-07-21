package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;

public class zzcz
  extends zzcu.zza
{
  private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zzyV;
  
  public zzcz(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener paramOnCustomTemplateAdLoadedListener)
  {
    zzyV = paramOnCustomTemplateAdLoadedListener;
  }
  
  public void zza(zzcp paramzzcp)
  {
    zzyV.onCustomTemplateAdLoaded(new zzcq(paramzzcp));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzcz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */