package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzk$zza
  extends Binder
  implements zzk
{
  public zzk$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.request.IAdResponseListener");
  }
  
  public static zzk zzY(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
    if ((localIInterface != null) && ((localIInterface instanceof zzk))) {
      return (zzk)localIInterface;
    }
    return new zzk.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.ads.internal.request.IAdResponseListener");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = AdResponseParcel.CREATOR.zzj(paramParcel1);; paramParcel1 = null)
    {
      zzb(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzk.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */