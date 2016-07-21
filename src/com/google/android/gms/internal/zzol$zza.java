package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.request.DisableFitRequest;

public abstract class zzol$zza
  extends Binder
  implements zzol
{
  public static zzol zzbG(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
    if ((localIInterface != null) && ((localIInterface instanceof zzol))) {
      return (zzol)localIInterface;
    }
    return new zzol.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
      if (paramParcel1.readInt() != 0) {
        localObject1 = (DataTypeCreateRequest)DataTypeCreateRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataTypeCreateRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (DataTypeReadRequest)DataTypeReadRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DataTypeReadRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
    localObject1 = localObject3;
    if (paramParcel1.readInt() != 0) {
      localObject1 = (DisableFitRequest)DisableFitRequest.CREATOR.createFromParcel(paramParcel1);
    }
    zza((DisableFitRequest)localObject1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzol.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */