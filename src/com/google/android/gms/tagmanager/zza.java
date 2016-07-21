package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzmt;

public class zza
{
  private static zza zzbhA;
  private static Object zzbhz = new Object();
  private volatile boolean mClosed = false;
  private final Context mContext;
  private final Thread zzLM;
  private volatile AdvertisingIdClient.Info zzPW;
  private volatile long zzbht = 900000L;
  private volatile long zzbhu = 30000L;
  private volatile long zzbhv;
  private volatile long zzbhw;
  private final Object zzbhx = new Object();
  private zza.zza zzbhy = new zza.1(this);
  private final zzmq zzqW;
  
  private zza(Context paramContext)
  {
    this(paramContext, null, zzmt.zzsc());
  }
  
  public zza(Context paramContext, zza.zza paramzza, zzmq paramzzmq)
  {
    zzqW = paramzzmq;
    if (paramContext != null) {}
    for (mContext = paramContext.getApplicationContext();; mContext = paramContext)
    {
      if (paramzza != null) {
        zzbhy = paramzza;
      }
      zzbhv = zzqW.currentTimeMillis();
      zzLM = new Thread(new zza.2(this));
      return;
    }
  }
  
  /* Error */
  private void zzFR()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 97	com/google/android/gms/tagmanager/zza:zzFS	()V
    //   6: aload_0
    //   7: ldc2_w 98
    //   10: invokevirtual 103	java/lang/Object:wait	(J)V
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    //   21: astore_1
    //   22: goto -9 -> 13
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	25	0	this	zza
    //   16	4	1	localObject	Object
    //   21	1	1	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   2	13	16	finally
    //   13	15	16	finally
    //   2	13	21	java/lang/InterruptedException
  }
  
  private void zzFS()
  {
    if (zzqW.currentTimeMillis() - zzbhv > zzbhu) {}
    synchronized (zzbhx)
    {
      zzbhx.notify();
      zzbhv = zzqW.currentTimeMillis();
      return;
    }
  }
  
  private void zzFT()
  {
    if (zzqW.currentTimeMillis() - zzbhw > 3600000L) {
      zzPW = null;
    }
  }
  
  /* Error */
  private void zzFU()
  {
    // Byte code:
    //   0: bipush 10
    //   2: invokestatic 120	android/os/Process:setThreadPriority	(I)V
    //   5: aload_0
    //   6: getfield 54	com/google/android/gms/tagmanager/zza:mClosed	Z
    //   9: ifne +90 -> 99
    //   12: aload_0
    //   13: getfield 63	com/google/android/gms/tagmanager/zza:zzbhy	Lcom/google/android/gms/tagmanager/zza$zza;
    //   16: invokeinterface 126 1 0
    //   21: astore_1
    //   22: aload_1
    //   23: ifnull +26 -> 49
    //   26: aload_0
    //   27: aload_1
    //   28: putfield 113	com/google/android/gms/tagmanager/zza:zzPW	Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //   31: aload_0
    //   32: aload_0
    //   33: getfield 65	com/google/android/gms/tagmanager/zza:zzqW	Lcom/google/android/gms/internal/zzmq;
    //   36: invokeinterface 79 1 0
    //   41: putfield 109	com/google/android/gms/tagmanager/zza:zzbhw	J
    //   44: ldc -128
    //   46: invokestatic 134	com/google/android/gms/tagmanager/zzbg:zzaJ	(Ljava/lang/String;)V
    //   49: aload_0
    //   50: monitorenter
    //   51: aload_0
    //   52: invokevirtual 137	java/lang/Object:notifyAll	()V
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_0
    //   58: getfield 56	com/google/android/gms/tagmanager/zza:zzbhx	Ljava/lang/Object;
    //   61: astore_1
    //   62: aload_1
    //   63: monitorenter
    //   64: aload_0
    //   65: getfield 56	com/google/android/gms/tagmanager/zza:zzbhx	Ljava/lang/Object;
    //   68: aload_0
    //   69: getfield 48	com/google/android/gms/tagmanager/zza:zzbht	J
    //   72: invokevirtual 103	java/lang/Object:wait	(J)V
    //   75: aload_1
    //   76: monitorexit
    //   77: goto -72 -> 5
    //   80: astore_2
    //   81: aload_1
    //   82: monitorexit
    //   83: aload_2
    //   84: athrow
    //   85: astore_1
    //   86: ldc -117
    //   88: invokestatic 134	com/google/android/gms/tagmanager/zzbg:zzaJ	(Ljava/lang/String;)V
    //   91: goto -86 -> 5
    //   94: astore_1
    //   95: aload_0
    //   96: monitorexit
    //   97: aload_1
    //   98: athrow
    //   99: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	zza
    //   85	1	1	localInterruptedException	InterruptedException
    //   94	4	1	localObject2	Object
    //   80	4	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   64	77	80	finally
    //   57	64	85	java/lang/InterruptedException
    //   81	85	85	java/lang/InterruptedException
    //   51	57	94	finally
  }
  
  public static zza zzaW(Context paramContext)
  {
    if (zzbhA == null) {}
    synchronized (zzbhz)
    {
      if (zzbhA == null)
      {
        paramContext = new zza(paramContext);
        zzbhA = paramContext;
        paramContext.start();
      }
      return zzbhA;
    }
  }
  
  public boolean isLimitAdTrackingEnabled()
  {
    if (zzPW == null) {
      zzFR();
    }
    for (;;)
    {
      zzFT();
      if (zzPW != null) {
        break;
      }
      return true;
      zzFS();
    }
    return zzPW.isLimitAdTrackingEnabled();
  }
  
  public void start()
  {
    zzLM.start();
  }
  
  public String zzFQ()
  {
    if (zzPW == null) {
      zzFR();
    }
    for (;;)
    {
      zzFT();
      if (zzPW != null) {
        break;
      }
      return null;
      zzFS();
    }
    return zzPW.getId();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */