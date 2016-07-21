package com.google.android.gms.internal;

import android.content.Context;

final class zzam$zzb
  implements Runnable
{
  private Context zzoq;
  
  public zzam$zzb(Context paramContext)
  {
    zzoq = paramContext.getApplicationContext();
    if (zzoq == null) {
      zzoq = paramContext;
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: ldc 31
    //   2: monitorenter
    //   3: invokestatic 35	com/google/android/gms/internal/zzam:zzZ	()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;
    //   6: ifnonnull +28 -> 34
    //   9: iconst_1
    //   10: invokestatic 41	com/google/android/gms/ads/identifier/AdvertisingIdClient:setShouldSkipGmsCoreVersionCheck	(Z)V
    //   13: new 37	com/google/android/gms/ads/identifier/AdvertisingIdClient
    //   16: dup
    //   17: aload_0
    //   18: getfield 21	com/google/android/gms/internal/zzam$zzb:zzoq	Landroid/content/Context;
    //   21: invokespecial 43	com/google/android/gms/ads/identifier/AdvertisingIdClient:<init>	(Landroid/content/Context;)V
    //   24: astore_1
    //   25: aload_1
    //   26: invokevirtual 46	com/google/android/gms/ads/identifier/AdvertisingIdClient:start	()V
    //   29: aload_1
    //   30: invokestatic 50	com/google/android/gms/internal/zzam:zza	(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;
    //   33: pop
    //   34: invokestatic 54	com/google/android/gms/internal/zzam:zzaa	()Ljava/util/concurrent/CountDownLatch;
    //   37: invokevirtual 59	java/util/concurrent/CountDownLatch:countDown	()V
    //   40: ldc 31
    //   42: monitorexit
    //   43: return
    //   44: astore_1
    //   45: aconst_null
    //   46: invokestatic 50	com/google/android/gms/internal/zzam:zza	(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;
    //   49: pop
    //   50: invokestatic 54	com/google/android/gms/internal/zzam:zzaa	()Ljava/util/concurrent/CountDownLatch;
    //   53: invokevirtual 59	java/util/concurrent/CountDownLatch:countDown	()V
    //   56: goto -16 -> 40
    //   59: astore_1
    //   60: ldc 31
    //   62: monitorexit
    //   63: aload_1
    //   64: athrow
    //   65: astore_1
    //   66: invokestatic 54	com/google/android/gms/internal/zzam:zzaa	()Ljava/util/concurrent/CountDownLatch;
    //   69: invokevirtual 59	java/util/concurrent/CountDownLatch:countDown	()V
    //   72: aload_1
    //   73: athrow
    //   74: astore_1
    //   75: goto -30 -> 45
    //   78: astore_1
    //   79: goto -34 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	zzb
    //   24	6	1	localAdvertisingIdClient	com.google.android.gms.ads.identifier.AdvertisingIdClient
    //   44	1	1	localGooglePlayServicesRepairableException	com.google.android.gms.common.GooglePlayServicesRepairableException
    //   59	5	1	localObject1	Object
    //   65	8	1	localObject2	Object
    //   74	1	1	localGooglePlayServicesNotAvailableException	com.google.android.gms.common.GooglePlayServicesNotAvailableException
    //   78	1	1	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   3	34	44	com/google/android/gms/common/GooglePlayServicesRepairableException
    //   34	40	59	finally
    //   40	43	59	finally
    //   50	56	59	finally
    //   66	74	59	finally
    //   3	34	65	finally
    //   45	50	65	finally
    //   3	34	74	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   3	34	78	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzam.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */