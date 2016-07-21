package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzct$zza
  extends Binder
  implements zzct
{
  public zzct$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
  }
  
  public static zzct zzB(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    if ((localIInterface != null) && ((localIInterface instanceof zzct))) {
      return (zzct)localIInterface;
    }
    return new zzct.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    zza(zzcp.zza.zzy(paramParcel1.readStrongBinder()), paramParcel1.readString());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzct.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */