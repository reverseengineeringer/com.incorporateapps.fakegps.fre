package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzr;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class zzjw
  extends zzjq
{
  public zzjw(zzjp paramzzjp, boolean paramBoolean)
  {
    super(paramzzjp, paramBoolean);
  }
  
  /* Error */
  public WebResourceResponse shouldInterceptRequest(android.webkit.WebView paramWebView, String paramString)
  {
    // Byte code:
    //   0: ldc 21
    //   2: new 23	java/io/File
    //   5: dup
    //   6: aload_2
    //   7: invokespecial 26	java/io/File:<init>	(Ljava/lang/String;)V
    //   10: invokevirtual 30	java/io/File:getName	()Ljava/lang/String;
    //   13: invokevirtual 36	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   16: ifne +10 -> 26
    //   19: aload_0
    //   20: aload_1
    //   21: aload_2
    //   22: invokespecial 38	com/google/android/gms/internal/zzjq:shouldInterceptRequest	(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    //   25: areturn
    //   26: aload_1
    //   27: instanceof 40
    //   30: ifne +15 -> 45
    //   33: ldc 42
    //   35: invokestatic 47	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   38: aload_0
    //   39: aload_1
    //   40: aload_2
    //   41: invokespecial 38	com/google/android/gms/internal/zzjq:shouldInterceptRequest	(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    //   44: areturn
    //   45: aload_1
    //   46: checkcast 40	com/google/android/gms/internal/zzjp
    //   49: astore 4
    //   51: aload 4
    //   53: invokeinterface 51 1 0
    //   58: invokevirtual 55	com/google/android/gms/internal/zzjq:zzfo	()V
    //   61: aload 4
    //   63: invokeinterface 59 1 0
    //   68: getfield 65	com/google/android/gms/ads/internal/client/AdSizeParcel:zzui	Z
    //   71: ifeq +62 -> 133
    //   74: getstatic 71	com/google/android/gms/internal/zzbt:zzwf	Lcom/google/android/gms/internal/zzbp;
    //   77: invokevirtual 77	com/google/android/gms/internal/zzbp:get	()Ljava/lang/Object;
    //   80: checkcast 32	java/lang/String
    //   83: astore_3
    //   84: new 79	java/lang/StringBuilder
    //   87: dup
    //   88: ldc 81
    //   90: invokespecial 82	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   93: aload_3
    //   94: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: ldc 88
    //   99: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: invokestatic 94	com/google/android/gms/internal/zzin:v	(Ljava/lang/String;)V
    //   108: aload_0
    //   109: aload 4
    //   111: invokeinterface 98 1 0
    //   116: aload_0
    //   117: getfield 102	com/google/android/gms/internal/zzjw:zzpD	Lcom/google/android/gms/internal/zzjp;
    //   120: invokeinterface 106 1 0
    //   125: getfield 112	com/google/android/gms/ads/internal/util/client/VersionInfoParcel:afmaVersion	Ljava/lang/String;
    //   128: aload_3
    //   129: invokevirtual 116	com/google/android/gms/internal/zzjw:zzd	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    //   132: areturn
    //   133: aload 4
    //   135: invokeinterface 120 1 0
    //   140: ifeq +16 -> 156
    //   143: getstatic 123	com/google/android/gms/internal/zzbt:zzwe	Lcom/google/android/gms/internal/zzbp;
    //   146: invokevirtual 77	com/google/android/gms/internal/zzbp:get	()Ljava/lang/Object;
    //   149: checkcast 32	java/lang/String
    //   152: astore_3
    //   153: goto -69 -> 84
    //   156: getstatic 126	com/google/android/gms/internal/zzbt:zzwd	Lcom/google/android/gms/internal/zzbp;
    //   159: invokevirtual 77	com/google/android/gms/internal/zzbp:get	()Ljava/lang/Object;
    //   162: checkcast 32	java/lang/String
    //   165: astore_3
    //   166: goto -82 -> 84
    //   169: astore_3
    //   170: new 79	java/lang/StringBuilder
    //   173: dup
    //   174: ldc -128
    //   176: invokespecial 82	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   179: aload_3
    //   180: invokevirtual 133	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   183: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   189: invokestatic 47	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   192: aload_0
    //   193: aload_1
    //   194: aload_2
    //   195: invokespecial 38	com/google/android/gms/internal/zzjq:shouldInterceptRequest	(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    //   198: areturn
    //   199: astore_3
    //   200: goto -30 -> 170
    //   203: astore_3
    //   204: goto -34 -> 170
    //   207: astore_3
    //   208: goto -38 -> 170
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	211	0	this	zzjw
    //   0	211	1	paramWebView	android.webkit.WebView
    //   0	211	2	paramString	String
    //   83	83	3	str	String
    //   169	11	3	localInterruptedException	InterruptedException
    //   199	1	3	localExecutionException	java.util.concurrent.ExecutionException
    //   203	1	3	localIOException	java.io.IOException
    //   207	1	3	localTimeoutException	java.util.concurrent.TimeoutException
    //   49	85	4	localzzjp	zzjp
    // Exception table:
    //   from	to	target	type
    //   0	26	169	java/lang/InterruptedException
    //   26	45	169	java/lang/InterruptedException
    //   45	84	169	java/lang/InterruptedException
    //   84	133	169	java/lang/InterruptedException
    //   133	153	169	java/lang/InterruptedException
    //   156	166	169	java/lang/InterruptedException
    //   0	26	199	java/util/concurrent/ExecutionException
    //   26	45	199	java/util/concurrent/ExecutionException
    //   45	84	199	java/util/concurrent/ExecutionException
    //   84	133	199	java/util/concurrent/ExecutionException
    //   133	153	199	java/util/concurrent/ExecutionException
    //   156	166	199	java/util/concurrent/ExecutionException
    //   0	26	203	java/io/IOException
    //   26	45	203	java/io/IOException
    //   45	84	203	java/io/IOException
    //   84	133	203	java/io/IOException
    //   133	153	203	java/io/IOException
    //   156	166	203	java/io/IOException
    //   0	26	207	java/util/concurrent/TimeoutException
    //   26	45	207	java/util/concurrent/TimeoutException
    //   45	84	207	java/util/concurrent/TimeoutException
    //   84	133	207	java/util/concurrent/TimeoutException
    //   133	153	207	java/util/concurrent/TimeoutException
    //   156	166	207	java/util/concurrent/TimeoutException
  }
  
  protected WebResourceResponse zzd(Context paramContext, String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("User-Agent", zzr.zzbC().zze(paramContext, paramString1));
    localHashMap.put("Cache-Control", "max-stale=3600");
    paramContext = (String)new zziw(paramContext).zzb(paramString2, localHashMap).get(60L, TimeUnit.SECONDS);
    if (paramContext == null) {
      return null;
    }
    return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(paramContext.getBytes("UTF-8")));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */