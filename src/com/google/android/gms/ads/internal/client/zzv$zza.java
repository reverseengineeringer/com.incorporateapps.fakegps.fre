package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.internal.zzex.zza;

public abstract class zzv$zza
  extends Binder
  implements zzv
{
  public static zzv zzl(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
    if ((localIInterface != null) && ((localIInterface instanceof zzv))) {
      return (zzv)localIInterface;
    }
    return new zzv.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    zzd localzzd1 = null;
    Object localObject = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
      localzzd1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {
        localObject = AdSizeParcel.CREATOR.zzc(paramParcel1);
      }
      paramParcel1 = zza(localzzd1, (AdSizeParcel)localObject, paramParcel1.readString(), zzex.zza.zzE(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
    zzd localzzd2 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
    localObject = localzzd1;
    if (paramParcel1.readInt() != 0) {
      localObject = AdSizeParcel.CREATOR.zzc(paramParcel1);
    }
    paramParcel1 = zza(localzzd2, (AdSizeParcel)localObject, paramParcel1.readString(), zzex.zza.zzE(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readInt());
    paramParcel2.writeNoException();
    paramParcel2.writeStrongBinder(paramParcel1);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzv.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */