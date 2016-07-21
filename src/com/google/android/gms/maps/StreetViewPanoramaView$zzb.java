package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.zzad;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class StreetViewPanoramaView$zzb
  extends zza
{
  private final Context mContext;
  private final List zzaSC = new ArrayList();
  private final StreetViewPanoramaOptions zzaSO;
  protected zzf zzaSh;
  private final ViewGroup zzaSo;
  
  StreetViewPanoramaView$zzb(ViewGroup paramViewGroup, Context paramContext, StreetViewPanoramaOptions paramStreetViewPanoramaOptions)
  {
    zzaSo = paramViewGroup;
    mContext = paramContext;
    zzaSO = paramStreetViewPanoramaOptions;
  }
  
  public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback paramOnStreetViewPanoramaReadyCallback)
  {
    if (zztU() != null)
    {
      ((StreetViewPanoramaView.zza)zztU()).getStreetViewPanoramaAsync(paramOnStreetViewPanoramaReadyCallback);
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
    if ((zzaSh != null) && (zztU() == null)) {}
    try
    {
      Object localObject = zzad.zzaO(mContext).zza(zze.zzC(mContext), zzaSO);
      zzaSh.zza(new StreetViewPanoramaView.zza(zzaSo, (IStreetViewPanoramaViewDelegate)localObject));
      localObject = zzaSC.iterator();
      while (((Iterator)localObject).hasNext())
      {
        OnStreetViewPanoramaReadyCallback localOnStreetViewPanoramaReadyCallback = (OnStreetViewPanoramaReadyCallback)((Iterator)localObject).next();
        ((StreetViewPanoramaView.zza)zztU()).getStreetViewPanoramaAsync(localOnStreetViewPanoramaReadyCallback);
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
 * Qualified Name:     com.google.android.gms.maps.StreetViewPanoramaView.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */