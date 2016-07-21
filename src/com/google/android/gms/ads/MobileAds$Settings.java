package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzae;

public final class MobileAds$Settings
{
  private final zzae zzoM = new zzae();
  
  public final String getTrackingId()
  {
    return zzoM.getTrackingId();
  }
  
  public final boolean isGoogleAnalyticsEnabled()
  {
    return zzoM.isGoogleAnalyticsEnabled();
  }
  
  public final Settings setGoogleAnalyticsEnabled(boolean paramBoolean)
  {
    zzoM.zzm(paramBoolean);
    return this;
  }
  
  public final Settings setTrackingId(String paramString)
  {
    zzoM.zzJ(paramString);
    return this;
  }
  
  final zzae zzaG()
  {
    return zzoM;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.MobileAds.Settings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */