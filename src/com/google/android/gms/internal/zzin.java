package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.ads.internal.util.client.zzb;

public final class zzin
  extends zzb
{
  public static void v(String paramString)
  {
    if (zzhp()) {
      Log.v("Ads", paramString);
    }
  }
  
  public static boolean zzho()
  {
    return ((Boolean)zzbt.zzwK.get()).booleanValue();
  }
  
  private static boolean zzhp()
  {
    return (zzQ(2)) && (zzho());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */