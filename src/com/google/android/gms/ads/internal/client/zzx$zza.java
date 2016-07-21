package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzx$zza
  extends Binder
  implements zzx
{
  public zzx$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
  }
  
  public static zzx zzn(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    if ((localIInterface != null) && ((localIInterface instanceof zzx))) {
      return (zzx)localIInterface;
    }
    return new zzx.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    long l = getValue();
    paramParcel2.writeNoException();
    paramParcel2.writeLong(l);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzx.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */