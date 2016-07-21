package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzjp;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class zzm$3
  implements zzdf
{
  zzm$3(CountDownLatch paramCountDownLatch) {}
  
  public final void zza(zzjp paramzzjp, Map paramMap)
  {
    zzqu.countDown();
    paramzzjp = paramzzjp.getView();
    if (paramzzjp == null) {
      return;
    }
    paramzzjp.setVisibility(0);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzm.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */