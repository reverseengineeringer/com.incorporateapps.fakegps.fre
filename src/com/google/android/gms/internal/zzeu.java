package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class zzeu
  implements zzem
{
  private final Context mContext;
  private final zzeo zzCf;
  private final AdRequestInfoParcel zzCu;
  private final long zzCv;
  private final long zzCw;
  private final int zzCx;
  private boolean zzCy = false;
  private final Map zzCz = new HashMap();
  private final Object zzpV = new Object();
  private final zzex zzpn;
  private final boolean zzsA;
  private final boolean zzuS;
  
  public zzeu(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, zzex paramzzex, zzeo paramzzeo, boolean paramBoolean1, boolean paramBoolean2, long paramLong1, long paramLong2, int paramInt)
  {
    mContext = paramContext;
    zzCu = paramAdRequestInfoParcel;
    zzpn = paramzzex;
    zzCf = paramzzeo;
    zzsA = paramBoolean1;
    zzuS = paramBoolean2;
    zzCv = paramLong1;
    zzCw = paramLong2;
    zzCx = paramInt;
  }
  
  private void zza(zzjg paramzzjg)
  {
    zzir.zzMc.post(new zzeu.2(this, paramzzjg));
  }
  
  private zzes zzd(List paramList)
  {
    for (;;)
    {
      synchronized (zzpV)
      {
        if (zzCy)
        {
          paramList = new zzes(-1);
          return paramList;
        }
        ??? = paramList.iterator();
        if (((Iterator)???).hasNext()) {
          paramList = (zzjg)((Iterator)???).next();
        }
      }
      try
      {
        zzes localzzes = (zzes)paramList.get();
        if ((localzzes == null) || (zzCo != 0)) {
          continue;
        }
        zza(paramList);
        return localzzes;
      }
      catch (InterruptedException paramList)
      {
        zzin.zzd("Exception while processing an adapter; continuing with other adapters", paramList);
        continue;
        paramList = finally;
        throw paramList;
        zza(null);
        return new zzes(1);
      }
      catch (ExecutionException paramList)
      {
        for (;;) {}
      }
    }
  }
  
  /* Error */
  private zzes zze(List paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/google/android/gms/internal/zzeu:zzpV	Ljava/lang/Object;
    //   4: astore 9
    //   6: aload 9
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 36	com/google/android/gms/internal/zzeu:zzCy	Z
    //   13: ifeq +19 -> 32
    //   16: new 92	com/google/android/gms/internal/zzes
    //   19: dup
    //   20: iconst_m1
    //   21: invokespecial 95	com/google/android/gms/internal/zzes:<init>	(I)V
    //   24: astore 8
    //   26: aload 9
    //   28: monitorexit
    //   29: aload 8
    //   31: areturn
    //   32: aload 9
    //   34: monitorexit
    //   35: iconst_m1
    //   36: istore_2
    //   37: aconst_null
    //   38: astore 9
    //   40: aconst_null
    //   41: astore 8
    //   43: aload_0
    //   44: getfield 49	com/google/android/gms/internal/zzeu:zzCf	Lcom/google/android/gms/internal/zzeo;
    //   47: getfield 138	com/google/android/gms/internal/zzeo:zzBY	J
    //   50: ldc2_w 139
    //   53: lcmp
    //   54: ifeq +176 -> 230
    //   57: aload_0
    //   58: getfield 49	com/google/android/gms/internal/zzeu:zzCf	Lcom/google/android/gms/internal/zzeo;
    //   61: getfield 138	com/google/android/gms/internal/zzeo:zzBY	J
    //   64: lstore 4
    //   66: aload_1
    //   67: invokeinterface 101 1 0
    //   72: astore 11
    //   74: aload 8
    //   76: astore_1
    //   77: aload 11
    //   79: invokeinterface 107 1 0
    //   84: ifeq +228 -> 312
    //   87: aload 11
    //   89: invokeinterface 111 1 0
    //   94: checkcast 113	com/google/android/gms/internal/zzjg
    //   97: astore 10
    //   99: invokestatic 146	com/google/android/gms/ads/internal/zzr:zzbG	()Lcom/google/android/gms/internal/zzmq;
    //   102: invokeinterface 152 1 0
    //   107: lstore 6
    //   109: lload 4
    //   111: lconst_0
    //   112: lcmp
    //   113: ifne +125 -> 238
    //   116: aload 10
    //   118: invokeinterface 155 1 0
    //   123: ifeq +115 -> 238
    //   126: aload 10
    //   128: invokeinterface 116 1 0
    //   133: checkcast 92	com/google/android/gms/internal/zzes
    //   136: astore 8
    //   138: aload 8
    //   140: ifnull +209 -> 349
    //   143: aload 8
    //   145: getfield 119	com/google/android/gms/internal/zzes:zzCo	I
    //   148: ifne +201 -> 349
    //   151: aload 8
    //   153: getfield 159	com/google/android/gms/internal/zzes:zzCt	Lcom/google/android/gms/internal/zzfa;
    //   156: astore 12
    //   158: aload 12
    //   160: ifnull +189 -> 349
    //   163: aload 12
    //   165: invokeinterface 165 1 0
    //   170: iload_2
    //   171: if_icmple +178 -> 349
    //   174: aload 12
    //   176: invokeinterface 165 1 0
    //   181: istore_3
    //   182: iload_3
    //   183: istore_2
    //   184: aload 10
    //   186: astore_1
    //   187: aload 8
    //   189: astore 9
    //   191: aload_1
    //   192: astore 8
    //   194: aload 9
    //   196: astore_1
    //   197: lload 4
    //   199: invokestatic 146	com/google/android/gms/ads/internal/zzr:zzbG	()Lcom/google/android/gms/internal/zzmq;
    //   202: invokeinterface 152 1 0
    //   207: lload 6
    //   209: lsub
    //   210: lsub
    //   211: lconst_0
    //   212: invokestatic 171	java/lang/Math:max	(JJ)J
    //   215: lstore 4
    //   217: aload 8
    //   219: astore 9
    //   221: goto -144 -> 77
    //   224: astore_1
    //   225: aload 9
    //   227: monitorexit
    //   228: aload_1
    //   229: athrow
    //   230: ldc2_w 172
    //   233: lstore 4
    //   235: goto -169 -> 66
    //   238: aload 10
    //   240: lload 4
    //   242: getstatic 179	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   245: invokeinterface 182 4 0
    //   250: checkcast 92	com/google/android/gms/internal/zzes
    //   253: astore 8
    //   255: goto -117 -> 138
    //   258: astore 8
    //   260: ldc 123
    //   262: aload 8
    //   264: invokestatic 128	com/google/android/gms/internal/zzin:zzd	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   267: lload 4
    //   269: invokestatic 146	com/google/android/gms/ads/internal/zzr:zzbG	()Lcom/google/android/gms/internal/zzmq;
    //   272: invokeinterface 152 1 0
    //   277: lload 6
    //   279: lsub
    //   280: lsub
    //   281: lconst_0
    //   282: invokestatic 171	java/lang/Math:max	(JJ)J
    //   285: lstore 4
    //   287: goto -210 -> 77
    //   290: astore_1
    //   291: lload 4
    //   293: invokestatic 146	com/google/android/gms/ads/internal/zzr:zzbG	()Lcom/google/android/gms/internal/zzmq;
    //   296: invokeinterface 152 1 0
    //   301: lload 6
    //   303: lsub
    //   304: lsub
    //   305: lconst_0
    //   306: invokestatic 171	java/lang/Math:max	(JJ)J
    //   309: pop2
    //   310: aload_1
    //   311: athrow
    //   312: aload_0
    //   313: aload 9
    //   315: invokespecial 121	com/google/android/gms/internal/zzeu:zza	(Lcom/google/android/gms/internal/zzjg;)V
    //   318: aload_1
    //   319: astore 8
    //   321: aload_1
    //   322: ifnonnull -293 -> 29
    //   325: new 92	com/google/android/gms/internal/zzes
    //   328: dup
    //   329: iconst_1
    //   330: invokespecial 95	com/google/android/gms/internal/zzes:<init>	(I)V
    //   333: areturn
    //   334: astore 8
    //   336: goto -76 -> 260
    //   339: astore 8
    //   341: goto -81 -> 260
    //   344: astore 8
    //   346: goto -86 -> 260
    //   349: aload 9
    //   351: astore 8
    //   353: goto -156 -> 197
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	356	0	this	zzeu
    //   0	356	1	paramList	List
    //   36	148	2	i	int
    //   181	2	3	j	int
    //   64	228	4	l1	long
    //   107	195	6	l2	long
    //   24	230	8	localObject1	Object
    //   258	5	8	localRemoteException	android.os.RemoteException
    //   319	1	8	localList	List
    //   334	1	8	localInterruptedException	InterruptedException
    //   339	1	8	localExecutionException	ExecutionException
    //   344	1	8	localTimeoutException	java.util.concurrent.TimeoutException
    //   351	1	8	localObject2	Object
    //   4	346	9	localObject3	Object
    //   97	142	10	localzzjg	zzjg
    //   72	16	11	localIterator	Iterator
    //   156	19	12	localzzfa	zzfa
    // Exception table:
    //   from	to	target	type
    //   9	29	224	finally
    //   116	138	258	android/os/RemoteException
    //   143	158	258	android/os/RemoteException
    //   163	182	258	android/os/RemoteException
    //   238	255	258	android/os/RemoteException
    //   116	138	290	finally
    //   143	158	290	finally
    //   163	182	290	finally
    //   238	255	290	finally
    //   260	267	290	finally
    //   116	138	334	java/lang/InterruptedException
    //   143	158	334	java/lang/InterruptedException
    //   163	182	334	java/lang/InterruptedException
    //   238	255	334	java/lang/InterruptedException
    //   116	138	339	java/util/concurrent/ExecutionException
    //   143	158	339	java/util/concurrent/ExecutionException
    //   163	182	339	java/util/concurrent/ExecutionException
    //   238	255	339	java/util/concurrent/ExecutionException
    //   116	138	344	java/util/concurrent/TimeoutException
    //   143	158	344	java/util/concurrent/TimeoutException
    //   163	182	344	java/util/concurrent/TimeoutException
    //   238	255	344	java/util/concurrent/TimeoutException
  }
  
  public void cancel()
  {
    synchronized (zzpV)
    {
      zzCy = true;
      Iterator localIterator = zzCz.values().iterator();
      if (localIterator.hasNext()) {
        ((zzer)localIterator.next()).cancel();
      }
    }
  }
  
  public zzes zzc(List paramList)
  {
    zzin.zzaI("Starting mediation.");
    ExecutorService localExecutorService = Executors.newCachedThreadPool();
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      zzen localzzen = (zzen)paramList.next();
      zzin.zzaJ("Trying mediation network: " + zzBA);
      Iterator localIterator = zzBB.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (String)localIterator.next();
        localObject = new zzer(mContext, (String)localObject, zzpn, zzCf, localzzen, zzCu.zzHt, zzCu.zzrp, zzCu.zzrl, zzsA, zzuS, zzCu.zzrD, zzCu.zzrH);
        zzjg localzzjg = zziq.zza(localExecutorService, new zzeu.1(this, (zzer)localObject));
        zzCz.put(localzzjg, localObject);
        localArrayList.add(localzzjg);
      }
    }
    switch (zzCx)
    {
    default: 
      return zzd(localArrayList);
    }
    return zze(localArrayList);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzeu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */