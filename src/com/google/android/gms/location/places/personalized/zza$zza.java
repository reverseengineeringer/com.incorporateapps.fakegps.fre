package com.google.android.gms.location.places.personalized;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class zza$zza
  extends Binder
  implements zza
{
  public static zza zzcr(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.location.places.personalized.IPlaceAliasCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zza))) {
      return (zza)localIInterface;
    }
    return new zza.zza.zza(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.location.places.personalized.IPlaceAliasCallbacks");
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.personalized.IPlaceAliasCallbacks");
      paramParcel2 = (Parcel)localObject1;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (PlaceAliasResult)PlaceAliasResult.CREATOR.createFromParcel(paramParcel1);
      }
      zza(paramParcel2);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.places.personalized.IPlaceAliasCallbacks");
    paramParcel2 = (Parcel)localObject2;
    if (paramParcel1.readInt() != 0) {
      paramParcel2 = (PlaceAliasResult)PlaceAliasResult.CREATOR.createFromParcel(paramParcel1);
    }
    zzb(paramParcel2);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.personalized.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */