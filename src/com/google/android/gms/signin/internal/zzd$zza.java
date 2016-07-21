package com.google.android.gms.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public abstract class zzd$zza
  extends Binder
  implements zzd
{
  public zzd$zza()
  {
    attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
  }
  
  public static zzd zzea(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
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
    Object localObject;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
      if (paramParcel1.readInt() != 0)
      {
        localObject = (ConnectionResult)ConnectionResult.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label144;
        }
      }
      for (paramParcel1 = (AuthAccountResult)AuthAccountResult.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((ConnectionResult)localObject, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject = null;
        break;
      }
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zzbl(paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zzbm(paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 7: 
      label144:
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
      if (paramParcel1.readInt() != 0)
      {
        localObject = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label299;
        }
      }
      label299:
      for (paramParcel1 = (GoogleSignInAccount)GoogleSignInAccount.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((Status)localObject, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject = null;
        break;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (SignInResponse)SignInResponse.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      zzb(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.signin.internal.zzd.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */