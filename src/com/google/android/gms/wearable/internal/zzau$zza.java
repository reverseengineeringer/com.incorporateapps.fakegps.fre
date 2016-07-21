package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzau$zza
  extends Binder
  implements zzau
{
  public zzau$zza()
  {
    attachInterface(this, "com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
  }
  
  public static zzau zzer(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zzau))) {
      return (zzau)localIInterface;
    }
    return new zzau.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
    zzy(paramParcel1.readInt(), paramParcel1.readInt());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzau.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */