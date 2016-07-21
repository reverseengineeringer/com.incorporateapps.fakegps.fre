package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

class zzah
  extends zzd
{
  private static final byte[] zzTd = "\n".getBytes();
  private final zzaj zzTc;
  private final String zzzN = zza("GoogleAnalytics", zze.VERSION, Build.VERSION.RELEASE, zzam.zza(Locale.getDefault()), Build.MODEL, Build.ID);
  
  zzah(zzf paramzzf)
  {
    super(paramzzf);
    zzTc = new zzaj(paramzzf.zzjl());
  }
  
  /* Error */
  private int zza(URL paramURL, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 7
    //   6: aconst_null
    //   7: astore 8
    //   9: aconst_null
    //   10: astore 6
    //   12: aload_1
    //   13: invokestatic 86	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   16: pop
    //   17: aload_2
    //   18: invokestatic 86	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   21: pop
    //   22: aload_0
    //   23: ldc 88
    //   25: aload_2
    //   26: arraylength
    //   27: invokestatic 94	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   30: aload_1
    //   31: invokevirtual 98	com/google/android/gms/analytics/internal/zzah:zzb	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   34: aload_0
    //   35: invokevirtual 102	com/google/android/gms/analytics/internal/zzah:zzhp	()Z
    //   38: ifeq +17 -> 55
    //   41: aload_0
    //   42: ldc 104
    //   44: new 16	java/lang/String
    //   47: dup
    //   48: aload_2
    //   49: invokespecial 107	java/lang/String:<init>	([B)V
    //   52: invokevirtual 110	com/google/android/gms/analytics/internal/zzah:zza	(Ljava/lang/String;Ljava/lang/Object;)V
    //   55: aload_0
    //   56: aload_1
    //   57: invokevirtual 114	com/google/android/gms/analytics/internal/zzah:zzc	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   60: astore_1
    //   61: aload_1
    //   62: astore 5
    //   64: aload 7
    //   66: astore_1
    //   67: aload 5
    //   69: astore 4
    //   71: aload 8
    //   73: astore 6
    //   75: aload 5
    //   77: iconst_1
    //   78: invokevirtual 120	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   81: aload 7
    //   83: astore_1
    //   84: aload 5
    //   86: astore 4
    //   88: aload 8
    //   90: astore 6
    //   92: aload 5
    //   94: aload_2
    //   95: arraylength
    //   96: invokevirtual 124	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   99: aload 7
    //   101: astore_1
    //   102: aload 5
    //   104: astore 4
    //   106: aload 8
    //   108: astore 6
    //   110: aload 5
    //   112: invokevirtual 127	java/net/HttpURLConnection:connect	()V
    //   115: aload 7
    //   117: astore_1
    //   118: aload 5
    //   120: astore 4
    //   122: aload 8
    //   124: astore 6
    //   126: aload 5
    //   128: invokevirtual 131	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   131: astore 7
    //   133: aload 7
    //   135: astore_1
    //   136: aload 5
    //   138: astore 4
    //   140: aload 7
    //   142: astore 6
    //   144: aload 7
    //   146: aload_2
    //   147: invokevirtual 136	java/io/OutputStream:write	([B)V
    //   150: aload 7
    //   152: astore_1
    //   153: aload 5
    //   155: astore 4
    //   157: aload 7
    //   159: astore 6
    //   161: aload_0
    //   162: aload 5
    //   164: invokespecial 139	com/google/android/gms/analytics/internal/zzah:zzb	(Ljava/net/HttpURLConnection;)V
    //   167: aload 7
    //   169: astore_1
    //   170: aload 5
    //   172: astore 4
    //   174: aload 7
    //   176: astore 6
    //   178: aload 5
    //   180: invokevirtual 143	java/net/HttpURLConnection:getResponseCode	()I
    //   183: istore_3
    //   184: iload_3
    //   185: sipush 200
    //   188: if_icmpne +21 -> 209
    //   191: aload 7
    //   193: astore_1
    //   194: aload 5
    //   196: astore 4
    //   198: aload 7
    //   200: astore 6
    //   202: aload_0
    //   203: invokevirtual 147	com/google/android/gms/analytics/internal/zzah:zziH	()Lcom/google/android/gms/analytics/internal/zzb;
    //   206: invokevirtual 152	com/google/android/gms/analytics/internal/zzb:zzjh	()V
    //   209: aload 7
    //   211: astore_1
    //   212: aload 5
    //   214: astore 4
    //   216: aload 7
    //   218: astore 6
    //   220: aload_0
    //   221: ldc -102
    //   223: iload_3
    //   224: invokestatic 94	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   227: invokevirtual 156	com/google/android/gms/analytics/internal/zzah:zzb	(Ljava/lang/String;Ljava/lang/Object;)V
    //   230: aload 7
    //   232: ifnull +8 -> 240
    //   235: aload 7
    //   237: invokevirtual 159	java/io/OutputStream:close	()V
    //   240: aload 5
    //   242: ifnull +8 -> 250
    //   245: aload 5
    //   247: invokevirtual 162	java/net/HttpURLConnection:disconnect	()V
    //   250: iload_3
    //   251: ireturn
    //   252: astore_1
    //   253: aload_0
    //   254: ldc -92
    //   256: aload_1
    //   257: invokevirtual 167	com/google/android/gms/analytics/internal/zzah:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   260: goto -20 -> 240
    //   263: astore_2
    //   264: aconst_null
    //   265: astore 5
    //   267: aload 6
    //   269: astore_1
    //   270: aload 5
    //   272: astore 4
    //   274: aload_0
    //   275: ldc -87
    //   277: aload_2
    //   278: invokevirtual 172	com/google/android/gms/analytics/internal/zzah:zzd	(Ljava/lang/String;Ljava/lang/Object;)V
    //   281: aload 6
    //   283: ifnull +8 -> 291
    //   286: aload 6
    //   288: invokevirtual 159	java/io/OutputStream:close	()V
    //   291: aload 5
    //   293: ifnull +8 -> 301
    //   296: aload 5
    //   298: invokevirtual 162	java/net/HttpURLConnection:disconnect	()V
    //   301: iconst_0
    //   302: ireturn
    //   303: astore_1
    //   304: aload_0
    //   305: ldc -92
    //   307: aload_1
    //   308: invokevirtual 167	com/google/android/gms/analytics/internal/zzah:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   311: goto -20 -> 291
    //   314: astore_2
    //   315: aconst_null
    //   316: astore 4
    //   318: aload 5
    //   320: astore_1
    //   321: aload_1
    //   322: ifnull +7 -> 329
    //   325: aload_1
    //   326: invokevirtual 159	java/io/OutputStream:close	()V
    //   329: aload 4
    //   331: ifnull +8 -> 339
    //   334: aload 4
    //   336: invokevirtual 162	java/net/HttpURLConnection:disconnect	()V
    //   339: aload_2
    //   340: athrow
    //   341: astore_1
    //   342: aload_0
    //   343: ldc -92
    //   345: aload_1
    //   346: invokevirtual 167	com/google/android/gms/analytics/internal/zzah:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   349: goto -20 -> 329
    //   352: astore_2
    //   353: goto -32 -> 321
    //   356: astore_2
    //   357: goto -90 -> 267
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	360	0	this	zzah
    //   0	360	1	paramURL	URL
    //   0	360	2	paramArrayOfByte	byte[]
    //   183	68	3	i	int
    //   69	266	4	localURL1	URL
    //   1	318	5	localURL2	URL
    //   10	277	6	localObject1	Object
    //   4	232	7	localOutputStream	java.io.OutputStream
    //   7	116	8	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   235	240	252	java/io/IOException
    //   55	61	263	java/io/IOException
    //   286	291	303	java/io/IOException
    //   55	61	314	finally
    //   325	329	341	java/io/IOException
    //   75	81	352	finally
    //   92	99	352	finally
    //   110	115	352	finally
    //   126	133	352	finally
    //   144	150	352	finally
    //   161	167	352	finally
    //   178	184	352	finally
    //   202	209	352	finally
    //   220	230	352	finally
    //   274	281	352	finally
    //   75	81	356	java/io/IOException
    //   92	99	356	java/io/IOException
    //   110	115	356	java/io/IOException
    //   126	133	356	java/io/IOException
    //   144	150	356	java/io/IOException
    //   161	167	356	java/io/IOException
    //   178	184	356	java/io/IOException
    //   202	209	356	java/io/IOException
    //   220	230	356	java/io/IOException
  }
  
  private static String zza(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6 });
  }
  
  private void zza(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    if (paramStringBuilder.length() != 0) {
      paramStringBuilder.append('&');
    }
    paramStringBuilder.append(URLEncoder.encode(paramString1, "UTF-8"));
    paramStringBuilder.append('=');
    paramStringBuilder.append(URLEncoder.encode(paramString2, "UTF-8"));
  }
  
  private int zzb(URL paramURL)
  {
    zzx.zzz(paramURL);
    zzb("GET request", paramURL);
    Object localObject = null;
    URL localURL = null;
    try
    {
      paramURL = zzc(paramURL);
      localURL = paramURL;
      localObject = paramURL;
      paramURL.connect();
      localURL = paramURL;
      localObject = paramURL;
      zzb(paramURL);
      localURL = paramURL;
      localObject = paramURL;
      int i = paramURL.getResponseCode();
      if (i == 200)
      {
        localURL = paramURL;
        localObject = paramURL;
        zziH().zzjh();
      }
      localURL = paramURL;
      localObject = paramURL;
      zzb("GET status", Integer.valueOf(i));
      if (paramURL != null) {
        paramURL.disconnect();
      }
      return i;
    }
    catch (IOException paramURL)
    {
      localObject = localURL;
      zzd("Network GET connection error", paramURL);
      if (localURL != null) {
        localURL.disconnect();
      }
      return 0;
    }
    finally
    {
      if (localObject != null) {
        ((HttpURLConnection)localObject).disconnect();
      }
    }
  }
  
  /* Error */
  private int zzb(URL paramURL, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 4
    //   6: aload_1
    //   7: invokestatic 86	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   10: pop
    //   11: aload_2
    //   12: invokestatic 86	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   15: pop
    //   16: aload_2
    //   17: invokestatic 212	com/google/android/gms/analytics/internal/zzah:zzg	([B)[B
    //   20: astore 6
    //   22: aload_0
    //   23: ldc -42
    //   25: aload 6
    //   27: arraylength
    //   28: invokestatic 94	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   31: ldc2_w 215
    //   34: aload 6
    //   36: arraylength
    //   37: i2l
    //   38: lmul
    //   39: aload_2
    //   40: arraylength
    //   41: i2l
    //   42: ldiv
    //   43: invokestatic 221	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   46: aload_1
    //   47: invokevirtual 224	com/google/android/gms/analytics/internal/zzah:zza	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   50: aload 6
    //   52: arraylength
    //   53: aload_2
    //   54: arraylength
    //   55: if_icmple +20 -> 75
    //   58: aload_0
    //   59: ldc -30
    //   61: aload 6
    //   63: arraylength
    //   64: invokestatic 94	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   67: aload_2
    //   68: arraylength
    //   69: invokestatic 94	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   72: invokevirtual 228	com/google/android/gms/analytics/internal/zzah:zzc	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   75: aload_0
    //   76: invokevirtual 102	com/google/android/gms/analytics/internal/zzah:zzhp	()Z
    //   79: ifeq +32 -> 111
    //   82: aload_0
    //   83: ldc -26
    //   85: new 183	java/lang/StringBuilder
    //   88: dup
    //   89: ldc 14
    //   91: invokespecial 233	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   94: new 16	java/lang/String
    //   97: dup
    //   98: aload_2
    //   99: invokespecial 107	java/lang/String:<init>	([B)V
    //   102: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: invokevirtual 237	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: invokevirtual 110	com/google/android/gms/analytics/internal/zzah:zza	(Ljava/lang/String;Ljava/lang/Object;)V
    //   111: aload_0
    //   112: aload_1
    //   113: invokevirtual 114	com/google/android/gms/analytics/internal/zzah:zzc	(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   116: astore_1
    //   117: aload_1
    //   118: iconst_1
    //   119: invokevirtual 120	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   122: aload_1
    //   123: ldc -17
    //   125: ldc -15
    //   127: invokevirtual 245	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   130: aload_1
    //   131: aload 6
    //   133: arraylength
    //   134: invokevirtual 124	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   137: aload_1
    //   138: invokevirtual 127	java/net/HttpURLConnection:connect	()V
    //   141: aload_1
    //   142: invokevirtual 131	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   145: astore_2
    //   146: aload_2
    //   147: aload 6
    //   149: invokevirtual 136	java/io/OutputStream:write	([B)V
    //   152: aload_2
    //   153: invokevirtual 159	java/io/OutputStream:close	()V
    //   156: aload_0
    //   157: aload_1
    //   158: invokespecial 139	com/google/android/gms/analytics/internal/zzah:zzb	(Ljava/net/HttpURLConnection;)V
    //   161: aload_1
    //   162: invokevirtual 143	java/net/HttpURLConnection:getResponseCode	()I
    //   165: istore_3
    //   166: iload_3
    //   167: sipush 200
    //   170: if_icmpne +10 -> 180
    //   173: aload_0
    //   174: invokevirtual 147	com/google/android/gms/analytics/internal/zzah:zziH	()Lcom/google/android/gms/analytics/internal/zzb;
    //   177: invokevirtual 152	com/google/android/gms/analytics/internal/zzb:zzjh	()V
    //   180: aload_0
    //   181: ldc -102
    //   183: iload_3
    //   184: invokestatic 94	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   187: invokevirtual 156	com/google/android/gms/analytics/internal/zzah:zzb	(Ljava/lang/String;Ljava/lang/Object;)V
    //   190: aload_1
    //   191: ifnull +7 -> 198
    //   194: aload_1
    //   195: invokevirtual 162	java/net/HttpURLConnection:disconnect	()V
    //   198: iload_3
    //   199: ireturn
    //   200: astore_2
    //   201: aconst_null
    //   202: astore_1
    //   203: aload_0
    //   204: ldc -9
    //   206: aload_2
    //   207: invokevirtual 172	com/google/android/gms/analytics/internal/zzah:zzd	(Ljava/lang/String;Ljava/lang/Object;)V
    //   210: aload 4
    //   212: ifnull +8 -> 220
    //   215: aload 4
    //   217: invokevirtual 159	java/io/OutputStream:close	()V
    //   220: aload_1
    //   221: ifnull +7 -> 228
    //   224: aload_1
    //   225: invokevirtual 162	java/net/HttpURLConnection:disconnect	()V
    //   228: iconst_0
    //   229: ireturn
    //   230: astore_2
    //   231: aload_0
    //   232: ldc -7
    //   234: aload_2
    //   235: invokevirtual 167	com/google/android/gms/analytics/internal/zzah:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   238: goto -18 -> 220
    //   241: astore_2
    //   242: aconst_null
    //   243: astore_1
    //   244: aload 5
    //   246: astore 4
    //   248: aload 4
    //   250: ifnull +8 -> 258
    //   253: aload 4
    //   255: invokevirtual 159	java/io/OutputStream:close	()V
    //   258: aload_1
    //   259: ifnull +7 -> 266
    //   262: aload_1
    //   263: invokevirtual 162	java/net/HttpURLConnection:disconnect	()V
    //   266: aload_2
    //   267: athrow
    //   268: astore 4
    //   270: aload_0
    //   271: ldc -7
    //   273: aload 4
    //   275: invokevirtual 167	com/google/android/gms/analytics/internal/zzah:zze	(Ljava/lang/String;Ljava/lang/Object;)V
    //   278: goto -20 -> 258
    //   281: astore_2
    //   282: aload 5
    //   284: astore 4
    //   286: goto -38 -> 248
    //   289: astore 5
    //   291: aload_2
    //   292: astore 4
    //   294: aload 5
    //   296: astore_2
    //   297: goto -49 -> 248
    //   300: astore_2
    //   301: goto -53 -> 248
    //   304: astore_2
    //   305: goto -102 -> 203
    //   308: astore 5
    //   310: aload_2
    //   311: astore 4
    //   313: aload 5
    //   315: astore_2
    //   316: goto -113 -> 203
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	319	0	this	zzah
    //   0	319	1	paramURL	URL
    //   0	319	2	paramArrayOfByte	byte[]
    //   165	34	3	i	int
    //   4	250	4	localObject1	Object
    //   268	6	4	localIOException1	IOException
    //   284	28	4	localObject2	Object
    //   1	282	5	localObject3	Object
    //   289	6	5	localObject4	Object
    //   308	6	5	localIOException2	IOException
    //   20	128	6	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   16	75	200	java/io/IOException
    //   75	111	200	java/io/IOException
    //   111	117	200	java/io/IOException
    //   215	220	230	java/io/IOException
    //   16	75	241	finally
    //   75	111	241	finally
    //   111	117	241	finally
    //   253	258	268	java/io/IOException
    //   117	146	281	finally
    //   156	166	281	finally
    //   173	180	281	finally
    //   180	190	281	finally
    //   146	156	289	finally
    //   203	210	300	finally
    //   117	146	304	java/io/IOException
    //   156	166	304	java/io/IOException
    //   173	180	304	java/io/IOException
    //   180	190	304	java/io/IOException
    //   146	156	308	java/io/IOException
  }
  
  private URL zzb(zzab paramzzab, String paramString)
  {
    if (paramzzab.zzlt()) {}
    for (paramzzab = zzjn().zzkF() + zzjn().zzkH() + "?" + paramString;; paramzzab = zzjn().zzkG() + zzjn().zzkH() + "?" + paramString) {
      try
      {
        paramzzab = new URL(paramzzab);
        return paramzzab;
      }
      catch (MalformedURLException paramzzab)
      {
        zze("Error trying to parse the hardcoded host url", paramzzab);
      }
    }
    return null;
  }
  
  private void zzb(HttpURLConnection paramHttpURLConnection)
  {
    localHttpURLConnection = null;
    try
    {
      paramHttpURLConnection = paramHttpURLConnection.getInputStream();
      localHttpURLConnection = paramHttpURLConnection;
      byte[] arrayOfByte = new byte['Ѐ'];
      int i;
      do
      {
        localHttpURLConnection = paramHttpURLConnection;
        i = paramHttpURLConnection.read(arrayOfByte);
      } while (i > 0);
      if (paramHttpURLConnection != null) {}
      try
      {
        paramHttpURLConnection.close();
        return;
      }
      catch (IOException paramHttpURLConnection)
      {
        zze("Error closing http connection input stream", paramHttpURLConnection);
        return;
      }
      try
      {
        localHttpURLConnection.close();
        throw paramHttpURLConnection;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          zze("Error closing http connection input stream", localIOException);
        }
      }
    }
    finally
    {
      if (localHttpURLConnection == null) {}
    }
  }
  
  private boolean zzg(zzab paramzzab)
  {
    zzx.zzz(paramzzab);
    boolean bool;
    Object localObject;
    if (!paramzzab.zzlt())
    {
      bool = true;
      localObject = zza(paramzzab, bool);
      if (localObject != null) {
        break label43;
      }
      zzjm().zza(paramzzab, "Error formatting hit for upload");
    }
    label43:
    label90:
    do
    {
      do
      {
        return true;
        bool = false;
        break;
        if (((String)localObject).length() > zzjn().zzku()) {
          break label90;
        }
        paramzzab = zzb(paramzzab, (String)localObject);
        if (paramzzab == null)
        {
          zzbh("Failed to build collect GET endpoint url");
          return false;
        }
      } while (zzb(paramzzab) == 200);
      return false;
      localObject = zza(paramzzab, false);
      if (localObject == null)
      {
        zzjm().zza(paramzzab, "Error formatting hit for POST upload");
        return true;
      }
      localObject = ((String)localObject).getBytes();
      if (localObject.length > zzjn().zzkw())
      {
        zzjm().zza(paramzzab, "Hit payload exceeds size limit");
        return true;
      }
      paramzzab = zzh(paramzzab);
      if (paramzzab == null)
      {
        zzbh("Failed to build collect POST endpoint url");
        return false;
      }
    } while (zza(paramzzab, (byte[])localObject) == 200);
    return false;
  }
  
  private static byte[] zzg(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(localByteArrayOutputStream);
    localGZIPOutputStream.write(paramArrayOfByte);
    localGZIPOutputStream.close();
    localByteArrayOutputStream.close();
    return localByteArrayOutputStream.toByteArray();
  }
  
  private URL zzh(zzab paramzzab)
  {
    if (paramzzab.zzlt()) {}
    for (paramzzab = zzjn().zzkF() + zzjn().zzkH();; paramzzab = zzjn().zzkG() + zzjn().zzkH()) {
      try
      {
        paramzzab = new URL(paramzzab);
        return paramzzab;
      }
      catch (MalformedURLException paramzzab)
      {
        zze("Error trying to parse the hardcoded host url", paramzzab);
      }
    }
    return null;
  }
  
  private String zzi(zzab paramzzab)
  {
    return String.valueOf(paramzzab.zzlq());
  }
  
  private URL zzlC()
  {
    Object localObject = zzjn().zzkF() + zzjn().zzkI();
    try
    {
      localObject = new URL((String)localObject);
      return (URL)localObject;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      zze("Error trying to parse the hardcoded host url", localMalformedURLException);
    }
    return null;
  }
  
  String zza(zzab paramzzab, boolean paramBoolean)
  {
    zzx.zzz(paramzzab);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      Iterator localIterator = paramzzab.zzn().entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str = (String)localEntry.getKey();
        if ((!"ht".equals(str)) && (!"qt".equals(str)) && (!"AppUID".equals(str)) && (!"z".equals(str)) && (!"_gmsv".equals(str))) {
          zza(localStringBuilder, str, (String)localEntry.getValue());
        }
      }
      zza(localStringBuilder, "ht", String.valueOf(paramzzab.zzlr()));
    }
    catch (UnsupportedEncodingException paramzzab)
    {
      zze("Failed to encode name or value", paramzzab);
      return null;
    }
    zza(localStringBuilder, "qt", String.valueOf(zzjl().currentTimeMillis() - paramzzab.zzlr()));
    if (zzjn().zzkr()) {
      zza(localStringBuilder, "_gmsv", zze.VERSION);
    }
    long l;
    if (paramBoolean)
    {
      l = paramzzab.zzlu();
      if (l == 0L) {
        break label251;
      }
    }
    label251:
    for (paramzzab = String.valueOf(l);; paramzzab = zzi(paramzzab))
    {
      zza(localStringBuilder, "z", paramzzab);
      return localStringBuilder.toString();
    }
  }
  
  List zza(List paramList, boolean paramBoolean)
  {
    if (!paramList.isEmpty()) {}
    zzah.zza localzza;
    ArrayList localArrayList;
    for (boolean bool = true;; bool = false)
    {
      zzx.zzac(bool);
      zza("Uploading batched hits. compression, count", Boolean.valueOf(paramBoolean), Integer.valueOf(paramList.size()));
      localzza = new zzah.zza(this);
      localArrayList = new ArrayList();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        zzab localzzab = (zzab)paramList.next();
        if (!localzza.zzj(localzzab)) {
          break;
        }
        localArrayList.add(Long.valueOf(localzzab.zzlq()));
      }
    }
    if (localzza.zzlE() == 0) {
      return localArrayList;
    }
    paramList = zzlC();
    if (paramList == null)
    {
      zzbh("Failed to build batching endpoint url");
      return Collections.emptyList();
    }
    if (paramBoolean) {}
    for (int i = zzb(paramList, localzza.getPayload()); 200 == i; i = zza(paramList, localzza.getPayload()))
    {
      zza("Batched upload completed. Hits batched", Integer.valueOf(localzza.zzlE()));
      return localArrayList;
    }
    zza("Network error uploading hits. status code", Integer.valueOf(i));
    if (zzjn().zzkL().contains(Integer.valueOf(i)))
    {
      zzbg("Server instructed the client to stop batching");
      zzTc.start();
    }
    return Collections.emptyList();
  }
  
  HttpURLConnection zzc(URL paramURL)
  {
    paramURL = paramURL.openConnection();
    if (!(paramURL instanceof HttpURLConnection)) {
      throw new IOException("Failed to obtain http connection");
    }
    paramURL = (HttpURLConnection)paramURL;
    paramURL.setDefaultUseCaches(false);
    paramURL.setConnectTimeout(zzjn().zzkU());
    paramURL.setReadTimeout(zzjn().zzkV());
    paramURL.setInstanceFollowRedirects(false);
    paramURL.setRequestProperty("User-Agent", zzzN);
    paramURL.setDoInput(true);
    return paramURL;
  }
  
  protected void zziJ()
  {
    zza("Network initialized. User agent", zzzN);
  }
  
  public boolean zzlB()
  {
    zzjk();
    zzjv();
    Object localObject1 = (ConnectivityManager)getContext().getSystemService("connectivity");
    try
    {
      localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
      if ((localObject1 == null) || (!((NetworkInfo)localObject1).isConnected()))
      {
        zzbd("No network connectivity");
        return false;
      }
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return true;
  }
  
  public List zzq(List paramList)
  {
    boolean bool = true;
    zzjk();
    zzjv();
    zzx.zzz(paramList);
    int j;
    int i;
    if ((zzjn().zzkL().isEmpty()) || (!zzTc.zzv(zzjn().zzkE() * 1000L)))
    {
      j = 0;
      bool = false;
      i = j;
      label59:
      if (i != 0) {
        return zza(paramList, bool);
      }
    }
    else
    {
      if (zzjn().zzkJ() != zzm.zzRk) {}
      for (i = 1;; i = 0)
      {
        j = i;
        if (zzjn().zzkK() != zzo.zzRv) {
          break;
        }
        break label59;
      }
    }
    return zzr(paramList);
  }
  
  List zzr(List paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    do
    {
      if (!paramList.hasNext()) {
        break;
      }
      zzab localzzab = (zzab)paramList.next();
      if (!zzg(localzzab)) {
        break;
      }
      localArrayList.add(Long.valueOf(localzzab.zzlq()));
    } while (localArrayList.size() < zzjn().zzkC());
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzah
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */