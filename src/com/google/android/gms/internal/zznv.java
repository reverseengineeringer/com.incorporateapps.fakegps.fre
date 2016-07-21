package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.NotFoundException;
import android.telephony.TelephonyManager;
import android.util.Log;

public class zznv
{
  private static int zzazC = -1;
  
  public static boolean zzaD(Context paramContext)
  {
    return zzaG(paramContext) == 3;
  }
  
  private static int zzaE(Context paramContext)
  {
    return zzaF(paramContext) % 1000 / 100 + 5;
  }
  
  private static int zzaF(Context paramContext)
  {
    try
    {
      int i = getPackageManagergetPackageInfo"com.google.android.gms"0versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.w("Fitness", "Could not find package info for Google Play Services");
    }
    return -1;
  }
  
  public static int zzaG(Context paramContext)
  {
    int i;
    if (zzazC == -1) {
      switch (zzaE(paramContext))
      {
      case 9: 
      case 11: 
      case 12: 
      default: 
        if (zzaH(paramContext)) {
          i = 1;
        }
        break;
      }
    }
    for (;;)
    {
      zzazC = i;
      return zzazC;
      i = 3;
      continue;
      i = 0;
      continue;
      i = 2;
    }
  }
  
  private static boolean zzaH(Context paramContext)
  {
    try
    {
      int i = ((TelephonyManager)paramContext.getSystemService("phone")).getPhoneType();
      return i != 0;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      Log.wtf("Fitness", "Unable to determine type of device, assuming phone.  Version: " + zzaF(paramContext), localNotFoundException);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zznv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */