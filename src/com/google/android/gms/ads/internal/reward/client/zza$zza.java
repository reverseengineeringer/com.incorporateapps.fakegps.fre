package com.google.android.gms.ads.internal.reward.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zza$zza
  extends Binder
  implements zza
{
  public zza$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
  }
  
  public static zza zzZ(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    if ((localIInterface != null) && ((localIInterface instanceof zza))) {
      return (zza)localIInterface;
    }
    return new zza.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.reward.client.IRewardItem");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
      paramParcel1 = getType();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    paramInt1 = getAmount();
    paramParcel2.writeNoException();
    paramParcel2.writeInt(paramInt1);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */