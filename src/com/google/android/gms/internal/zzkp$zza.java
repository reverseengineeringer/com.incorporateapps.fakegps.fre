package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzkp$zza
  extends Binder
  implements zzkp
{
  public static zzkp zzal(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
    if ((localIInterface != null) && ((localIInterface instanceof zzkp))) {
      return (zzkp)localIInterface;
    }
    return new zzkp.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.appinvite.internal.IAppInviteService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
      zzb(zzko.zza.zzak(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
      zza(zzko.zza.zzak(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
    zza(zzko.zza.zzak(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkp.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */