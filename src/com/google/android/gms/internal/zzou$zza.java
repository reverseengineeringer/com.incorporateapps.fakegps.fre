package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.result.SessionReadResult;

public abstract class zzou$zza
  extends Binder
  implements zzou
{
  public zzou$zza()
  {
    attachInterface(this, "com.google.android.gms.fitness.internal.ISessionReadCallback");
  }
  
  public static zzou zzbP(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionReadCallback");
    if ((localIInterface != null) && ((localIInterface instanceof zzou))) {
      return (zzou)localIInterface;
    }
    return new zzou.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.fitness.internal.ISessionReadCallback");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.ISessionReadCallback");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (SessionReadResult)SessionReadResult.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zza(paramParcel1);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzou.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */