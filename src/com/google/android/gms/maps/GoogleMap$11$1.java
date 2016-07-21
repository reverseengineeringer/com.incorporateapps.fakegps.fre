package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.zzk;
import com.google.android.gms.maps.model.RuntimeRemoteException;

class GoogleMap$11$1
  implements LocationSource.OnLocationChangedListener
{
  GoogleMap$11$1(GoogleMap.11 param11, zzk paramzzk) {}
  
  public void onLocationChanged(Location paramLocation)
  {
    try
    {
      zzaRF.zzd(paramLocation);
      return;
    }
    catch (RemoteException paramLocation)
    {
      throw new RuntimeRemoteException(paramLocation);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.GoogleMap.11.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */