package com.google.android.gms.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class zzdu
  extends zzdr
{
  private static final Set zzzX = Collections.synchronizedSet(new HashSet());
  private static final DecimalFormat zzzY = new DecimalFormat("#,###");
  private boolean zzAa;
  private File zzzZ;
  
  public zzdu(zzjp paramzzjp)
  {
    super(paramzzjp);
    paramzzjp = mContext.getCacheDir();
    if (paramzzjp == null) {
      zzin.zzaK("Context.getCacheDir() returned null");
    }
    do
    {
      return;
      zzzZ = new File(paramzzjp, "admobVideoStreams");
      if ((!zzzZ.isDirectory()) && (!zzzZ.mkdirs()))
      {
        zzin.zzaK("Could not create preload cache directory at " + zzzZ.getAbsolutePath());
        zzzZ = null;
        return;
      }
    } while ((zzzZ.setReadable(true, false)) && (zzzZ.setExecutable(true, false)));
    zzin.zzaK("Could not set cache file permissions at " + zzzZ.getAbsolutePath());
    zzzZ = null;
  }
  
  private File zza(File paramFile)
  {
    return new File(zzzZ, paramFile.getName() + ".done");
  }
  
  private static void zzb(File paramFile)
  {
    if (paramFile.isFile())
    {
      paramFile.setLastModified(System.currentTimeMillis());
      return;
    }
    try
    {
      paramFile.createNewFile();
      return;
    }
    catch (IOException paramFile) {}
  }
  
  public void abort()
  {
    zzAa = true;
  }
  
  /* Error */
  public boolean zzU(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 66	com/google/android/gms/internal/zzdu:zzzZ	Ljava/io/File;
    //   4: ifnonnull +14 -> 18
    //   7: aload_0
    //   8: aload_1
    //   9: aconst_null
    //   10: ldc -119
    //   12: aconst_null
    //   13: invokevirtual 140	com/google/android/gms/internal/zzdu:zza	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   16: iconst_0
    //   17: ireturn
    //   18: aload_0
    //   19: invokevirtual 144	com/google/android/gms/internal/zzdu:zzea	()I
    //   22: getstatic 150	com/google/android/gms/internal/zzbt:zzvO	Lcom/google/android/gms/internal/zzbp;
    //   25: invokevirtual 156	com/google/android/gms/internal/zzbp:get	()Ljava/lang/Object;
    //   28: checkcast 158	java/lang/Integer
    //   31: invokevirtual 161	java/lang/Integer:intValue	()I
    //   34: if_icmple +26 -> 60
    //   37: aload_0
    //   38: invokevirtual 164	com/google/android/gms/internal/zzdu:zzeb	()Z
    //   41: ifne -23 -> 18
    //   44: ldc -90
    //   46: invokestatic 57	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   49: aload_0
    //   50: aload_1
    //   51: aconst_null
    //   52: ldc -88
    //   54: aconst_null
    //   55: invokevirtual 140	com/google/android/gms/internal/zzdu:zza	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   58: iconst_0
    //   59: ireturn
    //   60: aload_0
    //   61: aload_1
    //   62: invokevirtual 172	com/google/android/gms/internal/zzdu:zzV	(Ljava/lang/String;)Ljava/lang/String;
    //   65: astore 10
    //   67: new 59	java/io/File
    //   70: dup
    //   71: aload_0
    //   72: getfield 66	com/google/android/gms/internal/zzdu:zzzZ	Ljava/io/File;
    //   75: aload 10
    //   77: invokespecial 64	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   80: astore 16
    //   82: aload_0
    //   83: aload 16
    //   85: invokespecial 174	com/google/android/gms/internal/zzdu:zza	(Ljava/io/File;)Ljava/io/File;
    //   88: astore 11
    //   90: aload 16
    //   92: invokevirtual 113	java/io/File:isFile	()Z
    //   95: ifeq +50 -> 145
    //   98: aload 11
    //   100: invokevirtual 113	java/io/File:isFile	()Z
    //   103: ifeq +42 -> 145
    //   106: aload 16
    //   108: invokevirtual 177	java/io/File:length	()J
    //   111: l2i
    //   112: istore_2
    //   113: new 75	java/lang/StringBuilder
    //   116: dup
    //   117: ldc -77
    //   119: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   122: aload_1
    //   123: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   129: invokestatic 182	com/google/android/gms/internal/zzin:zzaI	(Ljava/lang/String;)V
    //   132: aload_0
    //   133: aload_1
    //   134: aload 16
    //   136: invokevirtual 82	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   139: iload_2
    //   140: invokevirtual 185	com/google/android/gms/internal/zzdu:zza	(Ljava/lang/String;Ljava/lang/String;I)V
    //   143: iconst_1
    //   144: ireturn
    //   145: new 75	java/lang/StringBuilder
    //   148: dup
    //   149: invokespecial 101	java/lang/StringBuilder:<init>	()V
    //   152: aload_0
    //   153: getfield 66	com/google/android/gms/internal/zzdu:zzzZ	Ljava/io/File;
    //   156: invokevirtual 82	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   159: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: aload_1
    //   163: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: astore 17
    //   171: getstatic 27	com/google/android/gms/internal/zzdu:zzzX	Ljava/util/Set;
    //   174: astore 10
    //   176: aload 10
    //   178: monitorenter
    //   179: getstatic 27	com/google/android/gms/internal/zzdu:zzzX	Ljava/util/Set;
    //   182: aload 17
    //   184: invokeinterface 191 2 0
    //   189: ifeq +46 -> 235
    //   192: new 75	java/lang/StringBuilder
    //   195: dup
    //   196: ldc -63
    //   198: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   201: aload_1
    //   202: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   208: invokestatic 57	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   211: aload_0
    //   212: aload_1
    //   213: aload 16
    //   215: invokevirtual 82	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   218: ldc -61
    //   220: aconst_null
    //   221: invokevirtual 140	com/google/android/gms/internal/zzdu:zza	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   224: aload 10
    //   226: monitorexit
    //   227: iconst_0
    //   228: ireturn
    //   229: astore_1
    //   230: aload 10
    //   232: monitorexit
    //   233: aload_1
    //   234: athrow
    //   235: getstatic 27	com/google/android/gms/internal/zzdu:zzzX	Ljava/util/Set;
    //   238: aload 17
    //   240: invokeinterface 198 2 0
    //   245: pop
    //   246: aload 10
    //   248: monitorexit
    //   249: aconst_null
    //   250: astore 13
    //   252: new 200	java/net/URL
    //   255: dup
    //   256: aload_1
    //   257: invokespecial 201	java/net/URL:<init>	(Ljava/lang/String;)V
    //   260: invokevirtual 205	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   263: astore 10
    //   265: getstatic 208	com/google/android/gms/internal/zzbt:zzvT	Lcom/google/android/gms/internal/zzbp;
    //   268: invokevirtual 156	com/google/android/gms/internal/zzbp:get	()Ljava/lang/Object;
    //   271: checkcast 158	java/lang/Integer
    //   274: invokevirtual 161	java/lang/Integer:intValue	()I
    //   277: istore_2
    //   278: aload 10
    //   280: iload_2
    //   281: invokevirtual 214	java/net/URLConnection:setConnectTimeout	(I)V
    //   284: aload 10
    //   286: iload_2
    //   287: invokevirtual 217	java/net/URLConnection:setReadTimeout	(I)V
    //   290: aload 10
    //   292: instanceof 219
    //   295: ifeq +200 -> 495
    //   298: aload 10
    //   300: checkcast 219	java/net/HttpURLConnection
    //   303: invokevirtual 222	java/net/HttpURLConnection:getResponseCode	()I
    //   306: istore_2
    //   307: iload_2
    //   308: sipush 400
    //   311: if_icmplt +184 -> 495
    //   314: ldc -32
    //   316: astore 12
    //   318: new 75	java/lang/StringBuilder
    //   321: dup
    //   322: ldc -30
    //   324: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   327: iload_2
    //   328: invokestatic 229	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   331: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   337: astore 11
    //   339: new 110	java/io/IOException
    //   342: dup
    //   343: new 75	java/lang/StringBuilder
    //   346: dup
    //   347: ldc -25
    //   349: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   352: iload_2
    //   353: invokevirtual 234	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   356: ldc -20
    //   358: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   361: aload_1
    //   362: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   368: invokespecial 237	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   371: athrow
    //   372: astore 10
    //   374: aload 10
    //   376: instanceof 133
    //   379: ifeq +12 -> 391
    //   382: invokestatic 243	com/google/android/gms/ads/internal/zzr:zzbF	()Lcom/google/android/gms/internal/zzih;
    //   385: aload 10
    //   387: iconst_1
    //   388: invokevirtual 248	com/google/android/gms/internal/zzih:zzb	(Ljava/lang/Throwable;Z)V
    //   391: aload 13
    //   393: invokevirtual 253	java/io/FileOutputStream:close	()V
    //   396: aload_0
    //   397: getfield 129	com/google/android/gms/internal/zzdu:zzAa	Z
    //   400: ifeq +776 -> 1176
    //   403: new 75	java/lang/StringBuilder
    //   406: dup
    //   407: ldc -1
    //   409: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   412: aload_1
    //   413: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   416: ldc_w 257
    //   419: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   422: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   425: invokestatic 260	com/google/android/gms/internal/zzin:zzaJ	(Ljava/lang/String;)V
    //   428: aload 16
    //   430: invokevirtual 263	java/io/File:exists	()Z
    //   433: ifeq +35 -> 468
    //   436: aload 16
    //   438: invokevirtual 266	java/io/File:delete	()Z
    //   441: ifne +27 -> 468
    //   444: new 75	java/lang/StringBuilder
    //   447: dup
    //   448: ldc_w 268
    //   451: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   454: aload 16
    //   456: invokevirtual 82	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   459: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   462: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   465: invokestatic 57	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   468: aload_0
    //   469: aload_1
    //   470: aload 16
    //   472: invokevirtual 82	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   475: aload 12
    //   477: aload 11
    //   479: invokevirtual 140	com/google/android/gms/internal/zzdu:zza	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   482: getstatic 27	com/google/android/gms/internal/zzdu:zzzX	Ljava/util/Set;
    //   485: aload 17
    //   487: invokeinterface 271 2 0
    //   492: pop
    //   493: iconst_0
    //   494: ireturn
    //   495: aload 10
    //   497: invokevirtual 274	java/net/URLConnection:getContentLength	()I
    //   500: istore 4
    //   502: iload 4
    //   504: ifge +50 -> 554
    //   507: new 75	java/lang/StringBuilder
    //   510: dup
    //   511: ldc_w 276
    //   514: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   517: aload_1
    //   518: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   521: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   524: invokestatic 57	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   527: aload_0
    //   528: aload_1
    //   529: aload 16
    //   531: invokevirtual 82	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   534: ldc_w 278
    //   537: aconst_null
    //   538: invokevirtual 140	com/google/android/gms/internal/zzdu:zza	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   541: getstatic 27	com/google/android/gms/internal/zzdu:zzzX	Ljava/util/Set;
    //   544: aload 17
    //   546: invokeinterface 271 2 0
    //   551: pop
    //   552: iconst_0
    //   553: ireturn
    //   554: getstatic 36	com/google/android/gms/internal/zzdu:zzzY	Ljava/text/DecimalFormat;
    //   557: iload 4
    //   559: i2l
    //   560: invokevirtual 282	java/text/DecimalFormat:format	(J)Ljava/lang/String;
    //   563: astore 12
    //   565: getstatic 285	com/google/android/gms/internal/zzbt:zzvP	Lcom/google/android/gms/internal/zzbp;
    //   568: invokevirtual 156	com/google/android/gms/internal/zzbp:get	()Ljava/lang/Object;
    //   571: checkcast 158	java/lang/Integer
    //   574: invokevirtual 161	java/lang/Integer:intValue	()I
    //   577: istore 5
    //   579: iload 4
    //   581: iload 5
    //   583: if_icmple +82 -> 665
    //   586: new 75	java/lang/StringBuilder
    //   589: dup
    //   590: ldc_w 287
    //   593: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   596: aload 12
    //   598: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   601: ldc_w 289
    //   604: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   607: aload_1
    //   608: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   611: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   614: invokestatic 57	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   617: new 75	java/lang/StringBuilder
    //   620: dup
    //   621: ldc_w 291
    //   624: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   627: aload 12
    //   629: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   632: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   635: astore 10
    //   637: aload_0
    //   638: aload_1
    //   639: aload 16
    //   641: invokevirtual 82	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   644: ldc_w 293
    //   647: aload 10
    //   649: invokevirtual 140	com/google/android/gms/internal/zzdu:zza	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   652: getstatic 27	com/google/android/gms/internal/zzdu:zzzX	Ljava/util/Set;
    //   655: aload 17
    //   657: invokeinterface 271 2 0
    //   662: pop
    //   663: iconst_0
    //   664: ireturn
    //   665: new 75	java/lang/StringBuilder
    //   668: dup
    //   669: ldc_w 295
    //   672: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   675: aload 12
    //   677: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   680: ldc_w 297
    //   683: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   686: aload_1
    //   687: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   690: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   693: invokestatic 182	com/google/android/gms/internal/zzin:zzaI	(Ljava/lang/String;)V
    //   696: aload 10
    //   698: invokevirtual 301	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   701: invokestatic 307	java/nio/channels/Channels:newChannel	(Ljava/io/InputStream;)Ljava/nio/channels/ReadableByteChannel;
    //   704: astore 12
    //   706: new 250	java/io/FileOutputStream
    //   709: dup
    //   710: aload 16
    //   712: invokespecial 309	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   715: astore 10
    //   717: aload 10
    //   719: invokevirtual 313	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   722: astore 13
    //   724: ldc_w 314
    //   727: invokestatic 320	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   730: astore 14
    //   732: invokestatic 324	com/google/android/gms/ads/internal/zzr:zzbG	()Lcom/google/android/gms/internal/zzmq;
    //   735: astore 15
    //   737: iconst_0
    //   738: istore_2
    //   739: aload 15
    //   741: invokeinterface 327 1 0
    //   746: lstore 6
    //   748: new 329	com/google/android/gms/internal/zziz
    //   751: dup
    //   752: getstatic 332	com/google/android/gms/internal/zzbt:zzvS	Lcom/google/android/gms/internal/zzbp;
    //   755: invokevirtual 156	com/google/android/gms/internal/zzbp:get	()Ljava/lang/Object;
    //   758: checkcast 334	java/lang/Long
    //   761: invokevirtual 337	java/lang/Long:longValue	()J
    //   764: invokespecial 340	com/google/android/gms/internal/zziz:<init>	(J)V
    //   767: astore 18
    //   769: getstatic 343	com/google/android/gms/internal/zzbt:zzvR	Lcom/google/android/gms/internal/zzbp;
    //   772: invokevirtual 156	com/google/android/gms/internal/zzbp:get	()Ljava/lang/Object;
    //   775: checkcast 334	java/lang/Long
    //   778: invokevirtual 337	java/lang/Long:longValue	()J
    //   781: lstore 8
    //   783: aload 12
    //   785: aload 14
    //   787: invokeinterface 349 2 0
    //   792: istore_3
    //   793: iload_3
    //   794: iflt +292 -> 1086
    //   797: iload_2
    //   798: iload_3
    //   799: iadd
    //   800: istore_3
    //   801: iload_3
    //   802: iload 5
    //   804: if_icmple +82 -> 886
    //   807: ldc_w 293
    //   810: astore 11
    //   812: aload 11
    //   814: astore 12
    //   816: aload 11
    //   818: astore 13
    //   820: new 75	java/lang/StringBuilder
    //   823: dup
    //   824: ldc_w 291
    //   827: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   830: iload_3
    //   831: invokestatic 229	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   834: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   837: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   840: astore 14
    //   842: aload 14
    //   844: astore 13
    //   846: aload 11
    //   848: astore 12
    //   850: aload 11
    //   852: astore 15
    //   854: new 110	java/io/IOException
    //   857: dup
    //   858: ldc_w 351
    //   861: invokespecial 237	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   864: athrow
    //   865: astore 11
    //   867: aload 10
    //   869: astore 14
    //   871: aload 11
    //   873: astore 10
    //   875: aload 13
    //   877: astore 11
    //   879: aload 14
    //   881: astore 13
    //   883: goto -509 -> 374
    //   886: aload 14
    //   888: invokevirtual 355	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   891: pop
    //   892: aload 13
    //   894: aload 14
    //   896: invokevirtual 360	java/nio/channels/FileChannel:write	(Ljava/nio/ByteBuffer;)I
    //   899: ifgt -7 -> 892
    //   902: aload 14
    //   904: invokevirtual 363	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   907: pop
    //   908: aload 15
    //   910: invokeinterface 327 1 0
    //   915: lload 6
    //   917: lsub
    //   918: ldc2_w 364
    //   921: lload 8
    //   923: lmul
    //   924: lcmp
    //   925: ifle +89 -> 1014
    //   928: ldc_w 367
    //   931: astore 11
    //   933: aload 11
    //   935: astore 12
    //   937: aload 11
    //   939: astore 13
    //   941: new 75	java/lang/StringBuilder
    //   944: dup
    //   945: ldc_w 369
    //   948: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   951: lload 8
    //   953: invokestatic 371	java/lang/Long:toString	(J)Ljava/lang/String;
    //   956: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   959: ldc_w 373
    //   962: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   965: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   968: astore 14
    //   970: aload 14
    //   972: astore 13
    //   974: aload 11
    //   976: astore 12
    //   978: aload 11
    //   980: astore 15
    //   982: new 110	java/io/IOException
    //   985: dup
    //   986: ldc_w 375
    //   989: invokespecial 237	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   992: athrow
    //   993: astore 11
    //   995: aload 10
    //   997: astore 13
    //   999: aload 11
    //   1001: astore 10
    //   1003: aload 14
    //   1005: astore 11
    //   1007: aload 15
    //   1009: astore 12
    //   1011: goto -637 -> 374
    //   1014: aload_0
    //   1015: getfield 129	com/google/android/gms/internal/zzdu:zzAa	Z
    //   1018: ifeq +39 -> 1057
    //   1021: ldc_w 377
    //   1024: astore 13
    //   1026: aload 13
    //   1028: astore 12
    //   1030: new 110	java/io/IOException
    //   1033: dup
    //   1034: ldc_w 379
    //   1037: invokespecial 237	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   1040: athrow
    //   1041: astore 14
    //   1043: aconst_null
    //   1044: astore 11
    //   1046: aload 10
    //   1048: astore 13
    //   1050: aload 14
    //   1052: astore 10
    //   1054: goto -680 -> 374
    //   1057: iload_3
    //   1058: istore_2
    //   1059: aload 18
    //   1061: invokevirtual 382	com/google/android/gms/internal/zziz:tryAcquire	()Z
    //   1064: ifeq -281 -> 783
    //   1067: aload_0
    //   1068: aload_1
    //   1069: aload 16
    //   1071: invokevirtual 82	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1074: iload_3
    //   1075: iload 4
    //   1077: iconst_0
    //   1078: invokevirtual 385	com/google/android/gms/internal/zzdu:zza	(Ljava/lang/String;Ljava/lang/String;IIZ)V
    //   1081: iload_3
    //   1082: istore_2
    //   1083: goto -300 -> 783
    //   1086: aload 10
    //   1088: invokevirtual 253	java/io/FileOutputStream:close	()V
    //   1091: iconst_3
    //   1092: invokestatic 389	com/google/android/gms/internal/zzin:zzQ	(I)Z
    //   1095: ifeq +44 -> 1139
    //   1098: getstatic 36	com/google/android/gms/internal/zzdu:zzzY	Ljava/text/DecimalFormat;
    //   1101: iload_2
    //   1102: i2l
    //   1103: invokevirtual 282	java/text/DecimalFormat:format	(J)Ljava/lang/String;
    //   1106: astore 12
    //   1108: new 75	java/lang/StringBuilder
    //   1111: dup
    //   1112: ldc_w 391
    //   1115: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1118: aload 12
    //   1120: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1123: ldc_w 297
    //   1126: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1129: aload_1
    //   1130: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1133: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1136: invokestatic 182	com/google/android/gms/internal/zzin:zzaI	(Ljava/lang/String;)V
    //   1139: aload 16
    //   1141: iconst_1
    //   1142: iconst_0
    //   1143: invokevirtual 93	java/io/File:setReadable	(ZZ)Z
    //   1146: pop
    //   1147: aload 11
    //   1149: invokestatic 393	com/google/android/gms/internal/zzdu:zzb	(Ljava/io/File;)V
    //   1152: aload_0
    //   1153: aload_1
    //   1154: aload 16
    //   1156: invokevirtual 82	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1159: iload_2
    //   1160: invokevirtual 185	com/google/android/gms/internal/zzdu:zza	(Ljava/lang/String;Ljava/lang/String;I)V
    //   1163: getstatic 27	com/google/android/gms/internal/zzdu:zzzX	Ljava/util/Set;
    //   1166: aload 17
    //   1168: invokeinterface 271 2 0
    //   1173: pop
    //   1174: iconst_1
    //   1175: ireturn
    //   1176: new 75	java/lang/StringBuilder
    //   1179: dup
    //   1180: ldc_w 395
    //   1183: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1186: aload_1
    //   1187: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1190: ldc_w 257
    //   1193: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1196: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1199: aload 10
    //   1201: invokestatic 399	com/google/android/gms/internal/zzin:zzd	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1204: goto -776 -> 428
    //   1207: astore 13
    //   1209: goto -813 -> 396
    //   1212: astore 13
    //   1214: goto -818 -> 396
    //   1217: astore 10
    //   1219: aconst_null
    //   1220: astore 11
    //   1222: ldc_w 401
    //   1225: astore 12
    //   1227: goto -853 -> 374
    //   1230: astore 10
    //   1232: aconst_null
    //   1233: astore 11
    //   1235: goto -861 -> 374
    //   1238: astore 10
    //   1240: goto -866 -> 374
    //   1243: astore 14
    //   1245: aconst_null
    //   1246: astore 11
    //   1248: ldc_w 401
    //   1251: astore 12
    //   1253: aload 10
    //   1255: astore 13
    //   1257: aload 14
    //   1259: astore 10
    //   1261: goto -887 -> 374
    //   1264: astore 12
    //   1266: aconst_null
    //   1267: astore 11
    //   1269: aload 10
    //   1271: astore 14
    //   1273: aload 12
    //   1275: astore 10
    //   1277: aload 13
    //   1279: astore 12
    //   1281: aload 14
    //   1283: astore 13
    //   1285: goto -911 -> 374
    //   1288: astore 10
    //   1290: aconst_null
    //   1291: astore 11
    //   1293: ldc_w 401
    //   1296: astore 12
    //   1298: goto -924 -> 374
    //   1301: astore 10
    //   1303: aconst_null
    //   1304: astore 11
    //   1306: goto -932 -> 374
    //   1309: astore 14
    //   1311: aconst_null
    //   1312: astore 11
    //   1314: ldc_w 401
    //   1317: astore 12
    //   1319: aload 10
    //   1321: astore 13
    //   1323: aload 14
    //   1325: astore 10
    //   1327: goto -953 -> 374
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1330	0	this	zzdu
    //   0	1330	1	paramString	String
    //   112	1048	2	i	int
    //   792	290	3	j	int
    //   500	576	4	k	int
    //   577	228	5	m	int
    //   746	170	6	l1	long
    //   781	171	8	l2	long
    //   65	234	10	localObject1	Object
    //   372	124	10	localIOException1	IOException
    //   635	565	10	localObject2	Object
    //   1217	1	10	localRuntimeException1	RuntimeException
    //   1230	1	10	localRuntimeException2	RuntimeException
    //   1238	16	10	localRuntimeException3	RuntimeException
    //   1259	17	10	localObject3	Object
    //   1288	1	10	localIOException2	IOException
    //   1301	19	10	localIOException3	IOException
    //   1325	1	10	localObject4	Object
    //   88	763	11	localObject5	Object
    //   865	7	11	localIOException4	IOException
    //   877	102	11	localObject6	Object
    //   993	7	11	localRuntimeException4	RuntimeException
    //   1005	308	11	localObject7	Object
    //   316	936	12	localObject8	Object
    //   1264	10	12	localRuntimeException5	RuntimeException
    //   1279	39	12	localObject9	Object
    //   250	799	13	localObject10	Object
    //   1207	1	13	localIOException5	IOException
    //   1212	1	13	localNullPointerException	NullPointerException
    //   1255	67	13	localObject11	Object
    //   730	274	14	localObject12	Object
    //   1041	10	14	localIOException6	IOException
    //   1243	15	14	localRuntimeException6	RuntimeException
    //   1271	11	14	localObject13	Object
    //   1309	15	14	localIOException7	IOException
    //   735	273	15	localObject14	Object
    //   80	1075	16	localFile	File
    //   169	998	17	str	String
    //   767	293	18	localzziz	zziz
    // Exception table:
    //   from	to	target	type
    //   179	227	229	finally
    //   235	249	229	finally
    //   339	372	372	java/io/IOException
    //   854	865	865	java/io/IOException
    //   982	993	865	java/io/IOException
    //   854	865	993	java/lang/RuntimeException
    //   982	993	993	java/lang/RuntimeException
    //   820	842	1041	java/io/IOException
    //   941	970	1041	java/io/IOException
    //   1030	1041	1041	java/io/IOException
    //   391	396	1207	java/io/IOException
    //   391	396	1212	java/lang/NullPointerException
    //   252	307	1217	java/lang/RuntimeException
    //   495	502	1217	java/lang/RuntimeException
    //   507	552	1217	java/lang/RuntimeException
    //   554	579	1217	java/lang/RuntimeException
    //   586	663	1217	java/lang/RuntimeException
    //   665	717	1217	java/lang/RuntimeException
    //   318	339	1230	java/lang/RuntimeException
    //   339	372	1238	java/lang/RuntimeException
    //   717	737	1243	java/lang/RuntimeException
    //   739	783	1243	java/lang/RuntimeException
    //   783	793	1243	java/lang/RuntimeException
    //   886	892	1243	java/lang/RuntimeException
    //   892	928	1243	java/lang/RuntimeException
    //   1014	1021	1243	java/lang/RuntimeException
    //   1059	1081	1243	java/lang/RuntimeException
    //   1086	1139	1243	java/lang/RuntimeException
    //   1139	1174	1243	java/lang/RuntimeException
    //   820	842	1264	java/lang/RuntimeException
    //   941	970	1264	java/lang/RuntimeException
    //   1030	1041	1264	java/lang/RuntimeException
    //   252	307	1288	java/io/IOException
    //   495	502	1288	java/io/IOException
    //   507	552	1288	java/io/IOException
    //   554	579	1288	java/io/IOException
    //   586	663	1288	java/io/IOException
    //   665	717	1288	java/io/IOException
    //   318	339	1301	java/io/IOException
    //   717	737	1309	java/io/IOException
    //   739	783	1309	java/io/IOException
    //   783	793	1309	java/io/IOException
    //   886	892	1309	java/io/IOException
    //   892	928	1309	java/io/IOException
    //   1014	1021	1309	java/io/IOException
    //   1059	1081	1309	java/io/IOException
    //   1086	1139	1309	java/io/IOException
    //   1139	1174	1309	java/io/IOException
  }
  
  public int zzea()
  {
    int i = 0;
    int k = 0;
    if (zzzZ == null) {
      return k;
    }
    File[] arrayOfFile = zzzZ.listFiles();
    int m = arrayOfFile.length;
    int j = 0;
    for (;;)
    {
      k = i;
      if (j >= m) {
        break;
      }
      k = i;
      if (!arrayOfFile[j].getName().endsWith(".done")) {
        k = i + 1;
      }
      j += 1;
      i = k;
    }
  }
  
  public boolean zzeb()
  {
    if (zzzZ == null) {
      return false;
    }
    Object localObject = null;
    long l1 = Long.MAX_VALUE;
    File[] arrayOfFile = zzzZ.listFiles();
    int j = arrayOfFile.length;
    int i = 0;
    if (i < j)
    {
      File localFile = arrayOfFile[i];
      if (localFile.getName().endsWith(".done")) {
        break label134;
      }
      long l2 = localFile.lastModified();
      if (l2 >= l1) {
        break label134;
      }
      localObject = localFile;
      l1 = l2;
    }
    label134:
    for (;;)
    {
      i += 1;
      break;
      boolean bool2;
      if (localObject != null)
      {
        bool2 = ((File)localObject).delete();
        localObject = zza((File)localObject);
        bool1 = bool2;
        if (!((File)localObject).isFile()) {}
      }
      for (boolean bool1 = bool2 & ((File)localObject).delete();; bool1 = false) {
        return bool1;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */