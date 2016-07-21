package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzak;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzan;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzn;
import com.google.android.gms.analytics.internal.zzy;
import com.google.android.gms.analytics.internal.zzy.zza;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class GoogleAnalytics
  extends zza
{
  private static List zzPe = new ArrayList();
  private boolean zzPf;
  private Set zzPg = new HashSet();
  private boolean zzPh;
  private boolean zzPi;
  private volatile boolean zzPj;
  private boolean zzPk;
  private boolean zzqA;
  
  public GoogleAnalytics(zzf paramzzf)
  {
    super(paramzzf);
  }
  
  public static GoogleAnalytics getInstance(Context paramContext)
  {
    return zzf.zzaa(paramContext).zzjz();
  }
  
  public static void zziF()
  {
    try
    {
      if (zzPe != null)
      {
        Iterator localIterator = zzPe.iterator();
        while (localIterator.hasNext()) {
          ((Runnable)localIterator.next()).run();
        }
        zzPe = null;
      }
    }
    finally {}
  }
  
  private zzb zziH()
  {
    return zzix().zziH();
  }
  
  private zzan zziI()
  {
    return zzix().zziI();
  }
  
  public final void dispatchLocalHits()
  {
    zziH().zzjd();
  }
  
  public final void enableAutoActivityReports(Application paramApplication)
  {
    if ((Build.VERSION.SDK_INT >= 14) && (!zzPh))
    {
      paramApplication.registerActivityLifecycleCallbacks(new GoogleAnalytics.zzb(this));
      zzPh = true;
    }
  }
  
  public final boolean getAppOptOut()
  {
    return zzPj;
  }
  
  public final String getClientId()
  {
    zzx.zzcE("getClientId can not be called from the main thread");
    return zzix().zzjC().zzkk();
  }
  
  public final Logger getLogger()
  {
    return zzae.getLogger();
  }
  
  public final boolean isDryRunEnabled()
  {
    return zzPi;
  }
  
  public final boolean isInitialized()
  {
    return (zzqA) && (!zzPf);
  }
  
  public final Tracker newTracker(int paramInt)
  {
    try
    {
      Tracker localTracker = new Tracker(zzix(), null, null);
      if (paramInt > 0)
      {
        zzal localzzal = (zzal)new zzak(zzix()).zzah(paramInt);
        if (localzzal != null) {
          localTracker.zza(localzzal);
        }
      }
      localTracker.zza();
      return localTracker;
    }
    finally {}
  }
  
  public final Tracker newTracker(String paramString)
  {
    try
    {
      paramString = new Tracker(zzix(), paramString, null);
      paramString.zza();
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void reportActivityStart(Activity paramActivity)
  {
    if (!zzPh) {
      zzj(paramActivity);
    }
  }
  
  public final void reportActivityStop(Activity paramActivity)
  {
    if (!zzPh) {
      zzk(paramActivity);
    }
  }
  
  public final void setAppOptOut(boolean paramBoolean)
  {
    zzPj = paramBoolean;
    if (zzPj) {
      zziH().zzjc();
    }
  }
  
  public final void setDryRun(boolean paramBoolean)
  {
    zzPi = paramBoolean;
  }
  
  public final void setLocalDispatchPeriod(int paramInt)
  {
    zziH().setLocalDispatchPeriod(paramInt);
  }
  
  public final void setLogger(Logger paramLogger)
  {
    zzae.setLogger(paramLogger);
    if (!zzPk)
    {
      Log.i((String)zzy.zzRL.get(), "GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag." + (String)zzy.zzRL.get() + " DEBUG");
      zzPk = true;
    }
  }
  
  public final void zza()
  {
    zziE();
    zzqA = true;
  }
  
  final void zza(GoogleAnalytics.zza paramzza)
  {
    zzPg.add(paramzza);
    paramzza = zzix().getContext();
    if ((paramzza instanceof Application)) {
      enableAutoActivityReports((Application)paramzza);
    }
  }
  
  final void zzb(GoogleAnalytics.zza paramzza)
  {
    zzPg.remove(paramzza);
  }
  
  final void zziE()
  {
    zzan localzzan = zziI();
    if (localzzan.zzlj()) {
      getLogger().setLogLevel(localzzan.getLogLevel());
    }
    if (localzzan.zzln()) {
      zzPi = localzzan.zzlo();
    }
    if (localzzan.zzlj())
    {
      Logger localLogger = zzae.getLogger();
      if (localLogger != null) {
        localLogger.setLogLevel(localzzan.getLogLevel());
      }
    }
  }
  
  final void zziG()
  {
    zziH().zzje();
  }
  
  final void zzj(Activity paramActivity)
  {
    Iterator localIterator = zzPg.iterator();
    while (localIterator.hasNext()) {
      ((GoogleAnalytics.zza)localIterator.next()).zzl(paramActivity);
    }
  }
  
  final void zzk(Activity paramActivity)
  {
    Iterator localIterator = zzPg.iterator();
    while (localIterator.hasNext()) {
      ((GoogleAnalytics.zza)localIterator.next()).zzm(paramActivity);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.GoogleAnalytics
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */