package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.zzb.zzb;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class zzlv
  implements zzc
{
  private static final Object zzafn = new Object();
  private static final zzlv.zze zzafo = new zzlv.zze(null);
  private static final long zzafp = TimeUnit.MILLISECONDS.convert(2L, TimeUnit.MINUTES);
  private GoogleApiClient zzaaj = null;
  private final zzlv.zza zzafq;
  private final Object zzafr = new Object();
  private long zzafs = 0L;
  private final long zzaft;
  private ScheduledFuture zzafu = null;
  private final Runnable zzafv = new zzlv.1(this);
  private final zzmq zzqW;
  
  public zzlv()
  {
    this(new zzmt(), zzafp, new zzlv.zzb());
  }
  
  public zzlv(zzmq paramzzmq, long paramLong, zzlv.zza paramzza)
  {
    zzqW = paramzzmq;
    zzaft = paramLong;
    zzafq = paramzza;
  }
  
  private static void zza(LogEventParcelable paramLogEventParcelable)
  {
    if ((zzafl != null) && (zzafk.zzbuY.length == 0)) {
      zzafk.zzbuY = zzafl.zzoF();
    }
    if ((zzafm != null) && (zzafk.zzbvf.length == 0)) {
      zzafk.zzbvf = zzafm.zzoF();
    }
    zzafi = zzsu.toByteArray(zzafk);
  }
  
  private zzlv.zzd zzb(GoogleApiClient paramGoogleApiClient, LogEventParcelable paramLogEventParcelable)
  {
    zzafo.zzoH();
    paramGoogleApiClient = new zzlv.zzd(this, paramLogEventParcelable, paramGoogleApiClient);
    paramGoogleApiClient.zza(new zzlv.2(this));
    return paramGoogleApiClient;
  }
  
  public PendingResult zza(GoogleApiClient paramGoogleApiClient, LogEventParcelable paramLogEventParcelable)
  {
    zza(paramLogEventParcelable);
    return paramGoogleApiClient.zza(zzb(paramGoogleApiClient, paramLogEventParcelable));
  }
  
  public boolean zza(GoogleApiClient paramGoogleApiClient, long paramLong, TimeUnit paramTimeUnit)
  {
    try
    {
      boolean bool = zzafo.zza(paramLong, paramTimeUnit);
      return bool;
    }
    catch (InterruptedException paramGoogleApiClient)
    {
      Log.e("ClearcutLoggerApiImpl", "flush interrupted");
      Thread.currentThread().interrupt();
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */