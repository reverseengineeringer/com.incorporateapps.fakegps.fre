package com.incorporateapps.fakegps.fre;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

final class aj
  implements DialogInterface.OnClickListener
{
  aj(Maps paramMaps) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Object localObject = a.getPackageName();
    localObject = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + (String)localObject));
    a.startActivity((Intent)localObject);
    paramDialogInterface.cancel();
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.aj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */