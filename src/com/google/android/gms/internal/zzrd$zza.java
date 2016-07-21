package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzrd$zza
  extends Binder
  implements zzrd
{
  public static zzrd zzdV(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
    if ((localIInterface != null) && ((localIInterface instanceof zzrd))) {
      return (zzrd)localIInterface;
    }
    return new zzrd.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.safetynet.internal.ISafetyNetService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
      zza(zzrc.zza.zzdU(paramParcel1.readStrongBinder()), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
      zza(zzrc.zza.zzdU(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
    zza(zzrc.zza.zzdU(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.createIntArray(), paramParcel1.readInt(), paramParcel1.readString());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrd.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */