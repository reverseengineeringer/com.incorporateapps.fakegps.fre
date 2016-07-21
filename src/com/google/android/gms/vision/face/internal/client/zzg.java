package com.google.android.gms.vision.face.internal.client;

import android.content.Context;
import android.graphics.PointF;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;

public class zzg
{
  private final Context mContext;
  private final FaceSettingsParcel zzbob;
  private zzc zzboc = null;
  private boolean zzbod = false;
  private final Object zzpV = new Object();
  
  public zzg(Context paramContext, FaceSettingsParcel paramFaceSettingsParcel)
  {
    mContext = paramContext;
    zzbob = paramFaceSettingsParcel;
    zzIi();
  }
  
  private zzc zzIi()
  {
    for (;;)
    {
      synchronized (zzpV)
      {
        zzc localzzc;
        if (zzboc != null)
        {
          localzzc = zzboc;
          return localzzc;
        }
        zzboc = zzf.zza(mContext, zzbob);
        if ((!zzbod) && (zzboc == null))
        {
          Log.w("FaceDetectorHandle", "Native face detector not yet available.  Reverting to no-op detection.");
          zzbod = true;
          localzzc = zzboc;
          return localzzc;
        }
      }
      if ((zzbod) && (zzboc != null)) {
        Log.w("FaceDetectorHandle", "Native face detector is now available.");
      }
    }
  }
  
  private Face zza(FaceParcel paramFaceParcel)
  {
    return new Face(id, new PointF(centerX, centerY), width, height, zzbnP, zzbnQ, zzb(paramFaceParcel), zzbnS, zzbnT, zzbnU);
  }
  
  private Landmark zza(LandmarkParcel paramLandmarkParcel)
  {
    return new Landmark(new PointF(x, y), type);
  }
  
  private Landmark[] zzb(FaceParcel paramFaceParcel)
  {
    int i = 0;
    paramFaceParcel = zzbnR;
    if (paramFaceParcel == null) {
      return new Landmark[0];
    }
    Landmark[] arrayOfLandmark = new Landmark[paramFaceParcel.length];
    while (i < paramFaceParcel.length)
    {
      arrayOfLandmark[i] = zza(paramFaceParcel[i]);
      i += 1;
    }
    return arrayOfLandmark;
  }
  
  public boolean isOperational()
  {
    return zzIi() != null;
  }
  
  public void zzIh()
  {
    synchronized (zzpV)
    {
      if (zzboc == null) {
        return;
      }
    }
    try
    {
      zzboc.zzIh();
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Log.e("FaceDetectorHandle", "Could not finalize native face detector", localRemoteException);
      }
    }
  }
  
  public Face[] zzb(ByteBuffer paramByteBuffer, FrameMetadataParcel paramFrameMetadataParcel)
  {
    int i = 0;
    zzc localzzc = zzIi();
    if (localzzc == null) {
      return new Face[0];
    }
    try
    {
      paramByteBuffer = localzzc.zzc(zze.zzC(paramByteBuffer), paramFrameMetadataParcel);
      paramFrameMetadataParcel = new Face[paramByteBuffer.length];
      while (i < paramByteBuffer.length)
      {
        paramFrameMetadataParcel[i] = zza(paramByteBuffer[i]);
        i += 1;
      }
      return paramFrameMetadataParcel;
    }
    catch (RemoteException paramByteBuffer)
    {
      Log.e("FaceDetectorHandle", "Could not call native face detector", paramByteBuffer);
      return new Face[0];
    }
  }
  
  public boolean zzkJ(int paramInt)
  {
    zzc localzzc = zzIi();
    if (localzzc == null) {
      return false;
    }
    try
    {
      boolean bool = localzzc.zzkJ(paramInt);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("FaceDetectorHandle", "Could not call native face detector", localRemoteException);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.face.internal.client.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */