package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;
import java.util.HashSet;
import java.util.Set;

public class zzr
{
  private final zzf zzOK;
  private Set zzRA;
  private volatile Boolean zzRy;
  private String zzRz;
  
  protected zzr(zzf paramzzf)
  {
    zzx.zzz(paramzzf);
    zzOK = paramzzf;
  }
  
  public long zzkA()
  {
    return ((Long)zzy.zzRV.get()).longValue();
  }
  
  public long zzkB()
  {
    return ((Long)zzy.zzRW.get()).longValue();
  }
  
  public int zzkC()
  {
    return ((Integer)zzy.zzRX.get()).intValue();
  }
  
  public int zzkD()
  {
    return ((Integer)zzy.zzRY.get()).intValue();
  }
  
  public long zzkE()
  {
    return ((Integer)zzy.zzSl.get()).intValue();
  }
  
  public String zzkF()
  {
    return (String)zzy.zzSa.get();
  }
  
  public String zzkG()
  {
    return (String)zzy.zzRZ.get();
  }
  
  public String zzkH()
  {
    return (String)zzy.zzSb.get();
  }
  
  public String zzkI()
  {
    return (String)zzy.zzSc.get();
  }
  
  public zzm zzkJ()
  {
    return zzm.zzbm((String)zzy.zzSe.get());
  }
  
  public zzo zzkK()
  {
    return zzo.zzbn((String)zzy.zzSf.get());
  }
  
  public Set zzkL()
  {
    String str1 = (String)zzy.zzSk.get();
    String[] arrayOfString;
    HashSet localHashSet;
    int j;
    int i;
    if ((zzRA == null) || (zzRz == null) || (!zzRz.equals(str1)))
    {
      arrayOfString = TextUtils.split(str1, ",");
      localHashSet = new HashSet();
      j = arrayOfString.length;
      i = 0;
    }
    for (;;)
    {
      String str2;
      if (i < j) {
        str2 = arrayOfString[i];
      }
      try
      {
        localHashSet.add(Integer.valueOf(Integer.parseInt(str2)));
        i += 1;
        continue;
        zzRz = str1;
        zzRA = localHashSet;
        return zzRA;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;) {}
      }
    }
  }
  
  public long zzkM()
  {
    return ((Long)zzy.zzSt.get()).longValue();
  }
  
  public long zzkN()
  {
    return ((Long)zzy.zzSu.get()).longValue();
  }
  
  public long zzkO()
  {
    return ((Long)zzy.zzSx.get()).longValue();
  }
  
  public int zzkP()
  {
    return ((Integer)zzy.zzRO.get()).intValue();
  }
  
  public int zzkQ()
  {
    return ((Integer)zzy.zzRQ.get()).intValue();
  }
  
  public String zzkR()
  {
    return "google_analytics_v4.db";
  }
  
  public String zzkS()
  {
    return "google_analytics2_v4.db";
  }
  
  public long zzkT()
  {
    return 86400000L;
  }
  
  public int zzkU()
  {
    return ((Integer)zzy.zzSn.get()).intValue();
  }
  
  public int zzkV()
  {
    return ((Integer)zzy.zzSo.get()).intValue();
  }
  
  public long zzkW()
  {
    return ((Long)zzy.zzSp.get()).longValue();
  }
  
  public long zzkX()
  {
    return ((Long)zzy.zzSy.get()).longValue();
  }
  
  public boolean zzkr()
  {
    return zzd.zzakE;
  }
  
  /* Error */
  public boolean zzks()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 203	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   4: ifnonnull +129 -> 133
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 203	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   13: ifnonnull +118 -> 131
    //   16: aload_0
    //   17: getfield 25	com/google/android/gms/analytics/internal/zzr:zzOK	Lcom/google/android/gms/analytics/internal/zzf;
    //   20: invokevirtual 209	com/google/android/gms/analytics/internal/zzf:getContext	()Landroid/content/Context;
    //   23: invokevirtual 215	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   26: astore_3
    //   27: aload_0
    //   28: getfield 25	com/google/android/gms/analytics/internal/zzr:zzOK	Lcom/google/android/gms/analytics/internal/zzf;
    //   31: invokevirtual 209	com/google/android/gms/analytics/internal/zzf:getContext	()Landroid/content/Context;
    //   34: invokestatic 220	android/os/Process:myPid	()I
    //   37: invokestatic 226	com/google/android/gms/internal/zznf:zzi	(Landroid/content/Context;I)Ljava/lang/String;
    //   40: astore_2
    //   41: aload_3
    //   42: ifnull +30 -> 72
    //   45: aload_3
    //   46: getfield 231	android/content/pm/ApplicationInfo:processName	Ljava/lang/String;
    //   49: astore_3
    //   50: aload_3
    //   51: ifnull +90 -> 141
    //   54: aload_3
    //   55: aload_2
    //   56: invokevirtual 123	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   59: ifeq +82 -> 141
    //   62: iconst_1
    //   63: istore_1
    //   64: aload_0
    //   65: iload_1
    //   66: invokestatic 236	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   69: putfield 203	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   72: aload_0
    //   73: getfield 203	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   76: ifnull +13 -> 89
    //   79: aload_0
    //   80: getfield 203	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   83: invokevirtual 239	java/lang/Boolean:booleanValue	()Z
    //   86: ifne +19 -> 105
    //   89: ldc -15
    //   91: aload_2
    //   92: invokevirtual 123	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   95: ifeq +10 -> 105
    //   98: aload_0
    //   99: getstatic 244	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   102: putfield 203	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   105: aload_0
    //   106: getfield 203	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   109: ifnonnull +22 -> 131
    //   112: aload_0
    //   113: getstatic 244	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   116: putfield 203	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   119: aload_0
    //   120: getfield 25	com/google/android/gms/analytics/internal/zzr:zzOK	Lcom/google/android/gms/analytics/internal/zzf;
    //   123: invokevirtual 248	com/google/android/gms/analytics/internal/zzf:zzjm	()Lcom/google/android/gms/analytics/internal/zzaf;
    //   126: ldc -6
    //   128: invokevirtual 256	com/google/android/gms/analytics/internal/zzaf:zzbh	(Ljava/lang/String;)V
    //   131: aload_0
    //   132: monitorexit
    //   133: aload_0
    //   134: getfield 203	com/google/android/gms/analytics/internal/zzr:zzRy	Ljava/lang/Boolean;
    //   137: invokevirtual 239	java/lang/Boolean:booleanValue	()Z
    //   140: ireturn
    //   141: iconst_0
    //   142: istore_1
    //   143: goto -79 -> 64
    //   146: astore_2
    //   147: aload_0
    //   148: monitorexit
    //   149: aload_2
    //   150: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	151	0	this	zzr
    //   63	80	1	bool	boolean
    //   40	52	2	str	String
    //   146	4	2	localObject1	Object
    //   26	29	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   9	41	146	finally
    //   45	50	146	finally
    //   54	62	146	finally
    //   64	72	146	finally
    //   72	89	146	finally
    //   89	105	146	finally
    //   105	131	146	finally
    //   131	133	146	finally
  }
  
  public boolean zzkt()
  {
    return ((Boolean)zzy.zzRK.get()).booleanValue();
  }
  
  public int zzku()
  {
    return ((Integer)zzy.zzSd.get()).intValue();
  }
  
  public int zzkv()
  {
    return ((Integer)zzy.zzSh.get()).intValue();
  }
  
  public int zzkw()
  {
    return ((Integer)zzy.zzSi.get()).intValue();
  }
  
  public int zzkx()
  {
    return ((Integer)zzy.zzSj.get()).intValue();
  }
  
  public long zzky()
  {
    return ((Long)zzy.zzRS.get()).longValue();
  }
  
  public long zzkz()
  {
    return ((Long)zzy.zzRR.get()).longValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */