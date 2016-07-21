package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzd$zza
  extends Binder
  implements zzd
{
  public zzd$zza()
  {
    attachInterface(this, "com.google.android.gms.nearby.messages.internal.IMessageListener");
  }
  
  public static zzd zzdy(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
    if ((localIInterface != null) && ((localIInterface instanceof zzd))) {
      return (zzd)localIInterface;
    }
    return new zzd.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.nearby.messages.internal.IMessageListener");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
      paramParcel2 = (Parcel)localObject1;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = MessageWrapper.CREATOR.zzgk(paramParcel1);
      }
      zza(paramParcel2);
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
      paramParcel2 = (Parcel)localObject2;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = MessageWrapper.CREATOR.zzgk(paramParcel1);
      }
      zzb(paramParcel2);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
    zza((MessageWrapper[])paramParcel1.createTypedArray(MessageWrapper.CREATOR));
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzd.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */