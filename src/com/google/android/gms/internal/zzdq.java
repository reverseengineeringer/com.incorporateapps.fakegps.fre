package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzr;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class zzdq
  implements Iterable
{
  private final List zzzM = new LinkedList();
  
  private zzdp zzf(zzjp paramzzjp)
  {
    Iterator localIterator = zzr.zzbR().iterator();
    while (localIterator.hasNext())
    {
      zzdp localzzdp = (zzdp)localIterator.next();
      if (zzpD == paramzzjp) {
        return localzzdp;
      }
    }
    return null;
  }
  
  public Iterator iterator()
  {
    return zzzM.iterator();
  }
  
  public void zza(zzdp paramzzdp)
  {
    zzzM.add(paramzzdp);
  }
  
  public void zzb(zzdp paramzzdp)
  {
    zzzM.remove(paramzzdp);
  }
  
  public boolean zzd(zzjp paramzzjp)
  {
    paramzzjp = zzf(paramzzjp);
    if (paramzzjp != null)
    {
      zzzJ.abort();
      return true;
    }
    return false;
  }
  
  public boolean zze(zzjp paramzzjp)
  {
    return zzf(paramzzjp) != null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */