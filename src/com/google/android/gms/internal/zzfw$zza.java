package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zzfw$zza
  extends Binder
  implements zzfw
{
  public static zzfw zzM(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    if ((localIInterface != null) && ((localIInterface instanceof zzfw))) {
      return (zzfw)localIInterface;
    }
    return new zzfw.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    paramParcel1 = zze(zzd.zza.zzbs(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    paramParcel2.writeStrongBinder(paramParcel1);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfw.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */