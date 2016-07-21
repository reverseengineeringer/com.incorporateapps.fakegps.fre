package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzaa;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class SearchAdRequest
{
  public static final int BORDER_TYPE_DASHED = 1;
  public static final int BORDER_TYPE_DOTTED = 2;
  public static final int BORDER_TYPE_NONE = 0;
  public static final int BORDER_TYPE_SOLID = 3;
  public static final int CALL_BUTTON_COLOR_DARK = 2;
  public static final int CALL_BUTTON_COLOR_LIGHT = 0;
  public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
  public static final String DEVICE_ID_EMULATOR = zzaa.DEVICE_ID_EMULATOR;
  public static final int ERROR_CODE_INTERNAL_ERROR = 0;
  public static final int ERROR_CODE_INVALID_REQUEST = 1;
  public static final int ERROR_CODE_NETWORK_ERROR = 2;
  public static final int ERROR_CODE_NO_FILL = 3;
  private final int zzOA;
  private final int zzOB;
  private final int zzOC;
  private final int zzOD;
  private final String zzOE;
  private final int zzOF;
  private final String zzOG;
  private final int zzOH;
  private final int zzOI;
  private final String zzOJ;
  private final int zzOx;
  private final int zzOy;
  private final int zzOz;
  private final zzaa zzoE;
  private final int zzxO;
  
  private SearchAdRequest(SearchAdRequest.Builder paramBuilder)
  {
    zzOx = SearchAdRequest.Builder.zza(paramBuilder);
    zzxO = SearchAdRequest.Builder.zzb(paramBuilder);
    zzOy = SearchAdRequest.Builder.zzc(paramBuilder);
    zzOz = SearchAdRequest.Builder.zzd(paramBuilder);
    zzOA = SearchAdRequest.Builder.zze(paramBuilder);
    zzOB = SearchAdRequest.Builder.zzf(paramBuilder);
    zzOC = SearchAdRequest.Builder.zzg(paramBuilder);
    zzOD = SearchAdRequest.Builder.zzh(paramBuilder);
    zzOE = SearchAdRequest.Builder.zzi(paramBuilder);
    zzOF = SearchAdRequest.Builder.zzj(paramBuilder);
    zzOG = SearchAdRequest.Builder.zzk(paramBuilder);
    zzOH = SearchAdRequest.Builder.zzl(paramBuilder);
    zzOI = SearchAdRequest.Builder.zzm(paramBuilder);
    zzOJ = SearchAdRequest.Builder.zzn(paramBuilder);
    zzoE = new zzaa(SearchAdRequest.Builder.zzo(paramBuilder), this);
  }
  
  public final int getAnchorTextColor()
  {
    return zzOx;
  }
  
  public final int getBackgroundColor()
  {
    return zzxO;
  }
  
  public final int getBackgroundGradientBottom()
  {
    return zzOy;
  }
  
  public final int getBackgroundGradientTop()
  {
    return zzOz;
  }
  
  public final int getBorderColor()
  {
    return zzOA;
  }
  
  public final int getBorderThickness()
  {
    return zzOB;
  }
  
  public final int getBorderType()
  {
    return zzOC;
  }
  
  public final int getCallButtonColor()
  {
    return zzOD;
  }
  
  public final String getCustomChannels()
  {
    return zzOE;
  }
  
  public final Bundle getCustomEventExtrasBundle(Class paramClass)
  {
    return zzoE.getCustomEventExtrasBundle(paramClass);
  }
  
  public final int getDescriptionTextColor()
  {
    return zzOF;
  }
  
  public final String getFontFace()
  {
    return zzOG;
  }
  
  public final int getHeaderTextColor()
  {
    return zzOH;
  }
  
  public final int getHeaderTextSize()
  {
    return zzOI;
  }
  
  public final Location getLocation()
  {
    return zzoE.getLocation();
  }
  
  public final NetworkExtras getNetworkExtras(Class paramClass)
  {
    return zzoE.getNetworkExtras(paramClass);
  }
  
  public final Bundle getNetworkExtrasBundle(Class paramClass)
  {
    return zzoE.getNetworkExtrasBundle(paramClass);
  }
  
  public final String getQuery()
  {
    return zzOJ;
  }
  
  public final boolean isTestDevice(Context paramContext)
  {
    return zzoE.isTestDevice(paramContext);
  }
  
  final zzaa zzaE()
  {
    return zzoE;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.search.SearchAdRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */