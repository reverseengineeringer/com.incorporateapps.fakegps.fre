package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.zzpl;

public class zzb
{
  private static SharedPreferences zzaBZ = null;
  
  public static SharedPreferences zzw(Context paramContext)
  {
    try
    {
      if (zzaBZ == null) {
        zzaBZ = (SharedPreferences)zzpl.zzb(new zzb.1(paramContext));
      }
      paramContext = zzaBZ;
      return paramContext;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.flags.impl.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */