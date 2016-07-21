package com.incorporateapps.fakegps.fre;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class p
  implements DialogInterface.OnClickListener
{
  p(Maps paramMaps) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.cancel();
    a.finish();
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */