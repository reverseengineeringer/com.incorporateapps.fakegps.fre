package com.incorporateapps.fakegps.fre;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

final class j
  implements Preference.OnPreferenceChangeListener
{
  j(ManagePreferences paramManagePreferences) {}
  
  public final boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    if (paramObject.getClass().equals(String.class)) {
      paramPreference.setTitle((String)paramObject);
    }
    return ManagePreferences.a(a, paramPreference, paramObject);
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */