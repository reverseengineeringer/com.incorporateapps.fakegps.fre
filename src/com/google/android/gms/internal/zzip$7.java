package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class zzip$7
  extends zzip.zza
{
  zzip$7(Context paramContext, String paramString)
  {
    super(null);
  }
  
  public final void zzbr()
  {
    SharedPreferences.Editor localEditor = zzip.zzw(zzxh).edit();
    localEditor.putString("content_url_hashes", zzLT);
    localEditor.apply();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzip.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */