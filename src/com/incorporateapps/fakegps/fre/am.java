package com.incorporateapps.fakegps.fre;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders.AppViewBuilder;
import com.google.android.gms.analytics.Tracker;

final class am
  implements DialogInterface.OnClickListener
{
  am(Maps paramMaps) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Tracker localTracker = a.v.newTracker(2131034112);
    localTracker.setScreenName("Buy View Dialog");
    localTracker.send(new HitBuilders.AppViewBuilder().build());
    a.c();
    paramDialogInterface.cancel();
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.am
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */