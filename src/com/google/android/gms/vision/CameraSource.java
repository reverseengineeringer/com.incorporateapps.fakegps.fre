package com.google.android.gms.vision;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.google.android.gms.common.images.Size;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CameraSource
{
  public static final int CAMERA_FACING_BACK = 0;
  public static final int CAMERA_FACING_FRONT = 1;
  private Context mContext;
  private int zzDE;
  private Camera zzbmA;
  private int zzbmB = 0;
  private Size zzbmC;
  private float zzbmD = 30.0F;
  private int zzbmE = 1024;
  private int zzbmF = 768;
  private boolean zzbmG = false;
  private SurfaceView zzbmH;
  private SurfaceTexture zzbmI;
  private boolean zzbmJ;
  private Thread zzbmK;
  private CameraSource.zzb zzbmL;
  private Map zzbmM = new HashMap();
  private final Object zzbmz = new Object();
  
  private Camera zzIb()
  {
    int i = zzkp(zzbmB);
    if (i == -1) {
      throw new RuntimeException("Could not find requested camera.");
    }
    Camera localCamera = Camera.open(i);
    Object localObject = zza(localCamera, zzbmE, zzbmF);
    if (localObject == null) {
      throw new RuntimeException("Could not find suitable preview size.");
    }
    Size localSize = ((CameraSource.zze)localObject).zzId();
    zzbmC = ((CameraSource.zze)localObject).zzIc();
    localObject = zza(localCamera, zzbmD);
    if (localObject == null) {
      throw new RuntimeException("Could not find suitable preview frames per second range.");
    }
    Camera.Parameters localParameters = localCamera.getParameters();
    localParameters.setPictureSize(localSize.getWidth(), localSize.getHeight());
    localParameters.setPreviewSize(zzbmC.getWidth(), zzbmC.getHeight());
    localParameters.setPreviewFpsRange(localObject[0], localObject[1]);
    localParameters.setPreviewFormat(17);
    zza(localCamera, localParameters, i);
    if (zzbmG)
    {
      if (!localParameters.getSupportedFocusModes().contains("continuous-video")) {
        break label262;
      }
      localParameters.setFocusMode("continuous-video");
    }
    for (;;)
    {
      localCamera.setParameters(localParameters);
      localCamera.setPreviewCallbackWithBuffer(new CameraSource.zza(this, null));
      localCamera.addCallbackBuffer(zza(zzbmC));
      localCamera.addCallbackBuffer(zza(zzbmC));
      localCamera.addCallbackBuffer(zza(zzbmC));
      localCamera.addCallbackBuffer(zza(zzbmC));
      return localCamera;
      label262:
      Log.i("CameraSource", "Camera auto focus is not supported on this device.");
    }
  }
  
  private static CameraSource.zze zza(Camera paramCamera, int paramInt1, int paramInt2)
  {
    Object localObject = zza(paramCamera);
    paramCamera = null;
    int i = Integer.MAX_VALUE;
    Iterator localIterator = ((List)localObject).iterator();
    if (localIterator.hasNext())
    {
      localObject = (CameraSource.zze)localIterator.next();
      Size localSize = ((CameraSource.zze)localObject).zzIc();
      int j = Math.abs(localSize.getWidth() - paramInt1);
      j = Math.abs(localSize.getHeight() - paramInt2) + j;
      if (j >= i) {
        break label93;
      }
      paramCamera = (Camera)localObject;
      i = j;
    }
    label93:
    for (;;)
    {
      break;
      return paramCamera;
    }
  }
  
  private static List zza(Camera paramCamera)
  {
    Object localObject = paramCamera.getParameters();
    paramCamera = ((Camera.Parameters)localObject).getSupportedPreviewSizes();
    List localList = ((Camera.Parameters)localObject).getSupportedPictureSizes();
    localObject = new ArrayList();
    Iterator localIterator1 = paramCamera.iterator();
    for (;;)
    {
      if (!localIterator1.hasNext()) {
        break label142;
      }
      Camera.Size localSize1 = (Camera.Size)localIterator1.next();
      float f = width / height;
      Iterator localIterator2 = localList.iterator();
      if (localIterator2.hasNext())
      {
        Camera.Size localSize2 = (Camera.Size)localIterator2.next();
        if (Math.abs(f - width / height) >= 0.01F) {
          break;
        }
        ((List)localObject).add(new CameraSource.zze(localSize1, localSize2));
      }
    }
    label142:
    if (((List)localObject).size() == 0)
    {
      Log.w("CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
      paramCamera = paramCamera.iterator();
      while (paramCamera.hasNext()) {
        ((List)localObject).add(new CameraSource.zze((Camera.Size)paramCamera.next(), null));
      }
    }
    return (List)localObject;
  }
  
  private void zza(Camera paramCamera, Camera.Parameters paramParameters, int paramInt)
  {
    int i = ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay().getRotation();
    Camera.CameraInfo localCameraInfo;
    switch (i)
    {
    default: 
      Log.e("CameraSource", "Bad rotation value: " + i);
      i = 0;
      localCameraInfo = new Camera.CameraInfo();
      Camera.getCameraInfo(paramInt, localCameraInfo);
      if (facing == 1)
      {
        i = (i + orientation) % 360;
        paramInt = (360 - i) % 360;
      }
      break;
    }
    for (;;)
    {
      zzDE = (i / 90);
      paramCamera.setDisplayOrientation(paramInt);
      paramParameters.setRotation(i);
      return;
      i = 0;
      break;
      i = 90;
      break;
      i = 180;
      break;
      i = 270;
      break;
      paramInt = (orientation - i + 360) % 360;
      i = paramInt;
    }
  }
  
  private byte[] zza(Size paramSize)
  {
    paramSize = new byte[(int)Math.ceil(ImageFormat.getBitsPerPixel(17) * (paramSize.getHeight() * paramSize.getWidth()) / 8.0D) + 1];
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramSize);
    if ((!localByteBuffer.hasArray()) || (localByteBuffer.array() != paramSize)) {
      throw new IllegalStateException("Failed to create valid buffer for camera source.");
    }
    zzbmM.put(paramSize, localByteBuffer);
    return paramSize;
  }
  
  private int[] zza(Camera paramCamera, float paramFloat)
  {
    int k = (int)(1000.0F * paramFloat);
    int[] arrayOfInt = null;
    int i = Integer.MAX_VALUE;
    Iterator localIterator = paramCamera.getParameters().getSupportedPreviewFpsRange().iterator();
    paramCamera = arrayOfInt;
    if (localIterator.hasNext())
    {
      arrayOfInt = (int[])localIterator.next();
      int j = arrayOfInt[0];
      int m = arrayOfInt[1];
      j = Math.abs(k - j) + Math.abs(k - m);
      if (j >= i) {
        break label101;
      }
      paramCamera = arrayOfInt;
      i = j;
    }
    label101:
    for (;;)
    {
      break;
      return paramCamera;
    }
  }
  
  private static int zzkp(int paramInt)
  {
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    int i = 0;
    while (i < Camera.getNumberOfCameras())
    {
      Camera.getCameraInfo(i, localCameraInfo);
      if (facing == paramInt) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
  
  public int getCameraFacing()
  {
    return zzbmB;
  }
  
  public Size getPreviewSize()
  {
    return zzbmC;
  }
  
  public void release()
  {
    synchronized (zzbmz)
    {
      stop();
      zzbmL.release();
      return;
    }
  }
  
  public CameraSource start()
  {
    for (;;)
    {
      synchronized (zzbmz)
      {
        if (zzbmA != null) {
          return this;
        }
        zzbmA = zzIb();
        if (Build.VERSION.SDK_INT >= 11)
        {
          zzbmI = new SurfaceTexture(100);
          zzbmA.setPreviewTexture(zzbmI);
          zzbmJ = true;
          zzbmA.startPreview();
          zzbmK = new Thread(zzbmL);
          zzbmL.setActive(true);
          zzbmK.start();
          return this;
        }
      }
      zzbmH = new SurfaceView(mContext);
      zzbmA.setPreviewDisplay(zzbmH.getHolder());
      zzbmJ = false;
    }
  }
  
  public CameraSource start(SurfaceHolder paramSurfaceHolder)
  {
    synchronized (zzbmz)
    {
      if (zzbmA != null) {
        return this;
      }
      zzbmA = zzIb();
      zzbmA.setPreviewDisplay(paramSurfaceHolder);
      zzbmA.startPreview();
      zzbmK = new Thread(zzbmL);
      zzbmL.setActive(true);
      zzbmK.start();
      zzbmJ = false;
      return this;
    }
  }
  
  /* Error */
  public void stop()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 42	com/google/android/gms/vision/CameraSource:zzbmz	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 187	com/google/android/gms/vision/CameraSource:zzbmL	Lcom/google/android/gms/vision/CameraSource$zzb;
    //   11: iconst_0
    //   12: invokevirtual 406	com/google/android/gms/vision/CameraSource$zzb:setActive	(Z)V
    //   15: aload_0
    //   16: getfield 354	com/google/android/gms/vision/CameraSource:zzbmK	Ljava/lang/Thread;
    //   19: astore_2
    //   20: aload_2
    //   21: ifnull +15 -> 36
    //   24: aload_0
    //   25: getfield 354	com/google/android/gms/vision/CameraSource:zzbmK	Ljava/lang/Thread;
    //   28: invokevirtual 431	java/lang/Thread:join	()V
    //   31: aload_0
    //   32: aconst_null
    //   33: putfield 354	com/google/android/gms/vision/CameraSource:zzbmK	Ljava/lang/Thread;
    //   36: aload_0
    //   37: getfield 348	com/google/android/gms/vision/CameraSource:zzbmA	Landroid/hardware/Camera;
    //   40: ifnull +45 -> 85
    //   43: aload_0
    //   44: getfield 348	com/google/android/gms/vision/CameraSource:zzbmA	Landroid/hardware/Camera;
    //   47: invokevirtual 434	android/hardware/Camera:stopPreview	()V
    //   50: aload_0
    //   51: getfield 348	com/google/android/gms/vision/CameraSource:zzbmA	Landroid/hardware/Camera;
    //   54: aconst_null
    //   55: invokevirtual 162	android/hardware/Camera:setPreviewCallbackWithBuffer	(Landroid/hardware/Camera$PreviewCallback;)V
    //   58: aload_0
    //   59: getfield 394	com/google/android/gms/vision/CameraSource:zzbmJ	Z
    //   62: ifeq +53 -> 115
    //   65: aload_0
    //   66: getfield 348	com/google/android/gms/vision/CameraSource:zzbmA	Landroid/hardware/Camera;
    //   69: aconst_null
    //   70: invokevirtual 392	android/hardware/Camera:setPreviewTexture	(Landroid/graphics/SurfaceTexture;)V
    //   73: aload_0
    //   74: getfield 348	com/google/android/gms/vision/CameraSource:zzbmA	Landroid/hardware/Camera;
    //   77: invokevirtual 435	android/hardware/Camera:release	()V
    //   80: aload_0
    //   81: aconst_null
    //   82: putfield 348	com/google/android/gms/vision/CameraSource:zzbmA	Landroid/hardware/Camera;
    //   85: aload_0
    //   86: getfield 58	com/google/android/gms/vision/CameraSource:zzbmM	Ljava/util/Map;
    //   89: invokeinterface 438 1 0
    //   94: aload_1
    //   95: monitorexit
    //   96: return
    //   97: astore_2
    //   98: ldc -85
    //   100: ldc_w 440
    //   103: invokestatic 443	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   106: pop
    //   107: goto -76 -> 31
    //   110: astore_2
    //   111: aload_1
    //   112: monitorexit
    //   113: aload_2
    //   114: athrow
    //   115: aload_0
    //   116: getfield 348	com/google/android/gms/vision/CameraSource:zzbmA	Landroid/hardware/Camera;
    //   119: aconst_null
    //   120: invokevirtual 423	android/hardware/Camera:setPreviewDisplay	(Landroid/view/SurfaceHolder;)V
    //   123: goto -50 -> 73
    //   126: astore_2
    //   127: ldc -85
    //   129: new 267	java/lang/StringBuilder
    //   132: dup
    //   133: ldc_w 445
    //   136: invokespecial 270	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   139: aload_2
    //   140: invokevirtual 448	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   143: invokevirtual 278	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: invokestatic 281	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   149: pop
    //   150: goto -77 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	153	0	this	CameraSource
    //   4	108	1	localObject1	Object
    //   19	2	2	localThread	Thread
    //   97	1	2	localInterruptedException	InterruptedException
    //   110	4	2	localObject2	Object
    //   126	14	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   24	31	97	java/lang/InterruptedException
    //   7	20	110	finally
    //   24	31	110	finally
    //   31	36	110	finally
    //   36	58	110	finally
    //   58	73	110	finally
    //   73	85	110	finally
    //   85	96	110	finally
    //   98	107	110	finally
    //   115	123	110	finally
    //   127	150	110	finally
    //   58	73	126	java/lang/Exception
    //   115	123	126	java/lang/Exception
  }
  
  public void takePicture(CameraSource.ShutterCallback paramShutterCallback, CameraSource.PictureCallback paramPictureCallback)
  {
    synchronized (zzbmz)
    {
      if (zzbmA != null)
      {
        CameraSource.zzd localzzd = new CameraSource.zzd(this, null);
        CameraSource.zzd.zza(localzzd, paramShutterCallback);
        paramShutterCallback = new CameraSource.zzc(this, null);
        CameraSource.zzc.zza(paramShutterCallback, paramPictureCallback);
        zzbmA.takePicture(localzzd, null, null, paramShutterCallback);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.CameraSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */