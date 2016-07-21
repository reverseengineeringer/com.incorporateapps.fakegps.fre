package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.AppMetadata;

public abstract class zzqn$zza
  extends Binder
  implements zzqn
{
  public static zzqn zzdx(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
    if ((localIInterface != null) && ((localIInterface instanceof zzqn))) {
      return (zzqn)localIInterface;
    }
    return new zzqn.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      return true;
    case 1001: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      zzqm localzzqm = zzqm.zza.zzdw(paramParcel1.readStrongBinder());
      String str = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (AppMetadata localAppMetadata = (AppMetadata)AppMetadata.CREATOR.createFromParcel(paramParcel1);; localAppMetadata = null)
      {
        zza(localzzqm, str, localAppMetadata, paramParcel1.readLong(), paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      }
    case 1002: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      zzag(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 1003: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      zza(zzqm.zza.zzdw(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readLong(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 1004: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      zzh(paramParcel1.readString(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 1005: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      zza(zzqm.zza.zzdw(paramParcel1.readStrongBinder()), paramParcel1.readInt(), paramParcel1.readLong(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 1006: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      zzah(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 1007: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      zza(zzqm.zza.zzdw(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createByteArray(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 1008: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      zza(zzqm.zza.zzdw(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.createByteArray(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 1009: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      zza(zzqm.zza.zzdw(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 1010: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      zza(paramParcel1.createStringArray(), paramParcel1.createByteArray(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 1011: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      zzb(paramParcel1.createStringArray(), paramParcel1.createByteArray(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 1012: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      zzi(paramParcel1.readString(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 1013: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      zzai(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 1014: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      zzF(paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 1015: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
      paramParcel1 = zzaj(paramParcel1.readLong());
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
    paramParcel1 = zzEk();
    paramParcel2.writeNoException();
    paramParcel2.writeString(paramParcel1);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqn.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */