package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.util.ArrayList;
import java.util.HashSet;

public class zzhz
  extends zzim
  implements zzhy
{
  private final Context mContext;
  private final zzif.zza zzGd;
  private final ArrayList zzKL = new ArrayList();
  private final ArrayList zzKM = new ArrayList();
  private final HashSet zzKN = new HashSet();
  private final zzht zzKO;
  private final Object zzpV = new Object();
  private final String zzrG;
  
  public zzhz(Context paramContext, String paramString, zzif.zza paramzza, zzht paramzzht)
  {
    mContext = paramContext;
    zzrG = paramString;
    zzGd = paramzza;
    zzKO = paramzzht;
  }
  
  private zzif zza(int paramInt, String paramString, zzen paramzzen)
  {
    return new zzif(zzGd.zzLd.zzHt, null, zzGd.zzLe.zzBQ, paramInt, zzGd.zzLe.zzBR, zzGd.zzLe.zzHV, zzGd.zzLe.orientation, zzGd.zzLe.zzBU, zzGd.zzLd.zzHw, zzGd.zzLe.zzHT, paramzzen, null, paramString, zzGd.zzKV, null, zzGd.zzLe.zzHU, zzGd.zzrp, zzGd.zzLe.zzHS, zzGd.zzKY, zzGd.zzLe.zzHX, zzGd.zzLe.zzHY, zzGd.zzKT, null, zzGd.zzLe.zzIj, zzGd.zzLe.zzIk, zzGd.zzLe.zzIl, zzGd.zzLe.zzIm);
  }
  
  private zzif zza(String paramString, zzen paramzzen)
  {
    return zza(-2, paramString, paramzzen);
  }
  
  private void zzd(String paramString1, String paramString2, String paramString3)
  {
    synchronized (zzpV)
    {
      zzia localzzia = zzKO.zzaw(paramString1);
      if ((localzzia == null) || (localzzia.zzgQ() == null) || (localzzia.zzgP() == null)) {
        return;
      }
      paramString2 = new zzhu(mContext, paramString1, zzrG, paramString2, paramString3, zzGd, localzzia, this);
      zzKL.add(paramString2.zzhn());
      zzKM.add(paramString1);
      return;
    }
  }
  
  private zzif zzgO()
  {
    return zza(3, null, null);
  }
  
  public void onStop() {}
  
  public void zza(String paramString, int paramInt) {}
  
  public void zzax(String paramString)
  {
    synchronized (zzpV)
    {
      zzKN.add(paramString);
      return;
    }
  }
  
  /* Error */
  public void zzbr()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 49	com/google/android/gms/internal/zzhz:zzGd	Lcom/google/android/gms/internal/zzif$zza;
    //   4: getfield 104	com/google/android/gms/internal/zzif$zza:zzKV	Lcom/google/android/gms/internal/zzeo;
    //   7: getfield 194	com/google/android/gms/internal/zzeo:zzBO	Ljava/util/List;
    //   10: invokeinterface 200 1 0
    //   15: astore_2
    //   16: aload_2
    //   17: invokeinterface 206 1 0
    //   22: ifeq +63 -> 85
    //   25: aload_2
    //   26: invokeinterface 210 1 0
    //   31: checkcast 212	com/google/android/gms/internal/zzen
    //   34: astore_3
    //   35: aload_3
    //   36: getfield 215	com/google/android/gms/internal/zzen:zzBG	Ljava/lang/String;
    //   39: astore 4
    //   41: aload_3
    //   42: getfield 218	com/google/android/gms/internal/zzen:zzBB	Ljava/util/List;
    //   45: invokeinterface 200 1 0
    //   50: astore 5
    //   52: aload 5
    //   54: invokeinterface 206 1 0
    //   59: ifeq -43 -> 16
    //   62: aload_0
    //   63: aload 5
    //   65: invokeinterface 210 1 0
    //   70: checkcast 220	java/lang/String
    //   73: aload 4
    //   75: aload_3
    //   76: getfield 223	com/google/android/gms/internal/zzen:zzBz	Ljava/lang/String;
    //   79: invokespecial 225	com/google/android/gms/internal/zzhz:zzd	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   82: goto -30 -> 52
    //   85: iconst_0
    //   86: istore_1
    //   87: iload_1
    //   88: aload_0
    //   89: getfield 31	com/google/android/gms/internal/zzhz:zzKL	Ljava/util/ArrayList;
    //   92: invokevirtual 229	java/util/ArrayList:size	()I
    //   95: if_icmpge +114 -> 209
    //   98: aload_0
    //   99: getfield 31	com/google/android/gms/internal/zzhz:zzKL	Ljava/util/ArrayList;
    //   102: iload_1
    //   103: invokevirtual 233	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   106: checkcast 235	java/util/concurrent/Future
    //   109: invokeinterface 237 1 0
    //   114: pop
    //   115: aload_0
    //   116: getfield 43	com/google/android/gms/internal/zzhz:zzpV	Ljava/lang/Object;
    //   119: astore_2
    //   120: aload_2
    //   121: monitorenter
    //   122: aload_0
    //   123: getfield 38	com/google/android/gms/internal/zzhz:zzKN	Ljava/util/HashSet;
    //   126: aload_0
    //   127: getfield 33	com/google/android/gms/internal/zzhz:zzKM	Ljava/util/ArrayList;
    //   130: iload_1
    //   131: invokevirtual 233	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   134: invokevirtual 240	java/util/HashSet:contains	(Ljava/lang/Object;)Z
    //   137: ifeq +57 -> 194
    //   140: aload_0
    //   141: aload_0
    //   142: getfield 33	com/google/android/gms/internal/zzhz:zzKM	Ljava/util/ArrayList;
    //   145: iload_1
    //   146: invokevirtual 233	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   149: checkcast 220	java/lang/String
    //   152: aload_0
    //   153: getfield 49	com/google/android/gms/internal/zzhz:zzGd	Lcom/google/android/gms/internal/zzif$zza;
    //   156: getfield 104	com/google/android/gms/internal/zzif$zza:zzKV	Lcom/google/android/gms/internal/zzeo;
    //   159: getfield 194	com/google/android/gms/internal/zzeo:zzBO	Ljava/util/List;
    //   162: iload_1
    //   163: invokeinterface 241 2 0
    //   168: checkcast 212	com/google/android/gms/internal/zzen
    //   171: invokespecial 243	com/google/android/gms/internal/zzhz:zza	(Ljava/lang/String;Lcom/google/android/gms/internal/zzen;)Lcom/google/android/gms/internal/zzif;
    //   174: astore_3
    //   175: getstatic 249	com/google/android/gms/ads/internal/util/client/zza:zzMS	Landroid/os/Handler;
    //   178: new 251	com/google/android/gms/internal/zzhz$1
    //   181: dup
    //   182: aload_0
    //   183: aload_3
    //   184: invokespecial 254	com/google/android/gms/internal/zzhz$1:<init>	(Lcom/google/android/gms/internal/zzhz;Lcom/google/android/gms/internal/zzif;)V
    //   187: invokevirtual 260	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   190: pop
    //   191: aload_2
    //   192: monitorexit
    //   193: return
    //   194: aload_2
    //   195: monitorexit
    //   196: iload_1
    //   197: iconst_1
    //   198: iadd
    //   199: istore_1
    //   200: goto -113 -> 87
    //   203: astore_3
    //   204: aload_2
    //   205: monitorexit
    //   206: aload_3
    //   207: athrow
    //   208: astore_2
    //   209: aload_0
    //   210: invokespecial 262	com/google/android/gms/internal/zzhz:zzgO	()Lcom/google/android/gms/internal/zzif;
    //   213: astore_2
    //   214: getstatic 249	com/google/android/gms/ads/internal/util/client/zza:zzMS	Landroid/os/Handler;
    //   217: new 264	com/google/android/gms/internal/zzhz$2
    //   220: dup
    //   221: aload_0
    //   222: aload_2
    //   223: invokespecial 265	com/google/android/gms/internal/zzhz$2:<init>	(Lcom/google/android/gms/internal/zzhz;Lcom/google/android/gms/internal/zzif;)V
    //   226: invokevirtual 260	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   229: pop
    //   230: return
    //   231: astore_2
    //   232: goto -36 -> 196
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	this	zzhz
    //   86	114	1	i	int
    //   208	1	2	localInterruptedException	InterruptedException
    //   213	10	2	localzzif	zzif
    //   231	1	2	localException	Exception
    //   34	150	3	localObject2	Object
    //   203	4	3	localObject3	Object
    //   39	35	4	str	String
    //   50	14	5	localIterator	java.util.Iterator
    // Exception table:
    //   from	to	target	type
    //   122	193	203	finally
    //   98	115	208	java/lang/InterruptedException
    //   98	115	231	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */