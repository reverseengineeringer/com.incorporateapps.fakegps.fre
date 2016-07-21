package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

class zzdr$2
  implements Runnable
{
  zzdr$2(zzdr paramzzdr, String paramString1, String paramString2, int paramInt) {}
  
  public void run()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "precacheComplete");
    localHashMap.put("src", zzzP);
    localHashMap.put("cachedSrc", zzzQ);
    localHashMap.put("totalBytes", Integer.toString(zzzS));
    zzdr.zza(zzzU, "onPrecacheEvent", localHashMap);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdr.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */