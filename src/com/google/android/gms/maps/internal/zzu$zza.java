package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.internal.zzg.zza;

public abstract class zzu$zza
  extends Binder
  implements zzu
{
  public zzu$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IOnPolygonClickListener");
  }
  
  public static zzu zzcQ(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    if ((localIInterface != null) && ((localIInterface instanceof zzu))) {
      return (zzu)localIInterface;
    }
    return new zzu.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.maps.internal.IOnPolygonClickListener");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    zza(zzg.zza.zzdj(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.internal.zzu.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */