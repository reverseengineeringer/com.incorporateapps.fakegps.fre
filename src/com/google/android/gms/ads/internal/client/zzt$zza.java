package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.internal.zzex.zza;

public abstract class zzt$zza
  extends Binder
  implements zzt
{
  public static zzt zzj(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    if ((localIInterface != null) && ((localIInterface instanceof zzt))) {
      return (zzt)localIInterface;
    }
    return new zzt.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    paramParcel1 = zza(zzd.zza.zzbs(paramParcel1.readStrongBinder()), paramParcel1.readString(), zzex.zza.zzE(paramParcel1.readStrongBinder()), paramParcel1.readInt());
    paramParcel2.writeNoException();
    paramParcel2.writeStrongBinder(paramParcel1);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzt.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */