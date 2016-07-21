package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

public final class zzc
  extends zzq.zza
{
  private final AdListener zztA;
  
  public zzc(AdListener paramAdListener)
  {
    zztA = paramAdListener;
  }
  
  public final void onAdClosed()
  {
    zztA.onAdClosed();
  }
  
  public final void onAdFailedToLoad(int paramInt)
  {
    zztA.onAdFailedToLoad(paramInt);
  }
  
  public final void onAdLeftApplication()
  {
    zztA.onAdLeftApplication();
  }
  
  public final void onAdLoaded()
  {
    zztA.onAdLoaded();
  }
  
  public final void onAdOpened()
  {
    zztA.onAdOpened();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */