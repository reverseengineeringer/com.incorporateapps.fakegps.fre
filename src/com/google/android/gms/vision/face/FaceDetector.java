package com.google.android.gms.vision.face;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.internal.client.zzg;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.zza;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public final class FaceDetector
  extends Detector
{
  public static final int ACCURATE_MODE = 1;
  public static final int ALL_CLASSIFICATIONS = 1;
  public static final int ALL_LANDMARKS = 1;
  public static final int FAST_MODE = 0;
  public static final int NO_CLASSIFICATIONS = 0;
  public static final int NO_LANDMARKS = 0;
  private final zza zzbnG = new zza();
  private final zzg zzbnH;
  private boolean zzbnI = true;
  private final Object zzpV = new Object();
  
  private FaceDetector()
  {
    throw new IllegalStateException("Default constructor called");
  }
  
  private FaceDetector(zzg paramzzg)
  {
    zzbnH = paramzzg;
  }
  
  public final SparseArray detect(Frame paramFrame)
  {
    if (paramFrame == null) {
      throw new IllegalArgumentException("No frame supplied.");
    }
    Object localObject2 = paramFrame.getGrayscaleImageData();
    synchronized (zzpV)
    {
      if (!zzbnI) {
        throw new RuntimeException("Cannot use detector after release()");
      }
    }
    paramFrame = zzbnH.zzb((ByteBuffer)localObject2, FrameMetadataParcel.zzc(paramFrame));
    ??? = new HashSet();
    localObject2 = new SparseArray(paramFrame.length);
    int i1 = paramFrame.length;
    int j = 0;
    int i = 0;
    while (j < i1)
    {
      Object localObject3 = paramFrame[j];
      int m = ((Face)localObject3).getId();
      int n = Math.max(i, m);
      int k = m;
      i = n;
      if (((Set)???).contains(Integer.valueOf(m)))
      {
        k = n + 1;
        i = k;
      }
      ((Set)???).add(Integer.valueOf(k));
      ((SparseArray)localObject2).append(zzbnG.zzkr(k), localObject3);
      j += 1;
    }
    return (SparseArray)localObject2;
  }
  
  /* Error */
  protected final void finalize()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	com/google/android/gms/vision/face/FaceDetector:zzpV	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 37	com/google/android/gms/vision/face/FaceDetector:zzbnI	Z
    //   11: ifeq +15 -> 26
    //   14: ldc 127
    //   16: ldc -127
    //   18: invokestatic 135	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   21: pop
    //   22: aload_0
    //   23: invokevirtual 138	com/google/android/gms/vision/face/FaceDetector:release	()V
    //   26: aload_1
    //   27: monitorexit
    //   28: aload_0
    //   29: invokespecial 140	java/lang/Object:finalize	()V
    //   32: return
    //   33: astore_2
    //   34: aload_1
    //   35: monitorexit
    //   36: aload_2
    //   37: athrow
    //   38: astore_1
    //   39: aload_0
    //   40: invokespecial 140	java/lang/Object:finalize	()V
    //   43: aload_1
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	FaceDetector
    //   38	6	1	localObject2	Object
    //   33	4	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   7	26	33	finally
    //   26	28	33	finally
    //   0	7	38	finally
    //   34	38	38	finally
  }
  
  public final boolean isOperational()
  {
    return zzbnH.isOperational();
  }
  
  public final void release()
  {
    synchronized (zzpV)
    {
      if (!zzbnI) {
        return;
      }
      zzbnH.zzIh();
      zzbnI = false;
      return;
    }
  }
  
  public final boolean setFocus(int paramInt)
  {
    paramInt = zzbnG.zzks(paramInt);
    synchronized (zzpV)
    {
      if (!zzbnI) {
        throw new RuntimeException("Cannot use detector after release()");
      }
    }
    boolean bool = zzbnH.zzkJ(paramInt);
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.face.FaceDetector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */