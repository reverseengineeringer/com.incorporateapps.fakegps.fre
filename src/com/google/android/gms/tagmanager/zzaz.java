package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import com.google.android.gms.internal.zzrs.zza;
import com.google.android.gms.internal.zzrs.zzb;
import com.google.android.gms.internal.zzrs.zzc;
import com.google.android.gms.internal.zzrs.zzd;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

class zzaz
{
  private static zzag.zza zzK(Object paramObject)
  {
    return zzdf.zzR(zzL(paramObject));
  }
  
  static Object zzL(Object paramObject)
  {
    if ((paramObject instanceof JSONArray)) {
      throw new RuntimeException("JSONArrays are not supported");
    }
    if (JSONObject.NULL.equals(paramObject)) {
      throw new RuntimeException("JSON nulls are not supported");
    }
    Object localObject = paramObject;
    if ((paramObject instanceof JSONObject))
    {
      paramObject = (JSONObject)paramObject;
      localObject = new HashMap();
      Iterator localIterator = ((JSONObject)paramObject).keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        ((Map)localObject).put(str, zzL(((JSONObject)paramObject).get(str)));
      }
    }
    return localObject;
  }
  
  public static zzrs.zzc zzgi(String paramString)
  {
    paramString = zzK(new JSONObject(paramString));
    zzrs.zzd localzzd = zzrs.zzc.zzHK();
    int i = 0;
    while (i < zzjz.length)
    {
      localzzd.zzc(zzrs.zza.zzHH().zzb(zzae.zzfR.toString(), zzjz[i]).zzb(zzae.zzfG.toString(), zzdf.zzgt(zzn.zzFZ())).zzb(zzn.zzGa(), zzjA[i]).zzHJ());
      i += 1;
    }
    return localzzd.zzHN();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzaz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */