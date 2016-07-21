package com.incorporateapps.fakegps.fre;

import android.app.ProgressDialog;
import android.location.Geocoder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.util.Locale;

final class u
  extends Thread
{
  u(Maps paramMaps, String paramString) {}
  
  public final void run()
  {
    try
    {
      Looper.prepare();
      Message localMessage1 = Message.obtain();
      what = 0;
      Geocoder localGeocoder = new Geocoder(a, Locale.getDefault());
      Maps.a(a, localGeocoder.getFromLocationName(b, 5));
      Maps.n(a).sendMessage(localMessage1);
      return;
    }
    catch (IOException localIOException)
    {
      if (Maps.a(a) != null) {
        Maps.a(a).dismiss();
      }
      Message localMessage2 = Message.obtain();
      what = 1;
      Maps.n(a).sendMessage(localMessage2);
    }
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */