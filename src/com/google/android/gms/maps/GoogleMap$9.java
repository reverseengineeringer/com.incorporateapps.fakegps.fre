package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzv.zza;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;

class GoogleMap$9
  extends zzv.zza
{
  GoogleMap$9(GoogleMap paramGoogleMap, GoogleMap.OnPolylineClickListener paramOnPolylineClickListener) {}
  
  public void zza(IPolylineDelegate paramIPolylineDelegate)
  {
    zzaRC.onPolylineClick(new Polyline(paramIPolylineDelegate));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.GoogleMap.9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */