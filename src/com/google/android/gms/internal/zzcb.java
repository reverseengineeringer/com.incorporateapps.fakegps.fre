package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzr;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class zzcb
{
  private final Object zzpV = new Object();
  private final Map zzxA = new LinkedHashMap();
  private String zzxB;
  private zzbz zzxC;
  private zzcb zzxD;
  boolean zzxi;
  private final List zzxz = new LinkedList();
  
  public zzcb(boolean paramBoolean, String paramString1, String paramString2)
  {
    zzxi = paramBoolean;
    zzxA.put("action", paramString1);
    zzxA.put("ad_format", paramString2);
  }
  
  public void zzN(String paramString)
  {
    if (!zzxi) {
      return;
    }
    synchronized (zzpV)
    {
      zzxB = paramString;
      return;
    }
  }
  
  public boolean zza(zzbz paramzzbz, long paramLong, String... paramVarArgs)
  {
    synchronized (zzpV)
    {
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        zzbz localzzbz = new zzbz(paramLong, paramVarArgs[i], paramzzbz);
        zzxz.add(localzzbz);
        i += 1;
      }
      return true;
    }
  }
  
  public boolean zza(zzbz paramzzbz, String... paramVarArgs)
  {
    if ((!zzxi) || (paramzzbz == null)) {
      return false;
    }
    return zza(paramzzbz, zzr.zzbG().elapsedRealtime(), paramVarArgs);
  }
  
  public zzbz zzb(long paramLong)
  {
    if (!zzxi) {
      return null;
    }
    return new zzbz(paramLong, null, null);
  }
  
  public void zzc(zzcb paramzzcb)
  {
    synchronized (zzpV)
    {
      zzxD = paramzzcb;
      return;
    }
  }
  
  public void zzc(String paramString1, String paramString2)
  {
    if ((!zzxi) || (TextUtils.isEmpty(paramString2))) {}
    zzbv localzzbv;
    do
    {
      return;
      localzzbv = zzr.zzbF().zzhb();
    } while (localzzbv == null);
    synchronized (zzpV)
    {
      localzzbv.zzL(paramString1).zza(zzxA, paramString1, paramString2);
      return;
    }
  }
  
  public zzbz zzdB()
  {
    return zzb(zzr.zzbG().elapsedRealtime());
  }
  
  public void zzdC()
  {
    synchronized (zzpV)
    {
      zzxC = zzdB();
      return;
    }
  }
  
  public String zzdD()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    synchronized (zzpV)
    {
      Iterator localIterator = zzxz.iterator();
      while (localIterator.hasNext())
      {
        zzbz localzzbz = (zzbz)localIterator.next();
        long l1 = localzzbz.getTime();
        String str2 = localzzbz.zzdy();
        localzzbz = localzzbz.zzdz();
        if ((localzzbz != null) && (l1 > 0L))
        {
          long l2 = localzzbz.getTime();
          localStringBuilder.append(str2).append('.').append(l1 - l2).append(',');
        }
      }
    }
    zzxz.clear();
    if (!TextUtils.isEmpty(zzxB)) {
      ((StringBuilder)localObject2).append(zzxB);
    }
    for (;;)
    {
      String str1 = ((StringBuilder)localObject2).toString();
      return str1;
      if (str1.length() > 0) {
        str1.setLength(str1.length() - 1);
      }
    }
  }
  
  public zzbz zzdE()
  {
    synchronized (zzpV)
    {
      zzbz localzzbz = zzxC;
      return localzzbz;
    }
  }
  
  Map zzn()
  {
    synchronized (zzpV)
    {
      Object localObject2 = zzr.zzbF().zzhb();
      if ((localObject2 == null) || (zzxD == null))
      {
        localObject2 = zzxA;
        return (Map)localObject2;
      }
      localObject2 = ((zzbv)localObject2).zza(zzxA, zzxD.zzn());
      return (Map)localObject2;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzcb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */