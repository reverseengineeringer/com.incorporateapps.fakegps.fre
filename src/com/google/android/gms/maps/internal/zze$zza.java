package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.zza;

public abstract class zze$zza
  extends Binder
  implements zze
{
  public zze$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IOnCameraChangeListener");
  }
  
  public static zze zzcA(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    if ((localIInterface != null) && ((localIInterface instanceof zze))) {
      return (zze)localIInterface;
    }
    return new zze.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.maps.internal.IOnCameraChangeListener");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = CameraPosition.CREATOR.zzfv(paramParcel1);; paramParcel1 = null)
    {
      onCameraChange(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.internal.zze.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */