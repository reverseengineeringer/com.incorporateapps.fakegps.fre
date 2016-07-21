package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzao$zza
  extends Binder
  implements zzao
{
  public zzao$zza()
  {
    attachInterface(this, "com.google.android.gms.drive.internal.IEventCallback");
  }
  
  public static zzao zzbc(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventCallback");
    if ((localIInterface != null) && ((localIInterface instanceof zzao))) {
      return (zzao)localIInterface;
    }
    return new zzao.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.drive.internal.IEventCallback");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IEventCallback");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (OnEventResponse)OnEventResponse.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zzc(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzao.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */