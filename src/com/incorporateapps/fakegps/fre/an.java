package com.incorporateapps.fakegps.fre;

import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.maps.MapView;
import java.util.List;

final class an
  extends Handler
{
  an(Maps paramMaps) {}
  
  public final void handleMessage(Message paramMessage)
  {
    try
    {
      if (Maps.h(a) == null) {
        Maps.a(a, new FixedMyLocationOverlay(a.l, Maps.c(a)));
      }
      Maps.c(a).getOverlays().add(Maps.h(a));
      if (!Maps.h(a).isCompassEnabled()) {
        Maps.a(a, Maps.h(a).enableCompass());
      }
      if (!Maps.h(a).isMyLocationEnabled()) {
        Maps.b(a, Maps.h(a).enableMyLocation());
      }
      Maps.h(a).runOnFirstFix(new ao(this));
      return;
    }
    catch (Exception paramMessage)
    {
      if ((Maps.i(a) != null) && (Maps.i(a).isShowing())) {
        Maps.i(a).dismiss();
      }
      Log.e("Show My Location Exception", paramMessage.toString());
    }
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.an
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */