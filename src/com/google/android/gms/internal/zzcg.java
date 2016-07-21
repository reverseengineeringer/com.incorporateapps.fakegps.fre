package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

public final class zzcg
  extends zzcf.zza
{
  private final OnCustomRenderedAdLoadedListener zzuQ;
  
  public zzcg(OnCustomRenderedAdLoadedListener paramOnCustomRenderedAdLoadedListener)
  {
    zzuQ = paramOnCustomRenderedAdLoadedListener;
  }
  
  public final void zza(zzce paramzzce)
  {
    zzuQ.onCustomRenderedAdLoaded(new zzcd(paramzzce));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzcg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */