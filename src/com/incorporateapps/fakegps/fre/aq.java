package com.incorporateapps.fakegps.fre;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders.AppViewBuilder;
import com.google.android.gms.analytics.Tracker;

final class aq
  implements DialogInterface.OnClickListener
{
  aq(Maps paramMaps) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = a.v.newTracker(2131034112);
    paramDialogInterface.setScreenName("Refuse view");
    paramDialogInterface.send(new HitBuilders.AppViewBuilder().build());
    a.finish();
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.aq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */