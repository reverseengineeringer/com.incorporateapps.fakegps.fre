package com.google.android.gms.nearby.sharing.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzd$zza
  extends Binder
  implements zzd
{
  public static zzd zzdI(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
    if ((localIInterface != null) && ((localIInterface instanceof zzd))) {
      return (zzd)localIInterface;
    }
    return new zzd.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
      if (paramParcel1.readInt() != 0) {
        localObject1 = (ProvideContentRequest)ProvideContentRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ProvideContentRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (StopProvidingContentRequest)StopProvidingContentRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((StopProvidingContentRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
      localObject1 = localObject3;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (TrustedDevicesRequest)TrustedDevicesRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((TrustedDevicesRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
      localObject1 = localObject4;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (ReceiveContentRequest)ReceiveContentRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ReceiveContentRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
    zza(zzc.zza.zzdH(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.sharing.internal.zzd.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */