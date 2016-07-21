package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.zza;

public abstract class IMapFragmentDelegate$zza
  extends Binder
  implements IMapFragmentDelegate
{
  public static IMapFragmentDelegate zzcy(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof IMapFragmentDelegate))) {
      return (IMapFragmentDelegate)localIInterface;
    }
    return new IMapFragmentDelegate.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    GoogleMapOptions localGoogleMapOptions = null;
    zzd localzzd1;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      paramParcel1 = getMap();
      paramParcel2.writeNoException();
      if (paramParcel1 != null) {}
      for (paramParcel1 = paramParcel1.asBinder();; paramParcel1 = null)
      {
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      localzzd1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0)
      {
        localGoogleMapOptions = GoogleMapOptions.CREATOR.zzft(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label264;
        }
      }
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        onInflate(localzzd1, localGoogleMapOptions, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localGoogleMapOptions = null;
        break;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        onCreate(paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      localzzd1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zzd localzzd2 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        localzzd1 = onCreateView(localzzd1, localzzd2, paramParcel1);
        paramParcel2.writeNoException();
        paramParcel1 = localGoogleMapOptions;
        if (localzzd1 != null) {
          paramParcel1 = localzzd1.asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      }
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      onResume();
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      onPause();
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      onDestroyView();
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      onDestroy();
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      onLowMemory();
      paramParcel2.writeNoException();
      return true;
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        onSaveInstanceState(paramParcel1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null) {
          break;
        }
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      boolean bool = isReady();
      paramParcel2.writeNoException();
      if (bool) {}
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        return true;
      }
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      getMapAsync(zzo.zza.zzcK(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 13: 
      label264:
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        onEnterAmbient(paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
    onExitAmbient();
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.internal.IMapFragmentDelegate.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */