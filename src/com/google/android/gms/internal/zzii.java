package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;

public class zzii
{
  long zzLE = -1L;
  long zzLF = -1L;
  int zzLG = -1;
  int zzLH = 0;
  int zzLI = 0;
  final String zzLq;
  private final Object zzpV = new Object();
  
  public zzii(String paramString)
  {
    zzLq = paramString;
  }
  
  public static boolean zzH(Context paramContext)
  {
    int i = paramContext.getResources().getIdentifier("Theme.Translucent", "style", "android");
    if (i == 0)
    {
      zzin.zzaJ("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    }
    ComponentName localComponentName = new ComponentName(paramContext.getPackageName(), "com.google.android.gms.ads.AdActivity");
    try
    {
      if (i == getPackageManagergetActivityInfo0theme) {
        return true;
      }
      zzin.zzaJ("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
      return false;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      zzin.zzaK("Fail to fetch AdActivity theme");
      zzin.zzaJ("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
    }
    return false;
  }
  
  public void zzb(AdRequestParcel paramAdRequestParcel, long paramLong)
  {
    synchronized (zzpV)
    {
      if (zzLF == -1L)
      {
        zzLF = paramLong;
        zzLE = zzLF;
        if ((extras == null) || (extras.getInt("gw", 2) != 1)) {}
      }
      else
      {
        zzLE = paramLong;
      }
    }
    zzLG += 1;
  }
  
  public Bundle zzc(Context paramContext, String paramString)
  {
    synchronized (zzpV)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("session_id", zzLq);
      localBundle.putLong("basets", zzLF);
      localBundle.putLong("currts", zzLE);
      localBundle.putString("seq_num", paramString);
      localBundle.putInt("preqs", zzLG);
      localBundle.putInt("pclick", zzLH);
      localBundle.putInt("pimp", zzLI);
      localBundle.putBoolean("support_transparent_background", zzH(paramContext));
      return localBundle;
    }
  }
  
  public void zzgS()
  {
    synchronized (zzpV)
    {
      zzLI += 1;
      return;
    }
  }
  
  public void zzgT()
  {
    synchronized (zzpV)
    {
      zzLH += 1;
      return;
    }
  }
  
  public long zzhl()
  {
    return zzLF;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzii
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */