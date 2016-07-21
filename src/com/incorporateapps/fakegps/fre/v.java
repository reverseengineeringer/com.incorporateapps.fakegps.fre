package com.incorporateapps.fakegps.fre;

import android.view.MotionEvent;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.Projection;

final class v
  extends Overlay
{
  v(Maps paramMaps) {}
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent, MapView paramMapView)
  {
    int i = paramMotionEvent.getAction();
    if (paramMotionEvent.getPointerCount() > 1) {
      a.d = paramMotionEvent.getEventTime();
    }
    while (i != 0) {
      return false;
    }
    a.d = paramMotionEvent.getEventTime();
    if (a.d - a.e < 250L)
    {
      paramMapView = Maps.c(a).getProjection();
      i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      Maps.a(a, paramMapView.fromPixels(i, j));
      a.a(Maps.e(a));
      a.e = -1L;
      return false;
    }
    a.e = a.d;
    return false;
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */