package com.google.android.gms.ads.search;

import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzaa.zza;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class SearchAdRequest$Builder
{
  private int zzOA;
  private int zzOB;
  private int zzOC = 0;
  private int zzOD;
  private String zzOE;
  private int zzOF;
  private String zzOG;
  private int zzOH;
  private int zzOI;
  private String zzOJ;
  private int zzOx;
  private int zzOy;
  private int zzOz;
  private final zzaa.zza zzoF = new zzaa.zza();
  private int zzxO;
  
  public final Builder addCustomEventExtrasBundle(Class paramClass, Bundle paramBundle)
  {
    zzoF.zzb(paramClass, paramBundle);
    return this;
  }
  
  public final Builder addNetworkExtras(NetworkExtras paramNetworkExtras)
  {
    zzoF.zza(paramNetworkExtras);
    return this;
  }
  
  public final Builder addNetworkExtrasBundle(Class paramClass, Bundle paramBundle)
  {
    zzoF.zza(paramClass, paramBundle);
    return this;
  }
  
  public final Builder addTestDevice(String paramString)
  {
    zzoF.zzB(paramString);
    return this;
  }
  
  public final SearchAdRequest build()
  {
    return new SearchAdRequest(this, null);
  }
  
  public final Builder setAnchorTextColor(int paramInt)
  {
    zzOx = paramInt;
    return this;
  }
  
  public final Builder setBackgroundColor(int paramInt)
  {
    zzxO = paramInt;
    zzOy = Color.argb(0, 0, 0, 0);
    zzOz = Color.argb(0, 0, 0, 0);
    return this;
  }
  
  public final Builder setBackgroundGradient(int paramInt1, int paramInt2)
  {
    zzxO = Color.argb(0, 0, 0, 0);
    zzOy = paramInt2;
    zzOz = paramInt1;
    return this;
  }
  
  public final Builder setBorderColor(int paramInt)
  {
    zzOA = paramInt;
    return this;
  }
  
  public final Builder setBorderThickness(int paramInt)
  {
    zzOB = paramInt;
    return this;
  }
  
  public final Builder setBorderType(int paramInt)
  {
    zzOC = paramInt;
    return this;
  }
  
  public final Builder setCallButtonColor(int paramInt)
  {
    zzOD = paramInt;
    return this;
  }
  
  public final Builder setCustomChannels(String paramString)
  {
    zzOE = paramString;
    return this;
  }
  
  public final Builder setDescriptionTextColor(int paramInt)
  {
    zzOF = paramInt;
    return this;
  }
  
  public final Builder setFontFace(String paramString)
  {
    zzOG = paramString;
    return this;
  }
  
  public final Builder setHeaderTextColor(int paramInt)
  {
    zzOH = paramInt;
    return this;
  }
  
  public final Builder setHeaderTextSize(int paramInt)
  {
    zzOI = paramInt;
    return this;
  }
  
  public final Builder setLocation(Location paramLocation)
  {
    zzoF.zzb(paramLocation);
    return this;
  }
  
  public final Builder setQuery(String paramString)
  {
    zzOJ = paramString;
    return this;
  }
  
  public final Builder setRequestAgent(String paramString)
  {
    zzoF.zzF(paramString);
    return this;
  }
  
  public final Builder tagForChildDirectedTreatment(boolean paramBoolean)
  {
    zzoF.zzk(paramBoolean);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.search.SearchAdRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */