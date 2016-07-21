package com.google.android.gms.location.places.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.PlacePhotoResult;

public abstract class zzh$zza
  extends Binder
  implements zzh
{
  public zzh$zza()
  {
    attachInterface(this, "com.google.android.gms.location.places.internal.IPhotosCallbacks");
  }
  
  public static zzh zzco(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IPhotosCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof zzh))) {
      return (zzh)localIInterface;
    }
    return new zzh.zza.zza(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.location.places.internal.IPhotosCallbacks");
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IPhotosCallbacks");
      paramParcel2 = (Parcel)localObject1;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (PlacePhotoMetadataResult)PlacePhotoMetadataResult.CREATOR.createFromParcel(paramParcel1);
      }
      zza(paramParcel2);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IPhotosCallbacks");
    paramParcel2 = (Parcel)localObject2;
    if (paramParcel1.readInt() != 0) {
      paramParcel2 = (PlacePhotoResult)PlacePhotoResult.CREATOR.createFromParcel(paramParcel1);
    }
    zza(paramParcel2);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.zzh.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */