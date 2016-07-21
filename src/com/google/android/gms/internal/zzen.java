package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzen
{
  public final String zzBA;
  public final List zzBB;
  public final String zzBC;
  public final String zzBD;
  public final List zzBE;
  public final List zzBF;
  public final String zzBG;
  public final List zzBH;
  public final List zzBI;
  public final String zzBJ;
  public final String zzBK;
  public final String zzBL;
  public final List zzBM;
  public final String zzBN;
  public final String zzBz;
  
  public zzen(String paramString1, String paramString2, List paramList1, String paramString3, String paramString4, List paramList2, List paramList3, String paramString5, String paramString6, List paramList4, List paramList5, String paramString7, String paramString8, String paramString9, List paramList6, String paramString10)
  {
    zzBz = paramString1;
    zzBA = paramString2;
    zzBB = paramList1;
    zzBC = paramString3;
    zzBD = paramString4;
    zzBE = paramList2;
    zzBF = paramList3;
    zzBG = paramString5;
    zzBH = paramList4;
    zzBI = paramList5;
    zzBJ = paramString7;
    zzBK = paramString8;
    zzBL = paramString9;
    zzBM = paramList6;
    zzBN = paramString10;
  }
  
  public zzen(JSONObject paramJSONObject)
  {
    zzBA = paramJSONObject.getString("id");
    Object localObject1 = paramJSONObject.getJSONArray("adapters");
    Object localObject3 = new ArrayList(((JSONArray)localObject1).length());
    int i = 0;
    while (i < ((JSONArray)localObject1).length())
    {
      ((List)localObject3).add(((JSONArray)localObject1).getString(i));
      i += 1;
    }
    zzBB = Collections.unmodifiableList((List)localObject3);
    zzBC = paramJSONObject.optString("allocation_id", null);
    zzBE = zzr.zzbP().zza(paramJSONObject, "clickurl");
    zzBF = zzr.zzbP().zza(paramJSONObject, "imp_urls");
    zzBH = zzr.zzbP().zza(paramJSONObject, "video_start_urls");
    zzBI = zzr.zzbP().zza(paramJSONObject, "video_complete_urls");
    localObject1 = paramJSONObject.optJSONObject("ad");
    if (localObject1 != null)
    {
      localObject1 = ((JSONObject)localObject1).toString();
      zzBz = ((String)localObject1);
      localObject3 = paramJSONObject.optJSONObject("data");
      if (localObject3 == null) {
        break label288;
      }
      localObject1 = ((JSONObject)localObject3).toString();
      label179:
      zzBG = ((String)localObject1);
      if (localObject3 == null) {
        break label293;
      }
      localObject1 = ((JSONObject)localObject3).optString("class_name");
      label197:
      zzBD = ((String)localObject1);
      zzBJ = paramJSONObject.optString("html_template", null);
      zzBK = paramJSONObject.optString("ad_base_url", null);
      localObject1 = paramJSONObject.optJSONObject("assets");
      if (localObject1 == null) {
        break label298;
      }
    }
    label288:
    label293:
    label298:
    for (localObject1 = ((JSONObject)localObject1).toString();; localObject1 = null)
    {
      zzBL = ((String)localObject1);
      zzBM = zzr.zzbP().zza(paramJSONObject, "template_ids");
      localObject1 = paramJSONObject.optJSONObject("ad_loader_options");
      paramJSONObject = (JSONObject)localObject2;
      if (localObject1 != null) {
        paramJSONObject = ((JSONObject)localObject1).toString();
      }
      zzBN = paramJSONObject;
      return;
      localObject1 = null;
      break;
      localObject1 = null;
      break label179;
      localObject1 = null;
      break label197;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzen
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */