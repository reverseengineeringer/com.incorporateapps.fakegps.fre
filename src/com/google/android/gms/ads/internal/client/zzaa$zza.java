package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class zzaa$zza
{
  private Date zzbf;
  private Location zzbj;
  private boolean zzpE = false;
  private int zztT = -1;
  private int zztW = -1;
  private String zztX;
  private String zztZ;
  private final Bundle zzuA = new Bundle();
  private final HashSet zzuF = new HashSet();
  private final HashMap zzuG = new HashMap();
  private final HashSet zzuH = new HashSet();
  private final HashSet zzuI = new HashSet();
  private final Bundle zzub = new Bundle();
  private String zzud;
  private boolean zzuf;
  
  public final void setManualImpressionsEnabled(boolean paramBoolean)
  {
    zzpE = paramBoolean;
  }
  
  public final void zzA(String paramString)
  {
    zzuF.add(paramString);
  }
  
  public final void zzB(String paramString)
  {
    zzuH.add(paramString);
  }
  
  public final void zzC(String paramString)
  {
    zzuH.remove(paramString);
  }
  
  public final void zzD(String paramString)
  {
    zztZ = paramString;
  }
  
  public final void zzE(String paramString)
  {
    zztX = paramString;
  }
  
  public final void zzF(String paramString)
  {
    zzud = paramString;
  }
  
  public final void zzG(String paramString)
  {
    zzuI.add(paramString);
  }
  
  public final void zza(NetworkExtras paramNetworkExtras)
  {
    if ((paramNetworkExtras instanceof AdMobExtras))
    {
      zza(AdMobAdapter.class, ((AdMobExtras)paramNetworkExtras).getExtras());
      return;
    }
    zzuG.put(paramNetworkExtras.getClass(), paramNetworkExtras);
  }
  
  public final void zza(Class paramClass, Bundle paramBundle)
  {
    zzuA.putBundle(paramClass.getName(), paramBundle);
  }
  
  public final void zza(String paramString1, String paramString2)
  {
    zzub.putString(paramString1, paramString2);
  }
  
  public final void zza(Date paramDate)
  {
    zzbf = paramDate;
  }
  
  public final void zzb(Location paramLocation)
  {
    zzbj = paramLocation;
  }
  
  public final void zzb(Class paramClass, Bundle paramBundle)
  {
    if (zzuA.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
      zzuA.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
    }
    zzuA.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(paramClass.getName(), paramBundle);
  }
  
  public final void zzk(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      zztW = i;
      return;
    }
  }
  
  public final void zzl(boolean paramBoolean)
  {
    zzuf = paramBoolean;
  }
  
  public final void zzn(int paramInt)
  {
    zztT = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzaa.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */