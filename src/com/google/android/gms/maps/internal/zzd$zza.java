package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.internal.zzf.zza;

public abstract class zzd$zza
  extends Binder
  implements zzd
{
  public zzd$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IInfoWindowAdapter");
  }
  
  public static zzd zzcw(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    if ((localIInterface != null) && ((localIInterface instanceof zzd))) {
      return (zzd)localIInterface;
    }
    return new zzd.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    com.google.android.gms.dynamic.zzd localzzd2 = null;
    com.google.android.gms.dynamic.zzd localzzd1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
      localzzd2 = zzb(zzf.zza.zzdi(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel1 = localzzd1;
      if (localzzd2 != null) {
        paramParcel1 = localzzd2.asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    localzzd1 = zzc(zzf.zza.zzdi(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    paramParcel1 = localzzd2;
    if (localzzd1 != null) {
      paramParcel1 = localzzd1.asBinder();
    }
    paramParcel2.writeStrongBinder(paramParcel1);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.internal.zzd.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */