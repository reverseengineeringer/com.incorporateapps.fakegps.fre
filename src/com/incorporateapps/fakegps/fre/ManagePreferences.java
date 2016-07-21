package com.incorporateapps.fakegps.fre;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.util.Log;

public class ManagePreferences
  extends PreferenceActivity
{
  Preference a;
  Preference b;
  Preference c;
  CheckBoxPreference d;
  SharedPreferences e;
  boolean f = false;
  Context g;
  SharedPreferences.Editor h;
  private Resources i;
  private Preference.OnPreferenceChangeListener j = new i(this);
  private Preference.OnPreferenceChangeListener k = new j(this);
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    i = getResources();
    g = getApplicationContext();
    e = PreferenceManager.getDefaultSharedPreferences(this);
    h = e.edit();
    try
    {
      addPreferencesFromResource(2131034113);
      a = findPreference(getString(2131230905));
      a.setOnPreferenceChangeListener(j);
      d = ((CheckBoxPreference)findPreference(getString(2131230889)));
      d.setOnPreferenceChangeListener(j);
      c = findPreference(getString(2131230893));
      c.setOnPreferenceChangeListener(j);
      b = findPreference(getString(2131230901));
      b.setOnPreferenceChangeListener(j);
      findPreference(getString(2131230825)).setOnPreferenceClickListener(new k(this));
      if (d.isChecked())
      {
        c.setEnabled(true);
        b.setEnabled(true);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        Log.e("Add Preferences From Resource exception", paramBundle.toString());
      }
      c.setEnabled(false);
      b.setEnabled(false);
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.ManagePreferences
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */