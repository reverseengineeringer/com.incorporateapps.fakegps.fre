package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzq.zza;
import com.google.android.gms.ads.internal.zzr;

class zzdx$zza
  extends zzq.zza
{
  zzq zzAv;
  
  zzdx$zza(zzdx paramzzdx, zzq paramzzq)
  {
    zzAv = paramzzq;
  }
  
  public void onAdClosed()
  {
    zzAv.onAdClosed();
    zzr.zzbN().zzee();
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    zzAv.onAdFailedToLoad(paramInt);
  }
  
  public void onAdLeftApplication()
  {
    zzAv.onAdLeftApplication();
  }
  
  public void onAdLoaded()
  {
    zzAv.onAdLoaded();
  }
  
  public void onAdOpened()
  {
    zzAv.onAdOpened();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdx.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */