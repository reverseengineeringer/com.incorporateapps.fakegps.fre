package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class zzdz
{
  private final Object[] mParams;
  private boolean zzAA;
  
  zzdz(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    mParams = zza(paramAdRequestParcel, paramString, paramInt);
  }
  
  private static Object[] zza(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    HashSet localHashSet = new HashSet(Arrays.asList(((String)zzbt.zzwF.get()).split(",")));
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString);
    if (localHashSet.contains("networkType")) {
      localArrayList.add(Integer.valueOf(paramInt));
    }
    if (localHashSet.contains("birthday")) {
      localArrayList.add(Long.valueOf(zztC));
    }
    if (localHashSet.contains("extras")) {
      localArrayList.add(zzc(extras));
    }
    if (localHashSet.contains("gender")) {
      localArrayList.add(Integer.valueOf(zztD));
    }
    if (localHashSet.contains("keywords"))
    {
      if (zztE != null) {
        localArrayList.add(zztE.toString());
      }
    }
    else
    {
      if (localHashSet.contains("isTestDevice")) {
        localArrayList.add(Boolean.valueOf(zztF));
      }
      if (localHashSet.contains("tagForChildDirectedTreatment")) {
        localArrayList.add(Integer.valueOf(zztG));
      }
      if (localHashSet.contains("manualImpressionsEnabled")) {
        localArrayList.add(Boolean.valueOf(zztH));
      }
      if (localHashSet.contains("publisherProvidedId")) {
        localArrayList.add(zztI);
      }
      if (localHashSet.contains("location"))
      {
        if (zztK == null) {
          break label447;
        }
        localArrayList.add(zztK.toString());
      }
      label289:
      if (localHashSet.contains("contentUrl")) {
        localArrayList.add(zztL);
      }
      if (localHashSet.contains("networkExtras")) {
        localArrayList.add(zzc(zztM));
      }
      if (localHashSet.contains("customTargeting")) {
        localArrayList.add(zzc(zztN));
      }
      if (localHashSet.contains("categoryExclusions"))
      {
        if (zztO == null) {
          break label457;
        }
        localArrayList.add(zztO.toString());
      }
    }
    for (;;)
    {
      if (localHashSet.contains("requestAgent")) {
        localArrayList.add(zztP);
      }
      if (localHashSet.contains("requestPackage")) {
        localArrayList.add(zztQ);
      }
      return localArrayList.toArray();
      localArrayList.add(null);
      break;
      label447:
      localArrayList.add(null);
      break label289;
      label457:
      localArrayList.add(null);
    }
  }
  
  private static String zzc(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Collections.sort(new ArrayList(paramBundle.keySet()));
    Iterator localIterator = paramBundle.keySet().iterator();
    if (localIterator.hasNext())
    {
      Object localObject = paramBundle.get((String)localIterator.next());
      if (localObject == null) {
        localObject = "null";
      }
      for (;;)
      {
        localStringBuilder.append((String)localObject);
        break;
        if ((localObject instanceof Bundle)) {
          localObject = zzc((Bundle)localObject);
        } else {
          localObject = localObject.toString();
        }
      }
    }
    return localStringBuilder.toString();
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzdz)) {
      return false;
    }
    paramObject = (zzdz)paramObject;
    return Arrays.equals(mParams, mParams);
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(mParams);
  }
  
  public String toString()
  {
    return "[InterstitialAdPoolKey " + Arrays.toString(mParams) + "]";
  }
  
  void zzeg()
  {
    zzAA = true;
  }
  
  boolean zzeh()
  {
    return zzAA;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */