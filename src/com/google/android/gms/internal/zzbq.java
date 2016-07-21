package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class zzbq
{
  private final Collection zzvu = new ArrayList();
  private final Collection zzvv = new ArrayList();
  private final Collection zzvw = new ArrayList();
  
  public void zza(zzbp paramzzbp)
  {
    zzvu.add(paramzzbp);
  }
  
  public void zzb(zzbp paramzzbp)
  {
    zzvv.add(paramzzbp);
  }
  
  public void zzc(zzbp paramzzbp)
  {
    zzvw.add(paramzzbp);
  }
  
  public List zzdr()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = zzvv.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)((zzbp)localIterator.next()).get();
      if (str != null) {
        localArrayList.add(str);
      }
    }
    return localArrayList;
  }
  
  public List zzds()
  {
    List localList = zzdr();
    Iterator localIterator = zzvw.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)((zzbp)localIterator.next()).get();
      if (str != null) {
        localList.add(str);
      }
    }
    return localList;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */