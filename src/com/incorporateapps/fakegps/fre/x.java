package com.incorporateapps.fakegps.fre;

import android.os.Handler;
import android.os.Message;
import com.google.android.maps.GeoPoint;

final class x
  extends Thread
{
  x(Maps paramMaps, GeoPoint paramGeoPoint) {}
  
  public final void run()
  {
    Message localMessage = Message.obtain();
    obj = b;
    try
    {
      Maps localMaps = a;
      Maps.a(localMaps, Maps.g(localMaps) + 1);
      Maps.b(a, b);
      Maps.o(a).sendMessage(localMessage);
      return;
    }
    catch (Exception localException)
    {
      Maps.f(a);
      a.g = a.getString(2131230808);
      Maps.o(a).sendMessage(localMessage);
    }
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */