package com.google.android.gms.measurement;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzpq;
import com.google.android.gms.internal.zzps;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public final class zzg
{
  private static volatile zzg zzaUv;
  private final Context mContext;
  private volatile zzpq zzQX;
  private final List zzaUw;
  private final zzb zzaUx;
  private final zzg.zza zzaUy;
  private Thread.UncaughtExceptionHandler zzaUz;
  
  zzg(Context paramContext)
  {
    paramContext = paramContext.getApplicationContext();
    zzx.zzz(paramContext);
    mContext = paramContext;
    zzaUy = new zzg.zza(this);
    zzaUw = new CopyOnWriteArrayList();
    zzaUx = new zzb();
  }
  
  public static zzg zzaS(Context paramContext)
  {
    zzx.zzz(paramContext);
    if (zzaUv == null) {}
    try
    {
      if (zzaUv == null) {
        zzaUv = new zzg(paramContext);
      }
      return zzaUv;
    }
    finally {}
  }
  
  private void zzb(zzc paramzzc)
  {
    zzx.zzcE("deliver should be called from worker thread");
    zzx.zzb(paramzzc.zzAz(), "Measurement must be submitted");
    Object localObject = paramzzc.zzAw();
    if (((List)localObject).isEmpty()) {}
    for (;;)
    {
      return;
      HashSet localHashSet = new HashSet();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        zzi localzzi = (zzi)((Iterator)localObject).next();
        Uri localUri = localzzi.zziA();
        if (!localHashSet.contains(localUri))
        {
          localHashSet.add(localUri);
          localzzi.zzb(paramzzc);
        }
      }
    }
  }
  
  public static void zzjk()
  {
    if (!(Thread.currentThread() instanceof zzg.zzc)) {
      throw new IllegalStateException("Call expected from worker thread");
    }
  }
  
  public final Context getContext()
  {
    return mContext;
  }
  
  public final zzpq zzAH()
  {
    if (zzQX == null) {}
    Object localObject5;
    Object localObject3;
    try
    {
      zzpq localzzpq;
      PackageManager localPackageManager;
      String str2;
      if (zzQX == null)
      {
        localzzpq = new zzpq();
        localPackageManager = mContext.getPackageManager();
        str2 = mContext.getPackageName();
        localzzpq.setAppId(str2);
        localzzpq.setAppInstallerId(localPackageManager.getInstallerPackageName(str2));
        localObject5 = null;
        localObject3 = str2;
      }
      try
      {
        PackageInfo localPackageInfo = localPackageManager.getPackageInfo(mContext.getPackageName(), 0);
        localObject4 = localObject5;
        str1 = str2;
        if (localPackageInfo != null)
        {
          localObject3 = str2;
          localObject4 = localPackageManager.getApplicationLabel(applicationInfo);
          str1 = str2;
          localObject3 = str2;
          if (!TextUtils.isEmpty((CharSequence)localObject4))
          {
            localObject3 = str2;
            str1 = ((CharSequence)localObject4).toString();
          }
          localObject3 = str1;
          localObject4 = versionName;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        for (;;)
        {
          String str1;
          Log.e("GAv4", "Error retrieving package info: appName set to " + (String)localObject3);
          Object localObject4 = localObject5;
          Object localObject1 = localObject3;
        }
      }
      localzzpq.setAppName(str1);
      localzzpq.setAppVersion((String)localObject4);
      zzQX = localzzpq;
      return zzQX;
    }
    finally {}
  }
  
  public final zzps zzAI()
  {
    DisplayMetrics localDisplayMetrics = mContext.getResources().getDisplayMetrics();
    zzps localzzps = new zzps();
    localzzps.setLanguage(zzam.zza(Locale.getDefault()));
    localzzps.zziB(widthPixels);
    localzzps.zziC(heightPixels);
    return localzzps;
  }
  
  public final void zza(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    zzaUz = paramUncaughtExceptionHandler;
  }
  
  public final Future zzc(Callable paramCallable)
  {
    zzx.zzz(paramCallable);
    if ((Thread.currentThread() instanceof zzg.zzc))
    {
      paramCallable = new FutureTask(paramCallable);
      paramCallable.run();
      return paramCallable;
    }
    return zzaUy.submit(paramCallable);
  }
  
  final void zze(zzc paramzzc)
  {
    if (paramzzc.zzAD()) {
      throw new IllegalStateException("Measurement prototype can't be submitted");
    }
    if (paramzzc.zzAz()) {
      throw new IllegalStateException("Measurement can only be submitted once");
    }
    paramzzc = paramzzc.zzAu();
    paramzzc.zzAA();
    zzaUy.execute(new zzg.1(this, paramzzc));
  }
  
  public final void zzf(Runnable paramRunnable)
  {
    zzx.zzz(paramRunnable);
    zzaUy.submit(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */