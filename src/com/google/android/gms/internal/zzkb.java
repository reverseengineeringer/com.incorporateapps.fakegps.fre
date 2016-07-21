package com.google.android.gms.internal;

import com.google.android.gms.measurement.zze;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzkb
  extends zze
{
  private Map zzPL = new HashMap(4);
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = zzPL.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap.put("dimension" + localEntry.getKey(), localEntry.getValue());
    }
    return zzF(localHashMap);
  }
  
  public final void zza(zzkb paramzzkb)
  {
    zzPL.putAll(zzPL);
  }
  
  public final Map zziP()
  {
    return Collections.unmodifiableMap(zzPL);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */