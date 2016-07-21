package com.incorporateapps.fakegps.fre;

import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;

final class l
  extends Handler
{
  l(Maps paramMaps) {}
  
  public final void handleMessage(Message paramMessage)
  {
    Maps.a(a).dismiss();
    if (what == 1)
    {
      Toast.makeText(a, 2131230872, 0).show();
      return;
    }
    if (what == 0)
    {
      if (Maps.b(a) != null)
      {
        a.a(Maps.b(a));
        Maps.c(a).getController().animateTo(Maps.b(a));
        return;
      }
      Toast.makeText(a, 2131230806, 0).show();
      return;
    }
    Toast.makeText(a, 2131230806, 0).show();
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */