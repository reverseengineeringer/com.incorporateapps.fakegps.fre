package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzr;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class zzbv
{
  final Context mContext;
  final String zzsy;
  String zzxj;
  BlockingQueue zzxl;
  ExecutorService zzxm;
  LinkedHashMap zzxn = new LinkedHashMap();
  Map zzxo = new HashMap();
  private AtomicBoolean zzxp;
  private File zzxq;
  
  public zzbv(Context paramContext, String paramString1, String paramString2, Map paramMap)
  {
    mContext = paramContext;
    zzsy = paramString1;
    zzxj = paramString2;
    zzxp = new AtomicBoolean(false);
    zzxp.set(((Boolean)zzbt.zzwi.get()).booleanValue());
    if (zzxp.get())
    {
      paramContext = Environment.getExternalStorageDirectory();
      if (paramContext != null) {
        zzxq = new File(paramContext, "sdk_csi_data.txt");
      }
    }
    paramContext = paramMap.entrySet().iterator();
    while (paramContext.hasNext())
    {
      paramString1 = (Map.Entry)paramContext.next();
      zzxn.put(paramString1.getKey(), paramString1.getValue());
    }
    zzxl = new ArrayBlockingQueue(30);
    zzxm = Executors.newSingleThreadExecutor();
    zzxm.execute(new zzbv.1(this));
    zzxo.put("action", zzby.zzxt);
    zzxo.put("ad_format", zzby.zzxt);
    zzxo.put("e", zzby.zzxu);
  }
  
  /* Error */
  private void zza(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +97 -> 98
    //   4: new 170	java/io/FileOutputStream
    //   7: dup
    //   8: aload_1
    //   9: iconst_1
    //   10: invokespecial 173	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   13: astore_3
    //   14: aload_3
    //   15: astore_1
    //   16: aload_3
    //   17: aload_2
    //   18: invokevirtual 179	java/lang/String:getBytes	()[B
    //   21: invokevirtual 183	java/io/FileOutputStream:write	([B)V
    //   24: aload_3
    //   25: astore_1
    //   26: aload_3
    //   27: bipush 10
    //   29: invokevirtual 185	java/io/FileOutputStream:write	(I)V
    //   32: aload_3
    //   33: invokevirtual 188	java/io/FileOutputStream:close	()V
    //   36: return
    //   37: astore_1
    //   38: ldc -66
    //   40: aload_1
    //   41: invokestatic 196	com/google/android/gms/internal/zzin:zzd	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   44: return
    //   45: astore 4
    //   47: aconst_null
    //   48: astore_2
    //   49: aload_2
    //   50: astore_1
    //   51: ldc -58
    //   53: aload 4
    //   55: invokestatic 196	com/google/android/gms/internal/zzin:zzd	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   58: aload_2
    //   59: ifnull -23 -> 36
    //   62: aload_2
    //   63: invokevirtual 188	java/io/FileOutputStream:close	()V
    //   66: return
    //   67: astore_1
    //   68: ldc -66
    //   70: aload_1
    //   71: invokestatic 196	com/google/android/gms/internal/zzin:zzd	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   74: return
    //   75: astore_2
    //   76: aconst_null
    //   77: astore_1
    //   78: aload_1
    //   79: ifnull +7 -> 86
    //   82: aload_1
    //   83: invokevirtual 188	java/io/FileOutputStream:close	()V
    //   86: aload_2
    //   87: athrow
    //   88: astore_1
    //   89: ldc -66
    //   91: aload_1
    //   92: invokestatic 196	com/google/android/gms/internal/zzin:zzd	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   95: goto -9 -> 86
    //   98: ldc -56
    //   100: invokestatic 204	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   103: return
    //   104: astore_2
    //   105: goto -27 -> 78
    //   108: astore 4
    //   110: aload_3
    //   111: astore_2
    //   112: goto -63 -> 49
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	zzbv
    //   0	115	1	paramFile	File
    //   0	115	2	paramString	String
    //   13	98	3	localFileOutputStream	java.io.FileOutputStream
    //   45	9	4	localIOException1	java.io.IOException
    //   108	1	4	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   32	36	37	java/io/IOException
    //   4	14	45	java/io/IOException
    //   62	66	67	java/io/IOException
    //   4	14	75	finally
    //   82	86	88	java/io/IOException
    //   16	24	104	finally
    //   26	32	104	finally
    //   51	58	104	finally
    //   16	24	108	java/io/IOException
    //   26	32	108	java/io/IOException
  }
  
  private void zzc(Map paramMap, String paramString)
  {
    paramMap = zza(zzxj, paramMap, paramString);
    if (zzxp.get())
    {
      zza(zzxq, paramMap);
      return;
    }
    zzr.zzbC().zzc(mContext, zzsy, paramMap);
  }
  
  private void zzdx()
  {
    try
    {
      for (;;)
      {
        zzcb localzzcb = (zzcb)zzxl.take();
        String str = localzzcb.zzdD();
        if (!TextUtils.isEmpty(str)) {
          zzc(zza(zzxn, localzzcb.zzn()), str);
        }
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      zzin.zzd("CsiReporter:reporter interrupted", localInterruptedException);
    }
  }
  
  public zzby zzL(String paramString)
  {
    paramString = (zzby)zzxo.get(paramString);
    if (paramString != null) {
      return paramString;
    }
    return zzby.zzxs;
  }
  
  String zza(String paramString1, Map paramMap, String paramString2)
  {
    paramString1 = Uri.parse(paramString1).buildUpon();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      paramString1.appendQueryParameter((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    paramString1 = new StringBuilder(paramString1.build().toString());
    paramString1.append("&it=").append(paramString2);
    return paramString1.toString();
  }
  
  Map zza(Map paramMap1, Map paramMap2)
  {
    paramMap1 = new LinkedHashMap(paramMap1);
    if (paramMap2 == null) {
      return paramMap1;
    }
    paramMap2 = paramMap2.entrySet().iterator();
    while (paramMap2.hasNext())
    {
      Object localObject = (Map.Entry)paramMap2.next();
      String str1 = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      String str2 = (String)paramMap1.get(str1);
      paramMap1.put(str1, zzL(str1).zzb(str2, (String)localObject));
    }
    return paramMap1;
  }
  
  public boolean zza(zzcb paramzzcb)
  {
    return zzxl.offer(paramzzcb);
  }
  
  public void zzb(List paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      zzxn.put("e", TextUtils.join(",", paramList));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */