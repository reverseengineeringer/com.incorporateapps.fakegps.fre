package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

class zzdr$1
  implements Runnable
{
  zzdr$1(zzdr paramzzdr, String paramString1, String paramString2, int paramInt1, int paramInt2, boolean paramBoolean) {}
  
  public void run()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "precacheProgress");
    localHashMap.put("src", zzzP);
    localHashMap.put("cachedSrc", zzzQ);
    localHashMap.put("bytesLoaded", Integer.toString(zzzR));
    localHashMap.put("totalBytes", Integer.toString(zzzS));
    if (zzzT) {}
    for (String str = "1";; str = "0")
    {
      localHashMap.put("cacheReady", str);
      zzdr.zza(zzzU, "onPrecacheEvent", localHashMap);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdr.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */