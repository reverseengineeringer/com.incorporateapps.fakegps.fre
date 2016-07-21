package com.google.android.gms.internal;

import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.formats.zza;
import com.google.android.gms.ads.internal.formats.zzf;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

public class zzgz
  implements zzgw.zza
{
  private final boolean zzHc;
  
  public zzgz(boolean paramBoolean)
  {
    zzHc = paramBoolean;
  }
  
  private void zza(zzgw paramzzgw, JSONObject paramJSONObject, SimpleArrayMap paramSimpleArrayMap)
  {
    paramSimpleArrayMap.put(paramJSONObject.getString("name"), paramzzgw.zza(paramJSONObject, "image_value", zzHc));
  }
  
  private void zza(JSONObject paramJSONObject, SimpleArrayMap paramSimpleArrayMap)
  {
    paramSimpleArrayMap.put(paramJSONObject.getString("name"), paramJSONObject.getString("string_value"));
  }
  
  private SimpleArrayMap zzc(SimpleArrayMap paramSimpleArrayMap)
  {
    SimpleArrayMap localSimpleArrayMap = new SimpleArrayMap();
    int i = 0;
    while (i < paramSimpleArrayMap.size())
    {
      localSimpleArrayMap.put(paramSimpleArrayMap.keyAt(i), ((Future)paramSimpleArrayMap.valueAt(i)).get());
      i += 1;
    }
    return localSimpleArrayMap;
  }
  
  public zzf zzd(zzgw paramzzgw, JSONObject paramJSONObject)
  {
    SimpleArrayMap localSimpleArrayMap1 = new SimpleArrayMap();
    SimpleArrayMap localSimpleArrayMap2 = new SimpleArrayMap();
    zzjg localzzjg = paramzzgw.zzf(paramJSONObject);
    JSONArray localJSONArray = paramJSONObject.getJSONArray("custom_assets");
    int i = 0;
    if (i < localJSONArray.length())
    {
      JSONObject localJSONObject = localJSONArray.getJSONObject(i);
      String str = localJSONObject.getString("type");
      if ("string".equals(str)) {
        zza(localJSONObject, localSimpleArrayMap2);
      }
      for (;;)
      {
        i += 1;
        break;
        if ("image".equals(str)) {
          zza(paramzzgw, localJSONObject, localSimpleArrayMap1);
        } else {
          zzin.zzaK("Unknown custom asset type: " + str);
        }
      }
    }
    return new zzf(paramJSONObject.getString("custom_template_id"), zzc(localSimpleArrayMap1), localSimpleArrayMap2, (zza)localzzjg.get());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */