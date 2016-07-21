package com.google.android.gms.vision.barcode.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.internal.client.zza;

public abstract class zzb$zza
  extends Binder
  implements zzb
{
  public static zzb zzed(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    if ((localIInterface != null) && ((localIInterface instanceof zzb))) {
      return (zzb)localIInterface;
    }
    return new zzb.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    zzd localzzd1 = null;
    Object localObject = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
      localzzd1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {
        localObject = FrameMetadataParcel.CREATOR.zzhn(paramParcel1);
      }
      paramParcel1 = zza(localzzd1, (FrameMetadataParcel)localObject);
      paramParcel2.writeNoException();
      paramParcel2.writeTypedArray(paramParcel1, 1);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    zzd localzzd2 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
    localObject = localzzd1;
    if (paramParcel1.readInt() != 0) {
      localObject = FrameMetadataParcel.CREATOR.zzhn(paramParcel1);
    }
    paramParcel1 = zzb(localzzd2, (FrameMetadataParcel)localObject);
    paramParcel2.writeNoException();
    paramParcel2.writeTypedArray(paramParcel1, 1);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.internal.client.zzb.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */