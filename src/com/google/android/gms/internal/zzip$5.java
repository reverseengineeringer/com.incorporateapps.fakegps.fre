package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class zzip$5
  extends zzip.zza
{
  zzip$5(Context paramContext, boolean paramBoolean)
  {
    super(null);
  }
  
  public final void zzbr()
  {
    SharedPreferences.Editor localEditor = zzip.zzw(zzxh).edit();
    localEditor.putBoolean("content_url_opted_out", zzLS);
    localEditor.apply();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzip.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */