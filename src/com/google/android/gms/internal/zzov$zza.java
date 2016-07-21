package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.result.SessionStopResult;

public abstract class zzov$zza
  extends Binder
  implements zzov
{
  public zzov$zza()
  {
    attachInterface(this, "com.google.android.gms.fitness.internal.ISessionStopCallback");
  }
  
  public static zzov zzbQ(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
    if ((localIInterface != null) && ((localIInterface instanceof zzov))) {
      return (zzov)localIInterface;
    }
    return new zzov.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.fitness.internal.ISessionStopCallback");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (SessionStopResult)SessionStopResult.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zza(paramParcel1);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzov.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */