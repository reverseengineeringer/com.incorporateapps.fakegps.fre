package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;

public class zzcw
  extends zzcr.zza
{
  private final NativeAppInstallAd.OnAppInstallAdLoadedListener zzyS;
  
  public zzcw(NativeAppInstallAd.OnAppInstallAdLoadedListener paramOnAppInstallAdLoadedListener)
  {
    zzyS = paramOnAppInstallAdLoadedListener;
  }
  
  public void zza(zzcl paramzzcl)
  {
    zzyS.onAppInstallAdLoaded(zzb(paramzzcl));
  }
  
  zzcm zzb(zzcl paramzzcl)
  {
    return new zzcm(paramzzcl);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzcw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */