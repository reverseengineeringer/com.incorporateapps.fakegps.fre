package com.incorporateapps.fakegps.fre;

import android.app.AppOpsManager;
import android.os.Build.VERSION;
import android.os.Process;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

final class e
  implements View.OnClickListener
{
  e(CrashMap paramCrashMap) {}
  
  public final void onClick(View paramView)
  {
    for (;;)
    {
      try
      {
        i = Build.VERSION.SDK_INT;
        if (i < 23) {}
      }
      catch (Settings.SettingNotFoundException paramView)
      {
        int i;
        CrashMap.a(a);
        return;
      }
      try
      {
        i = ((AppOpsManager)a.getSystemService("appops")).checkOp("android:mock_location", Process.myUid(), a.getPackageName());
        if (i != 0) {
          break label129;
        }
        bool = true;
      }
      catch (Exception paramView)
      {
        bool = false;
        continue;
      }
      Log.e("Crashmap", bool + " ");
      if (bool)
      {
        a.a();
        return;
      }
      CrashMap.a(a);
      return;
      if (Settings.Secure.getInt(a.getContentResolver(), "mock_location") <= 0)
      {
        CrashMap.a(a);
        return;
      }
      a.a();
      return;
      label129:
      bool = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */