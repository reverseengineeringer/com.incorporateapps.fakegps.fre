package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzq.zza;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzf;

class GoogleMap$16
  extends zzq.zza
{
  GoogleMap$16(GoogleMap paramGoogleMap, GoogleMap.OnMarkerDragListener paramOnMarkerDragListener) {}
  
  public void zze(zzf paramzzf)
  {
    zzaRL.onMarkerDragStart(new Marker(paramzzf));
  }
  
  public void zzf(zzf paramzzf)
  {
    zzaRL.onMarkerDragEnd(new Marker(paramzzf));
  }
  
  public void zzg(zzf paramzzf)
  {
    zzaRL.onMarkerDrag(new Marker(paramzzf));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.GoogleMap.16
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */