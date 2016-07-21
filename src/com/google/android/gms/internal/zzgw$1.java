package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class zzgw$1
  implements zzdf
{
  zzgw$1(zzgw paramzzgw, zzed paramzzed, zzgw.zzb paramzzb, zzjd paramzzjd) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    zzGM.zzb("/nativeAdPreProcess", zzGN.zzHb);
    try
    {
      paramzzjp = (String)paramMap.get("success");
      if (!TextUtils.isEmpty(paramzzjp))
      {
        zzGO.zzg(new JSONObject(paramzzjp).getJSONArray("ads").getJSONObject(0));
        return;
      }
    }
    catch (JSONException paramzzjp)
    {
      zzin.zzb("Malformed native JSON response.", paramzzjp);
      zzGP.zzF(0);
      zzx.zza(zzGP.zzgn(), "Unable to set the ad state error!");
      zzGO.zzg(null);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgw.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */