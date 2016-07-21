package com.google.android.gms.ads.internal.request;

import com.google.android.gms.internal.zzdk;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzji.zzc;

class zzm$2$1
  implements zzji.zzc
{
  zzm$2$1(zzm.2 param2) {}
  
  public void zzd(zzeh paramzzeh)
  {
    try
    {
      paramzzeh.zza("AFMA_getAdapterLessMediationAd", zzIG.zzIE);
      return;
    }
    catch (Exception paramzzeh)
    {
      zzin.zzb("Error requesting an ad url", paramzzeh);
      zzm.zzgx().zzS(zzIG.zzIF);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzm.2.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */