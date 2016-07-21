package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class zzip$6
  extends zzip.zza
{
  zzip$6(Context paramContext, zzip.zzb paramzzb)
  {
    super(null);
  }
  
  public final void zzbr()
  {
    SharedPreferences localSharedPreferences = zzip.zzw(zzxh);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("content_url_opted_out", localSharedPreferences.getBoolean("content_url_opted_out", true));
    if (zzLQ != null) {
      zzLQ.zze(localBundle);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzip.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */