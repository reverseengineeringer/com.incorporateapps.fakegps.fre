package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzml$zza
  extends Binder
  implements zzml
{
  public static zzml zzaY(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
    if ((localIInterface != null) && ((localIInterface instanceof zzml))) {
      return (zzml)localIInterface;
    }
    return new zzml.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.common.internal.service.ICommonService");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.service.ICommonService");
    zza(zzmk.zza.zzaX(paramParcel1.readStrongBinder()));
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzml.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */