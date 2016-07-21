package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.zzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzeo
{
  public final List zzBO;
  public final long zzBP;
  public final List zzBQ;
  public final List zzBR;
  public final List zzBS;
  public final String zzBT;
  public final long zzBU;
  public final String zzBV;
  public final int zzBW;
  public final int zzBX;
  public final long zzBY;
  public int zzBZ;
  public int zzCa;
  
  public zzeo(String paramString)
  {
    paramString = new JSONObject(paramString);
    if (zzin.zzQ(2)) {
      zzin.v("Mediation Response JSON: " + paramString.toString(2));
    }
    JSONArray localJSONArray = paramString.getJSONArray("ad_networks");
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    int i = 0;
    int k;
    for (int j = -1; i < localJSONArray.length(); j = k)
    {
      zzen localzzen = new zzen(localJSONArray.getJSONObject(i));
      localArrayList.add(localzzen);
      k = j;
      if (j < 0)
      {
        k = j;
        if (zza(localzzen)) {
          k = i;
        }
      }
      i += 1;
    }
    zzBZ = j;
    zzCa = localJSONArray.length();
    zzBO = Collections.unmodifiableList(localArrayList);
    zzBT = paramString.getString("qdata");
    zzBX = paramString.optInt("fs_model_type", -1);
    zzBY = paramString.optLong("timeout_ms", -1L);
    paramString = paramString.optJSONObject("settings");
    if (paramString != null)
    {
      zzBP = paramString.optLong("ad_network_timeout_millis", -1L);
      zzBQ = zzr.zzbP().zza(paramString, "click_urls");
      zzBR = zzr.zzbP().zza(paramString, "imp_urls");
      zzBS = zzr.zzbP().zza(paramString, "nofill_urls");
      long l = paramString.optLong("refresh", -1L);
      if (l > 0L) {}
      for (l *= 1000L;; l = -1L)
      {
        zzBU = l;
        paramString = RewardItemParcel.zza(paramString.optJSONArray("rewards"));
        if (paramString != null) {
          break;
        }
        zzBV = null;
        zzBW = 0;
        return;
      }
      zzBV = type;
      zzBW = zzKS;
      return;
    }
    zzBP = -1L;
    zzBQ = null;
    zzBR = null;
    zzBS = null;
    zzBU = -1L;
    zzBV = null;
    zzBW = 0;
  }
  
  public zzeo(List paramList1, long paramLong1, List paramList2, List paramList3, List paramList4, String paramString1, long paramLong2, int paramInt1, int paramInt2, String paramString2, int paramInt3, int paramInt4, long paramLong3)
  {
    zzBO = paramList1;
    zzBP = paramLong1;
    zzBQ = paramList2;
    zzBR = paramList3;
    zzBS = paramList4;
    zzBT = paramString1;
    zzBU = paramLong2;
    zzBZ = paramInt1;
    zzCa = paramInt2;
    zzBV = paramString2;
    zzBW = paramInt3;
    zzBX = paramInt4;
    zzBY = paramLong3;
  }
  
  private boolean zza(zzen paramzzen)
  {
    paramzzen = zzBB.iterator();
    while (paramzzen.hasNext()) {
      if (((String)paramzzen.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzeo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */