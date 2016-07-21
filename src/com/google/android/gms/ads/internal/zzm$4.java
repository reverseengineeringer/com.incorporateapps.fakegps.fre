package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class zzm$4
  implements zzdf
{
  zzm$4(CountDownLatch paramCountDownLatch) {}
  
  public final void zza(zzjp paramzzjp, Map paramMap)
  {
    zzin.zzaK("Adapter returned an ad, but assets substitution failed");
    zzqu.countDown();
    paramzzjp.destroy();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzm.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */