package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.bootstrap.Device;

public abstract class zzqi$zza
  extends Binder
  implements zzqi
{
  public static zzqi zzdu(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
    if ((localIInterface != null) && ((localIInterface instanceof zzqi))) {
      return (zzqi)localIInterface;
    }
    return new zzqi.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Device)Device.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza(paramParcel1);
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
      onScanStopped();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
    onError(paramParcel1.readInt());
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqi.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */