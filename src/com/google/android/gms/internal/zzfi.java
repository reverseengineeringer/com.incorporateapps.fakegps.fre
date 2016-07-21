package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class zzfi
  implements NativeMediationAdRequest
{
  private final int zzCH;
  private final Date zzbf;
  private final Set zzbh;
  private final boolean zzbi;
  private final Location zzbj;
  private final NativeAdOptionsParcel zzpP;
  private final List zzpQ;
  private final int zztT;
  private final boolean zzuf;
  
  public zzfi(Date paramDate, int paramInt1, Set paramSet, Location paramLocation, boolean paramBoolean1, int paramInt2, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList, boolean paramBoolean2)
  {
    zzbf = paramDate;
    zztT = paramInt1;
    zzbh = paramSet;
    zzbj = paramLocation;
    zzbi = paramBoolean1;
    zzCH = paramInt2;
    zzpP = paramNativeAdOptionsParcel;
    zzpQ = paramList;
    zzuf = paramBoolean2;
  }
  
  public final Date getBirthday()
  {
    return zzbf;
  }
  
  public final int getGender()
  {
    return zztT;
  }
  
  public final Set getKeywords()
  {
    return zzbh;
  }
  
  public final Location getLocation()
  {
    return zzbj;
  }
  
  public final NativeAdOptions getNativeAdOptions()
  {
    if (zzpP == null) {
      return null;
    }
    return new NativeAdOptions.Builder().setReturnUrlsForImageAssets(zzpP.zzyA).setImageOrientation(zzpP.zzyB).setRequestMultipleImages(zzpP.zzyC).build();
  }
  
  public final boolean isAppInstallAdRequested()
  {
    return (zzpQ != null) && (zzpQ.contains("2"));
  }
  
  public final boolean isContentAdRequested()
  {
    return (zzpQ != null) && (zzpQ.contains("1"));
  }
  
  public final boolean isDesignedForFamilies()
  {
    return zzuf;
  }
  
  public final boolean isTesting()
  {
    return zzbi;
  }
  
  public final int taggedForChildDirectedTreatment()
  {
    return zzCH;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */