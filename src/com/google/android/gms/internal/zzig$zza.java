package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

final class zzig$zza
{
  private long zzLo = -1L;
  private long zzLp = -1L;
  
  public final Bundle toBundle()
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("topen", zzLo);
    localBundle.putLong("tclose", zzLp);
    return localBundle;
  }
  
  public final long zzgV()
  {
    return zzLp;
  }
  
  public final void zzgW()
  {
    zzLp = SystemClock.elapsedRealtime();
  }
  
  public final void zzgX()
  {
    zzLo = SystemClock.elapsedRealtime();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzig.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */