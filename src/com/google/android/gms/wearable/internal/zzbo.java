package com.google.android.gms.wearable.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzbo
{
  private static Map zzG(List paramList)
  {
    HashMap localHashMap = new HashMap(paramList.size() * 2);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      CapabilityInfoParcelable localCapabilityInfoParcelable = (CapabilityInfoParcelable)paramList.next();
      localHashMap.put(localCapabilityInfoParcelable.getName(), new zzj.zzc(localCapabilityInfoParcelable));
    }
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */