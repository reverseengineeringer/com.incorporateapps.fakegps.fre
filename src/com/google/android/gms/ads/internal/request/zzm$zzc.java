package com.google.android.gms.ads.internal.request;

import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzdk;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import java.util.Map;

public class zzm$zzc
  implements zzdf
{
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    paramzzjp = (String)paramMap.get("request_id");
    paramMap = (String)paramMap.get("errors");
    zzin.zzaK("Invalid request: " + paramMap);
    zzm.zzgx().zzS(paramzzjp);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzm.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */