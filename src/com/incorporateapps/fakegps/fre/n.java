package com.incorporateapps.fakegps.fre;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class n
  implements DialogInterface.OnClickListener
{
  n(Maps paramMaps) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    a.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */