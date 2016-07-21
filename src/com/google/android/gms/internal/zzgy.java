package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.zza;
import com.google.android.gms.ads.internal.formats.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

public class zzgy
  implements zzgw.zza
{
  private final boolean zzHc;
  private final boolean zzHd;
  
  public zzgy(boolean paramBoolean1, boolean paramBoolean2)
  {
    zzHc = paramBoolean1;
    zzHd = paramBoolean2;
  }
  
  public zze zzc(zzgw paramzzgw, JSONObject paramJSONObject)
  {
    Object localObject = paramzzgw.zza(paramJSONObject, "images", true, zzHc, zzHd);
    zzjg localzzjg = paramzzgw.zza(paramJSONObject, "secondary_image", false, zzHc);
    paramzzgw = paramzzgw.zzf(paramJSONObject);
    ArrayList localArrayList = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.add(((zzjg)((Iterator)localObject).next()).get());
    }
    return new zze(paramJSONObject.getString("headline"), localArrayList, paramJSONObject.getString("body"), (zzch)localzzjg.get(), paramJSONObject.getString("call_to_action"), paramJSONObject.getString("advertiser"), (zza)paramzzgw.get(), new Bundle());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */