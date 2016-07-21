package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

public abstract class zzla$zza
  extends Binder
  implements zzla
{
  public zzla$zza()
  {
    attachInterface(this, "com.google.android.gms.auth.api.internal.IAuthCallbacks");
  }
  
  public static zzla zzaz(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zzla))) {
      return (zzla)localIInterface;
    }
    return new zzla.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.auth.api.internal.IAuthCallbacks");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (ProxyResponse)ProxyResponse.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zza(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzla.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */