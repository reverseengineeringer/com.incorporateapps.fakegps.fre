package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzr;
import java.util.Map;

public class zzfo
{
  private final boolean zzDp;
  private final String zzDq;
  private final zzjp zzpD;
  
  public zzfo(zzjp paramzzjp, Map paramMap)
  {
    zzpD = paramzzjp;
    zzDq = ((String)paramMap.get("forceOrientation"));
    if (paramMap.containsKey("allowOrientationChange"))
    {
      zzDp = Boolean.parseBoolean((String)paramMap.get("allowOrientationChange"));
      return;
    }
    zzDp = true;
  }
  
  public void execute()
  {
    if (zzpD == null)
    {
      zzin.zzaK("AdWebView is null");
      return;
    }
    int i;
    if ("portrait".equalsIgnoreCase(zzDq)) {
      i = zzr.zzbE().zzhw();
    }
    for (;;)
    {
      zzpD.setRequestedOrientation(i);
      return;
      if ("landscape".equalsIgnoreCase(zzDq)) {
        i = zzr.zzbE().zzhv();
      } else if (zzDp) {
        i = -1;
      } else {
        i = zzr.zzbE().zzhx();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */