package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class zzip$8
  extends zzip.zza
{
  zzip$8(Context paramContext, zzip.zzb paramzzb)
  {
    super(null);
  }
  
  public final void zzbr()
  {
    SharedPreferences localSharedPreferences = zzip.zzw(zzxh);
    Bundle localBundle = new Bundle();
    localBundle.putString("content_url_hashes", localSharedPreferences.getString("content_url_hashes", ""));
    if (zzLQ != null) {
      zzLQ.zze(localBundle);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzip.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */