package com.google.android.gms.internal;

final class zzlv$zze
{
  private int mSize = 0;
  
  /* Error */
  public final boolean zza(long paramLong, java.util.concurrent.TimeUnit paramTimeUnit)
  {
    // Byte code:
    //   0: invokestatic 23	java/lang/System:currentTimeMillis	()J
    //   3: lstore 4
    //   5: getstatic 29	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   8: lload_1
    //   9: aload_3
    //   10: invokevirtual 33	java/util/concurrent/TimeUnit:convert	(JLjava/util/concurrent/TimeUnit;)J
    //   13: lstore_1
    //   14: aload_0
    //   15: monitorenter
    //   16: aload_0
    //   17: getfield 12	com/google/android/gms/internal/zzlv$zze:mSize	I
    //   20: ifne +7 -> 27
    //   23: aload_0
    //   24: monitorexit
    //   25: iconst_1
    //   26: ireturn
    //   27: lload_1
    //   28: lconst_0
    //   29: lcmp
    //   30: ifgt +7 -> 37
    //   33: aload_0
    //   34: monitorexit
    //   35: iconst_0
    //   36: ireturn
    //   37: aload_0
    //   38: lload_1
    //   39: invokevirtual 37	java/lang/Object:wait	(J)V
    //   42: lload_1
    //   43: invokestatic 23	java/lang/System:currentTimeMillis	()J
    //   46: lload 4
    //   48: lsub
    //   49: lsub
    //   50: lstore_1
    //   51: goto -35 -> 16
    //   54: astore_3
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_3
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	zze
    //   0	59	1	paramLong	long
    //   0	59	3	paramTimeUnit	java.util.concurrent.TimeUnit
    //   3	44	4	l	long
    // Exception table:
    //   from	to	target	type
    //   16	25	54	finally
    //   37	51	54	finally
    //   55	57	54	finally
  }
  
  public final void zzoH()
  {
    try
    {
      mSize += 1;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zzoI()
  {
    try
    {
      if (mSize == 0) {
        throw new RuntimeException("too many decrements");
      }
    }
    finally {}
    mSize -= 1;
    if (mSize == 0) {
      notifyAll();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlv.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */