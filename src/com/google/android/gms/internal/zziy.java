package com.google.android.gms.internal;

import android.content.Context;

public final class zziy
  extends zzim
{
  private final Context mContext;
  private final String zzF;
  private final String zzsy;
  private String zzzN = null;
  
  public zziy(Context paramContext, String paramString1, String paramString2)
  {
    mContext = paramContext;
    zzsy = paramString1;
    zzF = paramString2;
  }
  
  public zziy(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    mContext = paramContext;
    zzsy = paramString1;
    zzF = paramString2;
    zzzN = paramString3;
  }
  
  public final void onStop() {}
  
  /* Error */
  public final void zzbr()
  {
    // Byte code:
    //   0: new 35	java/lang/StringBuilder
    //   3: dup
    //   4: ldc 37
    //   6: invokespecial 40	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   9: aload_0
    //   10: getfield 23	com/google/android/gms/internal/zziy:zzF	Ljava/lang/String;
    //   13: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   19: invokestatic 53	com/google/android/gms/internal/zzin:v	(Ljava/lang/String;)V
    //   22: new 55	java/net/URL
    //   25: dup
    //   26: aload_0
    //   27: getfield 23	com/google/android/gms/internal/zziy:zzF	Ljava/lang/String;
    //   30: invokespecial 56	java/net/URL:<init>	(Ljava/lang/String;)V
    //   33: invokevirtual 60	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   36: checkcast 62	java/net/HttpURLConnection
    //   39: astore_2
    //   40: aload_0
    //   41: getfield 17	com/google/android/gms/internal/zziy:zzzN	Ljava/lang/String;
    //   44: invokestatic 68	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   47: ifeq +74 -> 121
    //   50: invokestatic 74	com/google/android/gms/ads/internal/zzr:zzbC	()Lcom/google/android/gms/internal/zzir;
    //   53: aload_0
    //   54: getfield 19	com/google/android/gms/internal/zziy:mContext	Landroid/content/Context;
    //   57: aload_0
    //   58: getfield 21	com/google/android/gms/internal/zziy:zzsy	Ljava/lang/String;
    //   61: iconst_1
    //   62: aload_2
    //   63: invokevirtual 80	com/google/android/gms/internal/zzir:zza	(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;)V
    //   66: aload_2
    //   67: invokevirtual 84	java/net/HttpURLConnection:getResponseCode	()I
    //   70: istore_1
    //   71: iload_1
    //   72: sipush 200
    //   75: if_icmplt +10 -> 85
    //   78: iload_1
    //   79: sipush 300
    //   82: if_icmplt +34 -> 116
    //   85: new 35	java/lang/StringBuilder
    //   88: dup
    //   89: ldc 86
    //   91: invokespecial 40	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   94: iload_1
    //   95: invokevirtual 89	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   98: ldc 91
    //   100: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: aload_0
    //   104: getfield 23	com/google/android/gms/internal/zziy:zzF	Ljava/lang/String;
    //   107: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   113: invokestatic 94	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   116: aload_2
    //   117: invokevirtual 97	java/net/HttpURLConnection:disconnect	()V
    //   120: return
    //   121: invokestatic 74	com/google/android/gms/ads/internal/zzr:zzbC	()Lcom/google/android/gms/internal/zzir;
    //   124: aload_0
    //   125: getfield 19	com/google/android/gms/internal/zziy:mContext	Landroid/content/Context;
    //   128: aload_0
    //   129: getfield 21	com/google/android/gms/internal/zziy:zzsy	Ljava/lang/String;
    //   132: iconst_1
    //   133: aload_2
    //   134: aload_0
    //   135: getfield 17	com/google/android/gms/internal/zziy:zzzN	Ljava/lang/String;
    //   138: invokevirtual 100	com/google/android/gms/internal/zzir:zza	(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;Ljava/lang/String;)V
    //   141: goto -75 -> 66
    //   144: astore_3
    //   145: aload_2
    //   146: invokevirtual 97	java/net/HttpURLConnection:disconnect	()V
    //   149: aload_3
    //   150: athrow
    //   151: astore_2
    //   152: new 35	java/lang/StringBuilder
    //   155: dup
    //   156: ldc 102
    //   158: invokespecial 40	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   161: aload_0
    //   162: getfield 23	com/google/android/gms/internal/zziy:zzF	Ljava/lang/String;
    //   165: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: ldc 104
    //   170: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: aload_2
    //   174: invokevirtual 107	java/lang/IndexOutOfBoundsException:getMessage	()Ljava/lang/String;
    //   177: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   183: invokestatic 94	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   186: return
    //   187: astore_2
    //   188: new 35	java/lang/StringBuilder
    //   191: dup
    //   192: ldc 109
    //   194: invokespecial 40	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   197: aload_0
    //   198: getfield 23	com/google/android/gms/internal/zziy:zzF	Ljava/lang/String;
    //   201: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: ldc 104
    //   206: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: aload_2
    //   210: invokevirtual 110	java/io/IOException:getMessage	()Ljava/lang/String;
    //   213: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   219: invokestatic 94	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   222: return
    //   223: astore_2
    //   224: new 35	java/lang/StringBuilder
    //   227: dup
    //   228: ldc 109
    //   230: invokespecial 40	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   233: aload_0
    //   234: getfield 23	com/google/android/gms/internal/zziy:zzF	Ljava/lang/String;
    //   237: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: ldc 104
    //   242: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: aload_2
    //   246: invokevirtual 111	java/lang/RuntimeException:getMessage	()Ljava/lang/String;
    //   249: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   255: invokestatic 94	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   258: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	259	0	this	zziy
    //   70	25	1	i	int
    //   39	107	2	localHttpURLConnection	java.net.HttpURLConnection
    //   151	23	2	localIndexOutOfBoundsException	IndexOutOfBoundsException
    //   187	23	2	localIOException	java.io.IOException
    //   223	23	2	localRuntimeException	RuntimeException
    //   144	6	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   40	66	144	finally
    //   66	71	144	finally
    //   85	116	144	finally
    //   121	141	144	finally
    //   0	40	151	java/lang/IndexOutOfBoundsException
    //   116	120	151	java/lang/IndexOutOfBoundsException
    //   145	151	151	java/lang/IndexOutOfBoundsException
    //   0	40	187	java/io/IOException
    //   116	120	187	java/io/IOException
    //   145	151	187	java/io/IOException
    //   0	40	223	java/lang/RuntimeException
    //   116	120	223	java/lang/RuntimeException
    //   145	151	223	java/lang/RuntimeException
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zziy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */