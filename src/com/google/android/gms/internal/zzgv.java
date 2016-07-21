package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzp;
import java.util.concurrent.Future;

public class zzgv
  extends zzim
{
  private final zzgw zzGC;
  private Future zzGD;
  private final zzgr.zza zzGc;
  private final zzif.zza zzGd;
  private final AdResponseParcel zzGe;
  private final Object zzpV = new Object();
  
  public zzgv(Context paramContext, zzp paramzzp, zzee paramzzee, zzif.zza paramzza, zzan paramzzan, zzgr.zza paramzza1)
  {
    this(paramzza, paramzza1, new zzgw(paramContext, paramzzp, paramzzee, new zziw(paramContext), paramzzan, paramzza));
  }
  
  zzgv(zzif.zza paramzza, zzgr.zza paramzza1, zzgw paramzzgw)
  {
    zzGd = paramzza;
    zzGe = zzLe;
    zzGc = paramzza1;
    zzGC = paramzzgw;
  }
  
  private zzif zzE(int paramInt)
  {
    return new zzif(zzGd.zzLd.zzHt, null, null, paramInt, null, null, zzGe.orientation, zzGe.zzBU, zzGd.zzLd.zzHw, false, null, null, null, null, null, zzGe.zzHU, zzGd.zzrp, zzGe.zzHS, zzGd.zzKY, zzGe.zzHX, zzGe.zzHY, zzGd.zzKT, null, null, null, null, zzGd.zzLe.zzIm);
  }
  
  public void onStop()
  {
    synchronized (zzpV)
    {
      if (zzGD != null) {
        zzGD.cancel(true);
      }
      return;
    }
  }
  
  /* Error */
  public void zzbr()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 40	com/google/android/gms/internal/zzgv:zzpV	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: aload_0
    //   9: getfield 53	com/google/android/gms/internal/zzgv:zzGC	Lcom/google/android/gms/internal/zzgw;
    //   12: invokestatic 136	com/google/android/gms/internal/zziq:zza	(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/zzjg;
    //   15: putfield 116	com/google/android/gms/internal/zzgv:zzGD	Ljava/util/concurrent/Future;
    //   18: aload_2
    //   19: monitorexit
    //   20: aload_0
    //   21: getfield 116	com/google/android/gms/internal/zzgv:zzGD	Ljava/util/concurrent/Future;
    //   24: ldc2_w 137
    //   27: getstatic 144	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   30: invokeinterface 148 4 0
    //   35: checkcast 57	com/google/android/gms/internal/zzif
    //   38: astore_2
    //   39: bipush -2
    //   41: istore_1
    //   42: aload_2
    //   43: ifnull +73 -> 116
    //   46: getstatic 154	com/google/android/gms/internal/zzir:zzMc	Landroid/os/Handler;
    //   49: new 156	com/google/android/gms/internal/zzgv$1
    //   52: dup
    //   53: aload_0
    //   54: aload_2
    //   55: invokespecial 159	com/google/android/gms/internal/zzgv$1:<init>	(Lcom/google/android/gms/internal/zzgv;Lcom/google/android/gms/internal/zzif;)V
    //   58: invokevirtual 165	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   61: pop
    //   62: return
    //   63: astore_3
    //   64: aload_2
    //   65: monitorexit
    //   66: aload_3
    //   67: athrow
    //   68: astore_2
    //   69: ldc -89
    //   71: invokestatic 173	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   74: aload_0
    //   75: getfield 116	com/google/android/gms/internal/zzgv:zzGD	Ljava/util/concurrent/Future;
    //   78: iconst_1
    //   79: invokeinterface 122 2 0
    //   84: pop
    //   85: iconst_2
    //   86: istore_1
    //   87: aconst_null
    //   88: astore_2
    //   89: goto -47 -> 42
    //   92: astore_2
    //   93: iconst_0
    //   94: istore_1
    //   95: aconst_null
    //   96: astore_2
    //   97: goto -55 -> 42
    //   100: astore_2
    //   101: aconst_null
    //   102: astore_2
    //   103: iconst_m1
    //   104: istore_1
    //   105: goto -63 -> 42
    //   108: astore_2
    //   109: aconst_null
    //   110: astore_2
    //   111: iconst_m1
    //   112: istore_1
    //   113: goto -71 -> 42
    //   116: aload_0
    //   117: iload_1
    //   118: invokespecial 175	com/google/android/gms/internal/zzgv:zzE	(I)Lcom/google/android/gms/internal/zzif;
    //   121: astore_2
    //   122: goto -76 -> 46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	zzgv
    //   41	77	1	i	int
    //   68	1	2	localTimeoutException	java.util.concurrent.TimeoutException
    //   88	1	2	localObject2	Object
    //   92	1	2	localExecutionException	java.util.concurrent.ExecutionException
    //   96	1	2	localObject3	Object
    //   100	1	2	localInterruptedException	InterruptedException
    //   102	1	2	localObject4	Object
    //   108	1	2	localCancellationException	java.util.concurrent.CancellationException
    //   110	12	2	localzzif	zzif
    //   63	4	3	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   7	20	63	finally
    //   0	7	68	java/util/concurrent/TimeoutException
    //   20	39	68	java/util/concurrent/TimeoutException
    //   64	68	68	java/util/concurrent/TimeoutException
    //   0	7	92	java/util/concurrent/ExecutionException
    //   20	39	92	java/util/concurrent/ExecutionException
    //   64	68	92	java/util/concurrent/ExecutionException
    //   0	7	100	java/lang/InterruptedException
    //   20	39	100	java/lang/InterruptedException
    //   64	68	100	java/lang/InterruptedException
    //   0	7	108	java/util/concurrent/CancellationException
    //   20	39	108	java/util/concurrent/CancellationException
    //   64	68	108	java/util/concurrent/CancellationException
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */