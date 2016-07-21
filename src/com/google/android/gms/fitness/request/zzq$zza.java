package com.google.android.gms.fitness.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.BleDevice;

public abstract class zzq$zza
  extends Binder
  implements zzq
{
  public zzq$zza()
  {
    attachInterface(this, "com.google.android.gms.fitness.request.IBleScanCallback");
  }
  
  public static zzq zzbU(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
    if ((localIInterface != null) && ((localIInterface instanceof zzq))) {
      return (zzq)localIInterface;
    }
    return new zzq.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.fitness.request.IBleScanCallback");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (BleDevice)BleDevice.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        onDeviceFound(paramParcel1);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
    onScanStopped();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.zzq.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */