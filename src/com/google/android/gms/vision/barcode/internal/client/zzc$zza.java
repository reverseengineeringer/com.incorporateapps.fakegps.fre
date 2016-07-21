package com.google.android.gms.vision.barcode.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zzc$zza
  extends Binder
  implements zzc
{
  public static zzc zzee(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    if ((localIInterface != null) && ((localIInterface instanceof zzc))) {
      return (zzc)localIInterface;
    }
    return new zzc.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    Object localObject2 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = BarcodeDetectorOptions.CREATOR.zzhj(paramParcel1);; paramParcel1 = null)
    {
      localObject2 = zza((zzd)localObject2, paramParcel1);
      paramParcel2.writeNoException();
      paramParcel1 = (Parcel)localObject1;
      if (localObject2 != null) {
        paramParcel1 = ((zzb)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.internal.client.zzc.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */