package com.google.android.gms.ads.internal.formats;

import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzcp.zza;
import com.google.android.gms.internal.zzin;
import java.util.Arrays;
import java.util.List;

public class zzf
  extends zzcp.zza
  implements zzh.zza
{
  private final Object zzpV = new Object();
  private final zza zzye;
  private zzh zzyf;
  private final String zzyi;
  private final SimpleArrayMap zzyj;
  private final SimpleArrayMap zzyk;
  
  public zzf(String paramString, SimpleArrayMap paramSimpleArrayMap1, SimpleArrayMap paramSimpleArrayMap2, zza paramzza)
  {
    zzyi = paramString;
    zzyj = paramSimpleArrayMap1;
    zzyk = paramSimpleArrayMap2;
    zzye = paramzza;
  }
  
  public List getAvailableAssetNames()
  {
    int n = 0;
    String[] arrayOfString = new String[zzyj.size() + zzyk.size()];
    int j = 0;
    int i = 0;
    int k;
    int m;
    for (;;)
    {
      k = n;
      m = i;
      if (j >= zzyj.size()) {
        break;
      }
      arrayOfString[i] = ((String)zzyj.keyAt(j));
      i += 1;
      j += 1;
    }
    while (k < zzyk.size())
    {
      arrayOfString[m] = ((String)zzyk.keyAt(k));
      k += 1;
      m += 1;
    }
    return Arrays.asList(arrayOfString);
  }
  
  public String getCustomTemplateId()
  {
    return zzyi;
  }
  
  public void performClick(String paramString)
  {
    synchronized (zzpV)
    {
      if (zzyf == null)
      {
        zzin.e("Attempt to call performClick before ad initialized.");
        return;
      }
      zzyf.zza(paramString, null, null, null);
      return;
    }
  }
  
  public void recordImpression()
  {
    synchronized (zzpV)
    {
      if (zzyf == null)
      {
        zzin.e("Attempt to perform recordImpression before ad initialized.");
        return;
      }
      zzyf.recordImpression();
      return;
    }
  }
  
  public String zzO(String paramString)
  {
    return (String)zzyk.get(paramString);
  }
  
  public zzch zzP(String paramString)
  {
    return (zzch)zzyj.get(paramString);
  }
  
  public void zzb(zzh paramzzh)
  {
    synchronized (zzpV)
    {
      zzyf = paramzzh;
      return;
    }
  }
  
  public String zzdM()
  {
    return "3";
  }
  
  public zza zzdN()
  {
    return zzye;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */