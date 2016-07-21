package com.google.android.gms.auth.api.credentials.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public abstract class zzi$zza
  extends Binder
  implements zzi
{
  public zzi$zza()
  {
    attachInterface(this, "com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
  }
  
  public static zzi zzaw(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zzi))) {
      return (zzi)localIInterface;
    }
    return new zzi.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
      if (paramParcel1.readInt() != 0)
      {
        localStatus = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label128;
        }
      }
      for (paramParcel1 = (Credential)Credential.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza(localStatus, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localStatus = null;
        break;
      }
    case 2: 
      label128:
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zzg(paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    if (paramParcel1.readInt() != 0) {}
    for (Status localStatus = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localStatus = null)
    {
      zza(localStatus, paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.internal.zzi.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */