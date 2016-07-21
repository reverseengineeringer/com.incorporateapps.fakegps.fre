package com.google.android.gms.tagmanager;

import android.os.Looper;
import com.google.android.gms.common.api.Status;

class zzo
  implements ContainerHolder
{
  private Status zzUX;
  private final Looper zzagr;
  private boolean zzapK;
  private Container zzbhU;
  private Container zzbhV;
  private zzo.zzb zzbhW;
  private zzo.zza zzbhX;
  private TagManager zzbhY;
  
  public zzo(Status paramStatus)
  {
    zzUX = paramStatus;
    zzagr = null;
  }
  
  public zzo(TagManager paramTagManager, Looper paramLooper, Container paramContainer, zzo.zza paramzza)
  {
    zzbhY = paramTagManager;
    if (paramLooper != null) {}
    for (;;)
    {
      zzagr = paramLooper;
      zzbhU = paramContainer;
      zzbhX = paramzza;
      zzUX = Status.zzagC;
      paramTagManager.zza(this);
      return;
      paramLooper = Looper.getMainLooper();
    }
  }
  
  private void zzGe()
  {
    if (zzbhW != null) {
      zzbhW.zzfU(zzbhV.zzGb());
    }
  }
  
  /* Error */
  public Container getContainer()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 76	com/google/android/gms/tagmanager/zzo:zzapK	Z
    //   8: ifeq +12 -> 20
    //   11: ldc 78
    //   13: invokestatic 83	com/google/android/gms/tagmanager/zzbg:e	(Ljava/lang/String;)V
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: areturn
    //   20: aload_0
    //   21: getfield 60	com/google/android/gms/tagmanager/zzo:zzbhV	Lcom/google/android/gms/tagmanager/Container;
    //   24: ifnull +16 -> 40
    //   27: aload_0
    //   28: aload_0
    //   29: getfield 60	com/google/android/gms/tagmanager/zzo:zzbhV	Lcom/google/android/gms/tagmanager/Container;
    //   32: putfield 36	com/google/android/gms/tagmanager/zzo:zzbhU	Lcom/google/android/gms/tagmanager/Container;
    //   35: aload_0
    //   36: aconst_null
    //   37: putfield 60	com/google/android/gms/tagmanager/zzo:zzbhV	Lcom/google/android/gms/tagmanager/Container;
    //   40: aload_0
    //   41: getfield 36	com/google/android/gms/tagmanager/zzo:zzbhU	Lcom/google/android/gms/tagmanager/Container;
    //   44: astore_1
    //   45: goto -29 -> 16
    //   48: astore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_1
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	zzo
    //   1	44	1	localContainer	Container
    //   48	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	16	48	finally
    //   20	40	48	finally
    //   40	45	48	finally
  }
  
  String getContainerId()
  {
    if (zzapK)
    {
      zzbg.e("getContainerId called on a released ContainerHolder.");
      return "";
    }
    return zzbhU.getContainerId();
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  /* Error */
  public void refresh()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 76	com/google/android/gms/tagmanager/zzo:zzapK	Z
    //   6: ifeq +11 -> 17
    //   9: ldc 95
    //   11: invokestatic 83	com/google/android/gms/tagmanager/zzbg:e	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: getfield 38	com/google/android/gms/tagmanager/zzo:zzbhX	Lcom/google/android/gms/tagmanager/zzo$zza;
    //   21: invokeinterface 100 1 0
    //   26: goto -12 -> 14
    //   29: astore_1
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_1
    //   33: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	zzo
    //   29	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	29	finally
    //   17	26	29	finally
  }
  
  /* Error */
  public void release()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 76	com/google/android/gms/tagmanager/zzo:zzapK	Z
    //   6: ifeq +11 -> 17
    //   9: ldc 103
    //   11: invokestatic 83	com/google/android/gms/tagmanager/zzbg:e	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: iconst_1
    //   19: putfield 76	com/google/android/gms/tagmanager/zzo:zzapK	Z
    //   22: aload_0
    //   23: getfield 34	com/google/android/gms/tagmanager/zzo:zzbhY	Lcom/google/android/gms/tagmanager/TagManager;
    //   26: aload_0
    //   27: invokevirtual 107	com/google/android/gms/tagmanager/TagManager:zzb	(Lcom/google/android/gms/tagmanager/zzo;)Z
    //   30: pop
    //   31: aload_0
    //   32: getfield 36	com/google/android/gms/tagmanager/zzo:zzbhU	Lcom/google/android/gms/tagmanager/Container;
    //   35: invokevirtual 109	com/google/android/gms/tagmanager/Container:release	()V
    //   38: aload_0
    //   39: aconst_null
    //   40: putfield 36	com/google/android/gms/tagmanager/zzo:zzbhU	Lcom/google/android/gms/tagmanager/Container;
    //   43: aload_0
    //   44: aconst_null
    //   45: putfield 60	com/google/android/gms/tagmanager/zzo:zzbhV	Lcom/google/android/gms/tagmanager/Container;
    //   48: aload_0
    //   49: aconst_null
    //   50: putfield 38	com/google/android/gms/tagmanager/zzo:zzbhX	Lcom/google/android/gms/tagmanager/zzo$zza;
    //   53: aload_0
    //   54: aconst_null
    //   55: putfield 58	com/google/android/gms/tagmanager/zzo:zzbhW	Lcom/google/android/gms/tagmanager/zzo$zzb;
    //   58: goto -44 -> 14
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	zzo
    //   61	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	61	finally
    //   17	58	61	finally
  }
  
  public void setContainerAvailableListener(ContainerHolder.ContainerAvailableListener paramContainerAvailableListener)
  {
    for (;;)
    {
      try
      {
        if (zzapK)
        {
          zzbg.e("ContainerHolder is released.");
          return;
        }
        if (paramContainerAvailableListener == null)
        {
          zzbhW = null;
          continue;
        }
        zzbhW = new zzo.zzb(this, paramContainerAvailableListener, zzagr);
      }
      finally {}
      if (zzbhV != null) {
        zzGe();
      }
    }
  }
  
  String zzGd()
  {
    if (zzapK)
    {
      zzbg.e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
      return "";
    }
    return zzbhX.zzGd();
  }
  
  public void zza(Container paramContainer)
  {
    for (;;)
    {
      try
      {
        boolean bool = zzapK;
        if (bool) {
          return;
        }
        if (paramContainer == null)
        {
          zzbg.e("Unexpected null container.");
          continue;
        }
        zzbhV = paramContainer;
      }
      finally {}
      zzGe();
    }
  }
  
  /* Error */
  public void zzfR(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 76	com/google/android/gms/tagmanager/zzo:zzapK	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 36	com/google/android/gms/tagmanager/zzo:zzbhU	Lcom/google/android/gms/tagmanager/Container;
    //   18: aload_1
    //   19: invokevirtual 127	com/google/android/gms/tagmanager/Container:zzfR	(Ljava/lang/String;)V
    //   22: goto -11 -> 11
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	30	0	this	zzo
    //   0	30	1	paramString	String
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	25	finally
    //   14	22	25	finally
  }
  
  void zzfT(String paramString)
  {
    if (zzapK)
    {
      zzbg.e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
      return;
    }
    zzbhX.zzfT(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */