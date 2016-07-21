package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzfa$zza
  extends Binder
  implements zzfa
{
  public zzfa$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
  }
  
  public static zzfa zzH(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    if ((localIInterface != null) && ((localIInterface instanceof zzfa))) {
      return (zzfa)localIInterface;
    }
    return new zzfa.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    paramInt1 = zzeD();
    paramParcel2.writeNoException();
    paramParcel2.writeInt(paramInt1);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfa.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */