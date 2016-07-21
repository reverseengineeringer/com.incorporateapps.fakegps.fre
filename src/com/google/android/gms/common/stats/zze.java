package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;

public class zze
{
  private final long zzanN;
  private final int zzanO;
  private final SimpleArrayMap zzanP;
  
  public zze()
  {
    zzanN = 60000L;
    zzanO = 10;
    zzanP = new SimpleArrayMap(10);
  }
  
  public zze(int paramInt, long paramLong)
  {
    zzanN = paramLong;
    zzanO = paramInt;
    zzanP = new SimpleArrayMap();
  }
  
  private void zzb(long paramLong1, long paramLong2)
  {
    int i = zzanP.size() - 1;
    while (i >= 0)
    {
      if (paramLong2 - ((Long)zzanP.valueAt(i)).longValue() > paramLong1) {
        zzanP.removeAt(i);
      }
      i -= 1;
    }
  }
  
  public Long zzcS(String paramString)
  {
    long l2 = SystemClock.elapsedRealtime();
    long l1 = zzanN;
    try
    {
      while (zzanP.size() >= zzanO)
      {
        zzb(l1, l2);
        l1 /= 2L;
        Log.w("ConnectionTracker", "The max capacity " + zzanO + " is not enough. Current durationThreshold is: " + l1);
      }
      paramString = (Long)zzanP.put(paramString, Long.valueOf(l2));
    }
    finally {}
    return paramString;
  }
  
  /* Error */
  public boolean zzcT(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 27	com/google/android/gms/common/stats/zze:zzanP	Landroid/support/v4/util/SimpleArrayMap;
    //   6: aload_1
    //   7: invokevirtual 105	android/support/v4/util/SimpleArrayMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   10: ifnull +9 -> 19
    //   13: iconst_1
    //   14: istore_2
    //   15: aload_0
    //   16: monitorexit
    //   17: iload_2
    //   18: ireturn
    //   19: iconst_0
    //   20: istore_2
    //   21: goto -6 -> 15
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	29	0	this	zze
    //   0	29	1	paramString	String
    //   14	7	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	13	24	finally
    //   15	17	24	finally
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.stats.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */