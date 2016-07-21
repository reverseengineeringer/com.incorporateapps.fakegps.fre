package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.request.DeleteAllUserDataRequest;

public abstract class zzon$zza
  extends Binder
  implements zzon
{
  public static zzon zzbI(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
    if ((localIInterface != null) && ((localIInterface instanceof zzon))) {
      return (zzon)localIInterface;
    }
    return new zzon.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (DeleteAllUserDataRequest)DeleteAllUserDataRequest.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zza(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzon.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */