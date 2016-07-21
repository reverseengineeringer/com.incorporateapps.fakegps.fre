package com.incorporateapps.fakegps.fre;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

final class aw
  implements DialogInterface.OnClickListener
{
  aw(Test paramTest) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + a.getPackageName()));
    a.startActivity(paramDialogInterface);
    a.finish();
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.aw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */