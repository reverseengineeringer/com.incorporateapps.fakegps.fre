package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;

public abstract class zzok$zza
  extends Binder
  implements zzok
{
  public static zzok zzbF(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
    if ((localIInterface != null) && ((localIInterface instanceof zzok))) {
      return (zzok)localIInterface;
    }
    return new zzok.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
      if (paramParcel1.readInt() != 0) {
        localObject1 = (StartBleScanRequest)StartBleScanRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((StartBleScanRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (StopBleScanRequest)StopBleScanRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((StopBleScanRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
      localObject1 = localObject3;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (ClaimBleDeviceRequest)ClaimBleDeviceRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ClaimBleDeviceRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
      localObject1 = localObject4;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (UnclaimBleDeviceRequest)UnclaimBleDeviceRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((UnclaimBleDeviceRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
    localObject1 = localObject5;
    if (paramParcel1.readInt() != 0) {
      localObject1 = (ListClaimedBleDevicesRequest)ListClaimedBleDevicesRequest.CREATOR.createFromParcel(paramParcel1);
    }
    zza((ListClaimedBleDevicesRequest)localObject1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzok.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */