package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

class zzdr$3
  implements Runnable
{
  zzdr$3(zzdr paramzzdr, String paramString1, String paramString2, String paramString3, String paramString4) {}
  
  public void run()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "precacheCanceled");
    localHashMap.put("src", zzzP);
    if (!TextUtils.isEmpty(zzzQ)) {
      localHashMap.put("cachedSrc", zzzQ);
    }
    localHashMap.put("type", zzdr.zza(zzzU, zzzV));
    localHashMap.put("reason", zzzV);
    if (!TextUtils.isEmpty(zzzW)) {
      localHashMap.put("message", zzzW);
    }
    zzdr.zza(zzzU, "onPrecacheEvent", localHashMap);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdr.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */