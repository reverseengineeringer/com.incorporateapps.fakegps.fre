package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class zzmu
{
  public static boolean zzaw(Context paramContext)
  {
    return (zzne.zzsl()) && (paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
  }
  
  public static boolean zzb(Resources paramResources)
  {
    if (paramResources == null) {}
    for (;;)
    {
      return false;
      if ((getConfigurationscreenLayout & 0xF) > 3) {}
      for (int i = 1; ((zzne.zzsd()) && (i != 0)) || (zzc(paramResources)); i = 0) {
        return true;
      }
    }
  }
  
  private static boolean zzc(Resources paramResources)
  {
    boolean bool2 = false;
    paramResources = paramResources.getConfiguration();
    boolean bool1 = bool2;
    if (zzne.zzsf())
    {
      bool1 = bool2;
      if ((screenLayout & 0xF) <= 3)
      {
        bool1 = bool2;
        if (smallestScreenWidthDp >= 600) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzmu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */