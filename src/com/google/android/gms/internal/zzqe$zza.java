package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.bootstrap.Device;

public abstract class zzqe$zza
  extends Binder
  implements zzqe
{
  public static zzqe zzdq(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
    if ((localIInterface != null) && ((localIInterface instanceof zzqe))) {
      return (zzqe)localIInterface;
    }
    return new zzqe.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel2 = (Device)Device.CREATOR.createFromParcel(paramParcel1);; paramParcel2 = null)
      {
        zza(paramParcel2, paramParcel1.createByteArray());
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
      onDisconnected();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
      onError(paramParcel1.readInt());
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
      zzfw(paramParcel1.readString());
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
      zzEc();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
    zzfx(paramParcel1.readString());
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqe.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */