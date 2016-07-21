package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class zzg$zza
  extends Binder
  implements zzg
{
  public zzg$zza()
  {
    attachInterface(this, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
  }
  
  public static zzg zzaC(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zzg))) {
      return (zzg)localIInterface;
    }
    return new zzg.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
      if (paramParcel1.readInt() != 0)
      {
        localObject = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label152;
        }
      }
      for (paramParcel1 = (SignInAccount)SignInAccount.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((Status)localObject, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject = null;
        break;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zzk(paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
      if (paramParcel1.readInt() != 0) {}
      for (localObject = (Status)Status.CREATOR.createFromParcel(paramParcel1);; localObject = null)
      {
        zza((Status)localObject, paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      }
    case 101: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
      if (paramParcel1.readInt() != 0)
      {
        localObject = (GoogleSignInAccount)GoogleSignInAccount.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label322;
        }
      }
      for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((GoogleSignInAccount)localObject, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject = null;
        break;
      }
    case 102: 
      label152:
      label322:
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zzl(paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zzm(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzg.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */