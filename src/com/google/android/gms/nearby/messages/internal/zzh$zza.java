package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzh$zza
  extends Binder
  implements zzh
{
  public zzh$zza()
  {
    attachInterface(this, "com.google.android.gms.nearby.messages.internal.IStatusCallback");
  }
  
  public static zzh zzdC(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
    if ((localIInterface != null) && ((localIInterface instanceof zzh))) {
      return (zzh)localIInterface;
    }
    return new zzh.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.nearby.messages.internal.IStatusCallback");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
    if (paramParcel1.readInt() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      onPermissionChanged(bool);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzh.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */