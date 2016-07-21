package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import java.util.Map;

class zzc$1
  implements zzdf
{
  zzc$1(zzc paramzzc) {}
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    if (zzpr.zzpj.zzrq != null)
    {
      zzpr.zzpl.zza(zzpr.zzpj.zzrp, zzpr.zzpj.zzrq, paramzzjp.getView(), paramzzjp);
      return;
    }
    zzin.zzaK("Request to enable ActiveView before adState is available.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzc.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */