package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.zzad;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class SupportMapFragment$zzb
  extends zza
{
  private Activity mActivity;
  protected zzf zzaSh;
  private final List zzaSi = new ArrayList();
  private final Fragment zzalg;
  
  SupportMapFragment$zzb(Fragment paramFragment)
  {
    zzalg = paramFragment;
  }
  
  private void setActivity(Activity paramActivity)
  {
    mActivity = paramActivity;
    zzzW();
  }
  
  public void getMapAsync(OnMapReadyCallback paramOnMapReadyCallback)
  {
    if (zztU() != null)
    {
      ((SupportMapFragment.zza)zztU()).getMapAsync(paramOnMapReadyCallback);
      return;
    }
    zzaSi.add(paramOnMapReadyCallback);
  }
  
  public void onEnterAmbient(Bundle paramBundle)
  {
    if (zztU() != null) {
      ((SupportMapFragment.zza)zztU()).onEnterAmbient(paramBundle);
    }
  }
  
  public void onExitAmbient()
  {
    if (zztU() != null) {
      ((SupportMapFragment.zza)zztU()).onExitAmbient();
    }
  }
  
  protected void zza(zzf paramzzf)
  {
    zzaSh = paramzzf;
    zzzW();
  }
  
  public void zzzW()
  {
    if ((mActivity != null) && (zzaSh != null) && (zztU() == null)) {
      try
      {
        MapsInitializer.initialize(mActivity);
        Object localObject = zzad.zzaO(mActivity).zzs(zze.zzC(mActivity));
        if (localObject == null) {
          return;
        }
        zzaSh.zza(new SupportMapFragment.zza(zzalg, (IMapFragmentDelegate)localObject));
        localObject = zzaSi.iterator();
        while (((Iterator)localObject).hasNext())
        {
          OnMapReadyCallback localOnMapReadyCallback = (OnMapReadyCallback)((Iterator)localObject).next();
          ((SupportMapFragment.zza)zztU()).getMapAsync(localOnMapReadyCallback);
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
 * Qualified Name:     com.google.android.gms.maps.SupportMapFragment.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */