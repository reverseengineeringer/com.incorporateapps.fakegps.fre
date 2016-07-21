package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.zzrw;

class zzcl
  implements Runnable
{
  private final Context mContext;
  private final String zzbhM;
  private volatile String zzbij;
  private final zzrw zzbke;
  private final String zzbkf;
  private zzbf zzbkg;
  private volatile zzs zzbkh;
  private volatile String zzbki;
  
  zzcl(Context paramContext, String paramString, zzrw paramzzrw, zzs paramzzs)
  {
    mContext = paramContext;
    zzbke = paramzzrw;
    zzbhM = paramString;
    zzbkh = paramzzs;
    zzbkf = ("/r?id=" + paramString);
    zzbij = zzbkf;
    zzbki = null;
  }
  
  public zzcl(Context paramContext, String paramString, zzs paramzzs)
  {
    this(paramContext, paramString, new zzrw(), paramzzs);
  }
  
  private boolean zzGX()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo == null) || (!localNetworkInfo.isConnected()))
    {
      zzbg.v("...no network connectivity");
      return false;
    }
    return true;
  }
  
  /* Error */
  private void zzGY()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 95	com/google/android/gms/tagmanager/zzcl:zzGX	()Z
    //   4: ifne +16 -> 20
    //   7: aload_0
    //   8: getfield 97	com/google/android/gms/tagmanager/zzcl:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   11: getstatic 103	com/google/android/gms/tagmanager/zzbf$zza:zzbju	Lcom/google/android/gms/tagmanager/zzbf$zza;
    //   14: invokeinterface 109 2 0
    //   19: return
    //   20: ldc 111
    //   22: invokestatic 88	com/google/android/gms/tagmanager/zzbg:v	(Ljava/lang/String;)V
    //   25: aload_0
    //   26: invokevirtual 114	com/google/android/gms/tagmanager/zzcl:zzGZ	()Ljava/lang/String;
    //   29: astore_2
    //   30: aload_0
    //   31: getfield 28	com/google/android/gms/tagmanager/zzcl:zzbke	Lcom/google/android/gms/internal/zzrw;
    //   34: invokevirtual 118	com/google/android/gms/internal/zzrw:zzIa	()Lcom/google/android/gms/internal/zzrv;
    //   37: astore_1
    //   38: aload_1
    //   39: aload_2
    //   40: invokeinterface 124 2 0
    //   45: astore_3
    //   46: new 126	java/io/ByteArrayOutputStream
    //   49: dup
    //   50: invokespecial 127	java/io/ByteArrayOutputStream:<init>	()V
    //   53: astore 4
    //   55: aload_3
    //   56: aload 4
    //   58: invokestatic 133	com/google/android/gms/internal/zzrs:zzb	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   61: aload 4
    //   63: invokevirtual 137	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   66: invokestatic 143	com/google/android/gms/internal/zzaf$zzj:zzd	([B)Lcom/google/android/gms/internal/zzaf$zzj;
    //   69: astore_3
    //   70: new 34	java/lang/StringBuilder
    //   73: dup
    //   74: ldc -111
    //   76: invokespecial 39	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   79: aload_3
    //   80: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   83: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: invokestatic 88	com/google/android/gms/tagmanager/zzbg:v	(Ljava/lang/String;)V
    //   89: aload_3
    //   90: getfield 152	com/google/android/gms/internal/zzaf$zzj:zzju	Lcom/google/android/gms/internal/zzaf$zzf;
    //   93: ifnonnull +33 -> 126
    //   96: aload_3
    //   97: getfield 156	com/google/android/gms/internal/zzaf$zzj:zzjt	[Lcom/google/android/gms/internal/zzaf$zzi;
    //   100: arraylength
    //   101: ifne +25 -> 126
    //   104: new 34	java/lang/StringBuilder
    //   107: dup
    //   108: ldc -98
    //   110: invokespecial 39	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   113: aload_0
    //   114: getfield 30	com/google/android/gms/tagmanager/zzcl:zzbhM	Ljava/lang/String;
    //   117: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: invokestatic 88	com/google/android/gms/tagmanager/zzbg:v	(Ljava/lang/String;)V
    //   126: aload_0
    //   127: getfield 97	com/google/android/gms/tagmanager/zzcl:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   130: aload_3
    //   131: invokeinterface 162 2 0
    //   136: aload_1
    //   137: invokeinterface 165 1 0
    //   142: ldc -89
    //   144: invokestatic 88	com/google/android/gms/tagmanager/zzbg:v	(Ljava/lang/String;)V
    //   147: return
    //   148: astore_3
    //   149: new 34	java/lang/StringBuilder
    //   152: dup
    //   153: ldc -87
    //   155: invokespecial 39	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   158: aload_2
    //   159: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: ldc -85
    //   164: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: aload_0
    //   168: getfield 30	com/google/android/gms/tagmanager/zzcl:zzbhM	Ljava/lang/String;
    //   171: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: ldc -83
    //   176: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   182: invokestatic 176	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   185: aload_0
    //   186: getfield 97	com/google/android/gms/tagmanager/zzcl:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   189: getstatic 179	com/google/android/gms/tagmanager/zzbf$zza:zzbjw	Lcom/google/android/gms/tagmanager/zzbf$zza;
    //   192: invokeinterface 109 2 0
    //   197: aload_1
    //   198: invokeinterface 165 1 0
    //   203: return
    //   204: astore_3
    //   205: new 34	java/lang/StringBuilder
    //   208: dup
    //   209: ldc -75
    //   211: invokespecial 39	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   214: aload_2
    //   215: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: ldc -73
    //   220: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: aload_3
    //   224: invokevirtual 186	java/io/IOException:getMessage	()Ljava/lang/String;
    //   227: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   233: aload_3
    //   234: invokestatic 189	com/google/android/gms/tagmanager/zzbg:zzd	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   237: aload_0
    //   238: getfield 97	com/google/android/gms/tagmanager/zzcl:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   241: getstatic 192	com/google/android/gms/tagmanager/zzbf$zza:zzbjv	Lcom/google/android/gms/tagmanager/zzbf$zza;
    //   244: invokeinterface 109 2 0
    //   249: aload_1
    //   250: invokeinterface 165 1 0
    //   255: return
    //   256: astore_3
    //   257: new 34	java/lang/StringBuilder
    //   260: dup
    //   261: ldc -62
    //   263: invokespecial 39	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   266: aload_2
    //   267: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: ldc -73
    //   272: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: aload_3
    //   276: invokevirtual 186	java/io/IOException:getMessage	()Ljava/lang/String;
    //   279: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   285: aload_3
    //   286: invokestatic 189	com/google/android/gms/tagmanager/zzbg:zzd	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   289: aload_0
    //   290: getfield 97	com/google/android/gms/tagmanager/zzcl:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   293: getstatic 179	com/google/android/gms/tagmanager/zzbf$zza:zzbjw	Lcom/google/android/gms/tagmanager/zzbf$zza;
    //   296: invokeinterface 109 2 0
    //   301: aload_1
    //   302: invokeinterface 165 1 0
    //   307: return
    //   308: astore_2
    //   309: aload_1
    //   310: invokeinterface 165 1 0
    //   315: aload_2
    //   316: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	317	0	this	zzcl
    //   37	273	1	localzzrv	com.google.android.gms.internal.zzrv
    //   29	238	2	str	String
    //   308	8	2	localObject1	Object
    //   45	86	3	localObject2	Object
    //   148	1	3	localFileNotFoundException	java.io.FileNotFoundException
    //   204	30	3	localIOException1	java.io.IOException
    //   256	30	3	localIOException2	java.io.IOException
    //   53	9	4	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   38	46	148	java/io/FileNotFoundException
    //   38	46	204	java/io/IOException
    //   46	126	256	java/io/IOException
    //   126	136	256	java/io/IOException
    //   38	46	308	finally
    //   46	126	308	finally
    //   126	136	308	finally
    //   149	197	308	finally
    //   205	249	308	finally
    //   257	301	308	finally
  }
  
  public void run()
  {
    if (zzbkg == null) {
      throw new IllegalStateException("callback must be set before execute");
    }
    zzbkg.zzGk();
    zzGY();
  }
  
  String zzGZ()
  {
    Object localObject2 = zzbkh.zzGm() + zzbij + "&v=a65833898";
    Object localObject1 = localObject2;
    if (zzbki != null)
    {
      localObject1 = localObject2;
      if (!zzbki.trim().equals("")) {
        localObject1 = (String)localObject2 + "&pv=" + zzbki;
      }
    }
    localObject2 = localObject1;
    if (zzcb.zzGU().zzGV().equals(zzcb.zza.zzbjW)) {
      localObject2 = (String)localObject1 + "&gtm_debug=x";
    }
    return (String)localObject2;
  }
  
  void zza(zzbf paramzzbf)
  {
    zzbkg = paramzzbf;
  }
  
  void zzfW(String paramString)
  {
    if (paramString == null)
    {
      zzbij = zzbkf;
      return;
    }
    zzbg.zzaI("Setting CTFE URL path: " + paramString);
    zzbij = paramString;
  }
  
  void zzgl(String paramString)
  {
    zzbg.zzaI("Setting previous container version: " + paramString);
    zzbki = paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */