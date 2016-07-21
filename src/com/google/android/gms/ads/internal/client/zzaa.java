package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public final class zzaa
{
  public static final String DEVICE_ID_EMULATOR = zzn.zzcS().zzaH("emulator");
  private final Date zzbf;
  private final Set zzbh;
  private final Location zzbj;
  private final boolean zzpE;
  private final int zztT;
  private final int zztW;
  private final String zztX;
  private final String zztZ;
  private final Bundle zzuA;
  private final Map zzuB;
  private final SearchAdRequest zzuC;
  private final Set zzuD;
  private final Set zzuE;
  private final Bundle zzub;
  private final String zzud;
  private final boolean zzuf;
  
  public zzaa(zzaa.zza paramzza)
  {
    this(paramzza, null);
  }
  
  public zzaa(zzaa.zza paramzza, SearchAdRequest paramSearchAdRequest)
  {
    zzbf = zzaa.zza.zza(paramzza);
    zztZ = zzaa.zza.zzb(paramzza);
    zztT = zzaa.zza.zzc(paramzza);
    zzbh = Collections.unmodifiableSet(zzaa.zza.zzd(paramzza));
    zzbj = zzaa.zza.zze(paramzza);
    zzpE = zzaa.zza.zzf(paramzza);
    zzuA = zzaa.zza.zzg(paramzza);
    zzuB = Collections.unmodifiableMap(zzaa.zza.zzh(paramzza));
    zztX = zzaa.zza.zzi(paramzza);
    zzud = zzaa.zza.zzj(paramzza);
    zzuC = paramSearchAdRequest;
    zztW = zzaa.zza.zzk(paramzza);
    zzuD = Collections.unmodifiableSet(zzaa.zza.zzl(paramzza));
    zzub = zzaa.zza.zzm(paramzza);
    zzuE = Collections.unmodifiableSet(zzaa.zza.zzn(paramzza));
    zzuf = zzaa.zza.zzo(paramzza);
  }
  
  public final Date getBirthday()
  {
    return zzbf;
  }
  
  public final String getContentUrl()
  {
    return zztZ;
  }
  
  public final Bundle getCustomEventExtrasBundle(Class paramClass)
  {
    Bundle localBundle = zzuA.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
    if (localBundle != null) {
      return localBundle.getBundle(paramClass.getClass().getName());
    }
    return null;
  }
  
  public final Bundle getCustomTargeting()
  {
    return zzub;
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
  
  public final boolean getManualImpressionsEnabled()
  {
    return zzpE;
  }
  
  public final NetworkExtras getNetworkExtras(Class paramClass)
  {
    return (NetworkExtras)zzuB.get(paramClass);
  }
  
  public final Bundle getNetworkExtrasBundle(Class paramClass)
  {
    return zzuA.getBundle(paramClass.getName());
  }
  
  public final String getPublisherProvidedId()
  {
    return zztX;
  }
  
  public final boolean isDesignedForFamilies()
  {
    return zzuf;
  }
  
  public final boolean isTestDevice(Context paramContext)
  {
    return zzuD.contains(zzn.zzcS().zzT(paramContext));
  }
  
  public final String zzcZ()
  {
    return zzud;
  }
  
  public final SearchAdRequest zzda()
  {
    return zzuC;
  }
  
  public final Map zzdb()
  {
    return zzuB;
  }
  
  public final Bundle zzdc()
  {
    return zzuA;
  }
  
  public final int zzdd()
  {
    return zztW;
  }
  
  public final Set zzde()
  {
    return zzuE;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzaa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */