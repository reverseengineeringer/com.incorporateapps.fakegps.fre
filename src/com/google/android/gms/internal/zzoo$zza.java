package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.request.SubscribeRequest;
import com.google.android.gms.fitness.request.UnsubscribeRequest;

public abstract class zzoo$zza
  extends Binder
  implements zzoo
{
  public static zzoo zzbJ(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
    if ((localIInterface != null) && ((localIInterface instanceof zzoo))) {
      return (zzoo)localIInterface;
    }
    return new zzoo.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
      if (paramParcel1.readInt() != 0) {
        localObject1 = (SubscribeRequest)SubscribeRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SubscribeRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (UnsubscribeRequest)UnsubscribeRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((UnsubscribeRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
    localObject1 = localObject3;
    if (paramParcel1.readInt() != 0) {
      localObject1 = (ListSubscriptionsRequest)ListSubscriptionsRequest.CREATOR.createFromParcel(paramParcel1);
    }
    zza((ListSubscriptionsRequest)localObject1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzoo.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */