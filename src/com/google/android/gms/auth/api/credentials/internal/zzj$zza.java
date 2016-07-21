package com.google.android.gms.auth.api.credentials.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public abstract class zzj$zza
  extends Binder
  implements zzj
{
  public static zzj zzax(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    if ((localIInterface != null) && ((localIInterface instanceof zzj))) {
      return (zzj)localIInterface;
    }
    return new zzj.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    zzi localzzi1 = null;
    zzi localzzi2 = null;
    Object localObject2 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
      localzzi1 = zzi.zza.zzaw(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {
        localObject1 = (CredentialRequest)CredentialRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza(localzzi1, (CredentialRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
      localzzi2 = zzi.zza.zzaw(paramParcel1.readStrongBinder());
      localObject1 = localzzi1;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (SaveRequest)SaveRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza(localzzi2, (SaveRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
      localzzi1 = zzi.zza.zzaw(paramParcel1.readStrongBinder());
      localObject1 = localzzi2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (DeleteRequest)DeleteRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza(localzzi1, (DeleteRequest)localObject1);
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
      zza(zzi.zza.zzaw(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    localzzi1 = zzi.zza.zzaw(paramParcel1.readStrongBinder());
    localObject1 = localObject2;
    if (paramParcel1.readInt() != 0) {
      localObject1 = (GeneratePasswordRequest)GeneratePasswordRequest.CREATOR.createFromParcel(paramParcel1);
    }
    zza(localzzi1, (GeneratePasswordRequest)localObject1);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.internal.zzj.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */