package com.incorporateapps.fakegps.fre;

import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

final class k
  implements Preference.OnPreferenceClickListener
{
  k(ManagePreferences paramManagePreferences) {}
  
  public final boolean onPreferenceClick(Preference paramPreference)
  {
    paramPreference = a.getPackageName().replace(".fre", "");
    paramPreference = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + paramPreference));
    a.startActivity(paramPreference);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */