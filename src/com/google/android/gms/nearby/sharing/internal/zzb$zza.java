package com.google.android.gms.nearby.sharing.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzb$zza
  extends Binder
  implements zzb
{
  public static zzb zzdG(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IContentProvider");
    if ((localIInterface != null) && ((localIInterface instanceof zzb))) {
      return (zzb)localIInterface;
    }
    return new zzb.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.nearby.sharing.internal.IContentProvider");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.nearby.sharing.internal.IContentProvider");
    paramParcel1 = zzEO();
    paramParcel2.writeNoException();
    paramParcel2.writeTypedList(paramParcel1);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.sharing.internal.zzb.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */