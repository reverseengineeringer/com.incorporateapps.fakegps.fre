package com.google.android.gms.internal;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

class zzs$zza
{
  public static final boolean zzak = zzs.DEBUG;
  private final List zzal = new ArrayList();
  private boolean zzam = false;
  
  private long zzx()
  {
    if (zzal.size() == 0) {
      return 0L;
    }
    long l = zzal.get(0)).time;
    return zzal.get(zzal.size() - 1)).time - l;
  }
  
  protected void finalize()
  {
    if (!zzam)
    {
      zzd("Request on the loose");
      zzs.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
  }
  
  public void zza(String paramString, long paramLong)
  {
    try
    {
      if (zzam) {
        throw new IllegalStateException("Marker added to finished log");
      }
    }
    finally {}
    zzal.add(new zzs.zza.zza(paramString, paramLong, SystemClock.elapsedRealtime()));
  }
  
  /* Error */
  public void zzd(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield 29	com/google/android/gms/internal/zzs$zza:zzam	Z
    //   7: aload_0
    //   8: invokespecial 82	com/google/android/gms/internal/zzs$zza:zzx	()J
    //   11: lstore 4
    //   13: lload 4
    //   15: lconst_0
    //   16: lcmp
    //   17: ifgt +6 -> 23
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: aload_0
    //   24: getfield 27	com/google/android/gms/internal/zzs$zza:zzal	Ljava/util/List;
    //   27: iconst_0
    //   28: invokeinterface 41 2 0
    //   33: checkcast 43	com/google/android/gms/internal/zzs$zza$zza
    //   36: getfield 47	com/google/android/gms/internal/zzs$zza$zza:time	J
    //   39: lstore_2
    //   40: ldc 84
    //   42: iconst_2
    //   43: anewarray 4	java/lang/Object
    //   46: dup
    //   47: iconst_0
    //   48: lload 4
    //   50: invokestatic 90	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   53: aastore
    //   54: dup
    //   55: iconst_1
    //   56: aload_1
    //   57: aastore
    //   58: invokestatic 93	com/google/android/gms/internal/zzs:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   61: aload_0
    //   62: getfield 27	com/google/android/gms/internal/zzs$zza:zzal	Ljava/util/List;
    //   65: invokeinterface 97 1 0
    //   70: astore_1
    //   71: aload_1
    //   72: invokeinterface 103 1 0
    //   77: ifeq -57 -> 20
    //   80: aload_1
    //   81: invokeinterface 107 1 0
    //   86: checkcast 43	com/google/android/gms/internal/zzs$zza$zza
    //   89: astore 6
    //   91: aload 6
    //   93: getfield 47	com/google/android/gms/internal/zzs$zza$zza:time	J
    //   96: lstore 4
    //   98: ldc 109
    //   100: iconst_3
    //   101: anewarray 4	java/lang/Object
    //   104: dup
    //   105: iconst_0
    //   106: lload 4
    //   108: lload_2
    //   109: lsub
    //   110: invokestatic 90	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   113: aastore
    //   114: dup
    //   115: iconst_1
    //   116: aload 6
    //   118: getfield 112	com/google/android/gms/internal/zzs$zza$zza:zzan	J
    //   121: invokestatic 90	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   124: aastore
    //   125: dup
    //   126: iconst_2
    //   127: aload 6
    //   129: getfield 116	com/google/android/gms/internal/zzs$zza$zza:name	Ljava/lang/String;
    //   132: aastore
    //   133: invokestatic 93	com/google/android/gms/internal/zzs:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: lload 4
    //   138: lstore_2
    //   139: goto -68 -> 71
    //   142: astore_1
    //   143: aload_0
    //   144: monitorexit
    //   145: aload_1
    //   146: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	this	zza
    //   0	147	1	paramString	String
    //   39	100	2	l1	long
    //   11	126	4	l2	long
    //   89	39	6	localzza	zzs.zza.zza
    // Exception table:
    //   from	to	target	type
    //   2	13	142	finally
    //   23	71	142	finally
    //   71	136	142	finally
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzs.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */