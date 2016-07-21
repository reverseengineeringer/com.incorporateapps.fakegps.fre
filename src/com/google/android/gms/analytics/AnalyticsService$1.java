package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzw;

class AnalyticsService$1
  implements zzw
{
  AnalyticsService$1(AnalyticsService paramAnalyticsService, int paramInt, zzf paramzzf, zzaf paramzzaf) {}
  
  public void zzc(Throwable paramThrowable)
  {
    AnalyticsService.zza(zzOS).post(new AnalyticsService.1.1(this));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.AnalyticsService.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */