package com.google.android.gms.iid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zzb$zza
  extends Binder
  implements zzb
{
  public zzb$zza()
  {
    attachInterface(this, "com.google.android.gms.iid.IMessengerCompat");
  }
  
  public static zzb zzcd(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
    if ((localIInterface != null) && ((localIInterface instanceof zzb))) {
      return (zzb)localIInterface;
    }
    return new zzb.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.iid.IMessengerCompat");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.iid.IMessengerCompat");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (Message)Message.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      send(paramParcel1);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.iid.zzb.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */