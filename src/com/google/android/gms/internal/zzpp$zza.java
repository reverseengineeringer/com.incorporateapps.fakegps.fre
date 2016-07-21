package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.identity.intents.UserAddressRequest;

public abstract class zzpp$zza
  extends Binder
  implements zzpp
{
  public static zzpp zzcc(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
    if ((localIInterface != null) && ((localIInterface instanceof zzpp))) {
      return (zzpp)localIInterface;
    }
    return new zzpp.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.identity.intents.internal.IAddressService");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.identity.intents.internal.IAddressService");
    zzpo localzzpo = zzpo.zza.zzcb(paramParcel1.readStrongBinder());
    UserAddressRequest localUserAddressRequest;
    if (paramParcel1.readInt() != 0)
    {
      localUserAddressRequest = (UserAddressRequest)UserAddressRequest.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() == 0) {
        break label123;
      }
    }
    label123:
    for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zza(localzzpo, localUserAddressRequest, paramParcel1);
      paramParcel2.writeNoException();
      return true;
      localUserAddressRequest = null;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpp.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */