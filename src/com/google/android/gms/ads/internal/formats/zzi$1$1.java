package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.internal.zzed;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq.zza;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class zzi$1$1
  implements zzjq.zza
{
  zzi$1$1(zzi.1 param1, Map paramMap) {}
  
  public void zza(zzjp paramzzjp, boolean paramBoolean)
  {
    zzi.zza(zzyz.zzyx, (String)zzyy.get("id"));
    paramzzjp = new JSONObject();
    try
    {
      paramzzjp.put("messageType", "htmlLoaded");
      paramzzjp.put("id", zzi.zza(zzyz.zzyx));
      zzi.zzb(zzyz.zzyx).zzb("sendMessageToNativeJs", paramzzjp);
      return;
    }
    catch (JSONException paramzzjp)
    {
      zzin.zzb("Unable to dispatch sendMessageToNativeJsevent", paramzzjp);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzi.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */