package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.client.zza;
import com.google.android.gms.ads.internal.reward.client.zzd.zza;
import java.util.List;

class zzdw$6
  extends zzd.zza
{
  zzdw$6(zzdw paramzzdw) {}
  
  public void onRewardedVideoAdClosed()
  {
    zzdw.zza(zzAc).add(new zzdw.6.4(this));
  }
  
  public void onRewardedVideoAdFailedToLoad(int paramInt)
  {
    zzdw.zza(zzAc).add(new zzdw.6.7(this, paramInt));
  }
  
  public void onRewardedVideoAdLeftApplication()
  {
    zzdw.zza(zzAc).add(new zzdw.6.6(this));
  }
  
  public void onRewardedVideoAdLoaded()
  {
    zzdw.zza(zzAc).add(new zzdw.6.1(this));
  }
  
  public void onRewardedVideoAdOpened()
  {
    zzdw.zza(zzAc).add(new zzdw.6.2(this));
  }
  
  public void onRewardedVideoStarted()
  {
    zzdw.zza(zzAc).add(new zzdw.6.3(this));
  }
  
  public void zza(zza paramzza)
  {
    zzdw.zza(zzAc).add(new zzdw.6.5(this, paramzza));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdw.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */