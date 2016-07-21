package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.result.BleDevicesResult;

public abstract class zzpj$zza
  extends Binder
  implements zzpj
{
  public zzpj$zza()
  {
    attachInterface(this, "com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
  }
  
  public static zzpj zzbT(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
    if ((localIInterface != null) && ((localIInterface instanceof zzpj))) {
      return (zzpj)localIInterface;
    }
    return new zzpj.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.ble.IBleDevicesCallback");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (BleDevicesResult)BleDevicesResult.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zza(paramParcel1);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpj.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */