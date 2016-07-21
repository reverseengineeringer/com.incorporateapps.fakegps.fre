package com.incorporateapps.fakegps.fre;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class q
  implements DialogInterface.OnClickListener
{
  q(Maps paramMaps) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.cancel();
    a.startActivity(new Intent().setClassName("com.android.settings", "com.android.settings.DevelopmentSettings"));
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */