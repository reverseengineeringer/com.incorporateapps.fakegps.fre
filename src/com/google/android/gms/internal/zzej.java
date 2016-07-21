package com.google.android.gms.internal;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public class zzej
  implements zzei
{
  private final zzeh zzBx;
  private final HashSet zzBy;
  
  public zzej(zzeh paramzzeh)
  {
    zzBx = paramzzeh;
    zzBy = new HashSet();
  }
  
  public void zza(String paramString, zzdf paramzzdf)
  {
    zzBx.zza(paramString, paramzzdf);
    zzBy.add(new AbstractMap.SimpleEntry(paramString, paramzzdf));
  }
  
  public void zza(String paramString, JSONObject paramJSONObject)
  {
    zzBx.zza(paramString, paramJSONObject);
  }
  
  public void zzb(String paramString, zzdf paramzzdf)
  {
    zzBx.zzb(paramString, paramzzdf);
    zzBy.remove(new AbstractMap.SimpleEntry(paramString, paramzzdf));
  }
  
  public void zzb(String paramString, JSONObject paramJSONObject)
  {
    zzBx.zzb(paramString, paramJSONObject);
  }
  
  public void zze(String paramString1, String paramString2)
  {
    zzBx.zze(paramString1, paramString2);
  }
  
  public void zzew()
  {
    Iterator localIterator = zzBy.iterator();
    while (localIterator.hasNext())
    {
      AbstractMap.SimpleEntry localSimpleEntry = (AbstractMap.SimpleEntry)localIterator.next();
      zzin.v("Unregistering eventhandler: " + ((zzdf)localSimpleEntry.getValue()).toString());
      zzBx.zzb((String)localSimpleEntry.getKey(), (zzdf)localSimpleEntry.getValue());
    }
    zzBy.clear();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzej
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */