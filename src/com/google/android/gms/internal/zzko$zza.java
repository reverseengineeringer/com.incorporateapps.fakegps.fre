package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

public abstract class zzko$zza
  extends Binder
  implements zzko
{
  public zzko$zza()
  {
    attachInterface(this, "com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
  }
  
  public static zzko zzak(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zzko))) {
      return (zzko)localIInterface;
    }
    return new zzko.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zzd(paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
    Status localStatus;
    if (paramParcel1.readInt() != 0)
    {
      localStatus = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() == 0) {
        break label162;
      }
    }
    label162:
    for (paramParcel1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zza(localStatus, paramParcel1);
      paramParcel2.writeNoException();
      return true;
      localStatus = null;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzko.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */