package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zze$zza
  extends Binder
  implements zze
{
  public static zze zzdh(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof zze))) {
      return (zze)localIInterface;
    }
    return new zze.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
      paramParcel1 = getName();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
      paramParcel1 = getShortName();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
      activate();
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
      boolean bool = zza(zzdh(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      if (bool) {}
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
    paramInt1 = hashCodeRemote();
    paramParcel2.writeNoException();
    paramParcel2.writeInt(paramInt1);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.internal.zze.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */