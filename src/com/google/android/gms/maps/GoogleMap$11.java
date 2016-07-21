package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.ILocationSourceDelegate.zza;
import com.google.android.gms.maps.internal.zzk;

class GoogleMap$11
  extends ILocationSourceDelegate.zza
{
  GoogleMap$11(GoogleMap paramGoogleMap, LocationSource paramLocationSource) {}
  
  public void activate(zzk paramzzk)
  {
    zzaRE.activate(new GoogleMap.11.1(this, paramzzk));
  }
  
  public void deactivate()
  {
    zzaRE.deactivate();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.GoogleMap.11
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */