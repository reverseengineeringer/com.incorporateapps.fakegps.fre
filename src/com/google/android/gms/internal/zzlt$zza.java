package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzlt$zza
  extends Binder
  implements zzlt
{
  public static zzlt zzaI(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
    if ((localIInterface != null) && ((localIInterface instanceof zzlt))) {
      return (zzlt)localIInterface;
    }
    return new zzlt.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
      destroy();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
      disconnect();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
      zza(zzls.zza.zzaH(paramParcel1.readStrongBinder()), zzlu.zza.zzaJ(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
      zza(zzls.zza.zzaH(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
    zza(zzls.zza.zzaH(paramParcel1.readStrongBinder()));
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlt.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */