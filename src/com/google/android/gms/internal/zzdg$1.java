package com.google.android.gms.internal;

import android.os.Handler;
import java.util.Map;
import org.json.JSONObject;

class zzdg$1
  implements Runnable
{
  zzdg$1(zzdg paramzzdg, Map paramMap, zzjp paramzzjp) {}
  
  public void run()
  {
    zzin.zzaI("Received Http request.");
    Object localObject = (String)zzyy.get("http_request");
    localObject = zzzm.zzQ((String)localObject);
    if (localObject == null)
    {
      zzin.e("Response should not be null.");
      return;
    }
    zzir.zzMc.post(new zzdg.1.1(this, (JSONObject)localObject));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdg.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */