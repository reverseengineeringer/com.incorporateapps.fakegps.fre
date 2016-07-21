package com.incorporateapps.fakegps.fre;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;

final class ak
  implements DialogInterface.OnClickListener
{
  ak(Maps paramMaps) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    a.p.putBoolean("dontRate", true);
    a.p.commit();
    paramDialogInterface.cancel();
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.ak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */