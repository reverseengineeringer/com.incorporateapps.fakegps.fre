package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.internal.zza.zzb;

class zzbp$3
  implements Runnable
{
  zzbp$3(zzbp paramzzbp, Uri paramUri, zza.zzb paramzzb, String paramString, long paramLong1, long paramLong2) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: ldc 44
    //   2: iconst_2
    //   3: invokestatic 50	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   6: ifeq +11 -> 17
    //   9: ldc 44
    //   11: ldc 52
    //   13: invokestatic 56	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   16: pop
    //   17: ldc 58
    //   19: aload_0
    //   20: getfield 23	com/google/android/gms/wearable/internal/zzbp$3:zzbds	Landroid/net/Uri;
    //   23: invokevirtual 64	android/net/Uri:getScheme	()Ljava/lang/String;
    //   26: invokevirtual 70	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   29: ifne +32 -> 61
    //   32: ldc 44
    //   34: ldc 72
    //   36: invokestatic 75	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   39: pop
    //   40: aload_0
    //   41: getfield 25	com/google/android/gms/wearable/internal/zzbp$3:zzbto	Lcom/google/android/gms/common/api/internal/zza$zzb;
    //   44: new 77	com/google/android/gms/common/api/Status
    //   47: dup
    //   48: bipush 10
    //   50: ldc 72
    //   52: invokespecial 80	com/google/android/gms/common/api/Status:<init>	(ILjava/lang/String;)V
    //   55: invokeinterface 86 2 0
    //   60: return
    //   61: new 88	java/io/File
    //   64: dup
    //   65: aload_0
    //   66: getfield 23	com/google/android/gms/wearable/internal/zzbp$3:zzbds	Landroid/net/Uri;
    //   69: invokevirtual 91	android/net/Uri:getPath	()Ljava/lang/String;
    //   72: invokespecial 94	java/io/File:<init>	(Ljava/lang/String;)V
    //   75: astore_2
    //   76: aload_2
    //   77: ldc 95
    //   79: invokestatic 101	android/os/ParcelFileDescriptor:open	(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //   82: astore_1
    //   83: aload_0
    //   84: getfield 21	com/google/android/gms/wearable/internal/zzbp$3:zzbtn	Lcom/google/android/gms/wearable/internal/zzbp;
    //   87: invokevirtual 107	com/google/android/gms/wearable/internal/zzbp:zzqJ	()Landroid/os/IInterface;
    //   90: checkcast 109	com/google/android/gms/wearable/internal/zzax
    //   93: new 111	com/google/android/gms/wearable/internal/zzbo$zzr
    //   96: dup
    //   97: aload_0
    //   98: getfield 25	com/google/android/gms/wearable/internal/zzbp$3:zzbto	Lcom/google/android/gms/common/api/internal/zza$zzb;
    //   101: invokespecial 114	com/google/android/gms/wearable/internal/zzbo$zzr:<init>	(Lcom/google/android/gms/common/api/internal/zza$zzb;)V
    //   104: aload_0
    //   105: getfield 27	com/google/android/gms/wearable/internal/zzbp$3:zzVj	Ljava/lang/String;
    //   108: aload_1
    //   109: aload_0
    //   110: getfield 29	com/google/android/gms/wearable/internal/zzbp$3:zzbsf	J
    //   113: aload_0
    //   114: getfield 31	com/google/android/gms/wearable/internal/zzbp$3:zzbsg	J
    //   117: invokeinterface 118 8 0
    //   122: aload_1
    //   123: invokevirtual 121	android/os/ParcelFileDescriptor:close	()V
    //   126: return
    //   127: astore_1
    //   128: ldc 44
    //   130: ldc 123
    //   132: aload_1
    //   133: invokestatic 126	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   136: pop
    //   137: return
    //   138: astore_1
    //   139: ldc 44
    //   141: new 128	java/lang/StringBuilder
    //   144: dup
    //   145: ldc -126
    //   147: invokespecial 131	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   150: aload_2
    //   151: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   154: invokevirtual 138	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: invokestatic 75	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   160: pop
    //   161: aload_0
    //   162: getfield 25	com/google/android/gms/wearable/internal/zzbp$3:zzbto	Lcom/google/android/gms/common/api/internal/zza$zzb;
    //   165: new 77	com/google/android/gms/common/api/Status
    //   168: dup
    //   169: bipush 13
    //   171: invokespecial 141	com/google/android/gms/common/api/Status:<init>	(I)V
    //   174: invokeinterface 86 2 0
    //   179: return
    //   180: astore_2
    //   181: ldc 44
    //   183: ldc -113
    //   185: aload_2
    //   186: invokestatic 126	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   189: pop
    //   190: aload_0
    //   191: getfield 25	com/google/android/gms/wearable/internal/zzbp$3:zzbto	Lcom/google/android/gms/common/api/internal/zza$zzb;
    //   194: new 77	com/google/android/gms/common/api/Status
    //   197: dup
    //   198: bipush 8
    //   200: invokespecial 141	com/google/android/gms/common/api/Status:<init>	(I)V
    //   203: invokeinterface 86 2 0
    //   208: aload_1
    //   209: invokevirtual 121	android/os/ParcelFileDescriptor:close	()V
    //   212: return
    //   213: astore_1
    //   214: ldc 44
    //   216: ldc 123
    //   218: aload_1
    //   219: invokestatic 126	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   222: pop
    //   223: return
    //   224: astore_2
    //   225: aload_1
    //   226: invokevirtual 121	android/os/ParcelFileDescriptor:close	()V
    //   229: aload_2
    //   230: athrow
    //   231: astore_1
    //   232: ldc 44
    //   234: ldc 123
    //   236: aload_1
    //   237: invokestatic 126	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   240: pop
    //   241: goto -12 -> 229
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	244	0	this	3
    //   82	41	1	localParcelFileDescriptor	android.os.ParcelFileDescriptor
    //   127	6	1	localIOException1	java.io.IOException
    //   138	71	1	localFileNotFoundException	java.io.FileNotFoundException
    //   213	13	1	localIOException2	java.io.IOException
    //   231	6	1	localIOException3	java.io.IOException
    //   75	76	2	localFile	java.io.File
    //   180	6	2	localRemoteException	android.os.RemoteException
    //   224	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   122	126	127	java/io/IOException
    //   76	83	138	java/io/FileNotFoundException
    //   83	122	180	android/os/RemoteException
    //   208	212	213	java/io/IOException
    //   83	122	224	finally
    //   181	208	224	finally
    //   225	229	231	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbp.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */