package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class zzb$1
  implements Callable
{
  zzb$1(Context paramContext) {}
  
  public final SharedPreferences zzvw()
  {
    return zzxh.getSharedPreferences("google_sdk_flags", 1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.flags.impl.zzb.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */