package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;

public abstract class zzh$zza
  extends Binder
  implements zzh
{
  public static zzh zzaD(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
    if ((localIInterface != null) && ((localIInterface instanceof zzh))) {
      return (zzh)localIInterface;
    }
    return new zzh.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.auth.api.signin.internal.ISignInService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
      localObject = zzg.zza.zzaC(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (SignInConfiguration)SignInConfiguration.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((zzg)localObject, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
      localObject = zzg.zza.zzaC(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (SignInConfiguration)SignInConfiguration.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zzb((zzg)localObject, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
      zzg localzzg = zzg.zza.zzaC(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0)
      {
        localObject = (SignInConfiguration)SignInConfiguration.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label275;
        }
      }
      for (SignInAccount localSignInAccount = (SignInAccount)SignInAccount.CREATOR.createFromParcel(paramParcel1);; localSignInAccount = null)
      {
        zza(localzzg, (SignInConfiguration)localObject, localSignInAccount, paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
        localObject = null;
        break;
      }
    case 101: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
      localObject = zzg.zza.zzaC(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (GoogleSignInOptions)GoogleSignInOptions.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((zzg)localObject, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 102: 
      label275:
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
      localObject = zzg.zza.zzaC(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (GoogleSignInOptions)GoogleSignInOptions.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zzb((zzg)localObject, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
    Object localObject = zzg.zza.zzaC(paramParcel1.readStrongBinder());
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (GoogleSignInOptions)GoogleSignInOptions.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zzc((zzg)localObject, paramParcel1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzh.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */