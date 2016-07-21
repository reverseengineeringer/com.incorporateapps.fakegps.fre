package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.AppMetadata;

public abstract class zzqm$zza
  extends Binder
  implements zzqm
{
  public zzqm$zza()
  {
    attachInterface(this, "com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
  }
  
  public static zzqm zzdw(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zzqm))) {
      return (zzqm)localIInterface;
    }
    return new zzqm.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    String str1;
    Object localObject;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      return true;
    case 1001: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      onConnectionRequest(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      return true;
    case 1002: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      onEndpointFound(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 1003: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      onEndpointLost(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 1004: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      str1 = paramParcel1.readString();
      localObject = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      String str3 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (AppMetadata)AppMetadata.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza(str1, (String)localObject, str2, str3, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 1005: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      zzfy(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 1006: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      zza(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.createByteArray());
      paramParcel2.writeNoException();
      return true;
    case 1007: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      str1 = paramParcel1.readString();
      localObject = paramParcel1.createByteArray();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        onMessageReceived(str1, (byte[])localObject, bool);
        paramParcel2.writeNoException();
        return true;
      }
    case 1008: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      onDisconnected(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 1009: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      zzm(paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 1010: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      zziW(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 1011: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      zziX(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 1012: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      zziY(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 1013: 
      paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
      zziZ(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
    zzja(paramParcel1.readInt());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqm.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */