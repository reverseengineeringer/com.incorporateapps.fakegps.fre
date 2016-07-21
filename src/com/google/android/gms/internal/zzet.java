package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class zzet
{
  public List zza(JSONObject paramJSONObject, String paramString)
  {
    paramJSONObject = paramJSONObject.optJSONArray(paramString);
    if (paramJSONObject != null)
    {
      paramString = new ArrayList(paramJSONObject.length());
      int i = 0;
      while (i < paramJSONObject.length())
      {
        paramString.add(paramJSONObject.getString(i));
        i += 1;
      }
      return Collections.unmodifiableList(paramString);
    }
    return null;
  }
  
  public void zza(Context paramContext, String paramString1, zzif paramzzif, String paramString2, boolean paramBoolean, List paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return;
    }
    if (paramBoolean) {}
    for (String str1 = "1";; str1 = "0")
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str2 = ((String)localIterator.next()).replaceAll("@gw_adlocid@", paramString2).replaceAll("@gw_adnetrefresh@", str1).replaceAll("@gw_qdata@", zzKV.zzBT).replaceAll("@gw_sdkver@", paramString1).replaceAll("@gw_sessid@", zzr.zzbF().getSessionId()).replaceAll("@gw_seqnum@", zzHw);
        paramList = str2;
        if (zzCp != null) {
          paramList = str2.replaceAll("@gw_adnetid@", zzCp.zzBA).replaceAll("@gw_allocid@", zzCp.zzBC);
        }
        new zziy(paramContext, paramString1, paramList).zzhn();
      }
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */