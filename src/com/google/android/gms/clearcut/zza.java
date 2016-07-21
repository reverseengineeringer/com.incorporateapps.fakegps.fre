package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.SharedPreferences;

public class zza
{
  private static int zzaeO = -1;
  public static final zza zzaeP = new zza();
  
  public int zzah(Context paramContext)
  {
    if (zzaeO < 0) {
      zzaeO = paramContext.getSharedPreferences("bootCount", 0).getInt("bootCount", 1);
    }
    return zzaeO;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.clearcut.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */