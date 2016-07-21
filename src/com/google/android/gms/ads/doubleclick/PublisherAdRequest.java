package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzaa;
import com.google.android.gms.ads.mediation.NetworkExtras;
import java.util.Date;
import java.util.Set;

public final class PublisherAdRequest
{
  public static final String DEVICE_ID_EMULATOR = zzaa.DEVICE_ID_EMULATOR;
  public static final int ERROR_CODE_INTERNAL_ERROR = 0;
  public static final int ERROR_CODE_INVALID_REQUEST = 1;
  public static final int ERROR_CODE_NETWORK_ERROR = 2;
  public static final int ERROR_CODE_NO_FILL = 3;
  public static final int GENDER_FEMALE = 2;
  public static final int GENDER_MALE = 1;
  public static final int GENDER_UNKNOWN = 0;
  private final zzaa zzoE;
  
  private PublisherAdRequest(PublisherAdRequest.Builder paramBuilder)
  {
    zzoE = new zzaa(PublisherAdRequest.Builder.zza(paramBuilder));
  }
  
  public static void updateCorrelator() {}
  
  public final Date getBirthday()
  {
    return zzoE.getBirthday();
  }
  
  public final String getContentUrl()
  {
    return zzoE.getContentUrl();
  }
  
  public final Bundle getCustomEventExtrasBundle(Class paramClass)
  {
    return zzoE.getCustomEventExtrasBundle(paramClass);
  }
  
  public final Bundle getCustomTargeting()
  {
    return zzoE.getCustomTargeting();
  }
  
  public final int getGender()
  {
    return zzoE.getGender();
  }
  
  public final Set getKeywords()
  {
    return zzoE.getKeywords();
  }
  
  public final Location getLocation()
  {
    return zzoE.getLocation();
  }
  
  public final boolean getManualImpressionsEnabled()
  {
    return zzoE.getManualImpressionsEnabled();
  }
  
  public final NetworkExtras getNetworkExtras(Class paramClass)
  {
    return zzoE.getNetworkExtras(paramClass);
  }
  
  public final Bundle getNetworkExtrasBundle(Class paramClass)
  {
    return zzoE.getNetworkExtrasBundle(paramClass);
  }
  
  public final String getPublisherProvidedId()
  {
    return zzoE.getPublisherProvidedId();
  }
  
  public final boolean isTestDevice(Context paramContext)
  {
    return zzoE.isTestDevice(paramContext);
  }
  
  public final zzaa zzaE()
  {
    return zzoE;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.doubleclick.PublisherAdRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */