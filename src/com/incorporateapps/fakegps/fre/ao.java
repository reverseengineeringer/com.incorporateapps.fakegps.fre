package com.incorporateapps.fakegps.fre;

import android.app.ProgressDialog;
import android.os.Handler;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;

final class ao
  implements Runnable
{
  ao(an paraman) {}
  
  public final void run()
  {
    if (Maps.i(an.a(a)) != null) {
      Maps.i(an.a(a)).dismiss();
    }
    GeoPoint localGeoPoint = Maps.h(an.a(a)).getMyLocation();
    if (localGeoPoint != null) {
      Maps.j(an.a(a)).animateTo(localGeoPoint);
    }
    Maps.a(an.a(a), Maps.h(an.a(a)).getLastFix());
    if (Maps.k(an.a(a)) != null) {
      Maps.l(an.a(a)).sendEmptyMessage(0);
    }
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.ao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */