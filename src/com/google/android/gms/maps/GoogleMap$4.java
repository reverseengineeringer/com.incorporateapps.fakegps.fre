package com.google.android.gms.maps;

import android.location.Location;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.zzs.zza;

class GoogleMap$4
  extends zzs.zza
{
  GoogleMap$4(GoogleMap paramGoogleMap, GoogleMap.OnMyLocationChangeListener paramOnMyLocationChangeListener) {}
  
  public void zzq(zzd paramzzd)
  {
    zzaRx.onMyLocationChange((Location)zze.zzp(paramzzd));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.GoogleMap.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */