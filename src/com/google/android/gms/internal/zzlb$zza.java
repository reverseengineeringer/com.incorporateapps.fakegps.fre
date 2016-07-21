package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

public abstract class zzlb$zza
  extends Binder
  implements zzlb
{
  public static zzlb zzaA(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
    if ((localIInterface != null) && ((localIInterface instanceof zzlb))) {
      return (zzlb)localIInterface;
    }
    return new zzlb.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    zzla localzzla1 = null;
    Object localObject = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.auth.api.internal.IAuthService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
      localzzla1 = zzla.zza.zzaz(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {
        localObject = (ProxyRequest)ProxyRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza(localzzla1, (ProxyRequest)localObject);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
    zzla localzzla2 = zzla.zza.zzaz(paramParcel1.readStrongBinder());
    localObject = localzzla1;
    if (paramParcel1.readInt() != 0) {
      localObject = (ProxyGrpcRequest)ProxyGrpcRequest.CREATOR.createFromParcel(paramParcel1);
    }
    zza(localzzla2, (ProxyGrpcRequest)localObject);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlb.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */