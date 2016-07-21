package com.incorporateapps.fakegps.fre;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

final class av
  implements DialogInterface.OnClickListener
{
  av(MyItemizedOverlay paramMyItemizedOverlay) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Object localObject = MyItemizedOverlay.a(a).getPackageName().replace(".fre", "");
    localObject = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + (String)localObject));
    MyItemizedOverlay.a(a).startActivity((Intent)localObject);
    paramDialogInterface.cancel();
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.av
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */