package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.result.DataTypeResult;

public abstract class zzoj$zza
  extends Binder
  implements zzoj
{
  public zzoj$zza()
  {
    attachInterface(this, "com.google.android.gms.fitness.internal.IDataTypeCallback");
  }
  
  public static zzoj zzbE(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
    if ((localIInterface != null) && ((localIInterface instanceof zzoj))) {
      return (zzoj)localIInterface;
    }
    return new zzoj.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.fitness.internal.IDataTypeCallback");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (DataTypeResult)DataTypeResult.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zza(paramParcel1);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzoj.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */