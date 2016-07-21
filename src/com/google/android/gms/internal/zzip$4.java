package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class zzip$4
  extends zzip.zza
{
  zzip$4(Context paramContext, zzip.zzb paramzzb)
  {
    super(null);
  }
  
  public final void zzbr()
  {
    SharedPreferences localSharedPreferences = zzip.zzw(zzxh);
    Bundle localBundle = new Bundle();
    localBundle.putInt("webview_cache_version", localSharedPreferences.getInt("webview_cache_version", 0));
    if (zzLQ != null) {
      zzLQ.zze(localBundle);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzip.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */