package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzed;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class zzi$5
  implements zzdf
{
  zzi$5(zzi paramzzi) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    paramzzjp = new JSONObject();
    try
    {
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramzzjp.put(str, paramMap.get(str));
      }
      paramzzjp.put("id", zzi.zza(zzyx));
    }
    catch (JSONException paramzzjp)
    {
      zzin.zzb("Unable to dispatch sendMessageToNativeJs event", paramzzjp);
      return;
    }
    zzi.zzb(zzyx).zzb("sendMessageToNativeJs", paramzzjp);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzi.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */