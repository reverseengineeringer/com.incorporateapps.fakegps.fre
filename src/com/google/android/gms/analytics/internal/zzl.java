package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;
import com.google.android.gms.analytics.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzkd;
import com.google.android.gms.internal.zzke;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzpq;
import com.google.android.gms.internal.zzpr;
import com.google.android.gms.measurement.zzc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zzl
  extends zzd
{
  private boolean mStarted;
  private final zzj zzQY;
  private final zzah zzQZ;
  private final zzag zzRa;
  private final zzi zzRb;
  private long zzRc;
  private final zzt zzRd;
  private final zzt zzRe;
  private final zzaj zzRf;
  private long zzRg;
  private boolean zzRh;
  
  protected zzl(zzf paramzzf, zzg paramzzg)
  {
    super(paramzzf);
    zzx.zzz(paramzzg);
    zzRc = Long.MIN_VALUE;
    zzRa = paramzzg.zzk(paramzzf);
    zzQY = paramzzg.zzm(paramzzf);
    zzQZ = paramzzg.zzn(paramzzf);
    zzRb = paramzzg.zzo(paramzzf);
    zzRf = new zzaj(zzjl());
    zzRd = new zzl.1(this, paramzzf);
    zzRe = new zzl.2(this, paramzzf);
  }
  
  private void zza(zzh paramzzh, zzpr paramzzpr)
  {
    zzx.zzz(paramzzh);
    zzx.zzz(paramzzpr);
    Object localObject1 = new zza(zzji());
    ((zza)localObject1).zzaS(paramzzh.zzjE());
    ((zza)localObject1).enableAdvertisingIdCollection(paramzzh.zzjF());
    localObject1 = ((zza)localObject1).zziy();
    zzke localzzke = (zzke)((zzc)localObject1).zzf(zzke.class);
    localzzke.zzaX("data");
    localzzke.zzI(true);
    ((zzc)localObject1).zzb(paramzzpr);
    zzkd localzzkd = (zzkd)((zzc)localObject1).zzf(zzkd.class);
    zzpq localzzpq = (zzpq)((zzc)localObject1).zzf(zzpq.class);
    Iterator localIterator = paramzzh.zzn().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject2).getKey();
      localObject2 = (String)((Map.Entry)localObject2).getValue();
      if ("an".equals(str)) {
        localzzpq.setAppName((String)localObject2);
      } else if ("av".equals(str)) {
        localzzpq.setAppVersion((String)localObject2);
      } else if ("aid".equals(str)) {
        localzzpq.setAppId((String)localObject2);
      } else if ("aiid".equals(str)) {
        localzzpq.setAppInstallerId((String)localObject2);
      } else if ("uid".equals(str)) {
        localzzke.setUserId((String)localObject2);
      } else {
        localzzkd.set(str, (String)localObject2);
      }
    }
    zzb("Sending installation campaign to", paramzzh.zzjE(), paramzzpr);
    ((zzc)localObject1).zzM(zzjq().zzlF());
    ((zzc)localObject1).zzAy();
  }
  
  private boolean zzbk(String paramString)
  {
    return getContext().checkCallingOrSelfPermission(paramString) == 0;
  }
  
  private void zzjT()
  {
    Context localContext = zzji().getContext();
    if (!AnalyticsReceiver.zzY(localContext)) {
      zzbg("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
    }
    do
    {
      while (!CampaignTrackingReceiver.zzY(localContext))
      {
        zzbg("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        return;
        if (!AnalyticsService.zzZ(localContext)) {
          zzbh("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
      }
    } while (CampaignTrackingService.zzZ(localContext));
    zzbg("CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
  }
  
  private void zzjV()
  {
    zzb(new zzl.4(this));
  }
  
  private void zzjW()
  {
    try
    {
      zzQY.zzjN();
      zzkb();
      zzRe.zzt(zzjn().zzkT());
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        zzd("Failed to delete stale hits", localSQLiteException);
      }
    }
  }
  
  private boolean zzkc()
  {
    if (zzRh) {}
    while (((zzjn().zzkr()) && (!zzjn().zzks())) || (zzki() <= 0L)) {
      return false;
    }
    return true;
  }
  
  private void zzkd()
  {
    zzv localzzv = zzjp();
    if (!localzzv.zzlb()) {}
    long l;
    do
    {
      do
      {
        return;
      } while (localzzv.zzbw());
      l = zzjO();
    } while ((l == 0L) || (Math.abs(zzjl().currentTimeMillis() - l) > zzjn().zzkB()));
    zza("Dispatch alarm scheduled (ms)", Long.valueOf(zzjn().zzkA()));
    localzzv.zzlc();
  }
  
  private void zzke()
  {
    zzkd();
    long l2 = zzki();
    long l1 = zzjq().zzlH();
    if (l1 != 0L)
    {
      l1 = l2 - Math.abs(zzjl().currentTimeMillis() - l1);
      if (l1 <= 0L) {}
    }
    for (;;)
    {
      zza("Dispatch scheduled (ms)", Long.valueOf(l1));
      if (!zzRd.zzbw()) {
        break;
      }
      l1 = Math.max(1L, l1 + zzRd.zzkY());
      zzRd.zzu(l1);
      return;
      l1 = Math.min(zzjn().zzky(), l2);
      continue;
      l1 = Math.min(zzjn().zzky(), l2);
    }
    zzRd.zzt(l1);
  }
  
  private void zzkf()
  {
    zzkg();
    zzkh();
  }
  
  private void zzkg()
  {
    if (zzRd.zzbw()) {
      zzbd("All hits dispatched or no network/service. Going to power save mode");
    }
    zzRd.cancel();
  }
  
  private void zzkh()
  {
    zzv localzzv = zzjp();
    if (localzzv.zzbw()) {
      localzzv.cancel();
    }
  }
  
  protected void onServiceConnected()
  {
    zzjk();
    if (!zzjn().zzkr()) {
      zzjY();
    }
  }
  
  void start()
  {
    zzjv();
    if (!mStarted) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Analytics backend already started");
      mStarted = true;
      if (!zzjn().zzkr()) {
        zzjT();
      }
      zzjo().zzf(new zzl.3(this));
      return;
    }
  }
  
  public void zzJ(boolean paramBoolean)
  {
    zzkb();
  }
  
  /* Error */
  public long zza(zzh paramzzh, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 34	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 435	com/google/android/gms/analytics/internal/zzl:zzjv	()V
    //   9: aload_0
    //   10: invokevirtual 428	com/google/android/gms/analytics/internal/zzl:zzjk	()V
    //   13: aload_0
    //   14: getfield 52	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   17: invokevirtual 461	com/google/android/gms/analytics/internal/zzj:beginTransaction	()V
    //   20: aload_0
    //   21: getfield 52	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   24: aload_1
    //   25: invokevirtual 464	com/google/android/gms/analytics/internal/zzh:zzjD	()J
    //   28: aload_1
    //   29: invokevirtual 467	com/google/android/gms/analytics/internal/zzh:getClientId	()Ljava/lang/String;
    //   32: invokevirtual 470	com/google/android/gms/analytics/internal/zzj:zza	(JLjava/lang/String;)V
    //   35: aload_0
    //   36: getfield 52	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   39: aload_1
    //   40: invokevirtual 464	com/google/android/gms/analytics/internal/zzh:zzjD	()J
    //   43: aload_1
    //   44: invokevirtual 467	com/google/android/gms/analytics/internal/zzh:getClientId	()Ljava/lang/String;
    //   47: aload_1
    //   48: invokevirtual 103	com/google/android/gms/analytics/internal/zzh:zzjE	()Ljava/lang/String;
    //   51: invokevirtual 473	com/google/android/gms/analytics/internal/zzj:zza	(JLjava/lang/String;Ljava/lang/String;)J
    //   54: lstore_3
    //   55: iload_2
    //   56: ifne +32 -> 88
    //   59: aload_1
    //   60: lload_3
    //   61: invokevirtual 475	com/google/android/gms/analytics/internal/zzh:zzn	(J)V
    //   64: aload_0
    //   65: getfield 52	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   68: aload_1
    //   69: invokevirtual 478	com/google/android/gms/analytics/internal/zzj:zzb	(Lcom/google/android/gms/analytics/internal/zzh;)V
    //   72: aload_0
    //   73: getfield 52	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   76: invokevirtual 481	com/google/android/gms/analytics/internal/zzj:setTransactionSuccessful	()V
    //   79: aload_0
    //   80: getfield 52	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   83: invokevirtual 484	com/google/android/gms/analytics/internal/zzj:endTransaction	()V
    //   86: lload_3
    //   87: lreturn
    //   88: aload_1
    //   89: lconst_1
    //   90: lload_3
    //   91: ladd
    //   92: invokevirtual 475	com/google/android/gms/analytics/internal/zzh:zzn	(J)V
    //   95: goto -31 -> 64
    //   98: astore_1
    //   99: aload_0
    //   100: ldc_w 486
    //   103: aload_1
    //   104: invokevirtual 489	com/google/android/gms/analytics/internal/zzl:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   107: aload_0
    //   108: getfield 52	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   111: invokevirtual 484	com/google/android/gms/analytics/internal/zzj:endTransaction	()V
    //   114: ldc2_w 490
    //   117: lreturn
    //   118: astore_1
    //   119: aload_0
    //   120: ldc_w 493
    //   123: aload_1
    //   124: invokevirtual 489	com/google/android/gms/analytics/internal/zzl:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   127: lload_3
    //   128: lreturn
    //   129: astore_1
    //   130: aload_0
    //   131: ldc_w 493
    //   134: aload_1
    //   135: invokevirtual 489	com/google/android/gms/analytics/internal/zzl:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   138: goto -24 -> 114
    //   141: astore_1
    //   142: aload_0
    //   143: getfield 52	com/google/android/gms/analytics/internal/zzl:zzQY	Lcom/google/android/gms/analytics/internal/zzj;
    //   146: invokevirtual 484	com/google/android/gms/analytics/internal/zzj:endTransaction	()V
    //   149: aload_1
    //   150: athrow
    //   151: astore 5
    //   153: aload_0
    //   154: ldc_w 493
    //   157: aload 5
    //   159: invokevirtual 489	com/google/android/gms/analytics/internal/zzl:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   162: goto -13 -> 149
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	zzl
    //   0	165	1	paramzzh	zzh
    //   0	165	2	paramBoolean	boolean
    //   54	74	3	l	long
    //   151	7	5	localSQLiteException	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   13	55	98	android/database/sqlite/SQLiteException
    //   59	64	98	android/database/sqlite/SQLiteException
    //   64	79	98	android/database/sqlite/SQLiteException
    //   88	95	98	android/database/sqlite/SQLiteException
    //   79	86	118	android/database/sqlite/SQLiteException
    //   107	114	129	android/database/sqlite/SQLiteException
    //   13	55	141	finally
    //   59	64	141	finally
    //   64	79	141	finally
    //   88	95	141	finally
    //   99	107	141	finally
    //   142	149	151	android/database/sqlite/SQLiteException
  }
  
  public void zza(zzab paramzzab)
  {
    zzx.zzz(paramzzab);
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    if (zzRh) {
      zzbe("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
    }
    for (;;)
    {
      paramzzab = zzf(paramzzab);
      zzjX();
      if (!zzRb.zzb(paramzzab)) {
        break;
      }
      zzbe("Hit sent to the device AnalyticsService for delivery");
      return;
      zza("Delivering hit", paramzzab);
    }
    if (zzjn().zzkr())
    {
      zzjm().zza(paramzzab, "Service unavailable on package side");
      return;
    }
    try
    {
      zzQY.zzc(paramzzab);
      zzkb();
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      zze("Delivery failed to save hit to a database", localSQLiteException);
      zzjm().zza(paramzzab, "deliver: failed to insert hit to database");
    }
  }
  
  public void zza(zzw paramzzw, long paramLong)
  {
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    long l1 = -1L;
    long l2 = zzjq().zzlH();
    if (l2 != 0L) {
      l1 = Math.abs(zzjl().currentTimeMillis() - l2);
    }
    zzb("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(l1));
    if (!zzjn().zzkr()) {
      zzjX();
    }
    try
    {
      if (zzjZ())
      {
        zzjo().zzf(new zzl.5(this, paramzzw, paramLong));
        return;
      }
      zzjq().zzlI();
      zzkb();
      if (paramzzw != null) {
        paramzzw.zzc(null);
      }
      if (zzRg != paramLong)
      {
        zzRa.zzlA();
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      zze("Local dispatch failed", localThrowable);
      zzjq().zzlI();
      zzkb();
      if (paramzzw != null) {
        paramzzw.zzc(localThrowable);
      }
    }
  }
  
  public void zzb(zzw paramzzw)
  {
    zza(paramzzw, zzRg);
  }
  
  public void zzbl(String paramString)
  {
    zzx.zzcM(paramString);
    zzjk();
    zzjj();
    zzpr localzzpr = zzam.zza(zzjm(), paramString);
    if (localzzpr == null) {
      zzd("Parsing failed. Ignoring invalid campaign data", paramString);
    }
    for (;;)
    {
      return;
      String str = zzjq().zzlJ();
      if (paramString.equals(str))
      {
        zzbg("Ignoring duplicate install campaign");
        return;
      }
      if (!TextUtils.isEmpty(str))
      {
        zzd("Ignoring multiple install campaigns. original, new", str, paramString);
        return;
      }
      zzjq().zzbp(paramString);
      if (zzjq().zzlG().zzv(zzjn().zzkW()))
      {
        zzd("Campaign received too late, ignoring", localzzpr);
        return;
      }
      zzb("Received installation campaign", localzzpr);
      paramString = zzQY.zzr(0L).iterator();
      while (paramString.hasNext()) {
        zza((zzh)paramString.next(), localzzpr);
      }
    }
  }
  
  protected void zzc(zzh paramzzh)
  {
    zzjk();
    zzb("Sending first hit to property", paramzzh.zzjE());
    if (zzjq().zzlG().zzv(zzjn().zzkW())) {}
    do
    {
      return;
      localObject = zzjq().zzlJ();
    } while (TextUtils.isEmpty((CharSequence)localObject));
    Object localObject = zzam.zza(zzjm(), (String)localObject);
    zzb("Found relevant installation campaign", localObject);
    zza(paramzzh, (zzpr)localObject);
  }
  
  zzab zzf(zzab paramzzab)
  {
    if (!TextUtils.isEmpty(paramzzab.zzlv())) {}
    do
    {
      return paramzzab;
      localObject2 = zzjq().zzlK().zzlN();
    } while (localObject2 == null);
    Object localObject1 = (Long)second;
    Object localObject2 = (String)first;
    localObject1 = localObject1 + ":" + (String)localObject2;
    localObject2 = new HashMap(paramzzab.zzn());
    ((Map)localObject2).put("_m", localObject1);
    return zzab.zza(this, paramzzab, (Map)localObject2);
  }
  
  protected void zziJ()
  {
    zzQY.zza();
    zzQZ.zza();
    zzRb.zza();
  }
  
  public long zzjO()
  {
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    try
    {
      long l = zzQY.zzjO();
      return l;
    }
    catch (SQLiteException localSQLiteException)
    {
      zze("Failed to get min/max hit times from local store", localSQLiteException);
    }
    return 0L;
  }
  
  protected void zzjU()
  {
    zzjv();
    zzjq().zzlF();
    if (!zzbk("android.permission.ACCESS_NETWORK_STATE"))
    {
      zzbh("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
      zzkj();
    }
    if (!zzbk("android.permission.INTERNET"))
    {
      zzbh("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
      zzkj();
    }
    if (AnalyticsService.zzZ(getContext())) {
      zzbd("AnalyticsService registered in the app manifest and enabled");
    }
    for (;;)
    {
      if ((!zzRh) && (!zzjn().zzkr()) && (!zzQY.isEmpty())) {
        zzjX();
      }
      zzkb();
      return;
      if (zzjn().zzkr()) {
        zzbh("Device AnalyticsService not registered! Hits will not be delivered reliably.");
      } else {
        zzbg("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
  }
  
  protected void zzjX()
  {
    if (zzRh) {}
    do
    {
      long l;
      do
      {
        do
        {
          return;
        } while ((!zzjn().zzkt()) || (zzRb.isConnected()));
        l = zzjn().zzkO();
      } while (!zzRf.zzv(l));
      zzRf.start();
      zzbd("Connecting to service");
    } while (!zzRb.connect());
    zzbd("Connected to service");
    zzRf.clear();
    onServiceConnected();
  }
  
  public void zzjY()
  {
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    zzjj();
    if (!zzjn().zzkt()) {
      zzbg("Service client disabled. Can't dispatch local hits to device AnalyticsService");
    }
    if (!zzRb.isConnected()) {
      zzbd("Service not connected");
    }
    while (zzQY.isEmpty()) {
      return;
    }
    zzbd("Dispatching local hits to device AnalyticsService");
    for (;;)
    {
      try
      {
        List localList = zzQY.zzp(zzjn().zzkC());
        if (!localList.isEmpty()) {
          break label126;
        }
        zzkb();
        return;
      }
      catch (SQLiteException localSQLiteException1)
      {
        zze("Failed to read hits from store", localSQLiteException1);
        zzkf();
        return;
      }
      label107:
      Object localObject;
      localSQLiteException1.remove(localObject);
      try
      {
        zzQY.zzq(((zzab)localObject).zzlq());
        label126:
        if (!localSQLiteException1.isEmpty())
        {
          localObject = (zzab)localSQLiteException1.get(0);
          if (zzRb.zzb((zzab)localObject)) {
            break label107;
          }
          zzkb();
          return;
        }
      }
      catch (SQLiteException localSQLiteException2)
      {
        zze("Failed to remove hit that was send for delivery", localSQLiteException2);
        zzkf();
      }
    }
  }
  
  protected boolean zzjZ()
  {
    int j = 1;
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    zzbd("Dispatching a batch of local hits");
    int i;
    if ((!zzRb.isConnected()) && (!zzjn().zzkr()))
    {
      i = 1;
      if (zzQZ.zzlB()) {
        break label70;
      }
    }
    for (;;)
    {
      if ((i == 0) || (j == 0)) {
        break label75;
      }
      zzbd("No network or service available. Will retry later");
      return false;
      i = 0;
      break;
      label70:
      j = 0;
    }
    label75:
    long l3 = Math.max(zzjn().zzkC(), zzjn().zzkD());
    ArrayList localArrayList = new ArrayList();
    long l1 = 0L;
    try
    {
      for (;;)
      {
        zzQY.beginTransaction();
        localArrayList.clear();
        try
        {
          localList = zzQY.zzp(l3);
          if (localList.isEmpty())
          {
            zzbd("Store is empty, nothing to dispatch");
            zzkf();
            try
            {
              zzQY.setTransactionSuccessful();
              zzQY.endTransaction();
              return false;
            }
            catch (SQLiteException localSQLiteException1)
            {
              zze("Failed to commit local dispatch transaction", localSQLiteException1);
              zzkf();
              return false;
            }
          }
          zza("Hits loaded from store. count", Integer.valueOf(localList.size()));
          localObject2 = localList.iterator();
          for (;;)
          {
            if (((Iterator)localObject2).hasNext()) {
              if (((zzab)((Iterator)localObject2).next()).zzlq() == l1)
              {
                zzd("Database contains successfully uploaded hit", Long.valueOf(l1), Integer.valueOf(localList.size()));
                zzkf();
                try
                {
                  zzQY.setTransactionSuccessful();
                  zzQY.endTransaction();
                  return false;
                }
                catch (SQLiteException localSQLiteException2)
                {
                  zze("Failed to commit local dispatch transaction", localSQLiteException2);
                  zzkf();
                  return false;
                }
              }
            }
          }
        }
        catch (SQLiteException localSQLiteException3)
        {
          List localList;
          Object localObject2;
          zzd("Failed to read hits from persisted store", localSQLiteException3);
          zzkf();
          try
          {
            zzQY.setTransactionSuccessful();
            zzQY.endTransaction();
            return false;
          }
          catch (SQLiteException localSQLiteException4)
          {
            zze("Failed to commit local dispatch transaction", localSQLiteException4);
            zzkf();
            return false;
          }
          long l2 = l1;
          if (zzRb.isConnected())
          {
            l2 = l1;
            if (!zzjn().zzkr())
            {
              zzbd("Service connected, sending hits to the service");
              for (;;)
              {
                l2 = l1;
                if (!localList.isEmpty())
                {
                  localObject2 = (zzab)localList.get(0);
                  l2 = l1;
                  if (zzRb.zzb((zzab)localObject2))
                  {
                    l1 = Math.max(l1, ((zzab)localObject2).zzlq());
                    localList.remove(localObject2);
                    zzb("Hit sent do device AnalyticsService for delivery", localObject2);
                    try
                    {
                      zzQY.zzq(((zzab)localObject2).zzlq());
                      localSQLiteException4.add(Long.valueOf(((zzab)localObject2).zzlq()));
                    }
                    catch (SQLiteException localSQLiteException5)
                    {
                      zze("Failed to remove hit that was send for delivery", localSQLiteException5);
                      zzkf();
                      try
                      {
                        zzQY.setTransactionSuccessful();
                        zzQY.endTransaction();
                        return false;
                      }
                      catch (SQLiteException localSQLiteException6)
                      {
                        zze("Failed to commit local dispatch transaction", localSQLiteException6);
                        zzkf();
                        return false;
                      }
                    }
                  }
                }
              }
            }
          }
          l1 = l2;
          if (zzQZ.zzlB())
          {
            localObject2 = zzQZ.zzq(localList);
            Iterator localIterator = ((List)localObject2).iterator();
            for (l1 = l2; localIterator.hasNext(); l1 = Math.max(l1, ((Long)localIterator.next()).longValue())) {}
            localList.removeAll((Collection)localObject2);
          }
          try
          {
            zzQY.zzo((List)localObject2);
            localSQLiteException6.addAll((Collection)localObject2);
            boolean bool = localSQLiteException6.isEmpty();
            if (bool) {
              try
              {
                zzQY.setTransactionSuccessful();
                zzQY.endTransaction();
                return false;
              }
              catch (SQLiteException localSQLiteException7)
              {
                zze("Failed to commit local dispatch transaction", localSQLiteException7);
                zzkf();
                return false;
              }
            }
          }
          catch (SQLiteException localSQLiteException8)
          {
            zze("Failed to remove successfully uploaded hits", localSQLiteException8);
            zzkf();
            try
            {
              zzQY.setTransactionSuccessful();
              zzQY.endTransaction();
              return false;
            }
            catch (SQLiteException localSQLiteException9)
            {
              zze("Failed to commit local dispatch transaction", localSQLiteException9);
              zzkf();
              return false;
            }
            try
            {
              zzQY.setTransactionSuccessful();
              zzQY.endTransaction();
            }
            catch (SQLiteException localSQLiteException10)
            {
              zze("Failed to commit local dispatch transaction", localSQLiteException10);
              zzkf();
              return false;
            }
          }
        }
      }
      return false;
    }
    finally
    {
      try
      {
        zzQY.setTransactionSuccessful();
        zzQY.endTransaction();
        throw ((Throwable)localObject1);
      }
      catch (SQLiteException localSQLiteException11)
      {
        zze("Failed to commit local dispatch transaction", localSQLiteException11);
        zzkf();
      }
    }
  }
  
  public void zzjc()
  {
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    if (!zzjn().zzkr()) {
      zzbd("Delete all hits from local store");
    }
    try
    {
      zzQY.zzjL();
      zzQY.zzjM();
      zzkb();
      zzjX();
      if (zzRb.zzjH()) {
        zzbd("Device service unavailable. Can't clear hits stored on the device service.");
      }
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        zzd("Failed to delete hits from store", localSQLiteException);
      }
    }
  }
  
  public void zzjf()
  {
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    zzbd("Service disconnected");
  }
  
  void zzjh()
  {
    zzjk();
    zzRg = zzjl().currentTimeMillis();
  }
  
  public void zzka()
  {
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    zzbe("Sync dispatching local hits");
    long l = zzRg;
    if (!zzjn().zzkr()) {
      zzjX();
    }
    try
    {
      while (zzjZ()) {}
      zzjq().zzlI();
      zzkb();
      if (zzRg != l) {
        zzRa.zzlA();
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      zze("Sync local dispatch failed", localThrowable);
      zzkb();
    }
  }
  
  public void zzkb()
  {
    zzji().zzjk();
    zzjv();
    if (!zzkc())
    {
      zzRa.unregister();
      zzkf();
      return;
    }
    if (zzQY.isEmpty())
    {
      zzRa.unregister();
      zzkf();
      return;
    }
    if (!((Boolean)zzy.zzSs.get()).booleanValue()) {
      zzRa.zzly();
    }
    for (boolean bool = zzRa.isConnected(); bool; bool = true)
    {
      zzke();
      return;
    }
    zzkf();
    zzkd();
  }
  
  public long zzki()
  {
    long l;
    if (zzRc != Long.MIN_VALUE) {
      l = zzRc;
    }
    do
    {
      return l;
      l = zzjn().zzkz();
    } while (!zziI().zzll());
    return zziI().zzmc() * 1000L;
  }
  
  public void zzkj()
  {
    zzjv();
    zzjk();
    zzRh = true;
    zzRb.disconnect();
    zzkb();
  }
  
  public void zzs(long paramLong)
  {
    com.google.android.gms.measurement.zzg.zzjk();
    zzjv();
    long l = paramLong;
    if (paramLong < 0L) {
      l = 0L;
    }
    zzRc = l;
    zzkb();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */