package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.zzq.zza;
import java.util.List;

class zzdw$1
  extends zzq.zza
{
  zzdw$1(zzdw paramzzdw) {}
  
  public void onAdClosed()
  {
    zzdw.zza(zzAc).add(new zzdw.1.1(this));
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    zzdw.zza(zzAc).add(new zzdw.1.2(this, paramInt));
    zzin.v("Pooled interstitial failed to load.");
  }
  
  public void onAdLeftApplication()
  {
    zzdw.zza(zzAc).add(new zzdw.1.3(this));
  }
  
  public void onAdLoaded()
  {
    zzdw.zza(zzAc).add(new zzdw.1.4(this));
    zzin.v("Pooled interstitial loaded.");
  }
  
  public void onAdOpened()
  {
    zzdw.zza(zzAc).add(new zzdw.1.5(this));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdw.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */