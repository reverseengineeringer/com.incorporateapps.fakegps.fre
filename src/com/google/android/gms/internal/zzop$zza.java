package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;

public abstract class zzop$zza
  extends Binder
  implements zzop
{
  public static zzop zzbK(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
    if ((localIInterface != null) && ((localIInterface instanceof zzop))) {
      return (zzop)localIInterface;
    }
    return new zzop.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
      if (paramParcel1.readInt() != 0) {
        localObject1 = (DataSourcesRequest)DataSourcesRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataSourcesRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (SensorRegistrationRequest)SensorRegistrationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SensorRegistrationRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
    localObject1 = localObject3;
    if (paramParcel1.readInt() != 0) {
      localObject1 = (SensorUnregistrationRequest)SensorUnregistrationRequest.CREATOR.createFromParcel(paramParcel1);
    }
    zza((SensorUnregistrationRequest)localObject1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzop.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */