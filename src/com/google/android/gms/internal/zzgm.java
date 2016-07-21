package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

public final class zzgm
  extends zzgh.zza
{
  private final PlayStorePurchaseListener zzuP;
  
  public zzgm(PlayStorePurchaseListener paramPlayStorePurchaseListener)
  {
    zzuP = paramPlayStorePurchaseListener;
  }
  
  public final boolean isValidPurchase(String paramString)
  {
    return zzuP.isValidPurchase(paramString);
  }
  
  public final void zza(zzgg paramzzgg)
  {
    zzuP.onInAppPurchaseFinished(new zzgk(paramzzgg));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */