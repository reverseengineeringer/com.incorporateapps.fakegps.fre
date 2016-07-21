package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class zzip$1
  extends zzip.zza
{
  zzip$1(Context paramContext, boolean paramBoolean)
  {
    super(null);
  }
  
  public final void zzbr()
  {
    SharedPreferences.Editor localEditor = zzip.zzw(zzxh).edit();
    localEditor.putBoolean("use_https", zzLP);
    localEditor.apply();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzip.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */