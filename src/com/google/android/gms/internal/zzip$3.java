package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class zzip$3
  extends zzip.zza
{
  zzip$3(Context paramContext, int paramInt)
  {
    super(null);
  }
  
  public final void zzbr()
  {
    SharedPreferences.Editor localEditor = zzip.zzw(zzxh).edit();
    localEditor.putInt("webview_cache_version", zzLR);
    localEditor.apply();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzip.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */