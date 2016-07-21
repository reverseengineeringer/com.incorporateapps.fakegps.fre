package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.personalized.PlaceAlias;
import com.google.android.gms.location.places.personalized.zza.zza;
import com.google.android.gms.location.places.personalized.zzb;
import com.google.android.gms.location.places.zzc;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.zzd;
import java.util.List;

public abstract class zzg$zza
  extends Binder
  implements zzg
{
  public static zzg zzcn(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
    if ((localIInterface != null) && ((localIInterface instanceof zzg))) {
      return (zzg)localIInterface;
    }
    return new zzg.zza.zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1 = null;
    Object localObject4 = null;
    Object localObject2 = null;
    Object localObject9 = null;
    Object localObject10 = null;
    Object localObject11 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject7 = null;
    Object localObject12 = null;
    Object localObject13 = null;
    Object localObject14 = null;
    Object localObject8 = null;
    Object localObject3 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.location.places.internal.IGooglePlacesService");
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = LatLngBounds.CREATOR.zzfy(paramParcel1);
        paramInt1 = paramParcel1.readInt();
        localObject4 = paramParcel1.readString();
        if (paramParcel1.readInt() == 0) {
          break label343;
        }
      }
      for (localObject2 = PlaceFilter.CREATOR.zzfe(paramParcel1);; localObject2 = null)
      {
        if (paramParcel1.readInt() != 0) {
          localObject3 = PlacesParams.CREATOR.zzfo(paramParcel1);
        }
        zza((LatLngBounds)localObject1, paramInt1, (String)localObject4, (PlaceFilter)localObject2, (PlacesParams)localObject3, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject2 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {
        localObject1 = PlacesParams.CREATOR.zzfo(paramParcel1);
      }
      zza((String)localObject2, (PlacesParams)localObject1, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = LatLng.CREATOR.zzfz(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label485;
        }
      }
      for (localObject2 = PlaceFilter.CREATOR.zzfe(paramParcel1);; localObject2 = null)
      {
        localObject3 = localObject4;
        if (paramParcel1.readInt() != 0) {
          localObject3 = PlacesParams.CREATOR.zzfo(paramParcel1);
        }
        zza((LatLng)localObject1, (PlaceFilter)localObject2, (PlacesParams)localObject3, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = PlaceFilter.CREATOR.zzfe(paramParcel1);; localObject1 = null)
      {
        if (paramParcel1.readInt() != 0) {
          localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
        }
        zzb((PlaceFilter)localObject1, (PlacesParams)localObject2, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject2 = paramParcel1.readString();
      localObject1 = localObject9;
      if (paramParcel1.readInt() != 0) {
        localObject1 = PlacesParams.CREATOR.zzfo(paramParcel1);
      }
      zzb((String)localObject2, (PlacesParams)localObject1, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject2 = paramParcel1.createStringArrayList();
      localObject1 = localObject10;
      if (paramParcel1.readInt() != 0) {
        localObject1 = PlacesParams.CREATOR.zzfo(paramParcel1);
      }
      zza((List)localObject2, (PlacesParams)localObject1, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject2 = paramParcel1.createStringArrayList();
      localObject1 = localObject11;
      if (paramParcel1.readInt() != 0) {
        localObject1 = PlacesParams.CREATOR.zzfo(paramParcel1);
      }
      zzb((List)localObject2, (PlacesParams)localObject1, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = UserDataType.CREATOR.zzfj(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label806;
        }
        localObject2 = LatLngBounds.CREATOR.zzfy(paramParcel1);
        localObject4 = paramParcel1.createStringArrayList();
        if (paramParcel1.readInt() == 0) {
          break label812;
        }
      }
      for (localObject3 = PlacesParams.CREATOR.zzfo(paramParcel1);; localObject3 = null)
      {
        zza((UserDataType)localObject1, (LatLngBounds)localObject2, (List)localObject4, (PlacesParams)localObject3, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
        localObject2 = null;
        break label753;
      }
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (PlaceRequest)PlaceRequest.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label902;
        }
        localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label908;
        }
      }
      for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((PlaceRequest)localObject1, (PlacesParams)localObject2, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
        localObject2 = null;
        break label861;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = PlacesParams.CREATOR.zzfo(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label974;
        }
      }
      for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((PlacesParams)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = NearbyAlertRequest.CREATOR.zzfd(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1058;
        }
        localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1064;
        }
      }
      for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zza((NearbyAlertRequest)localObject1, (PlacesParams)localObject2, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
        localObject2 = null;
        break label1017;
      }
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = PlacesParams.CREATOR.zzfo(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1130;
        }
      }
      for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        zzb((PlacesParams)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject4 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = LatLngBounds.CREATOR.zzfy(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1226;
        }
        localObject2 = AutocompleteFilter.CREATOR.zzfb(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1232;
        }
      }
      for (localObject3 = PlacesParams.CREATOR.zzfo(paramParcel1);; localObject3 = null)
      {
        zza((String)localObject4, (LatLngBounds)localObject1, (AutocompleteFilter)localObject2, (PlacesParams)localObject3, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
        localObject2 = null;
        break label1179;
      }
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = (AddPlaceRequest)AddPlaceRequest.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        localObject2 = localObject5;
        if (paramParcel1.readInt() != 0) {
          localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
        }
        zza((AddPlaceRequest)localObject1, (PlacesParams)localObject2, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = (PlaceReport)PlaceReport.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        localObject2 = localObject6;
        if (paramParcel1.readInt() != 0) {
          localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
        }
        zza((PlaceReport)localObject1, (PlacesParams)localObject2);
        paramParcel2.writeNoException();
        return true;
      }
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = PlaceAlias.CREATOR.zzfq(paramParcel1);
        localObject3 = paramParcel1.readString();
        localObject4 = paramParcel1.readString();
        if (paramParcel1.readInt() == 0) {
          break label1460;
        }
      }
      for (localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);; localObject2 = null)
      {
        zza((PlaceAlias)localObject1, (String)localObject3, (String)localObject4, (PlacesParams)localObject2, zza.zza.zzcr(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 21: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = PlaceAlias.CREATOR.zzfq(paramParcel1);; localObject1 = null)
      {
        localObject2 = localObject7;
        if (paramParcel1.readInt() != 0) {
          localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
        }
        zza((PlaceAlias)localObject1, (PlacesParams)localObject2, zza.zza.zzcr(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      localObject1 = localObject12;
      if (paramParcel1.readInt() != 0) {
        localObject1 = PlacesParams.CREATOR.zzfo(paramParcel1);
      }
      zza((String)localObject2, paramInt1, (PlacesParams)localObject1, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 19: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject2 = paramParcel1.readString();
      localObject1 = localObject13;
      if (paramParcel1.readInt() != 0) {
        localObject1 = PlacesParams.CREATOR.zzfo(paramParcel1);
      }
      zza((String)localObject2, (PlacesParams)localObject1, zzh.zza.zzco(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 20: 
      label343:
      label485:
      label753:
      label806:
      label812:
      label861:
      label902:
      label908:
      label974:
      label1017:
      label1058:
      label1064:
      label1130:
      label1179:
      label1226:
      label1232:
      label1460:
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      paramInt2 = paramParcel1.readInt();
      int i = paramParcel1.readInt();
      localObject1 = localObject14;
      if (paramParcel1.readInt() != 0) {
        localObject1 = PlacesParams.CREATOR.zzfo(paramParcel1);
      }
      zza((String)localObject2, paramInt1, paramInt2, i, (PlacesParams)localObject1, zzh.zza.zzco(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
    if (paramParcel1.readInt() != 0) {}
    for (localObject1 = LatLng.CREATOR.zzfz(paramParcel1);; localObject1 = null)
    {
      localObject2 = localObject8;
      if (paramParcel1.readInt() != 0) {
        localObject2 = PlacesParams.CREATOR.zzfo(paramParcel1);
      }
      zza((LatLng)localObject1, (PlacesParams)localObject2, zzi.zza.zzcp(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.internal.zzg.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */