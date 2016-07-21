package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.zzad;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MapView$zzb
  extends zza
{
  private final Context mContext;
  protected zzf zzaSh;
  private final List zzaSi = new ArrayList();
  private final ViewGroup zzaSo;
  private final GoogleMapOptions zzaSp;
  
  MapView$zzb(ViewGroup paramViewGroup, Context paramContext, GoogleMapOptions paramGoogleMapOptions)
  {
    zzaSo = paramViewGroup;
    mContext = paramContext;
    zzaSp = paramGoogleMapOptions;
  }
  
  public void getMapAsync(OnMapReadyCallback paramOnMapReadyCallback)
  {
    if (zztU() != null)
    {
      ((MapView.zza)zztU()).getMapAsync(paramOnMapReadyCallback);
      return;
    }
    zzaSi.add(paramOnMapReadyCallback);
  }
  
  public void onEnterAmbient(Bundle paramBundle)
  {
    if (zztU() != null) {
      ((MapView.zza)zztU()).onEnterAmbient(paramBundle);
    }
  }
  
  public void onExitAmbient()
  {
    if (zztU() != null) {
      ((MapView.zza)zztU()).onExitAmbient();
    }
  }
  
  protected void zza(zzf paramzzf)
  {
    zzaSh = paramzzf;
    zzzW();
  }
  
  public void zzzW()
  {
    if ((zzaSh != null) && (zztU() == null)) {
      try
      {
        MapsInitializer.initialize(mContext);
        Object localObject = zzad.zzaO(mContext).zza(zze.zzC(mContext), zzaSp);
        if (localObject == null) {
          return;
        }
        zzaSh.zza(new MapView.zza(zzaSo, (IMapViewDelegate)localObject));
        localObject = zzaSi.iterator();
        while (((Iterator)localObject).hasNext())
        {
          OnMapReadyCallback localOnMapReadyCallback = (OnMapReadyCallback)((Iterator)localObject).next();
          ((MapView.zza)zztU()).getMapAsync(localOnMapReadyCallback);
        }
        return;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
        zzaSi.clear();
        return;
      }
      catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.MapView.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */