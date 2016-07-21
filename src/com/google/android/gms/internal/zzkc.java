package com.google.android.gms.internal;

import com.google.android.gms.measurement.zze;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzkc
  extends zze
{
  private Map zzPM = new HashMap(4);
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = zzPM.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localHashMap.put("metric" + localEntry.getKey(), localEntry.getValue());
    }
    return zzF(localHashMap);
  }
  
  public final void zza(zzkc paramzzkc)
  {
    zzPM.putAll(zzPM);
  }
  
  public final Map zziQ()
  {
    return Collections.unmodifiableMap(zzPM);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */