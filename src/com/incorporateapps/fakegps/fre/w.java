package com.incorporateapps.fakegps.fre;

import android.app.ProgressDialog;
import android.location.Address;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import java.util.Iterator;
import java.util.List;

final class w
  extends Handler
{
  w(Maps paramMaps) {}
  
  public final void handleMessage(Message paramMessage)
  {
    Maps.a(a).dismiss();
    if (what == 1) {
      Toast.makeText(a, 2131230873, 0).show();
    }
    for (;;)
    {
      return;
      if (what != 0) {
        break label198;
      }
      if ((Maps.d(a) == null) || (Maps.d(a).size() <= 0)) {
        break;
      }
      paramMessage = Maps.d(a).iterator();
      while (paramMessage.hasNext())
      {
        Address localAddress = (Address)paramMessage.next();
        double d1 = localAddress.getLatitude();
        double d2 = localAddress.getLongitude();
        Maps.a(a, new GeoPoint(Double.valueOf(d1 * 1000000.0D).intValue(), Double.valueOf(d2 * 1000000.0D).intValue()));
        a.a(Maps.e(a));
        Maps.c(a).getController().animateTo(Maps.e(a));
      }
    }
    Toast.makeText(a, 2131230806, 0).show();
    return;
    label198:
    Toast.makeText(a, 2131230806, 0).show();
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */