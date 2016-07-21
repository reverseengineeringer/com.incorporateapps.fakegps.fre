package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.zzad;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class SupportStreetViewPanoramaFragment$zzb
  extends zza
{
  private Activity mActivity;
  private final List zzaSC = new ArrayList();
  protected zzf zzaSh;
  private final Fragment zzalg;
  
  SupportStreetViewPanoramaFragment$zzb(Fragment paramFragment)
  {
    zzalg = paramFragment;
  }
  
  private void setActivity(Activity paramActivity)
  {
    mActivity = paramActivity;
    zzzW();
  }
  
  public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback paramOnStreetViewPanoramaReadyCallback)
  {
    if (zztU() != null)
    {
      ((SupportStreetViewPanoramaFragment.zza)zztU()).getStreetViewPanoramaAsync(paramOnStreetViewPanoramaReadyCallback);
      return;
    }
    zzaSC.add(paramOnStreetViewPanoramaReadyCallback);
  }
  
  protected void zza(zzf paramzzf)
  {
    zzaSh = paramzzf;
    zzzW();
  }
  
  public void zzzW()
  {
    if ((mActivity != null) && (zzaSh != null) && (zztU() == null)) {}
    try
    {
      MapsInitializer.initialize(mActivity);
      Object localObject = zzad.zzaO(mActivity).zzt(zze.zzC(mActivity));
      zzaSh.zza(new SupportStreetViewPanoramaFragment.zza(zzalg, (IStreetViewPanoramaFragmentDelegate)localObject));
      localObject = zzaSC.iterator();
      while (((Iterator)localObject).hasNext())
      {
        OnStreetViewPanoramaReadyCallback localOnStreetViewPanoramaReadyCallback = (OnStreetViewPanoramaReadyCallback)((Iterator)localObject).next();
        ((SupportStreetViewPanoramaFragment.zza)zztU()).getStreetViewPanoramaAsync(localOnStreetViewPanoramaReadyCallback);
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
      zzaSC.clear();
      return;
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException) {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.SupportStreetViewPanoramaFragment.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */