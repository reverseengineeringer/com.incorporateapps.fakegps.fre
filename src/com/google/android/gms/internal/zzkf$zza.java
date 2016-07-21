package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Request;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.zzf;

public abstract class zzkf$zza
  extends Binder
  implements zzkf
{
  public static zzkf zzag(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    if ((localIInterface != null) && ((localIInterface instanceof zzkf))) {
      return (zzkf)localIInterface;
    }
    return new zzkf.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      zza(zzkg.zza.zzah(paramParcel1.readStrongBinder()), paramParcel1.readString(), (UsageInfo[])paramParcel1.createTypedArray(UsageInfo.CREATOR));
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      zza(zzkg.zza.zzah(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      zzb(zzkg.zza.zzah(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      localObject = zzkg.zza.zzah(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        zza((zzkg)localObject, bool);
        paramParcel2.writeNoException();
        return true;
      }
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
      if (paramParcel1.readInt() != 0) {}
      for (localObject = GetRecentContextCall.Request.CREATOR.zzv(paramParcel1);; localObject = null)
      {
        zza((GetRecentContextCall.Request)localObject, zzkg.zza.zzah(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    zza(zzkg.zza.zzah(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkf.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */