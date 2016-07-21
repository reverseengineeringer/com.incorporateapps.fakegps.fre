package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class zzjf
{
  public static zzjg zza(zzjg paramzzjg, zzjf.zza paramzza)
  {
    zzjd localzzjd = new zzjd();
    paramzzjg.zzb(new zzjf.1(localzzjd, paramzza, paramzzjg));
    return localzzjd;
  }
  
  public static zzjg zzl(List paramList)
  {
    zzjd localzzjd = new zzjd();
    int i = paramList.size();
    AtomicInteger localAtomicInteger = new AtomicInteger(0);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      ((zzjg)localIterator.next()).zzb(new zzjf.2(localAtomicInteger, i, localzzjd, paramList));
    }
    return localzzjd;
  }
  
  private static List zzm(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = ((zzjg)paramList.next()).get();
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */