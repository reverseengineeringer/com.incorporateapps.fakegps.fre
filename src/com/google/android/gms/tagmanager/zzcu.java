package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;

class zzcu
  extends zzct
{
  private static final Object zzbkP = new Object();
  private static zzcu zzbla;
  private boolean connected = true;
  private Handler handler;
  private Context zzbkQ;
  private zzau zzbkR;
  private volatile zzas zzbkS;
  private int zzbkT = 1800000;
  private boolean zzbkU = true;
  private boolean zzbkV = false;
  private boolean zzbkW = true;
  private zzav zzbkX = new zzcu.1(this);
  private zzbl zzbkY;
  private boolean zzbkZ = false;
  
  public static zzcu zzHo()
  {
    if (zzbla == null) {
      zzbla = new zzcu();
    }
    return zzbla;
  }
  
  private void zzHp()
  {
    zzbkY = new zzbl(this);
    zzbkY.zzba(zzbkQ);
  }
  
  private void zzHq()
  {
    handler = new Handler(zzbkQ.getMainLooper(), new zzcu.2(this));
    if (zzbkT > 0) {
      handler.sendMessageDelayed(handler.obtainMessage(1, zzbkP), zzbkT);
    }
  }
  
  /* Error */
  public void dispatch()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 46	com/google/android/gms/tagmanager/zzcu:zzbkV	Z
    //   6: ifne +16 -> 22
    //   9: ldc 119
    //   11: invokestatic 125	com/google/android/gms/tagmanager/zzbg:v	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 44	com/google/android/gms/tagmanager/zzcu:zzbkU	Z
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: getfield 127	com/google/android/gms/tagmanager/zzcu:zzbkS	Lcom/google/android/gms/tagmanager/zzas;
    //   26: new 129	com/google/android/gms/tagmanager/zzcu$3
    //   29: dup
    //   30: aload_0
    //   31: invokespecial 130	com/google/android/gms/tagmanager/zzcu$3:<init>	(Lcom/google/android/gms/tagmanager/zzcu;)V
    //   34: invokeinterface 136 2 0
    //   39: goto -20 -> 19
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	zzcu
    //   42	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	19	42	finally
    //   22	39	42	finally
  }
  
  zzau zzHr()
  {
    try
    {
      if (zzbkR != null) {
        break label50;
      }
      if (zzbkQ == null) {
        throw new IllegalStateException("Cant get a store unless we have a context");
      }
    }
    finally {}
    zzbkR = new zzby(zzbkX, zzbkQ);
    label50:
    if (handler == null) {
      zzHq();
    }
    zzbkV = true;
    if (zzbkU)
    {
      dispatch();
      zzbkU = false;
    }
    if ((zzbkY == null) && (zzbkW)) {
      zzHp();
    }
    zzau localzzau = zzbkR;
    return localzzau;
  }
  
  /* Error */
  void zza(Context paramContext, zzas paramzzas)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 74	com/google/android/gms/tagmanager/zzcu:zzbkQ	Landroid/content/Context;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: aload_1
    //   16: invokevirtual 160	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   19: putfield 74	com/google/android/gms/tagmanager/zzcu:zzbkQ	Landroid/content/Context;
    //   22: aload_0
    //   23: getfield 127	com/google/android/gms/tagmanager/zzcu:zzbkS	Lcom/google/android/gms/tagmanager/zzas;
    //   26: ifnonnull -15 -> 11
    //   29: aload_0
    //   30: aload_2
    //   31: putfield 127	com/google/android/gms/tagmanager/zzcu:zzbkS	Lcom/google/android/gms/tagmanager/zzas;
    //   34: goto -23 -> 11
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	zzcu
    //   0	42	1	paramContext	Context
    //   0	42	2	paramzzas	zzas
    //   6	2	3	localContext	Context
    // Exception table:
    //   from	to	target	type
    //   2	7	37	finally
    //   14	34	37	finally
  }
  
  public void zzay(boolean paramBoolean)
  {
    try
    {
      zzd(zzbkZ, paramBoolean);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  void zzd(boolean paramBoolean1, boolean paramBoolean2)
  {
    for (;;)
    {
      StringBuilder localStringBuilder;
      String str1;
      try
      {
        if (zzbkZ == paramBoolean1)
        {
          boolean bool = connected;
          if (bool == paramBoolean2) {
            return;
          }
        }
        if (((paramBoolean1) || (!paramBoolean2)) && (zzbkT > 0)) {
          handler.removeMessages(1, zzbkP);
        }
        if ((!paramBoolean1) && (paramBoolean2) && (zzbkT > 0)) {
          handler.sendMessageDelayed(handler.obtainMessage(1, zzbkP), zzbkT);
        }
        localStringBuilder = new StringBuilder("PowerSaveMode ");
        if (paramBoolean1) {
          break label150;
        }
        if (paramBoolean2) {
          break label143;
        }
      }
      finally {}
      zzbg.v(str1);
      zzbkZ = paramBoolean1;
      connected = paramBoolean2;
      continue;
      label143:
      String str2 = "terminated.";
      continue;
      label150:
      str2 = "initiated.";
    }
  }
  
  public void zzjg()
  {
    try
    {
      if ((!zzbkZ) && (connected) && (zzbkT > 0))
      {
        handler.removeMessages(1, zzbkP);
        handler.sendMessage(handler.obtainMessage(1, zzbkP));
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */