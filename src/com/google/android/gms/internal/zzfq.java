package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

public class zzfq
{
  private final boolean zzDu;
  private final boolean zzDv;
  private final boolean zzDw;
  private final boolean zzDx;
  private final boolean zzDy;
  
  private zzfq(zzfq.zza paramzza)
  {
    zzDu = zzfq.zza.zza(paramzza);
    zzDv = zzfq.zza.zzb(paramzza);
    zzDw = zzfq.zza.zzc(paramzza);
    zzDx = zzfq.zza.zzd(paramzza);
    zzDy = zzfq.zza.zze(paramzza);
  }
  
  public JSONObject toJson()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("sms", zzDu).put("tel", zzDv).put("calendar", zzDw).put("storePicture", zzDx).put("inlineVideo", zzDy);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      zzin.zzb("Error occured while obtaining the MRAID capabilities.", localJSONException);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */