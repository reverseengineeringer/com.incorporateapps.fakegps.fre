package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;

public abstract class zzoq$zza
  extends Binder
  implements zzoq
{
  public static zzoq zzbL(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
    if ((localIInterface != null) && ((localIInterface instanceof zzoq))) {
      return (zzoq)localIInterface;
    }
    return new zzoq.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
      if (paramParcel1.readInt() != 0) {
        localObject1 = (SessionStartRequest)SessionStartRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SessionStartRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (SessionStopRequest)SessionStopRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SessionStopRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
      localObject1 = localObject3;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (SessionInsertRequest)SessionInsertRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SessionInsertRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
      localObject1 = localObject4;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (SessionReadRequest)SessionReadRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SessionReadRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
      localObject1 = localObject5;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (SessionRegistrationRequest)SessionRegistrationRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SessionRegistrationRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
    localObject1 = localObject6;
    if (paramParcel1.readInt() != 0) {
      localObject1 = (SessionUnregistrationRequest)SessionUnregistrationRequest.CREATOR.createFromParcel(paramParcel1);
    }
    zza((SessionUnregistrationRequest)localObject1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzoq.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */