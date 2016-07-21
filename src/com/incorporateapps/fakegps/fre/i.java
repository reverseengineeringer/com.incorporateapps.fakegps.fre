package com.incorporateapps.fakegps.fre;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

final class i
  implements Preference.OnPreferenceChangeListener
{
  i(ManagePreferences paramManagePreferences) {}
  
  public final boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    return ManagePreferences.a(a, paramPreference, paramObject);
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */