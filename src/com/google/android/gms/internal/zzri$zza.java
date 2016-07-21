package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzri$zza
  extends Binder
  implements zzri
{
  public static zzri zzdY(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthService");
    if ((localIInterface != null) && ((localIInterface instanceof zzri))) {
      return (zzri)localIInterface;
    }
    return new zzri.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.search.internal.ISearchAuthService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.search.internal.ISearchAuthService");
      zza(zzrh.zza.zzdX(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.search.internal.ISearchAuthService");
    zzb(zzrh.zza.zzdX(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzri.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */