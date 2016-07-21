package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.zze;
import com.google.android.gms.location.places.zzg;

public abstract class zzf$zza
  extends Binder
  implements zzf
{
  public static zzf zzcm(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
    if ((localIInterface != null) && ((localIInterface instanceof zzf))) {
      return (zzf)localIInterface;
    }
    return new zzf.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    PendingIntent localPendingIntent = null;
    Object localObject2 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (PlaceRequest)PlaceRequest.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label183;
        }
        localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label189;
        }
      }
      for (localPendingIntent = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent = null)
      {
        zza((PlaceRequest)localObject1, (PlacesParams)localObject2, localPendingIntent, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
        localObject2 = null;
        break label133;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = PlacesParams.CREATOR.zzfo(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label265;
        }
      }
      for (localObject2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        zza((PlacesParams)localObject1, (PendingIntent)localObject2, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = NearbyAlertRequest.CREATOR.zzfd(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label359;
        }
        localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label365;
        }
      }
      for (localPendingIntent = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent = null)
      {
        zza((NearbyAlertRequest)localObject1, (PlacesParams)localObject2, localPendingIntent, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
        localObject2 = null;
        break label309;
      }
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = PlacesParams.CREATOR.zzfo(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label441;
        }
      }
      for (localObject2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        zzb((PlacesParams)localObject1, (PendingIntent)localObject2, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 6: 
      label133:
      label183:
      label189:
      label265:
      label309:
      label359:
      label365:
      label441:
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = PlaceFilter.CREATOR.zzfe(paramParcel1);; localObject1 = null)
      {
        if (paramParcel1.readInt() != 0) {
          localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
        }
        zza((PlaceFilter)localObject1, (PlacesParams)localObject2, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
    if (paramParcel1.readInt() != 0) {}
    for (Object localObject1 = (PlaceReport)PlaceReport.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      localObject2 = localPendingIntent;
      if (paramParcel1.readInt() != 0) {
        localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
      }
      zza((PlaceReport)localObject1, (PlacesParams)localObject2, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.zzf.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */