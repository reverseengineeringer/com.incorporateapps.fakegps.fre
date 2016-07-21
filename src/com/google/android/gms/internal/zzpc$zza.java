package com.google.android.gms.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.fitness.result.DataReadResult;

class zzpc$zza
  extends zzoh.zza
{
  private int zzaAc = 0;
  private DataReadResult zzaAd = null;
  private final zza.zzb zzamC;
  
  private zzpc$zza(zza.zzb paramzzb)
  {
    zzamC = paramzzb;
  }
  
  /* Error */
  public void zza(DataReadResult paramDataReadResult)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 29
    //   4: iconst_2
    //   5: invokestatic 35	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   8: ifeq +28 -> 36
    //   11: ldc 29
    //   13: new 37	java/lang/StringBuilder
    //   16: dup
    //   17: ldc 39
    //   19: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   22: aload_0
    //   23: getfield 17	com/google/android/gms/internal/zzpc$zza:zzaAc	I
    //   26: invokevirtual 46	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   29: invokevirtual 50	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: invokestatic 54	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   35: pop
    //   36: aload_0
    //   37: getfield 19	com/google/android/gms/internal/zzpc$zza:zzaAd	Lcom/google/android/gms/fitness/result/DataReadResult;
    //   40: ifnonnull +48 -> 88
    //   43: aload_0
    //   44: aload_1
    //   45: putfield 19	com/google/android/gms/internal/zzpc$zza:zzaAd	Lcom/google/android/gms/fitness/result/DataReadResult;
    //   48: aload_0
    //   49: aload_0
    //   50: getfield 17	com/google/android/gms/internal/zzpc$zza:zzaAc	I
    //   53: iconst_1
    //   54: iadd
    //   55: putfield 17	com/google/android/gms/internal/zzpc$zza:zzaAc	I
    //   58: aload_0
    //   59: getfield 17	com/google/android/gms/internal/zzpc$zza:zzaAc	I
    //   62: aload_0
    //   63: getfield 19	com/google/android/gms/internal/zzpc$zza:zzaAd	Lcom/google/android/gms/fitness/result/DataReadResult;
    //   66: invokevirtual 60	com/google/android/gms/fitness/result/DataReadResult:zzvj	()I
    //   69: if_icmpne +16 -> 85
    //   72: aload_0
    //   73: getfield 21	com/google/android/gms/internal/zzpc$zza:zzamC	Lcom/google/android/gms/common/api/internal/zza$zzb;
    //   76: aload_0
    //   77: getfield 19	com/google/android/gms/internal/zzpc$zza:zzaAd	Lcom/google/android/gms/fitness/result/DataReadResult;
    //   80: invokeinterface 66 2 0
    //   85: aload_0
    //   86: monitorexit
    //   87: return
    //   88: aload_0
    //   89: getfield 19	com/google/android/gms/internal/zzpc$zza:zzaAd	Lcom/google/android/gms/fitness/result/DataReadResult;
    //   92: aload_1
    //   93: invokevirtual 69	com/google/android/gms/fitness/result/DataReadResult:zzb	(Lcom/google/android/gms/fitness/result/DataReadResult;)V
    //   96: goto -48 -> 48
    //   99: astore_1
    //   100: aload_0
    //   101: monitorexit
    //   102: aload_1
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	zza
    //   0	104	1	paramDataReadResult	DataReadResult
    // Exception table:
    //   from	to	target	type
    //   2	36	99	finally
    //   36	48	99	finally
    //   48	85	99	finally
    //   85	87	99	finally
    //   88	96	99	finally
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpc.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */