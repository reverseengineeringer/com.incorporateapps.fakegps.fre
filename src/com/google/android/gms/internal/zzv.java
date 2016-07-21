package com.google.android.gms.internal;

import android.os.SystemClock;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzv
  implements zzb
{
  private final int zzaA;
  private final Map zzax = new LinkedHashMap(16, 0.75F, true);
  private long zzay = 0L;
  private final File zzaz;
  
  public zzv(File paramFile)
  {
    this(paramFile, 5242880);
  }
  
  public zzv(File paramFile, int paramInt)
  {
    zzaz = paramFile;
    zzaA = paramInt;
  }
  
  private void removeEntry(String paramString)
  {
    zzv.zza localzza = (zzv.zza)zzax.get(paramString);
    if (localzza != null)
    {
      zzay -= zzaB;
      zzax.remove(paramString);
    }
  }
  
  private static int zza(InputStream paramInputStream)
  {
    int i = paramInputStream.read();
    if (i == -1) {
      throw new EOFException();
    }
    return i;
  }
  
  static void zza(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write(paramInt >> 0 & 0xFF);
    paramOutputStream.write(paramInt >> 8 & 0xFF);
    paramOutputStream.write(paramInt >> 16 & 0xFF);
    paramOutputStream.write(paramInt >> 24 & 0xFF);
  }
  
  static void zza(OutputStream paramOutputStream, long paramLong)
  {
    paramOutputStream.write((byte)(int)(paramLong >>> 0));
    paramOutputStream.write((byte)(int)(paramLong >>> 8));
    paramOutputStream.write((byte)(int)(paramLong >>> 16));
    paramOutputStream.write((byte)(int)(paramLong >>> 24));
    paramOutputStream.write((byte)(int)(paramLong >>> 32));
    paramOutputStream.write((byte)(int)(paramLong >>> 40));
    paramOutputStream.write((byte)(int)(paramLong >>> 48));
    paramOutputStream.write((byte)(int)(paramLong >>> 56));
  }
  
  static void zza(OutputStream paramOutputStream, String paramString)
  {
    paramString = paramString.getBytes("UTF-8");
    zza(paramOutputStream, paramString.length);
    paramOutputStream.write(paramString, 0, paramString.length);
  }
  
  private void zza(String paramString, zzv.zza paramzza)
  {
    if (!zzax.containsKey(paramString)) {}
    zzv.zza localzza;
    long l;
    for (zzay += zzaB;; zzay = (zzaB - zzaB + l))
    {
      zzax.put(paramString, paramzza);
      return;
      localzza = (zzv.zza)zzax.get(paramString);
      l = zzay;
    }
  }
  
  static void zza(Map paramMap, OutputStream paramOutputStream)
  {
    if (paramMap != null)
    {
      zza(paramOutputStream, paramMap.size());
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        zza(paramOutputStream, (String)localEntry.getKey());
        zza(paramOutputStream, (String)localEntry.getValue());
      }
    }
    zza(paramOutputStream, 0);
  }
  
  private static byte[] zza(InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    while (i < paramInt)
    {
      int j = paramInputStream.read(arrayOfByte, i, paramInt - i);
      if (j == -1) {
        break;
      }
      i += j;
    }
    if (i != paramInt) {
      throw new IOException("Expected " + paramInt + " bytes, read " + i + " bytes");
    }
    return arrayOfByte;
  }
  
  static int zzb(InputStream paramInputStream)
  {
    return zza(paramInputStream) << 0 | 0x0 | zza(paramInputStream) << 8 | zza(paramInputStream) << 16 | zza(paramInputStream) << 24;
  }
  
  static long zzc(InputStream paramInputStream)
  {
    return 0L | (zza(paramInputStream) & 0xFF) << 0 | (zza(paramInputStream) & 0xFF) << 8 | (zza(paramInputStream) & 0xFF) << 16 | (zza(paramInputStream) & 0xFF) << 24 | (zza(paramInputStream) & 0xFF) << 32 | (zza(paramInputStream) & 0xFF) << 40 | (zza(paramInputStream) & 0xFF) << 48 | (zza(paramInputStream) & 0xFF) << 56;
  }
  
  private void zzc(int paramInt)
  {
    if (zzay + paramInt < zzaA) {}
    label119:
    label229:
    label233:
    for (;;)
    {
      return;
      if (zzs.DEBUG) {
        zzs.zza("Pruning old cache entries.", new Object[0]);
      }
      long l1 = zzay;
      long l2 = SystemClock.elapsedRealtime();
      Iterator localIterator = zzax.entrySet().iterator();
      int i = 0;
      zzv.zza localzza;
      if (localIterator.hasNext())
      {
        localzza = (zzv.zza)((Map.Entry)localIterator.next()).getValue();
        if (zzf(key).delete())
        {
          zzay -= zzaB;
          localIterator.remove();
          i += 1;
          if ((float)(zzay + paramInt) >= zzaA * 0.9F) {
            break label229;
          }
        }
      }
      for (;;)
      {
        if (!zzs.DEBUG) {
          break label233;
        }
        zzs.zza("pruned %d files, %d bytes, %d ms", new Object[] { Integer.valueOf(i), Long.valueOf(zzay - l1), Long.valueOf(SystemClock.elapsedRealtime() - l2) });
        return;
        zzs.zzb("Could not delete cache entry for key=%s, filename=%s", new Object[] { key, zze(key) });
        break label119;
        break;
      }
    }
  }
  
  static String zzd(InputStream paramInputStream)
  {
    return new String(zza(paramInputStream, (int)zzc(paramInputStream)), "UTF-8");
  }
  
  private String zze(String paramString)
  {
    int i = paramString.length() / 2;
    int j = paramString.substring(0, i).hashCode();
    return String.valueOf(j) + String.valueOf(paramString.substring(i).hashCode());
  }
  
  static Map zze(InputStream paramInputStream)
  {
    int j = zzb(paramInputStream);
    if (j == 0) {}
    for (Object localObject = Collections.emptyMap();; localObject = new HashMap(j))
    {
      int i = 0;
      while (i < j)
      {
        ((Map)localObject).put(zzd(paramInputStream).intern(), zzd(paramInputStream).intern());
        i += 1;
      }
    }
    return (Map)localObject;
  }
  
  public void remove(String paramString)
  {
    try
    {
      boolean bool = zzf(paramString).delete();
      removeEntry(paramString);
      if (!bool) {
        zzs.zzb("Could not delete cache entry for key=%s, filename=%s", new Object[] { paramString, zze(paramString) });
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public zzb.zza zza(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 32	com/google/android/gms/internal/zzv:zzax	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 46 2 0
    //   12: checkcast 48	com/google/android/gms/internal/zzv$zza
    //   15: astore 4
    //   17: aload 4
    //   19: ifnonnull +9 -> 28
    //   22: aconst_null
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: areturn
    //   28: aload_0
    //   29: aload_1
    //   30: invokevirtual 192	com/google/android/gms/internal/zzv:zzf	(Ljava/lang/String;)Ljava/io/File;
    //   33: astore 5
    //   35: new 269	com/google/android/gms/internal/zzv$zzb
    //   38: dup
    //   39: new 271	java/io/FileInputStream
    //   42: dup
    //   43: aload 5
    //   45: invokespecial 273	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   48: aconst_null
    //   49: invokespecial 276	com/google/android/gms/internal/zzv$zzb:<init>	(Ljava/io/InputStream;Lcom/google/android/gms/internal/zzv$1;)V
    //   52: astore_3
    //   53: aload_3
    //   54: astore_2
    //   55: aload_3
    //   56: invokestatic 279	com/google/android/gms/internal/zzv$zza:zzf	(Ljava/io/InputStream;)Lcom/google/android/gms/internal/zzv$zza;
    //   59: pop
    //   60: aload_3
    //   61: astore_2
    //   62: aload 4
    //   64: aload_3
    //   65: aload 5
    //   67: invokevirtual 281	java/io/File:length	()J
    //   70: aload_3
    //   71: invokestatic 284	com/google/android/gms/internal/zzv$zzb:zza	(Lcom/google/android/gms/internal/zzv$zzb;)I
    //   74: i2l
    //   75: lsub
    //   76: l2i
    //   77: invokestatic 227	com/google/android/gms/internal/zzv:zza	(Ljava/io/InputStream;I)[B
    //   80: invokevirtual 287	com/google/android/gms/internal/zzv$zza:zzb	([B)Lcom/google/android/gms/internal/zzb$zza;
    //   83: astore 4
    //   85: aload 4
    //   87: astore_1
    //   88: aload_3
    //   89: invokevirtual 290	com/google/android/gms/internal/zzv$zzb:close	()V
    //   92: goto -68 -> 24
    //   95: astore_1
    //   96: aconst_null
    //   97: astore_1
    //   98: goto -74 -> 24
    //   101: astore 4
    //   103: aconst_null
    //   104: astore_3
    //   105: aload_3
    //   106: astore_2
    //   107: ldc_w 292
    //   110: iconst_2
    //   111: anewarray 4	java/lang/Object
    //   114: dup
    //   115: iconst_0
    //   116: aload 5
    //   118: invokevirtual 295	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   121: aastore
    //   122: dup
    //   123: iconst_1
    //   124: aload 4
    //   126: invokevirtual 296	java/io/IOException:toString	()Ljava/lang/String;
    //   129: aastore
    //   130: invokestatic 221	com/google/android/gms/internal/zzs:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   133: aload_3
    //   134: astore_2
    //   135: aload_0
    //   136: aload_1
    //   137: invokevirtual 298	com/google/android/gms/internal/zzv:remove	(Ljava/lang/String;)V
    //   140: aload_3
    //   141: ifnull +7 -> 148
    //   144: aload_3
    //   145: invokevirtual 290	com/google/android/gms/internal/zzv$zzb:close	()V
    //   148: aconst_null
    //   149: astore_1
    //   150: goto -126 -> 24
    //   153: astore_1
    //   154: aconst_null
    //   155: astore_1
    //   156: goto -132 -> 24
    //   159: astore_1
    //   160: aconst_null
    //   161: astore_2
    //   162: aload_2
    //   163: ifnull +7 -> 170
    //   166: aload_2
    //   167: invokevirtual 290	com/google/android/gms/internal/zzv$zzb:close	()V
    //   170: aload_1
    //   171: athrow
    //   172: astore_1
    //   173: aload_0
    //   174: monitorexit
    //   175: aload_1
    //   176: athrow
    //   177: astore_1
    //   178: aconst_null
    //   179: astore_1
    //   180: goto -156 -> 24
    //   183: astore_1
    //   184: goto -22 -> 162
    //   187: astore 4
    //   189: goto -84 -> 105
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	192	0	this	zzv
    //   0	192	1	paramString	String
    //   54	113	2	localzzb1	zzv.zzb
    //   52	93	3	localzzb2	zzv.zzb
    //   15	71	4	localObject	Object
    //   101	24	4	localIOException1	IOException
    //   187	1	4	localIOException2	IOException
    //   33	84	5	localFile	File
    // Exception table:
    //   from	to	target	type
    //   88	92	95	java/io/IOException
    //   35	53	101	java/io/IOException
    //   144	148	153	java/io/IOException
    //   35	53	159	finally
    //   2	17	172	finally
    //   28	35	172	finally
    //   88	92	172	finally
    //   144	148	172	finally
    //   166	170	172	finally
    //   170	172	172	finally
    //   166	170	177	java/io/IOException
    //   55	60	183	finally
    //   62	85	183	finally
    //   107	133	183	finally
    //   135	140	183	finally
    //   55	60	187	java/io/IOException
    //   62	85	187	java/io/IOException
  }
  
  /* Error */
  public void zza()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 36	com/google/android/gms/internal/zzv:zzaz	Ljava/io/File;
    //   6: invokevirtual 301	java/io/File:exists	()Z
    //   9: ifne +36 -> 45
    //   12: aload_0
    //   13: getfield 36	com/google/android/gms/internal/zzv:zzaz	Ljava/io/File;
    //   16: invokevirtual 304	java/io/File:mkdirs	()Z
    //   19: ifne +23 -> 42
    //   22: ldc_w 306
    //   25: iconst_1
    //   26: anewarray 4	java/lang/Object
    //   29: dup
    //   30: iconst_0
    //   31: aload_0
    //   32: getfield 36	com/google/android/gms/internal/zzv:zzaz	Ljava/io/File;
    //   35: invokevirtual 295	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   38: aastore
    //   39: invokestatic 308	com/google/android/gms/internal/zzs:zzc	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: aload_0
    //   46: getfield 36	com/google/android/gms/internal/zzv:zzaz	Ljava/io/File;
    //   49: invokevirtual 312	java/io/File:listFiles	()[Ljava/io/File;
    //   52: astore 5
    //   54: aload 5
    //   56: ifnull -14 -> 42
    //   59: aload 5
    //   61: arraylength
    //   62: istore_2
    //   63: iconst_0
    //   64: istore_1
    //   65: iload_1
    //   66: iload_2
    //   67: if_icmpge -25 -> 42
    //   70: aload 5
    //   72: iload_1
    //   73: aaload
    //   74: astore 6
    //   76: aconst_null
    //   77: astore_3
    //   78: new 314	java/io/BufferedInputStream
    //   81: dup
    //   82: new 271	java/io/FileInputStream
    //   85: dup
    //   86: aload 6
    //   88: invokespecial 273	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   91: invokespecial 317	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   94: astore 4
    //   96: aload 4
    //   98: astore_3
    //   99: aload 4
    //   101: invokestatic 279	com/google/android/gms/internal/zzv$zza:zzf	(Ljava/io/InputStream;)Lcom/google/android/gms/internal/zzv$zza;
    //   104: astore 7
    //   106: aload 4
    //   108: astore_3
    //   109: aload 7
    //   111: aload 6
    //   113: invokevirtual 281	java/io/File:length	()J
    //   116: putfield 51	com/google/android/gms/internal/zzv$zza:zzaB	J
    //   119: aload 4
    //   121: astore_3
    //   122: aload_0
    //   123: aload 7
    //   125: getfield 188	com/google/android/gms/internal/zzv$zza:key	Ljava/lang/String;
    //   128: aload 7
    //   130: invokespecial 319	com/google/android/gms/internal/zzv:zza	(Ljava/lang/String;Lcom/google/android/gms/internal/zzv$zza;)V
    //   133: aload 4
    //   135: invokevirtual 320	java/io/BufferedInputStream:close	()V
    //   138: iload_1
    //   139: iconst_1
    //   140: iadd
    //   141: istore_1
    //   142: goto -77 -> 65
    //   145: astore_3
    //   146: aconst_null
    //   147: astore 4
    //   149: aload 6
    //   151: ifnull +12 -> 163
    //   154: aload 4
    //   156: astore_3
    //   157: aload 6
    //   159: invokevirtual 197	java/io/File:delete	()Z
    //   162: pop
    //   163: aload 4
    //   165: ifnull -27 -> 138
    //   168: aload 4
    //   170: invokevirtual 320	java/io/BufferedInputStream:close	()V
    //   173: goto -35 -> 138
    //   176: astore_3
    //   177: goto -39 -> 138
    //   180: astore 5
    //   182: aload_3
    //   183: astore 4
    //   185: aload 5
    //   187: astore_3
    //   188: aload 4
    //   190: ifnull +8 -> 198
    //   193: aload 4
    //   195: invokevirtual 320	java/io/BufferedInputStream:close	()V
    //   198: aload_3
    //   199: athrow
    //   200: astore_3
    //   201: aload_0
    //   202: monitorexit
    //   203: aload_3
    //   204: athrow
    //   205: astore_3
    //   206: goto -68 -> 138
    //   209: astore 4
    //   211: goto -13 -> 198
    //   214: astore 5
    //   216: aload_3
    //   217: astore 4
    //   219: aload 5
    //   221: astore_3
    //   222: goto -34 -> 188
    //   225: astore_3
    //   226: goto -77 -> 149
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	this	zzv
    //   64	78	1	i	int
    //   62	6	2	j	int
    //   77	45	3	localObject1	Object
    //   145	1	3	localIOException1	IOException
    //   156	1	3	localObject2	Object
    //   176	7	3	localIOException2	IOException
    //   187	12	3	localObject3	Object
    //   200	4	3	localObject4	Object
    //   205	12	3	localIOException3	IOException
    //   221	1	3	localObject5	Object
    //   225	1	3	localIOException4	IOException
    //   94	100	4	localObject6	Object
    //   209	1	4	localIOException5	IOException
    //   217	1	4	localIOException6	IOException
    //   52	19	5	arrayOfFile	File[]
    //   180	6	5	localObject7	Object
    //   214	6	5	localObject8	Object
    //   74	84	6	localFile	File
    //   104	25	7	localzza	zzv.zza
    // Exception table:
    //   from	to	target	type
    //   78	96	145	java/io/IOException
    //   168	173	176	java/io/IOException
    //   78	96	180	finally
    //   2	42	200	finally
    //   45	54	200	finally
    //   59	63	200	finally
    //   133	138	200	finally
    //   168	173	200	finally
    //   193	198	200	finally
    //   198	200	200	finally
    //   133	138	205	java/io/IOException
    //   193	198	209	java/io/IOException
    //   99	106	214	finally
    //   109	119	214	finally
    //   122	133	214	finally
    //   157	163	214	finally
    //   99	106	225	java/io/IOException
    //   109	119	225	java/io/IOException
    //   122	133	225	java/io/IOException
  }
  
  /* Error */
  public void zza(String paramString, zzb.zza paramzza)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_2
    //   4: getfield 327	com/google/android/gms/internal/zzb$zza:data	[B
    //   7: arraylength
    //   8: invokespecial 329	com/google/android/gms/internal/zzv:zzc	(I)V
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual 192	com/google/android/gms/internal/zzv:zzf	(Ljava/lang/String;)Ljava/io/File;
    //   16: astore_3
    //   17: new 331	java/io/FileOutputStream
    //   20: dup
    //   21: aload_3
    //   22: invokespecial 332	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   25: astore 4
    //   27: new 48	com/google/android/gms/internal/zzv$zza
    //   30: dup
    //   31: aload_1
    //   32: aload_2
    //   33: invokespecial 334	com/google/android/gms/internal/zzv$zza:<init>	(Ljava/lang/String;Lcom/google/android/gms/internal/zzb$zza;)V
    //   36: astore 5
    //   38: aload 5
    //   40: aload 4
    //   42: invokevirtual 337	com/google/android/gms/internal/zzv$zza:zza	(Ljava/io/OutputStream;)Z
    //   45: ifne +61 -> 106
    //   48: aload 4
    //   50: invokevirtual 338	java/io/FileOutputStream:close	()V
    //   53: ldc_w 340
    //   56: iconst_1
    //   57: anewarray 4	java/lang/Object
    //   60: dup
    //   61: iconst_0
    //   62: aload_3
    //   63: invokevirtual 295	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   66: aastore
    //   67: invokestatic 221	com/google/android/gms/internal/zzs:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   70: new 138	java/io/IOException
    //   73: dup
    //   74: invokespecial 341	java/io/IOException:<init>	()V
    //   77: athrow
    //   78: astore_1
    //   79: aload_3
    //   80: invokevirtual 197	java/io/File:delete	()Z
    //   83: ifne +20 -> 103
    //   86: ldc_w 343
    //   89: iconst_1
    //   90: anewarray 4	java/lang/Object
    //   93: dup
    //   94: iconst_0
    //   95: aload_3
    //   96: invokevirtual 295	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   99: aastore
    //   100: invokestatic 221	com/google/android/gms/internal/zzs:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   103: aload_0
    //   104: monitorexit
    //   105: return
    //   106: aload 4
    //   108: aload_2
    //   109: getfield 327	com/google/android/gms/internal/zzb$zza:data	[B
    //   112: invokevirtual 346	java/io/FileOutputStream:write	([B)V
    //   115: aload 4
    //   117: invokevirtual 338	java/io/FileOutputStream:close	()V
    //   120: aload_0
    //   121: aload_1
    //   122: aload 5
    //   124: invokespecial 319	com/google/android/gms/internal/zzv:zza	(Ljava/lang/String;Lcom/google/android/gms/internal/zzv$zza;)V
    //   127: goto -24 -> 103
    //   130: astore_1
    //   131: aload_0
    //   132: monitorexit
    //   133: aload_1
    //   134: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	this	zzv
    //   0	135	1	paramString	String
    //   0	135	2	paramzza	zzb.zza
    //   16	80	3	localFile	File
    //   25	91	4	localFileOutputStream	java.io.FileOutputStream
    //   36	87	5	localzza	zzv.zza
    // Exception table:
    //   from	to	target	type
    //   17	78	78	java/io/IOException
    //   106	127	78	java/io/IOException
    //   2	17	130	finally
    //   17	78	130	finally
    //   79	103	130	finally
    //   106	127	130	finally
  }
  
  public File zzf(String paramString)
  {
    return new File(zzaz, zze(paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */