package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.zzl;

public abstract class zzx$zza
  extends Binder
  implements zzx
{
  public zzx$zza()
  {
    attachInterface(this, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
  }
  
  public static zzx zzcT(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
    if ((localIInterface != null) && ((localIInterface instanceof zzx))) {
      return (zzx)localIInterface;
    }
    return new zzx.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = StreetViewPanoramaLocation.CREATOR.zzfG(paramParcel1);; paramParcel1 = null)
    {
      onStreetViewPanoramaChange(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.internal.zzx.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */