package com.incorporateapps.fakegps.fre;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import com.google.android.maps.MapView;

final class aa
  implements DialogInterface.OnClickListener
{
  aa(Maps paramMaps) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == 0)
    {
      Maps.c(a).setSatellite(false);
      Maps.c(a).setStreetView(false);
      Maps.b(a, paramInt);
    }
    for (;;)
    {
      a.p.putInt("prefMapMode", paramInt);
      a.p.commit();
      paramDialogInterface.dismiss();
      return;
      if (paramInt == 1)
      {
        Maps.c(a).setSatellite(true);
        Maps.c(a).setStreetView(false);
        Maps.b(a, paramInt);
      }
      else if (paramInt == 2)
      {
        Maps.c(a).setStreetView(true);
        Maps.b(a, paramInt);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */