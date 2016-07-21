package com.incorporateapps.fakegps.fre;

import android.os.Handler;
import android.os.Message;
import com.google.android.maps.GeoPoint;

final class ah
  extends Handler
{
  ah(Maps paramMaps) {}
  
  public final void handleMessage(Message paramMessage)
  {
    if (a.a() <= 1)
    {
      a.b();
      a.a((GeoPoint)obj, a.g, a.h, a.f);
      Maps.f(a);
    }
    if (Maps.g(a) > 0)
    {
      paramMessage = a;
      Maps.a(paramMessage, Maps.g(paramMessage) - 1);
    }
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.ah
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */