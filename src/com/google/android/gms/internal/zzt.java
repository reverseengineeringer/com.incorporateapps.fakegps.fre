package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.impl.cookie.DateUtils;

public class zzt
  implements zzf
{
  protected static final boolean DEBUG = zzs.DEBUG;
  private static int zzao = 3000;
  private static int zzap = 4096;
  protected final zzy zzaq;
  protected final zzu zzar;
  
  public zzt(zzy paramzzy)
  {
    this(paramzzy, new zzu(zzap));
  }
  
  public zzt(zzy paramzzy, zzu paramzzu)
  {
    zzaq = paramzzy;
    zzar = paramzzu;
  }
  
  protected static Map zza(Header[] paramArrayOfHeader)
  {
    TreeMap localTreeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    int i = 0;
    while (i < paramArrayOfHeader.length)
    {
      localTreeMap.put(paramArrayOfHeader[i].getName(), paramArrayOfHeader[i].getValue());
      i += 1;
    }
    return localTreeMap;
  }
  
  private void zza(long paramLong, zzk paramzzk, byte[] paramArrayOfByte, StatusLine paramStatusLine)
  {
    if ((DEBUG) || (paramLong > zzao)) {
      if (paramArrayOfByte == null) {
        break label82;
      }
    }
    label82:
    for (paramArrayOfByte = Integer.valueOf(paramArrayOfByte.length);; paramArrayOfByte = "null")
    {
      zzs.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] { paramzzk, Long.valueOf(paramLong), paramArrayOfByte, Integer.valueOf(paramStatusLine.getStatusCode()), Integer.valueOf(paramzzk.zzu().zze()) });
      return;
    }
  }
  
  private static void zza(String paramString, zzk paramzzk, zzr paramzzr)
  {
    zzo localzzo = paramzzk.zzu();
    int i = paramzzk.zzt();
    try
    {
      localzzo.zza(paramzzr);
      paramzzk.zzc(String.format("%s-retry [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
      return;
    }
    catch (zzr paramzzr)
    {
      paramzzk.zzc(String.format("%s-timeout-giveup [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
      throw paramzzr;
    }
  }
  
  private void zza(Map paramMap, zzb.zza paramzza)
  {
    if (paramzza == null) {}
    do
    {
      return;
      if (zzb != null) {
        paramMap.put("If-None-Match", zzb);
      }
    } while (zzd <= 0L);
    paramMap.put("If-Modified-Since", DateUtils.formatDate(new Date(zzd)));
  }
  
  private byte[] zza(HttpEntity paramHttpEntity)
  {
    zzaa localzzaa = new zzaa(zzar, (int)paramHttpEntity.getContentLength());
    Object localObject2 = null;
    Object localObject1 = localObject2;
    Object localObject4;
    try
    {
      localObject4 = paramHttpEntity.getContent();
      if (localObject4 == null)
      {
        localObject1 = localObject2;
        throw new zzp();
      }
    }
    finally {}
    try
    {
      paramHttpEntity.consumeContent();
      zzar.zza((byte[])localObject1);
      localzzaa.close();
      throw ((Throwable)localObject3);
      localObject1 = localObject3;
      byte[] arrayOfByte = zzar.zzb(1024);
      for (;;)
      {
        localObject1 = arrayOfByte;
        int i = ((InputStream)localObject4).read(arrayOfByte);
        if (i == -1) {
          break;
        }
        localObject1 = arrayOfByte;
        localzzaa.write(arrayOfByte, 0, i);
      }
      localObject1 = arrayOfByte;
      localObject4 = localzzaa.toByteArray();
      try
      {
        paramHttpEntity.consumeContent();
        zzar.zza(arrayOfByte);
        localzzaa.close();
        return (byte[])localObject4;
      }
      catch (IOException paramHttpEntity)
      {
        for (;;)
        {
          zzs.zza("Error occured when calling consumingContent", new Object[0]);
        }
      }
    }
    catch (IOException paramHttpEntity)
    {
      for (;;)
      {
        zzs.zza("Error occured when calling consumingContent", new Object[0]);
      }
    }
  }
  
  /* Error */
  public zzi zza(zzk paramzzk)
  {
    // Byte code:
    //   0: invokestatic 217	android/os/SystemClock:elapsedRealtime	()J
    //   3: lstore_3
    //   4: aconst_null
    //   5: astore 9
    //   7: invokestatic 223	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   10: astore 7
    //   12: new 225	java/util/HashMap
    //   15: dup
    //   16: invokespecial 226	java/util/HashMap:<init>	()V
    //   19: astore 5
    //   21: aload_0
    //   22: aload 5
    //   24: aload_1
    //   25: invokevirtual 230	com/google/android/gms/internal/zzk:zzi	()Lcom/google/android/gms/internal/zzb$zza;
    //   28: invokespecial 232	com/google/android/gms/internal/zzt:zza	(Ljava/util/Map;Lcom/google/android/gms/internal/zzb$zza;)V
    //   31: aload_0
    //   32: getfield 41	com/google/android/gms/internal/zzt:zzaq	Lcom/google/android/gms/internal/zzy;
    //   35: aload_1
    //   36: aload 5
    //   38: invokeinterface 237 3 0
    //   43: astore 6
    //   45: aload 7
    //   47: astore 5
    //   49: aload 6
    //   51: invokeinterface 243 1 0
    //   56: astore 8
    //   58: aload 7
    //   60: astore 5
    //   62: aload 8
    //   64: invokeinterface 91 1 0
    //   69: istore_2
    //   70: aload 7
    //   72: astore 5
    //   74: aload 6
    //   76: invokeinterface 247 1 0
    //   81: invokestatic 249	com/google/android/gms/internal/zzt:zza	([Lorg/apache/http/Header;)Ljava/util/Map;
    //   84: astore 9
    //   86: iload_2
    //   87: sipush 304
    //   90: if_icmpne +89 -> 179
    //   93: aload 9
    //   95: astore 5
    //   97: aload_1
    //   98: invokevirtual 230	com/google/android/gms/internal/zzk:zzi	()Lcom/google/android/gms/internal/zzb$zza;
    //   101: astore 7
    //   103: aload 7
    //   105: ifnonnull +27 -> 132
    //   108: aload 9
    //   110: astore 5
    //   112: new 251	com/google/android/gms/internal/zzi
    //   115: dup
    //   116: sipush 304
    //   119: aconst_null
    //   120: aload 9
    //   122: iconst_1
    //   123: invokestatic 217	android/os/SystemClock:elapsedRealtime	()J
    //   126: lload_3
    //   127: lsub
    //   128: invokespecial 254	com/google/android/gms/internal/zzi:<init>	(I[BLjava/util/Map;ZJ)V
    //   131: areturn
    //   132: aload 9
    //   134: astore 5
    //   136: aload 7
    //   138: getfield 258	com/google/android/gms/internal/zzb$zza:zzg	Ljava/util/Map;
    //   141: aload 9
    //   143: invokeinterface 262 2 0
    //   148: aload 9
    //   150: astore 5
    //   152: new 251	com/google/android/gms/internal/zzi
    //   155: dup
    //   156: sipush 304
    //   159: aload 7
    //   161: getfield 266	com/google/android/gms/internal/zzb$zza:data	[B
    //   164: aload 7
    //   166: getfield 258	com/google/android/gms/internal/zzb$zza:zzg	Ljava/util/Map;
    //   169: iconst_1
    //   170: invokestatic 217	android/os/SystemClock:elapsedRealtime	()J
    //   173: lload_3
    //   174: lsub
    //   175: invokespecial 254	com/google/android/gms/internal/zzi:<init>	(I[BLjava/util/Map;ZJ)V
    //   178: areturn
    //   179: aload 9
    //   181: astore 5
    //   183: aload 6
    //   185: invokeinterface 270 1 0
    //   190: ifnull +79 -> 269
    //   193: aload 9
    //   195: astore 5
    //   197: aload_0
    //   198: aload 6
    //   200: invokeinterface 270 1 0
    //   205: invokespecial 272	com/google/android/gms/internal/zzt:zza	(Lorg/apache/http/HttpEntity;)[B
    //   208: astore 7
    //   210: aload 7
    //   212: astore 5
    //   214: aload_0
    //   215: invokestatic 217	android/os/SystemClock:elapsedRealtime	()J
    //   218: lload_3
    //   219: lsub
    //   220: aload_1
    //   221: aload 5
    //   223: aload 8
    //   225: invokespecial 274	com/google/android/gms/internal/zzt:zza	(JLcom/google/android/gms/internal/zzk;[BLorg/apache/http/StatusLine;)V
    //   228: iload_2
    //   229: sipush 200
    //   232: if_icmplt +10 -> 242
    //   235: iload_2
    //   236: sipush 299
    //   239: if_icmple +46 -> 285
    //   242: new 157	java/io/IOException
    //   245: dup
    //   246: invokespecial 275	java/io/IOException:<init>	()V
    //   249: athrow
    //   250: astore 5
    //   252: ldc_w 277
    //   255: aload_1
    //   256: new 279	com/google/android/gms/internal/zzq
    //   259: dup
    //   260: invokespecial 280	com/google/android/gms/internal/zzq:<init>	()V
    //   263: invokestatic 282	com/google/android/gms/internal/zzt:zza	(Ljava/lang/String;Lcom/google/android/gms/internal/zzk;Lcom/google/android/gms/internal/zzr;)V
    //   266: goto -262 -> 4
    //   269: aload 9
    //   271: astore 5
    //   273: iconst_0
    //   274: newarray <illegal type>
    //   276: astore 7
    //   278: aload 7
    //   280: astore 5
    //   282: goto -68 -> 214
    //   285: new 251	com/google/android/gms/internal/zzi
    //   288: dup
    //   289: iload_2
    //   290: aload 5
    //   292: aload 9
    //   294: iconst_0
    //   295: invokestatic 217	android/os/SystemClock:elapsedRealtime	()J
    //   298: lload_3
    //   299: lsub
    //   300: invokespecial 254	com/google/android/gms/internal/zzi:<init>	(I[BLjava/util/Map;ZJ)V
    //   303: astore 7
    //   305: aload 7
    //   307: areturn
    //   308: astore 5
    //   310: ldc_w 284
    //   313: aload_1
    //   314: new 279	com/google/android/gms/internal/zzq
    //   317: dup
    //   318: invokespecial 280	com/google/android/gms/internal/zzq:<init>	()V
    //   321: invokestatic 282	com/google/android/gms/internal/zzt:zza	(Ljava/lang/String;Lcom/google/android/gms/internal/zzk;Lcom/google/android/gms/internal/zzr;)V
    //   324: goto -320 -> 4
    //   327: astore 5
    //   329: new 286	java/lang/RuntimeException
    //   332: dup
    //   333: new 288	java/lang/StringBuilder
    //   336: dup
    //   337: ldc_w 290
    //   340: invokespecial 292	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   343: aload_1
    //   344: invokevirtual 295	com/google/android/gms/internal/zzk:getUrl	()Ljava/lang/String;
    //   347: invokevirtual 299	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: invokevirtual 302	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   353: aload 5
    //   355: invokespecial 305	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   358: athrow
    //   359: astore 6
    //   361: aconst_null
    //   362: astore 8
    //   364: aload 7
    //   366: astore 5
    //   368: aload 9
    //   370: astore 7
    //   372: aload 7
    //   374: ifnull +98 -> 472
    //   377: aload 7
    //   379: invokeinterface 243 1 0
    //   384: invokeinterface 91 1 0
    //   389: istore_2
    //   390: ldc_w 307
    //   393: iconst_2
    //   394: anewarray 4	java/lang/Object
    //   397: dup
    //   398: iconst_0
    //   399: iload_2
    //   400: invokestatic 78	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   403: aastore
    //   404: dup
    //   405: iconst_1
    //   406: aload_1
    //   407: invokevirtual 295	com/google/android/gms/internal/zzk:getUrl	()Ljava/lang/String;
    //   410: aastore
    //   411: invokestatic 309	com/google/android/gms/internal/zzs:zzc	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   414: aload 8
    //   416: ifnull +76 -> 492
    //   419: new 251	com/google/android/gms/internal/zzi
    //   422: dup
    //   423: iload_2
    //   424: aload 8
    //   426: aload 5
    //   428: iconst_0
    //   429: invokestatic 217	android/os/SystemClock:elapsedRealtime	()J
    //   432: lload_3
    //   433: lsub
    //   434: invokespecial 254	com/google/android/gms/internal/zzi:<init>	(I[BLjava/util/Map;ZJ)V
    //   437: astore 5
    //   439: iload_2
    //   440: sipush 401
    //   443: if_icmpeq +10 -> 453
    //   446: iload_2
    //   447: sipush 403
    //   450: if_icmpne +32 -> 482
    //   453: ldc_w 311
    //   456: aload_1
    //   457: new 313	com/google/android/gms/internal/zza
    //   460: dup
    //   461: aload 5
    //   463: invokespecial 316	com/google/android/gms/internal/zza:<init>	(Lcom/google/android/gms/internal/zzi;)V
    //   466: invokestatic 282	com/google/android/gms/internal/zzt:zza	(Ljava/lang/String;Lcom/google/android/gms/internal/zzk;Lcom/google/android/gms/internal/zzr;)V
    //   469: goto -465 -> 4
    //   472: new 318	com/google/android/gms/internal/zzj
    //   475: dup
    //   476: aload 6
    //   478: invokespecial 321	com/google/android/gms/internal/zzj:<init>	(Ljava/lang/Throwable;)V
    //   481: athrow
    //   482: new 174	com/google/android/gms/internal/zzp
    //   485: dup
    //   486: aload 5
    //   488: invokespecial 322	com/google/android/gms/internal/zzp:<init>	(Lcom/google/android/gms/internal/zzi;)V
    //   491: athrow
    //   492: new 324	com/google/android/gms/internal/zzh
    //   495: dup
    //   496: aconst_null
    //   497: invokespecial 325	com/google/android/gms/internal/zzh:<init>	(Lcom/google/android/gms/internal/zzi;)V
    //   500: athrow
    //   501: astore 9
    //   503: aconst_null
    //   504: astore 8
    //   506: aload 6
    //   508: astore 7
    //   510: aload 9
    //   512: astore 6
    //   514: goto -142 -> 372
    //   517: astore 8
    //   519: aload 6
    //   521: astore 7
    //   523: aload 8
    //   525: astore 6
    //   527: aload 5
    //   529: astore 8
    //   531: aload 9
    //   533: astore 5
    //   535: goto -163 -> 372
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	538	0	this	zzt
    //   0	538	1	paramzzk	zzk
    //   69	382	2	i	int
    //   3	430	3	l	long
    //   19	203	5	localObject1	Object
    //   250	1	5	localSocketTimeoutException	java.net.SocketTimeoutException
    //   271	20	5	localObject2	Object
    //   308	1	5	localConnectTimeoutException	org.apache.http.conn.ConnectTimeoutException
    //   327	27	5	localMalformedURLException	java.net.MalformedURLException
    //   366	168	5	localObject3	Object
    //   43	156	6	localHttpResponse	org.apache.http.HttpResponse
    //   359	148	6	localIOException1	IOException
    //   512	14	6	localObject4	Object
    //   10	512	7	localObject5	Object
    //   56	449	8	localStatusLine	StatusLine
    //   517	7	8	localIOException2	IOException
    //   529	1	8	localObject6	Object
    //   5	364	9	localMap	Map
    //   501	31	9	localIOException3	IOException
    // Exception table:
    //   from	to	target	type
    //   12	45	250	java/net/SocketTimeoutException
    //   49	58	250	java/net/SocketTimeoutException
    //   62	70	250	java/net/SocketTimeoutException
    //   74	86	250	java/net/SocketTimeoutException
    //   97	103	250	java/net/SocketTimeoutException
    //   112	132	250	java/net/SocketTimeoutException
    //   136	148	250	java/net/SocketTimeoutException
    //   152	179	250	java/net/SocketTimeoutException
    //   183	193	250	java/net/SocketTimeoutException
    //   197	210	250	java/net/SocketTimeoutException
    //   214	228	250	java/net/SocketTimeoutException
    //   242	250	250	java/net/SocketTimeoutException
    //   273	278	250	java/net/SocketTimeoutException
    //   285	305	250	java/net/SocketTimeoutException
    //   12	45	308	org/apache/http/conn/ConnectTimeoutException
    //   49	58	308	org/apache/http/conn/ConnectTimeoutException
    //   62	70	308	org/apache/http/conn/ConnectTimeoutException
    //   74	86	308	org/apache/http/conn/ConnectTimeoutException
    //   97	103	308	org/apache/http/conn/ConnectTimeoutException
    //   112	132	308	org/apache/http/conn/ConnectTimeoutException
    //   136	148	308	org/apache/http/conn/ConnectTimeoutException
    //   152	179	308	org/apache/http/conn/ConnectTimeoutException
    //   183	193	308	org/apache/http/conn/ConnectTimeoutException
    //   197	210	308	org/apache/http/conn/ConnectTimeoutException
    //   214	228	308	org/apache/http/conn/ConnectTimeoutException
    //   242	250	308	org/apache/http/conn/ConnectTimeoutException
    //   273	278	308	org/apache/http/conn/ConnectTimeoutException
    //   285	305	308	org/apache/http/conn/ConnectTimeoutException
    //   12	45	327	java/net/MalformedURLException
    //   49	58	327	java/net/MalformedURLException
    //   62	70	327	java/net/MalformedURLException
    //   74	86	327	java/net/MalformedURLException
    //   97	103	327	java/net/MalformedURLException
    //   112	132	327	java/net/MalformedURLException
    //   136	148	327	java/net/MalformedURLException
    //   152	179	327	java/net/MalformedURLException
    //   183	193	327	java/net/MalformedURLException
    //   197	210	327	java/net/MalformedURLException
    //   214	228	327	java/net/MalformedURLException
    //   242	250	327	java/net/MalformedURLException
    //   273	278	327	java/net/MalformedURLException
    //   285	305	327	java/net/MalformedURLException
    //   12	45	359	java/io/IOException
    //   49	58	501	java/io/IOException
    //   62	70	501	java/io/IOException
    //   74	86	501	java/io/IOException
    //   97	103	501	java/io/IOException
    //   112	132	501	java/io/IOException
    //   136	148	501	java/io/IOException
    //   152	179	501	java/io/IOException
    //   183	193	501	java/io/IOException
    //   197	210	501	java/io/IOException
    //   273	278	501	java/io/IOException
    //   214	228	517	java/io/IOException
    //   242	250	517	java/io/IOException
    //   285	305	517	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */