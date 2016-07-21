package com.incorporateapps.fakegps.fre;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class g
  implements DialogInterface.OnClickListener
{
  g(CrashMap paramCrashMap) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.cancel();
    a.startActivity(new Intent().setClassName("com.android.settings", "com.android.settings.DevelopmentSettings"));
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */