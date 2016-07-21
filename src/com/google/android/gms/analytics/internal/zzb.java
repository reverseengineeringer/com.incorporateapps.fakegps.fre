package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzb
  extends zzd
{
  private final zzl zzQb;
  
  public zzb(zzf paramzzf, zzg paramzzg)
  {
    super(paramzzf);
    zzx.zzz(paramzzg);
    zzQb = paramzzg.zzj(paramzzf);
  }
  
  void onServiceConnected()
  {
    zzjk();
    zzQb.onServiceConnected();
  }
  
  public void setLocalDispatchPeriod(int paramInt)
  {
    zzjv();
    zzb("setLocalDispatchPeriod (sec)", Integer.valueOf(paramInt));
    zzjo().zzf(new zzb.1(this, paramInt));
  }
  
  public void start()
  {
    zzQb.start();
  }
  
  public void zzJ(boolean paramBoolean)
  {
    zza("Network connectivity status changed", Boolean.valueOf(paramBoolean));
    zzjo().zzf(new zzb.2(this, paramBoolean));
  }
  
  public long zza(zzh paramzzh)
  {
    zzjv();
    zzx.zzz(paramzzh);
    zzjk();
    long l = zzQb.zza(paramzzh, true);
    if (l == 0L) {
      zzQb.zzc(paramzzh);
    }
    return l;
  }
  
  public void zza(zzab paramzzab)
  {
    zzx.zzz(paramzzab);
    zzjv();
    zzb("Hit delivery requested", paramzzab);
    zzjo().zzf(new zzb.4(this, paramzzab));
  }
  
  public void zza(zzw paramzzw)
  {
    zzjv();
    zzjo().zzf(new zzb.6(this, paramzzw));
  }
  
  public void zza(String paramString, Runnable paramRunnable)
  {
    zzx.zzh(paramString, "campaign param can't be empty");
    zzjo().zzf(new zzb.3(this, paramString, paramRunnable));
  }
  
  protected void zziJ()
  {
    zzQb.zza();
  }
  
  public void zzjc()
  {
    zzjv();
    zzjj();
    zzjo().zzf(new zzb.5(this));
  }
  
  public void zzjd()
  {
    zzjv();
    Context localContext = getContext();
    if ((AnalyticsReceiver.zzY(localContext)) && (AnalyticsService.zzZ(localContext)))
    {
      Intent localIntent = new Intent(localContext, AnalyticsService.class);
      localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
      localContext.startService(localIntent);
      return;
    }
    zza(null);
  }
  
  public boolean zzje()
  {
    zzjv();
    Future localFuture = zzjo().zzc(new zzb.7(this));
    try
    {
      localFuture.get(4L, TimeUnit.SECONDS);
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      zzd("syncDispatchLocalHits interrupted", localInterruptedException);
      return false;
    }
    catch (ExecutionException localExecutionException)
    {
      zze("syncDispatchLocalHits failed", localExecutionException);
      return false;
    }
    catch (TimeoutException localTimeoutException)
    {
      zzd("syncDispatchLocalHits timed out", localTimeoutException);
    }
    return false;
  }
  
  public void zzjf()
  {
    zzjv();
    com.google.android.gms.measurement.zzg.zzjk();
    zzQb.zzjf();
  }
  
  public void zzjg()
  {
    zzbd("Radio powered up");
    zzjd();
  }
  
  void zzjh()
  {
    zzjk();
    zzQb.zzjh();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */