package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzf$zza
  extends Binder
  implements zzf
{
  public static zzf zzdA(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
    if ((localIInterface != null) && ((localIInterface instanceof zzf))) {
      return (zzf)localIInterface;
    }
    return new zzf.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject7 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
      if (paramParcel1.readInt() != 0) {
        localObject1 = (PublishRequest)PublishRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((PublishRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (UnpublishRequest)UnpublishRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((UnpublishRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
      localObject1 = localObject3;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (SubscribeRequest)SubscribeRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SubscribeRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
      localObject1 = localObject4;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (UnsubscribeRequest)UnsubscribeRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((UnsubscribeRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
      zzfB(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
      localObject1 = localObject5;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (GetPermissionStatusRequest)GetPermissionStatusRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetPermissionStatusRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
      localObject1 = localObject6;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (RegisterStatusCallbackRequest)RegisterStatusCallbackRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((RegisterStatusCallbackRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
    localObject1 = localObject7;
    if (paramParcel1.readInt() != 0) {
      localObject1 = (HandleClientLifecycleEventRequest)HandleClientLifecycleEventRequest.CREATOR.createFromParcel(paramParcel1);
    }
    zza((HandleClientLifecycleEventRequest)localObject1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzf.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */