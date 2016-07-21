package com.google.android.gms.vision;

import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.images.Size;
import java.nio.ByteBuffer;
import java.util.Map;

class CameraSource$zzb
  implements Runnable
{
  private long zzRD = SystemClock.elapsedRealtime();
  private Detector zzbmN;
  private boolean zzbmQ = true;
  private long zzbmR;
  private int zzbmS = 0;
  private ByteBuffer zzbmT;
  private final Object zzpV = new Object();
  
  static
  {
    if (!CameraSource.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  CameraSource$zzb(CameraSource paramCameraSource, Detector paramDetector)
  {
    zzbmN = paramDetector;
  }
  
  void release()
  {
    assert (CameraSource.zzd(zzbmP).getState() == Thread.State.TERMINATED);
    zzbmN.release();
    zzbmN = null;
  }
  
  public void run()
  {
    for (;;)
    {
      synchronized (zzpV)
      {
        if (zzbmQ)
        {
          ByteBuffer localByteBuffer1 = zzbmT;
          if (localByteBuffer1 != null) {}
        }
        try
        {
          zzpV.wait();
          if (!zzbmQ) {
            return;
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          Log.d("CameraSource", "Frame processing loop terminated.", localInterruptedException);
          return;
        }
      }
      Frame localFrame = new Frame.Builder().setImageData(zzbmT, CameraSource.zzg(zzbmP).getWidth(), CameraSource.zzg(zzbmP).getHeight(), 17).setId(zzbmS).setTimestampMillis(zzbmR).setRotation(CameraSource.zzf(zzbmP)).build();
      ByteBuffer localByteBuffer2 = zzbmT;
      zzbmT = null;
      try
      {
        zzbmN.receiveFrame(localFrame);
        CameraSource.zzb(zzbmP).addCallbackBuffer(localByteBuffer2.array());
      }
      catch (Throwable localThrowable)
      {
        Log.e("CameraSource", "Exception thrown from receiver.", localThrowable);
        CameraSource.zzb(zzbmP).addCallbackBuffer(localByteBuffer2.array());
      }
      finally
      {
        CameraSource.zzb(zzbmP).addCallbackBuffer(localByteBuffer2.array());
      }
    }
  }
  
  void setActive(boolean paramBoolean)
  {
    synchronized (zzpV)
    {
      zzbmQ = paramBoolean;
      zzpV.notifyAll();
      return;
    }
  }
  
  void zza(byte[] paramArrayOfByte, Camera paramCamera)
  {
    synchronized (zzpV)
    {
      if (zzbmT != null)
      {
        paramCamera.addCallbackBuffer(zzbmT.array());
        zzbmT = null;
      }
      zzbmR = (SystemClock.elapsedRealtime() - zzRD);
      zzbmS += 1;
      zzbmT = ((ByteBuffer)CameraSource.zze(zzbmP).get(paramArrayOfByte));
      zzpV.notifyAll();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.CameraSource.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */