package com.google.android.gms.vision.face.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.internal.client.zza;

public abstract class zzc$zza
  extends Binder
  implements zzc
{
  public static zzc zzeg(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    if ((localIInterface != null) && ((localIInterface instanceof zzc))) {
      return (zzc)localIInterface;
    }
    return new zzc.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
      zzd localzzd = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = FrameMetadataParcel.CREATOR.zzhn(paramParcel1);; paramParcel1 = null)
      {
        paramParcel1 = zzc(localzzd, paramParcel1);
        paramParcel2.writeNoException();
        paramParcel2.writeTypedArray(paramParcel1, 1);
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
      boolean bool = zzkJ(paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (bool) {}
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    zzIh();
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.face.internal.client.zzc.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */