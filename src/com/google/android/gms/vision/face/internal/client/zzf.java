package com.google.android.gms.vision.face.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;

class zzf
  extends zzg
{
  private static zzf zzboa;
  
  zzf()
  {
    super("com.google.android.gms.vision.client.DynamiteNativeFaceDetectorCreator");
  }
  
  static zzc zza(Context paramContext, FaceSettingsParcel paramFaceSettingsParcel)
  {
    if (zzboa == null) {
      zzboa = new zzf();
    }
    return zzboa.zzb(paramContext, paramFaceSettingsParcel);
  }
  
  private zzc zzb(Context paramContext, FaceSettingsParcel paramFaceSettingsParcel)
  {
    try
    {
      com.google.android.gms.dynamic.zzd localzzd = zze.zzC(paramContext);
      paramContext = ((zzd)zzaB(paramContext)).zza(localzzd, paramFaceSettingsParcel);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      Log.e("FaceDetectorHandle", "Could not create native face detector", paramContext);
    }
    return null;
  }
  
  protected zzd zzei(IBinder paramIBinder)
  {
    return zzd.zza.zzeh(paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.face.internal.client.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */