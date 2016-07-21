package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;

public class zzcx
  extends zzcs.zza
{
  private final NativeContentAd.OnContentAdLoadedListener zzyT;
  
  public zzcx(NativeContentAd.OnContentAdLoadedListener paramOnContentAdLoadedListener)
  {
    zzyT = paramOnContentAdLoadedListener;
  }
  
  public void zza(zzcn paramzzcn)
  {
    zzyT.onContentAdLoaded(zzb(paramzzcn));
  }
  
  zzco zzb(zzcn paramzzcn)
  {
    return new zzco(paramzzcn);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzcx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */