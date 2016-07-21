package com.google.android.gms.tagmanager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zzcw
  implements zzl
{
  private final Map zzbld = new HashMap();
  private final int zzble;
  private final zzm.zza zzblf;
  private int zzblg;
  
  zzcw(int paramInt, zzm.zza paramzza)
  {
    zzble = paramInt;
    zzblf = paramzza;
  }
  
  public Object get(Object paramObject)
  {
    try
    {
      paramObject = zzbld.get(paramObject);
      return paramObject;
    }
    finally
    {
      paramObject = finally;
      throw ((Throwable)paramObject);
    }
  }
  
  public void zzh(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null)) {
      try
      {
        throw new NullPointerException("key == null || value == null");
      }
      finally {}
    }
    zzblg += zzblf.sizeOf(paramObject1, paramObject2);
    if (zzblg > zzble)
    {
      Iterator localIterator = zzbld.entrySet().iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        zzblg -= zzblf.sizeOf(localEntry.getKey(), localEntry.getValue());
        localIterator.remove();
      } while (zzblg > zzble);
    }
    zzbld.put(paramObject1, paramObject2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */