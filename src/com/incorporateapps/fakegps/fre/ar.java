package com.incorporateapps.fakegps.fre;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders.AppViewBuilder;
import com.google.android.gms.analytics.Tracker;

final class ar
  implements DialogInterface.OnClickListener
{
  ar(Maps paramMaps) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.cancel();
    a.p.putBoolean("prefDisclosureAdd", true);
    a.p.commit();
    paramDialogInterface = a.v.newTracker(2131034112);
    paramDialogInterface.setScreenName("Accept View");
    paramDialogInterface.send(new HitBuilders.AppViewBuilder().build());
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.ar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */