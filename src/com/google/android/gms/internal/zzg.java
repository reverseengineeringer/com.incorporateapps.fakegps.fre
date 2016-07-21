package com.google.android.gms.internal;

import android.net.TrafficStats;
import android.os.Build.VERSION;
import java.util.concurrent.BlockingQueue;

public class zzg
  extends Thread
{
  private final zzb zzj;
  private final zzn zzk;
  private volatile boolean zzl = false;
  private final BlockingQueue zzy;
  private final zzf zzz;
  
  public zzg(BlockingQueue paramBlockingQueue, zzf paramzzf, zzb paramzzb, zzn paramzzn)
  {
    zzy = paramBlockingQueue;
    zzz = paramzzf;
    zzj = paramzzb;
    zzk = paramzzn;
  }
  
  private void zzb(zzk paramzzk)
  {
    if (Build.VERSION.SDK_INT >= 14) {
      TrafficStats.setThreadStatsTag(paramzzk.zzg());
    }
  }
  
  private void zzb(zzk paramzzk, zzr paramzzr)
  {
    paramzzr = paramzzk.zzb(paramzzr);
    zzk.zza(paramzzk, paramzzr);
  }
  
  public void quit()
  {
    zzl = true;
    interrupt();
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: bipush 10
    //   2: invokestatic 75	android/os/Process:setThreadPriority	(I)V
    //   5: invokestatic 81	android/os/SystemClock:elapsedRealtime	()J
    //   8: lstore_1
    //   9: aload_0
    //   10: getfield 23	com/google/android/gms/internal/zzg:zzy	Ljava/util/concurrent/BlockingQueue;
    //   13: invokeinterface 87 1 0
    //   18: checkcast 40	com/google/android/gms/internal/zzk
    //   21: astore_3
    //   22: aload_3
    //   23: ldc 89
    //   25: invokevirtual 93	com/google/android/gms/internal/zzk:zzc	(Ljava/lang/String;)V
    //   28: aload_3
    //   29: invokevirtual 97	com/google/android/gms/internal/zzk:isCanceled	()Z
    //   32: ifeq +43 -> 75
    //   35: aload_3
    //   36: ldc 99
    //   38: invokevirtual 102	com/google/android/gms/internal/zzk:zzd	(Ljava/lang/String;)V
    //   41: goto -36 -> 5
    //   44: astore 4
    //   46: aload 4
    //   48: invokestatic 81	android/os/SystemClock:elapsedRealtime	()J
    //   51: lload_1
    //   52: lsub
    //   53: invokevirtual 105	com/google/android/gms/internal/zzr:zza	(J)V
    //   56: aload_0
    //   57: aload_3
    //   58: aload 4
    //   60: invokespecial 107	com/google/android/gms/internal/zzg:zzb	(Lcom/google/android/gms/internal/zzk;Lcom/google/android/gms/internal/zzr;)V
    //   63: goto -58 -> 5
    //   66: astore_3
    //   67: aload_0
    //   68: getfield 21	com/google/android/gms/internal/zzg:zzl	Z
    //   71: ifeq -66 -> 5
    //   74: return
    //   75: aload_0
    //   76: aload_3
    //   77: invokespecial 109	com/google/android/gms/internal/zzg:zzb	(Lcom/google/android/gms/internal/zzk;)V
    //   80: aload_0
    //   81: getfield 25	com/google/android/gms/internal/zzg:zzz	Lcom/google/android/gms/internal/zzf;
    //   84: aload_3
    //   85: invokeinterface 114 2 0
    //   90: astore 4
    //   92: aload_3
    //   93: ldc 116
    //   95: invokevirtual 93	com/google/android/gms/internal/zzk:zzc	(Ljava/lang/String;)V
    //   98: aload 4
    //   100: getfield 121	com/google/android/gms/internal/zzi:zzB	Z
    //   103: ifeq +76 -> 179
    //   106: aload_3
    //   107: invokevirtual 124	com/google/android/gms/internal/zzk:zzw	()Z
    //   110: ifeq +69 -> 179
    //   113: aload_3
    //   114: ldc 126
    //   116: invokevirtual 102	com/google/android/gms/internal/zzk:zzd	(Ljava/lang/String;)V
    //   119: goto -114 -> 5
    //   122: astore 4
    //   124: aload 4
    //   126: ldc -128
    //   128: iconst_1
    //   129: anewarray 130	java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: aload 4
    //   136: invokevirtual 134	java/lang/Exception:toString	()Ljava/lang/String;
    //   139: aastore
    //   140: invokestatic 139	com/google/android/gms/internal/zzs:zza	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: new 68	com/google/android/gms/internal/zzr
    //   146: dup
    //   147: aload 4
    //   149: invokespecial 142	com/google/android/gms/internal/zzr:<init>	(Ljava/lang/Throwable;)V
    //   152: astore 4
    //   154: aload 4
    //   156: invokestatic 81	android/os/SystemClock:elapsedRealtime	()J
    //   159: lload_1
    //   160: lsub
    //   161: invokevirtual 105	com/google/android/gms/internal/zzr:zza	(J)V
    //   164: aload_0
    //   165: getfield 29	com/google/android/gms/internal/zzg:zzk	Lcom/google/android/gms/internal/zzn;
    //   168: aload_3
    //   169: aload 4
    //   171: invokeinterface 59 3 0
    //   176: goto -171 -> 5
    //   179: aload_3
    //   180: aload 4
    //   182: invokevirtual 145	com/google/android/gms/internal/zzk:zza	(Lcom/google/android/gms/internal/zzi;)Lcom/google/android/gms/internal/zzm;
    //   185: astore 4
    //   187: aload_3
    //   188: ldc -109
    //   190: invokevirtual 93	com/google/android/gms/internal/zzk:zzc	(Ljava/lang/String;)V
    //   193: aload_3
    //   194: invokevirtual 150	com/google/android/gms/internal/zzk:zzr	()Z
    //   197: ifeq +35 -> 232
    //   200: aload 4
    //   202: getfield 156	com/google/android/gms/internal/zzm:zzag	Lcom/google/android/gms/internal/zzb$zza;
    //   205: ifnull +27 -> 232
    //   208: aload_0
    //   209: getfield 27	com/google/android/gms/internal/zzg:zzj	Lcom/google/android/gms/internal/zzb;
    //   212: aload_3
    //   213: invokevirtual 159	com/google/android/gms/internal/zzk:zzh	()Ljava/lang/String;
    //   216: aload 4
    //   218: getfield 156	com/google/android/gms/internal/zzm:zzag	Lcom/google/android/gms/internal/zzb$zza;
    //   221: invokeinterface 164 3 0
    //   226: aload_3
    //   227: ldc -90
    //   229: invokevirtual 93	com/google/android/gms/internal/zzk:zzc	(Ljava/lang/String;)V
    //   232: aload_3
    //   233: invokevirtual 169	com/google/android/gms/internal/zzk:zzv	()V
    //   236: aload_0
    //   237: getfield 29	com/google/android/gms/internal/zzg:zzk	Lcom/google/android/gms/internal/zzn;
    //   240: aload_3
    //   241: aload 4
    //   243: invokeinterface 172 3 0
    //   248: goto -243 -> 5
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	251	0	this	zzg
    //   8	152	1	l	long
    //   21	37	3	localzzk	zzk
    //   66	175	3	localInterruptedException	InterruptedException
    //   44	15	4	localzzr	zzr
    //   90	9	4	localzzi	zzi
    //   122	26	4	localException	Exception
    //   152	90	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   22	41	44	com/google/android/gms/internal/zzr
    //   75	119	44	com/google/android/gms/internal/zzr
    //   179	232	44	com/google/android/gms/internal/zzr
    //   232	248	44	com/google/android/gms/internal/zzr
    //   9	22	66	java/lang/InterruptedException
    //   22	41	122	java/lang/Exception
    //   75	119	122	java/lang/Exception
    //   179	232	122	java/lang/Exception
    //   232	248	122	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */